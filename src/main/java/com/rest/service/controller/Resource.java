package com.rest.service.controller;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.rest.service.action.InvokeServerAction;

@Path("/client-service")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })

public class Resource {

	@Inject
	InvokeServerAction invokeServerAction;

	@GET
	@Path("/health")
	public Response healthCheck() {
		System.out.println("successfully invoked client Get Method : /health");
		return Response.status(Status.OK).build();
	}

	@POST
	@Path("/invoke")
	public Response service() {
		System.out.println("successfully invoked client Post Method : /invoke");
		invokeServerAction.invoke();
		return Response.status(Status.CREATED).entity("success").build();
	}
}
