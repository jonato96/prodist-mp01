package com.programacion;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@ApplicationScoped
@Path("/hola")
public class HolaRest {
    @GET
    public String hola(){
        return "Hola desde Helidon";
    }
}
