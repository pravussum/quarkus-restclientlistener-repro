package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import javax.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ReactiveGreetingResourceTest {

	@RestClient
	@Inject
	MyRestClient myRestClient;

    @Test
    public void testHelloEndpoint() {
	    myRestClient.hello();
    }

}