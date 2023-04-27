package org.acme;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.quarkus.jackson.ObjectMapperCustomizer;

@Singleton
public class RegisterCustomModuleCustomizer implements ObjectMapperCustomizer {

    @ConfigProperty(name = "my.variable")
    String testProp;

    @Inject
    Logger log;

    @Override
    public void customize(ObjectMapper objectMapper) {
        log.infof("Customizing objectMapper for %s", testProp);
    }

}
