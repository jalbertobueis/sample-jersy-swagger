package es.bueis.poc.jersy.api;

import io.swagger.annotations.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by jesusbueis1 on 5/5/17.
 */
@Path("/customer")

@Api(value = "customer", description = "Endpoint for Customer specific operations")
public class CustomerResource {




    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{customer}")
    @ApiOperation(value = "Return customer's name",
            notes = "Return customer's nameeee",
            response = String.class,
            responseContainer = "map",
            authorizations = @Authorization(value = "api_key")
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful retrieval of user entity", response = String.class),
            @ApiResponse(code = 404, message = "User with given uuid does not exist"),
            @ApiResponse(code = 500, message = "Internal server error") }
    )
    public String getCustomer(@PathParam("customer") String customer){
        return "{\"customer\":\"" + customer + "\"}";
    }
}
