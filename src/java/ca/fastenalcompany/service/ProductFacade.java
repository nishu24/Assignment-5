/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.fastenalcompany.service;

import ca.fastenalcompany.config.PropertyManager;
import ca.fastenalcompany.datesource.DBManager;
import java.io.StringReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonReader;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("/products")
public class ProductFacade {
    @Context UriInfo uriInfo;

/**
 *
 * @author c0646929 nisarg
 */
@GET
    @Path("{id}")
    @Produces("application/json")
    public String doGet(@PathParam("id") Integer id){
            query(PropertyManager.getProperty("db_selectAll")).toString();
            JsonArray products= query(PropertyManager.getProperty("db_select"),id+"");
            return products.isEmpty()?Json.createObjectBuilder().build().toString():products.get(0).toString();
    }
    @GET
    @Produces("application/json")
    public String doGetAll(){
        return query(PropertyManager.getProperty("db_selectAll")).toString();
    }
    @POST
    @Consumes("application/json")
    //@Produces("text/plain-text")
    public Response doPost(String str) {
        JsonReader reader = Json.createReader(new StringReader(str));
        JsonObject json = reader.readObject();
        Set<String> keySet = json.keySet();
        if(keySet.contains("name")&&keySet.contains("description")&&keySet.contains("quantity")){
            //int productid = update(PropertyManager.getProperty("db_insert"),json.getString("name"),json.getString("description"),json.getString("quantity"));
            int productid = update(PropertyManager.getProperty("db_insert"),json.get("name").toString(),json.get("description").toString(),json.get("quantity").toString());
            if(productid>0){
                String url = uriInfo.getRequestUri()+"/"+productid;
                return Response.ok(url, MediaType.TEXT_PLAIN).build();
            }
        }
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
    }
    @PUT
    @Path("{id}")
    @Consumes("application/json")
    public Response doPut(@PathParam("id") Integer id,String str) {
        JsonReader reader = Json.createReader(new StringReader(str));
        JsonObject json = reader.readObject();
        Set<String> keySet = json.keySet();
        if(keySet.contains("name")&&keySet.contains("description")&&keySet.contains("quantity")){
            int productid = update(PropertyManager.getProperty("db_update"),json.get("name").toString(),json.get("description").toString(),json.get("quantity").toString(),id+"");
            if(productid>0){
                String url = uriInfo.getRequestUri().toString();
                return Response.ok(url, MediaType.TEXT_PLAIN).build();
            }
        }
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
    }

    @DELETE
    @Path("{id}")
    public Response doDelete(@PathParam("id") Integer id) {
        int productid = update(PropertyManager.getProperty("db_delete"),id+"");
        if(productid>0){
            
            return Response.ok("", MediaType.TEXT_PLAIN).build();
            
        }else{
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    public JsonArray query(String query, String... params){
        Connection conn = null;
         JsonArrayBuilder jab = Json.createArrayBuilder();
        try {
            conn = DBManager.getMysqlConn();
            PreparedStatement pstmt = conn.prepareStatement(query);
            
            for (int i = 1; i <= params.length; i++) {
                pstmt.setString(i, params[i - 1]);
            }
            System.out.println(query);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                JsonObjectBuilder job = Json.createObjectBuilder();
                
                for(int i=1;i<rs.getMetaData().getColumnCount()+1;i++){
                    
                    String label = rs.getMetaData().getColumnLabel(i);
                    String value = rs.getString(label);
                    job.add(label, value);
                }
                jab.add(job);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                System.out.println(PropertyManager.getProperty("db_conn_closed"));
                
                if(conn!=null)conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return jab.build();
    }
    
     public int update(String query, String... params){
         Connection conn = null;
         int result=-1;
         try {
            conn = DBManager.getMysqlConn();
            
            PreparedStatement pstmt = conn.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            for (int i = 1; i <= params.length; i++) {
                pstmt.setString(i, params[i - 1]);
            }
            System.out.println(query);
            int rowsEffect = pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            if(rs.next()){
                result = rs.getInt(1);
            }else if(rowsEffect>0){
                result = Integer.parseInt(params[params.length-1]);
            }
        } catch (SQLException ex) {
            
            ex.printStackTrace();
        } finally {
            try {
                System.out.println(PropertyManager.getProperty("db_conn_closed"));
                
                if(conn!=null)conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return result;
     }
     
}
