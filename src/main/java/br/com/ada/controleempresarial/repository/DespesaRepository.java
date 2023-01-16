package br.com.ada.controleempresarial.repository;

import br.com.ada.controleempresarial.model.Despesa;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DespesaRepository extends CrudRepository<Despesa, Long> {
}