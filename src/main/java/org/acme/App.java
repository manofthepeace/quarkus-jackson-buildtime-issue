package org.acme;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.quarkus.runtime.Startup;
import jakarta.inject.Singleton;

@Startup
@Singleton
public class App {

    App(ObjectMapper mapper, @RestClient RemoteApi api) {

    }
}
