package com.programacion;

import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.LocalDateTime;

@ApplicationScoped
@Path("/hola")
public class HolaRest {

    @ConfigProperty(name="mensaje", defaultValue = "por defecto")
    private String mensaje;

    @GET
    public String hola(){
        //return "Hola desde Helidon";

        System.out.println("Fuentes de configuracion");
        ConfigProvider.getConfig().getConfigSources()
                .forEach(s->{
                    System.out.printf("%3d: %s\n", s.getOrdinal(), s.getName());
                });
        return "Hola desde Quarkus "+ LocalDateTime.now()+" "+mensaje;
    }
}
