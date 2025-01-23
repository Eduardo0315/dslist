package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service // registra a classe como sendo componente do sistema
public class GameService { //Responsavel pelos servicos entre o banco de dados e a api
	@Autowired // com essa notation o proprio spring resolve a dependencia
	private GameRepository gameRepository; // injeta uma instancia do GameRepository dentro do gameservice

	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll(); // consulta o banco de dados para buscar todos os games. o
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList(); //Converte Game em GameMinDTO
		return dto;									// resultado e uma tabela de games qwue sera convertido em lista

		// devido ao extends do game repository, e possivel chamar varios metodos de
		// consulta sql
	}

}
