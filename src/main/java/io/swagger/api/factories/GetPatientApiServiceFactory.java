package io.swagger.api.factories;

import io.swagger.api.GetPatientApiService;
import io.swagger.api.impl.GetPatientApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-15T14:05:45.222Z")
public class GetPatientApiServiceFactory {
    private final static GetPatientApiService service = new GetPatientApiServiceImpl();

    public static GetPatientApiService getGetPatientApi() {
        return service;
    }
}
