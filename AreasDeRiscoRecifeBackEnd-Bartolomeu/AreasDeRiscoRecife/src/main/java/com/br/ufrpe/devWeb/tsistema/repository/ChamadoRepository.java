package com.br.ufrpe.devWeb.tsistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.ufrpe.devWeb.tsistema.model.Chamado;

@Repository
public interface ChamadoRepository extends JpaRepository<Chamado, Long>{

}
