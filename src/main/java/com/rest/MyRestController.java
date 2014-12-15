package com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.domains.User;

@Path("/")
public class MyRestController {

	public MyRestController() {
		super();
	}

	@Produces(MediaType.APPLICATION_JSON)
	public String sayHello() {
		return "Hello";
	}

	@GET
	@Path("jsonUser")
	@Produces(MediaType.APPLICATION_JSON)
	public User jsonUser() {
		return new User("jab", "zied", 30);
	}

	@GET
	@Path("xmlUser")
	@Produces(MediaType.APPLICATION_XML)
	public User xmlUser() {
		return new User("jab", "bilel", 30);
	}

}
