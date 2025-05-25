package com.devsuperior.DsList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.DsList.dto.GameMinDTO;
import com.devsuperior.DsList.entities.Games;
import com.devsuperior.DsList.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Games> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
		
	}
	

}
