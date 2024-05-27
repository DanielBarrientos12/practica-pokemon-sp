package com.ufps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufps.entities.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

}
