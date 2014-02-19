package com.about.java.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/sayHello")
public class HelloWorldService {
    @GET
    @Path("/{name}")
    public Response helloWorld(@PathParam("name") String name) {
        String response = "Hello world! My name is " + name;

        return Response.status(200).entity(response).build();
    }
}
