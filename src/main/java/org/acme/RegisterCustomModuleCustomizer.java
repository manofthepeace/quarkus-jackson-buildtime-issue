package org.acme;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.quarkus.jackson.ObjectMapperCustomizer;
import io.quarkus.runtime.annotations.StaticInitSafe;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class RegisterCustomModuleCustomizer implements ObjectMapperCustomizer {

    @StaticInitSafe
    @ConfigProperty(name = "my.variable")
    String testProp;

    @Inject
    Logger log;

    @Override
    public void customize(ObjectMapper objectMapper) {
        log.infof("Customizing objectMapper for %s", testProp);
    }

}
