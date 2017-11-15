package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.GetPatientApiService;
import io.swagger.api.factories.GetPatientApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Patient;
import io.swagger.model.RequestPatientById;

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

@Path("/getPatient")


@io.swagger.annotations.Api(description = "the getPatient API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-15T14:05:45.222Z")
public class GetPatientApi  {
   private final GetPatientApiService delegate;

   public GetPatientApi(@Context ServletConfig servletContext) {
      GetPatientApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("GetPatientApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (GetPatientApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = GetPatientApiServiceFactory.getGetPatientApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Patient.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Patient.class) })
    public Response getPatient(@ApiParam(value = "" ,required=true) RequestPatientById body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPatient(body,securityContext);
    }
}
