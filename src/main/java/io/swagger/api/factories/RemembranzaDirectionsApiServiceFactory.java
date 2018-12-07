package io.swagger.api.factories;

import io.swagger.api.RemembranzaDirectionsApiService;
import io.swagger.api.impl.RemembranzaDirectionsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-12-07T11:49:24.561Z[GMT]")
public class RemembranzaDirectionsApiServiceFactory {
    private final static RemembranzaDirectionsApiService service = new RemembranzaDirectionsApiServiceImpl();

    public static RemembranzaDirectionsApiService getRemembranzaDirectionsApi() {
        return service;
    }
}
