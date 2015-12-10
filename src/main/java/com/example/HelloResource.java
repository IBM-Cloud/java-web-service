package com.example;

import java.io.IOException;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.ibm.json.java.JSON;
import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;


// This class define the RESTful API to fetch the database service information
// <basepath>/api/hello

@Path("/hello")
public class HelloResource {

	@GET
	@Produces("application/json")
	public String getInformation() throws Exception, IOException {
        JSONObject myJSONObj = new JSONObject();
        myJSONObj.put("message", "Hello World!");
        return myJSONObj.toString();
        
	}
}