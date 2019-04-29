package com.eiv;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    private static final Logger LOG = Logger.getLogger("App de prueba");
    
    public static void main(String[] args) {
//        LOG.info("Mensaje de informacion!");
        LOG.log(Level.INFO, "Mensaje de informacion!");
        LOG.log(Level.WARNING, "Esto es una advertencia");
        LOG.log(Level.SEVERE, "Esto es un error");
        LOG.log(Level.FINE, "Mensaje de depuracion");
        
        // Log4J2 <--- *** LA MAS POPULAR Y ES USADA POR DEFECTO EN SPRING
        // LogBack
    }
}
