package digital.metro.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;

import digital.metro.Order;
import digital.metro.SampleEntity;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class SampleResource {

    public SampleResource() {
    }

    @GET
    @Timed
    public SampleEntity welcomeMessage() {
        return new SampleEntity("Hello world!");
    }

    @GET
    @Path("/{id}")
    public Order getOrderById(@PathParam("id") String id) {
        return new Order( id );
    }
}