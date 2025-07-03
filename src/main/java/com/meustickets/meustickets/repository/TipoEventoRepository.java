package com.meustickets.meustickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meustickets.meustickets.entity.TipoEvento;

public interface TipoEventoRepository extends JpaRepository<TipoEvento, Long> {

}
