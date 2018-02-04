package com.aws.dev;



import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.aws.dev.business.UserBusiness;
import com.aws.dev.domain.User;


@Path("/aws")
public class RestResource {

	@GET
	@Path("/getAws")
	@Produces(MediaType.APPLICATION_JSON)
	public String getAWS(){
		return "Rest Service using rest easy  to host on AWS TEST index.html !!!";
		
	}
	
	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAWSUsers(){
		UserBusiness userBusiness = new UserBusiness();
		List<User> userList =  userBusiness.getAwsUsers();
		//return userList.get(0).getFname();
		
		return userList;
		
	}
	
	
	@GET
	@Path("/user/{firstname}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getAWSUser(@PathParam(value = "firstname") String firstname){
		System.out.println("firstname"+firstname);
		UserBusiness userBusiness = new UserBusiness();
		
		return userBusiness.getAwsUser(firstname);
		
	}
}
