package com.avbravo.tareas.arquillian;


import com.avbravo.tareas.arquillian.services.HelloService;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;

@Path("/demo")
public class DemoController {

    HelloService helloService;

    @Inject
    public DemoController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GET
    public String getHello(@QueryParam("name") @DefaultValue("guest") String name) {
        return helloService.createHello(name);
    }

}
