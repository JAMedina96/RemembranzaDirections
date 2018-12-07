package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.RemembranzaDirectionsApiService;
import io.swagger.api.factories.RemembranzaDirectionsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.ModelApiResponse;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

import javax.validation.constraints.*;


@Path("/remembranzaDirections")


@io.swagger.annotations.Api(description = "the remembranzaDirections API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-12-07T11:49:24.561Z[GMT]")

public class RemembranzaDirectionsApi  {
   private final RemembranzaDirectionsApiService delegate;

   public RemembranzaDirectionsApi(@Context ServletConfig servletContext) {
      RemembranzaDirectionsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("RemembranzaDirectionsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (RemembranzaDirectionsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = RemembranzaDirectionsApiServiceFactory.getRemembranzaDirectionsApi();
      }

      this.delegate = delegate;
   }


    @GET
    
    
    @Produces({ "aplication/json" })
    @io.swagger.annotations.ApiOperation(value = "returns the path to follow.", notes = "returns all directions.", response = ModelApiResponse.class, tags={ "Directions", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ModelApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class) })
    public Response remembranzaDirectionsGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.remembranzaDirectionsGet(securityContext);
    }

}

