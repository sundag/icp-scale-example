package application.rest.v1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.QueryParam;
import java.util.logging.Logger;
@Path("v1/example")
public class Example {
    private static String CLAZZ = Example.class.getName();
    private static Logger logger = Logger.getLogger(CLAZZ);
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response example(@QueryParam("name") String name) {
        logger.entering(CLAZZ, "example",name);
        logger.info("logging example!");
        String helloworld = "{\"say\":\"Hello "+name+"!\"}";
        logger.exiting(CLAZZ, "example");
        return Response.ok(helloworld).build();
    }
}
