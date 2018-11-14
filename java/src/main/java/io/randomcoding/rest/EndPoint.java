package io.randomcoding.rest;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import io.randomcoding.model.Hello;
@Path("/hello")
public class EndPoint {
	/**
	 * Saludar
	 */	
	@GET
	@Path("/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response saludar(@PathParam("name") String name) {		
		return Response.status(Response.Status.OK).entity(new Hello(name)).build();
	}
}
