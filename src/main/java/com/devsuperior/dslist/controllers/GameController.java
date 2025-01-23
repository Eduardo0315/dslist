package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.services.GameService;

@RestController // para a classe implementar a api
@RequestMapping(value = "/games") // configura o endpoint da api
public class GameController { // implementa a api

	@Autowired

	private GameService gameService; // injeta o service no controller, que por sua vez injeta o repository

	@GetMapping //define o metodo como endpoint http get
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
}
