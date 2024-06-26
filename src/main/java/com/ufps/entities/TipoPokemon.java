package com.ufps.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class TipoPokemon {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
    private String descripcion;
    private String uuid;
    
}
