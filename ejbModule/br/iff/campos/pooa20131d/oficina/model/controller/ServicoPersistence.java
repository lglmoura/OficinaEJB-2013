package br.iff.campos.pooa20131d.oficina.model.controller;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.iff.campos.pooa20131d.oficina.model.entity.Servico;


@Stateless
@LocalBean
public class ServicoPersistence extends AbstractPersistence {

	public Servico inserir(String uid, String descricao, float preco,
			float tempo) {

		Servico servico = new Servico();

		servico.setUid(uid);
		servico.setDescricao(descricao);
		servico.setPreco(preco);
		servico.setTempo(tempo);
		super.insert(servico);

		return servico;

	}

	public Servico update(String uid, String descricao, float preco, float tempo) {

		Servico servico = super.find(Servico.class, uid);

		servico.setUid(uid);
		servico.setDescricao(descricao);
		servico.setPreco(preco);
		servico.setTempo(tempo);
		super.update(servico);

		return servico;

	}

	public Servico find(String uid) {

		return super.find(Servico.class, uid);
	}

	public void delete(String uid) {
		super.delete(Servico.class, uid);
	}

	public List<Servico> findAll() {
		return super.findAll(Servico.class);

	}

}
