package br.iff.campos.pooa20131d.oficina.model.controller;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.iff.campos.pooa20131d.oficina.model.entity.Mecanico;

@Stateless
@LocalBean
public class MecanicoPersistence extends AbstractPersistence {

	public Mecanico inserir(String uid, String especialidade, String nome,
			String telefone) {

		Mecanico mecanico = new Mecanico();

		mecanico.setUid(uid);
		mecanico.setEspecialidade(especialidade);
		mecanico.setNome(nome);
		mecanico.setTelefone(telefone);
		super.insert(mecanico);

		return mecanico;

	}

	public Mecanico update(String uid, String especialidade, String nome,
			String telefone) {

		Mecanico mecanico = super.find(Mecanico.class, uid);

		mecanico.setUid(uid);
		mecanico.setEspecialidade(especialidade);
		mecanico.setNome(nome);
		mecanico.setTelefone(telefone);
		super.update(mecanico);

		return mecanico;

	}

	public Mecanico find(String uid) {

		return super.find(Mecanico.class, uid);
	}

	public void delete(String uid) {
		super.delete(Mecanico.class, uid);
	}

	public List<Mecanico> findAll() {
		return super.findAll(Mecanico.class);

	}

}
