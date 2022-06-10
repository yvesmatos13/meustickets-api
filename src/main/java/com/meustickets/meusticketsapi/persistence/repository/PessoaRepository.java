package com.meustickets.meusticketsapi.persistence.repository;

import java.util.Optional;

import com.meustickets.meusticketsapi.persistence.entity.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
    Optional<Pessoa> findByIdPessoa(Long idPessoa);

}
