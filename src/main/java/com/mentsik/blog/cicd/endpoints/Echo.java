package com.mentsik.blog.cicd.endpoints;

import com.mentsik.blog.cicd.models.EchoReply;

import javax.ws.rs.GET;
        import javax.ws.rs.Path;
        import javax.ws.rs.PathParam;
        import javax.ws.rs.Produces;
        import javax.ws.rs.core.MediaType;
        import javax.ws.rs.core.Response;

@Path("/echo")
public class Echo {

    @GET
    @Path("/{msg}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response reply(@PathParam("msg") String msg){
        EchoReply r = new EchoReply(msg);
        return Response.ok(r).build();
    }
}
