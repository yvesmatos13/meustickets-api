package com.meustickets.meustickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meustickets.meustickets.entity.Assunto;

public interface AssuntoRepository extends JpaRepository<Assunto, Long> {
	
}
