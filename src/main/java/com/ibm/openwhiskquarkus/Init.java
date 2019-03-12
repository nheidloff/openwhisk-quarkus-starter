package com.ibm.openwhiskquarkus;

import javax.ws.rs.Path;
import javax.ws.rs.POST;

@Path("/init")
public class Init {

    @POST
    public String hello() {
        return "";
    }
}