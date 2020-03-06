package com.niit.alpha.myrest1;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 * Root resource (exposed at "myresource" path)
 */


    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @Path("/hello")
	public class MyResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
   public String sayPlainTextHello() {
    	return "Hello Jersey Plain";
    }
    
    @GET
    @Path("/xmlhello")
    @Produces(MediaType.TEXT_XML)
    public String sayXMLHello() {
    	return "<?xml version=\"1.0\"?>"+"<hello>Hello Jersey"+"</hello>";
    }
    
    @GET
    @Path("/htmlhello")
    @Produces(MediaType.TEXT_XML)
    public String sayHTMLHello() {
    	return "<HTML>"+"<TITLE>"+"Hello Jersey"+"</TITLE>"+"<BODY><H1>"+"Hello Jersey HTML"+"</H1></BODY>"+
    "</HTML>";
    }
}
