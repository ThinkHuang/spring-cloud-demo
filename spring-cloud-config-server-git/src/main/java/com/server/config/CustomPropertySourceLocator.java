package com.server.config;

import java.util.Collections;

import org.springframework.cloud.bootstrap.config.PropertySourceLocator;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;

@Configuration
public class CustomPropertySourceLocator implements PropertySourceLocator
{

    @Override
    public PropertySource<?> locate(Environment environment)
    {
        return new MapPropertySource("customProperty",
                Collections.<String, Object>singletonMap("property.from.sample.custom.source", "worked as intended"));
    }
    
}
