package com.rodrigo.TFG_cliente.Negocio.Modulo_Proyecto.Entidad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.io.Serializable;
import java.util.Objects;

@XmlAccessorType(XmlAccessType.FIELD)
public class ClavesEmpleadoProyecto implements Serializable {


    /****************************
     ********* ATRIBUTOS ********
     ****************************/

    private static final long serialVersionUID = 0;

//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Id private Long id;

    private Long idEmpleado;

    private Long idProyecto;

    public ClavesEmpleadoProyecto() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Long getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Long idProyecto) {
        this.idProyecto = idProyecto;
    }

    @Override
    public String toString() {
        return "ClavesEmpleadoProyecto{" +
                "idEmpleado=" + idEmpleado +
                ", idProyecto=" + idProyecto +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClavesEmpleadoProyecto)) return false;
        ClavesEmpleadoProyecto that = (ClavesEmpleadoProyecto) o;
        return Objects.equals(getIdEmpleado(), that.getIdEmpleado()) &&
                Objects.equals(getIdProyecto(), that.getIdProyecto());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getIdEmpleado(), getIdProyecto());
    }
}