package com.rodrigo.TFG_cliente.Negocio.Modulo_Departamento.Entidad.Transfers;

import com.rodrigo.TFG_cliente.Negocio.Modulo_Empleado.Entidad.Transfers.TEmpleado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TDepartamentoCompleto extends TDepartamento {


    private TDepartamento departamento;

    private HashMap<Long, TEmpleado> empleados = new HashMap<>();



    public TDepartamentoCompleto() {}

    public TDepartamentoCompleto(TDepartamento departamento) {
        this.departamento = departamento;
    }

    public TDepartamentoCompleto(TDepartamento departamento, HashMap<Long, TEmpleado> empleados) {
        this.departamento = departamento;
        this.empleados = empleados;
    }



    public TEmpleado addTEmpeado(TEmpleado te){
       return empleados.put(te.getId(), te);
    }

    public TEmpleado removeTEmpleado(Long id){
        return empleados.remove(id);
    }


    public Long getId(){
        return departamento.getId();
    }

    public String getSiglas(){ return departamento.getSiglas();}


    public TDepartamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(TDepartamento departamento) {
        this.departamento = departamento;
    }

    public HashMap<Long, TEmpleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashMap<Long, TEmpleado> empleados) {
        this.empleados = empleados;
    }





    @Override
    public String toString() {
        return "TDepartamentoCompleto{" +
                "departamento=" + departamento +
                ", empleados=" + empleados +
                '}';
    }
}
