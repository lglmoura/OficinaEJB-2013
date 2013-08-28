package br.iff.campos.pooa20131d.oficina.model.controller;

import java.util.Date;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.iff.campos.pooa20131d.oficina.model.entity.Ordemservico;
import br.iff.campos.pooa20131d.oficina.model.entity.Veiculo;


@Stateless
@LocalBean
public class OrdemservicoPersistence extends AbstractPersistence {

	public Ordemservico inserir(String uid, Date dataos, Veiculo veiculo) {

		Ordemservico ordemservico = new Ordemservico();

		ordemservico.setUid(uid);
		ordemservico.setDataos(dataos);
		ordemservico.setVeiculo(veiculo);
		super.insert(ordemservico);

		return ordemservico;

	}

	public Ordemservico update(String uid, Date dataos, Veiculo veiculo) {

		Ordemservico ordemservico = super.find(Ordemservico.class, uid);

		ordemservico.setUid(uid);
		ordemservico.setDataos(dataos);
		ordemservico.setVeiculo(veiculo);
		super.update(ordemservico);

		return ordemservico;
	}

	public Ordemservico find(String uid) {

		return super.find(Ordemservico.class, uid);
	}

	public void delete(String uid) {
		super.delete(Ordemservico.class, uid);
	}

	public List<Ordemservico> findAll() {
		return super.findAll(Ordemservico.class);

	}

}
