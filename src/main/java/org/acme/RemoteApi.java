package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@RegisterRestClient(baseUri = "http://httpbin.org")
public interface RemoteApi {

    @GET
    @Path("/get")
    Something performGet();

    @POST
    @Path("/post")
    void performPost(Something something);
}
