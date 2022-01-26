package br.plisbarbosa.quarkus.hello.world.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.plisbarbosa.quarkus.hello.world.services.HelloService;

@Path("/hello")
public class HelloResource {
	@Inject
	private HelloService helloSv;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "Hello";
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{name}")
	public String helloName(@PathParam(value = "name") String name) {
		return helloSv.helloName(name);
	}
}