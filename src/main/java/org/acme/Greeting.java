package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/hello")
public class Greeting {

    @GET
    public Something sayHello() {
        return new Something("someId", "someName");
    }

    @POST
    public void postHello(Something something) {
        return;
    }

}
