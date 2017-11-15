package io.swagger.api.factories;

import io.swagger.api.AddPatientApiService;
import io.swagger.api.impl.AddPatientApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-15T14:05:45.222Z")
public class AddPatientApiServiceFactory {
    private final static AddPatientApiService service = new AddPatientApiServiceImpl();

    public static AddPatientApiService getAddPatientApi() {
        return service;
    }
}
