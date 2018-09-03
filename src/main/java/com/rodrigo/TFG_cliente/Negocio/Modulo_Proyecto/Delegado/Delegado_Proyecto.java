package com.rodrigo.TFG_cliente.Negocio.Modulo_Proyecto.Delegado;

import com.rodrigo.TFG_cliente.Negocio.Modulo_Empleado.Entidad.Transfers.TEmpleado;
import com.rodrigo.TFG_cliente.Negocio.Modulo_Empleado.Excepciones.EmpleadoException;
import com.rodrigo.TFG_cliente.Negocio.Modulo_Proyecto.Delegado.impl.Delegado_ProyectoImpl;
import com.rodrigo.TFG_cliente.Negocio.Modulo_Proyecto.Entidad.Transfers.TEmpleadoProyecto;
import com.rodrigo.TFG_cliente.Negocio.Modulo_Proyecto.Entidad.Transfers.TProyecto;
import com.rodrigo.TFG_cliente.Negocio.Modulo_Proyecto.Entidad.Transfers.TProyectoCompleto;
import com.rodrigo.TFG_cliente.Negocio.Modulo_Proyecto.Excepciones.ProyectoException;
import com.rodrigo.TFG_cliente.Negocio.Modulo_Proyecto.Excepciones.ProyectoFieldInvalidException;
import com.rodrigo.TFG_cliente.Negocio.Modulo_Proyecto.Excepciones.ProyectoYaExistenteException;
import com.rodrigo.TFG_cliente.Presentacion.Proxy.Excepciones.ProxyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public abstract class Delegado_Proyecto  {

    private final static Logger log = LoggerFactory.getLogger(Delegado_Proyecto.class);

    String HOST = "http://localhost" ;
//    String HOST = "https://127.0.0.1" ;

    String PORT = "8080";
//    String PORT = "8443";

    String APP_URI = "/TFG_server/services";


    protected final String URL_WSDL = HOST + ":" + PORT + APP_URI +  "/SA_Proyecto?wsdl";

    protected final String NAMESPACE_URI = "http://impl.Serv_aplicacion.Modulo_Proyecto.Negocio.TFG_server.rodrigo.com/";

    protected final String SERVICE_NAME = "Broker_SA_ProyectoImpl";



    private static Delegado_Proyecto ourInstance;

    static {
        try {
            ourInstance = new Delegado_ProyectoImpl();
        } catch (ProxyException e) {
            log.error("Error al crear el DelegadoDelNegocio", e);
        }
    }


    public static Delegado_Proyecto getInstance() {
        return ourInstance;
    }



    public abstract TProyecto crearProyecto(TProyecto proyectoNuevo) throws ProyectoYaExistenteException, ProyectoFieldInvalidException, ProyectoException;

    public abstract TProyectoCompleto buscarByID(Long id) throws ProyectoFieldInvalidException, ProyectoException;

    public abstract TProyectoCompleto buscarByNombre(String nombre) throws ProyectoFieldInvalidException, ProyectoException;


    public abstract boolean eliminarProyecto(Long id) throws ProyectoFieldInvalidException, ProyectoException;

    public abstract List<TProyecto> listarProyectos();

    public abstract TEmpleadoProyecto añadirEmpleadoAProyecto( TEmpleado e, TProyecto p, int horas) throws ProyectoException, EmpleadoException;

    public abstract boolean eliminarEmpleadoAProyecto(Long idEmple, Long idProy) throws ProyectoException, EmpleadoException;


}
