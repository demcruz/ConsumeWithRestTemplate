package br.com.RestTemplates.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.RestTemplates.entity.Distritos;

@Repository
public interface DistritoRepository extends JpaRepository<Distritos, Integer> {

}
