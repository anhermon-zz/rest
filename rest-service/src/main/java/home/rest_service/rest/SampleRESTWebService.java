package home.rest_service.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("rest")
public class SampleRESTWebService {

	@GET
	@Produces("application/json")
	@Path("test")
	public Object test(){
		return "test";
	}
}
