package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> { // componente que faz consultas com o banco. Para
																	// isso, colocar a classe do banco de dados e o tipo
																	// do id

}
