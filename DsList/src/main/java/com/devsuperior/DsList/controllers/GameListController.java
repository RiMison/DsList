package com.devsuperior.DsList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.DsList.dto.GameListDTO;
import com.devsuperior.DsList.dto.GameMinDTO;
import com.devsuperior.DsList.dto.ReplacementDTO;
import com.devsuperior.DsList.services.GameListService;
import com.devsuperior.DsList.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
		
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;		
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
		
	}
	
	@PostMapping(value = "/{listId}/replacement")
	public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body){
		gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
		
		
	}
	
	
	
	
	
	

}
