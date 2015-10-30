/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import java.io.IOException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.DataFactory;

/**
 * REST Web Service
 *
 * @author RolfMoikjær
 */
@Path("member")
public class GenericResource {

    @Context
    private UriInfo context;

    private DataFactory dataF = new DataFactory();

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of rest.GenericResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("complete")
    public Response getMembers() throws IOException {
        return Response.ok(dataF.getMembersAsJson()).build();
    }

}
