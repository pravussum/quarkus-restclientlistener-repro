package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "my-rest-client")
public interface MyRestClient {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	String hello();
}
