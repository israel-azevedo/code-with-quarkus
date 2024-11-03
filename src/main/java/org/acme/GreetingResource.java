package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

@Path("/")
public class GreetingResource {
    
    private static final Logger LOG = Logger.getLogger(GreetingResource.class);
    
    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        LOG.info("Endpoint /hello foi chamado");
        return "Hello RESTEasy";
    }
    
    @GET
    @Path("/health")
    @Produces(MediaType.TEXT_PLAIN)
    public String health() {
        LOG.info("Endpoint /health foi chamado");
        return "Service is up";
    }
}
