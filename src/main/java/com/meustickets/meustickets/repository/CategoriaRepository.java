package com.meustickets.meustickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meustickets.meustickets.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
