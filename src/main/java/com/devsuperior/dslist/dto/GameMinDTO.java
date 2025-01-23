package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

import jakarta.persistence.Column;

public class GameMinDTO { //Atraves dessa classe e possivel customizar o que vai aparecer na requisicao http
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;

	public GameMinDTO() {

	}

	public GameMinDTO(Game entity) { // Instancia a classe entity e define os argumentos do construtor os mesmo da
										// classe Game
		super();
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();

	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	

}
