package com.meustickets.meustickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meustickets.meustickets.entity.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {

}
