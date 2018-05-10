package com.rodrigo.TFG_cliente.Negocio.Modulo_Proyecto.Serv_aplicacion;

import com.rodrigo.TFG_cliente.Negocio.Modulo_Empleado.Entidad.Transfers.TEmpleado;
import com.rodrigo.TFG_cliente.Negocio.Modulo_Proyecto.Entidad.Transfers.TEmpleadoProyecto;
import com.rodrigo.TFG_cliente.Negocio.Modulo_Proyecto.Entidad.Transfers.TProyecto;
import com.rodrigo.TFG_cliente.Negocio.Modulo_Proyecto.Entidad.Transfers.TProyectoCompleto;
import com.rodrigo.TFG_cliente.Negocio.Modulo_Proyecto.Excepciones.ProyectoException;
import com.rodrigo.TFG_cliente.Negocio.Modulo_Proyecto.Excepciones.ProyectoFieldInvalidException;
import com.rodrigo.TFG_cliente.Negocio.Modulo_Proyecto.Excepciones.ProyectoYaExistenteException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService(
        targetNamespace = "http://impl.Serv_aplicacion.Modulo_Proyecto.Negocio.TFG_server.rodrigo.com/",
        name = "Broker_SA_ProyectoImpl")
public interface IBroker_SA_Proyecto {

    @WebMethod(operationName="crearProyecto")
    public TProyecto crearProyecto(@WebParam(name = "Proyecto") TProyecto proyectoNuevo) throws ProyectoYaExistenteException, ProyectoFieldInvalidException, ProyectoException;

    @WebMethod(operationName="buscarByID")
    public TProyectoCompleto buscarByID(@WebParam(name = "id") Long id) throws ProyectoFieldInvalidException, ProyectoException;


    @WebMethod(operationName="buscarByNombre")
    TProyectoCompleto buscarByNombre(@WebParam(name = "nombre") String nombre) throws ProyectoFieldInvalidException, ProyectoException;

    @WebMethod(operationName="eliminarProyecto")
    public boolean eliminarProyecto(@WebParam(name = "Proyecto") TProyecto proyectoEliminar) throws ProyectoFieldInvalidException, ProyectoException;


    @WebMethod(operationName="listarProyectos")
    public List<TProyecto> listarProyectos();


    @WebMethod(operationName="añadirEmpleadoAProyecto")
    TEmpleadoProyecto añadirEmpleadoAProyecto(@WebParam(name = "e") TEmpleado e, @WebParam(name = "p") TProyecto p, @WebParam(name = "horas") int horas);


}

