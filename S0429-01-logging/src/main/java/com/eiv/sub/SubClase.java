package com.eiv.sub;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class SubClase {
    
    private static final Logger LOG = LogManager.getLogger(SubClase.class);

    public static void run() {
        LOG.info("Mensaje de info!!");
        LOG.debug("No aparece!");
    }

    public static int dividir(int a, int b) {
        if(b == 0) {
//            LOG.error("Estoy dividiendo por cero!");
            throw new RuntimeException("Division por cero!");
        }
        return a / b;
    }
}
