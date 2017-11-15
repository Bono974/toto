package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AddPatientApiService;
import io.swagger.api.factories.AddPatientApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Patient;

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

@Path("/addPatient")


@io.swagger.annotations.Api(description = "the addPatient API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-15T14:05:45.222Z")
public class AddPatientApi  {
   private final AddPatientApiService delegate;

   public AddPatientApi(@Context ServletConfig servletContext) {
      AddPatientApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AddPatientApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AddPatientApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = AddPatientApiServiceFactory.getAddPatientApi();
      }

      this.delegate = delegate;
   }

    @PUT
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Patient.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Patient.class) })
    public Response addPatient(@ApiParam(value = "" ,required=true) Patient body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addPatient(body,securityContext);
    }
}
