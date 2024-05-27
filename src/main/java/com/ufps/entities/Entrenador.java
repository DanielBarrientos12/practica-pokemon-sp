package com.ufps.entities;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Entrenador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
    private String nombre;
    
	@NotNull
	private String apellido;
    
	@NotNull
	private LocalDate fechaNacimiento;
    
	@NotNull
	private LocalDate fechaVinculacion;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pueblo_id")
    private Pueblo pueblo;
    
    private String uuid;
    
    @ManyToMany
    @JoinTable(
        name = "captura", 
        joinColumns = @JoinColumn(name = "entrenador_id"), 
        inverseJoinColumns = @JoinColumn(name = "pokemon_id") 
    )
    private Set<Pokemon> pokemons;

}