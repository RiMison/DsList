package com.devsuperior.DsList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.DsList.entities.Games;

public interface GameRepository extends JpaRepository<Games, Long>{

}
