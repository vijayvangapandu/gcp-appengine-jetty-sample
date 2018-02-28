package gcp.websamples.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Path("/v1")
@Component
public class WelcomeResource {

	public static final Logger logger = LoggerFactory.getLogger(WelcomeResource.class);

	@GET
	@Path("message/{message}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public String getMessage(@PathParam("message") final String message,
			final @Context HttpHeaders httpHeaders) {
		
      return "Welcome " + message;
		
	}
	
}
