package com.ujjwal.jaxrsex.api;

import com.ujjwal.jaxrsex.entity.Student;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path(value="/studentAPI")
public class StudentAPI{
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
   
    public String index(){
        
        return("<h1>Hello World from JAXRS</h1>");
    }
    
    @Path(value="/get")
    @GET
     @Produces(MediaType.APPLICATION_JSON)
    public Student get(){
        return new Student(1,"Shishir", "Parajuli","shishirparajuli@gmail.com", true);
    }
}