package com.rodrigo.TFG_cliente.Integracion;

/**
 * @Author Rodrigo de Miguel González
 * @Date 2017-2018
 * TFG - Atravesando las Capas de una Aplicación Empresarial: Demostrador Tecnológico J2EE
 */
public class EMFSingleton {

    private static javax.persistence.EntityManagerFactory ourInstance =
            javax.persistence.Persistence.createEntityManagerFactory("TFG_cliente");

    public static javax.persistence.EntityManagerFactory getInstance() { return ourInstance;    }


    @Override
    protected void finalize() throws Throwable {
        if (ourInstance.isOpen()) {
            ourInstance.close();
        }
        super.finalize();
    }
}
