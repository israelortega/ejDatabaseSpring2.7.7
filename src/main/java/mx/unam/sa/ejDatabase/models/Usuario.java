/*
 * (c) UNAM, 2022
 */
package mx.unam.sa.ejDatabase.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author israel1971
 */
@Entity
@Table(name = "TUSUARIO")
public @Data
class Usuario implements Serializable {

    @Id
    @Column(name = "iNumEmp")
    Long numEmp;
    @Column(name = "vcNombre", length=50)
    String nombre;
    @Column(name = "vcAp_Pat", length=50)
    String primerApp;
    @Column(name = "vcAp_Mat", length=50)
    String segundoApp;

    public Usuario() {
    }

    
    public Usuario(Long numEmp, String nombre, String primerApp, String segundoApp) {
        this.numEmp = numEmp;
        this.nombre = nombre;
        this.primerApp = primerApp;
        this.segundoApp = segundoApp;
    }
   
    
    
}
