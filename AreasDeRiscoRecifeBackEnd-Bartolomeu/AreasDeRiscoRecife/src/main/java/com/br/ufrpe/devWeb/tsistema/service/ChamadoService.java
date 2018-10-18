package com.br.ufrpe.devWeb.tsistema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.ufrpe.devWeb.tsistema.exception.ChamadoNotFoundException;
import com.br.ufrpe.devWeb.tsistema.model.Chamado;
import com.br.ufrpe.devWeb.tsistema.repository.ChamadoRepository;


@Service
public class ChamadoService {
  
  @Autowired
  public ChamadoRepository chamadoRepository;
  
  public Chamado save(Chamado chamado) {
    return chamadoRepository.save(chamado);
  }

  public List<Chamado> findAll() {
    return chamadoRepository.findAll();
  }
  
  public Chamado findOne(Long id) {
    Chamado chamado = chamadoRepository.getOne(id);
    if (chamado == null) throw new ChamadoNotFoundException(id);

    return chamado;
  }

  public Chamado update(Chamado chamadoUpdated) {

    Chamado chamado = chamadoRepository.getOne(chamadoUpdated.getProcesso_numero());

    if (chamado == null) {

      throw new ChamadoNotFoundException(chamadoUpdated.getProcesso_numero());

    }else {

      chamado.setLatitude(chamadoUpdated.getLatitude());
      chamado.setLongitude(chamadoUpdated.getLongitude());
    }

    return chamadoRepository.save(chamado);
  }
  
}
