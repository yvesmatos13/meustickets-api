package com.meustickets.meustickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meustickets.meustickets.entity.Ingresso;

public interface IngressoRepository extends JpaRepository<Ingresso, Long> {

}
