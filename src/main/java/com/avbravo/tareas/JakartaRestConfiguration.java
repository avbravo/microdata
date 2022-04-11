package com.avbravo.tareas;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

/**
 * Configures Jakarta RESTful Web Services for the application.
 * @author Juneau
 */
@ApplicationPath("microdata")
@ApplicationScoped
public class JakartaRestConfiguration extends Application {
    
}
