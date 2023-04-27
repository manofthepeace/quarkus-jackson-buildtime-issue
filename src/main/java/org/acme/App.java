package org.acme;

import javax.inject.Singleton;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.quarkus.runtime.Startup;

@Startup
@Singleton
public class App {

    App(ObjectMapper mapper) {

    }
}
