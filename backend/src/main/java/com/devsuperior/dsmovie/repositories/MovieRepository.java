package com.devsuperior.dsmovie.repositories;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	

}
