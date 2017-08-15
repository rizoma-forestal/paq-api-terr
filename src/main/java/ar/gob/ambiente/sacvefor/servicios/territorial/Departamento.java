
package ar.gob.ambiente.sacvefor.servicios.territorial;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase para manipular los Departamentos provenientes del servicio territorial
 * @author rincostante
 */
@XmlRootElement(name = "departamento")

public class Departamento implements Serializable {

    private Long id;
    private String nombre;
    private Provincia provincia;    
    
    /******************
     * Constructores **
     ******************/
    public Departamento(){
        this.id = Long.valueOf(0);
        this.nombre = "dafault";
        this.provincia = new Provincia();
    }
    
    public Departamento(Long id, String nombre, Provincia provincia){
        this.id = id;
        this.nombre = nombre;
        this.provincia = provincia;
    }
    
    /**********************
     * Métodos de acceso **
     **********************/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    
    
    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    /**************************
     * Métodos sobreescritos **
     **************************/
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamento)) {
            return false;
        }
        Departamento other = (Departamento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return new StringBuffer(" id: ").
                append(id).
                append(" nombre: ").
                append(nombre).
                append(" provincia: ").
                append(provincia.getNombre()).toString();
    } 
}
