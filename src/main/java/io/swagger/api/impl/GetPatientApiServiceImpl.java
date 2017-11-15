package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Patient;
import io.swagger.model.RequestPatientById;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-15T14:05:45.222Z")
public class GetPatientApiServiceImpl extends GetPatientApiService {
	@Override
	public Response getPatient(RequestPatientById body, SecurityContext securityContext) throws NotFoundException {
		try {
			Patient p = new Patient()
					.nom("TTTTT"
					.prenom("BRUNO")
					.idPatient(body.getIdPatient());

			ObjectMapper om = new ObjectMapper();
			String jsonResult = om.writeValueAsString(p);

			return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, jsonResult))
					.build();

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "ERROR!"))
				.build();
	}
}
