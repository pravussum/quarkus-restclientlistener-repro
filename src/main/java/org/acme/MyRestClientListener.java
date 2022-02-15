package org.acme;

import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.eclipse.microprofile.rest.client.spi.RestClientListener;

public class MyRestClientListener implements RestClientListener {
	@Override
	public void onNewClient(Class<?> aClass, RestClientBuilder restClientBuilder) {
		System.out.println("MyRestClientListener called");
	}
}
