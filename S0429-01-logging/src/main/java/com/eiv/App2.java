package com.eiv;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.eiv.sub.SubClase;

public class App2 {

    private static final Logger LOG = LogManager.getLogger(App2.class);
    
    public static void main(String[] args) {

        LOG.trace("Muestro muchos detalles");
        LOG.debug("Muestro informacion util para depurar la app");
        
        LOG.info("Mensaje de informacion");  // <-- Nivel del logger
        LOG.warn("Mensaje de advertencia");
        LOG.error("Mensaje de error");      // <-- Nivel del logger sin configuracion
        LOG.fatal("Mensaje de error que detiene la ejecucion de la app");
        
        SubClase.run();
        
        try {
            SubClase.dividir(5,  0);
        } catch (RuntimeException e) {
//            LOG.error("Estoy dividiendo por cero!", e);
//            LOG.error("Estoy dividiendo por cero!");
            if(LOG.isDebugEnabled()) {
                LOG.error("Estoy dividiendo por cero!", e);
            } else {
                LOG.error("Estoy dividiendo por cero!");
            }
        }
    }
}
