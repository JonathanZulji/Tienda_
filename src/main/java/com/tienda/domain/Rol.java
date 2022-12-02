
package com.tienda.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

        @Data
        @Entity
        @Table(name="rol")
public class Rol implements serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTY)
    @Column(name="id_rol")
    
    private Long idRol;
    @NotEmpty
    private String nombre;
   
    
    
        
    }
   
    
         
}
