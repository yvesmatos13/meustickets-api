package com.meustickets.meusticketsapi.persistence.repository;

import java.util.Optional;

import com.meustickets.meusticketsapi.persistence.entity.Evento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {

    Optional<Evento> findByIdEvento(Long idEvento);
    
}
