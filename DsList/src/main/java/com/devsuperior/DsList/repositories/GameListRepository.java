package com.devsuperior.DsList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.DsList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
