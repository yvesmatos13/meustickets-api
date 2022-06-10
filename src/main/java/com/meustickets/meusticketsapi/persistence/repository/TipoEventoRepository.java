package com.meustickets.meusticketsapi.persistence.repository;

import java.util.Optional;

import com.meustickets.meusticketsapi.persistence.entity.TipoEvento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEventoRepository extends JpaRepository<TipoEvento, Long> {
    
    Optional<TipoEvento> findByIdTipoEvento(Long idTipoEvento);

}
