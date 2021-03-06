

package ar.gob.ambiente.sacvefor.servicios.territorial;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase para manipular las Provincias provenientes del servicio territorial
 * @author rincostante
 */
@XmlRootElement(name = "provincia")
public class Provincia implements Serializable {

    private Long id;
    private String nombre;      
    
    /******************
     * Constructores **
     ******************/   
    public Provincia(){
        this.id = Long.valueOf(0);
        this.nombre = "dafault";
    }   
    
    public Provincia(Long id, String nombre){
        this.id = id;
        this.nombre = nombre;
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
        if (!(object instanceof Provincia)) {
            return false;
        }
        Provincia other = (Provincia) object;
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
                append(nombre).toString();
    }
    
}
