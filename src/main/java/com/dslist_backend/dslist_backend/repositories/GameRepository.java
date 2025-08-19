package com.dslist_backend.dslist_backend.repositories;

import com.dslist_backend.dslist_backend.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}
