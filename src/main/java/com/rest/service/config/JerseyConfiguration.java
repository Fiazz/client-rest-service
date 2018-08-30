package com.rest.service.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.rest.service.controller.Resource;

@Configuration
public class JerseyConfiguration extends ResourceConfig {

	public JerseyConfiguration() {
		super();
		register(Resource.class);
	}

}
