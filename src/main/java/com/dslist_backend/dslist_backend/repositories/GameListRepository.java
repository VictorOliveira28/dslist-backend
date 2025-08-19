package com.dslist_backend.dslist_backend.repositories;

import com.dslist_backend.dslist_backend.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {
}
