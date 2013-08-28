package br.iff.campos.pooa20131d.oficina.model.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.iff.campos.pooa20131d.oficina.model.entity.Itemso;
import br.iff.campos.pooa20131d.oficina.model.entity.Mecanico;
import br.iff.campos.pooa20131d.oficina.model.entity.Ordemservico;
import br.iff.campos.pooa20131d.oficina.model.entity.Servico;



@Stateless
@LocalBean
public class ItensoPersistence extends AbstractPersistence {

	public Itemso inserir(String uid, Date datafim, Date datainicio,
			Timestamp horafim, Timestamp horainicio, Servico servico,
			Ordemservico ordemservico, Mecanico mecanico) {

		Itemso itenso = new Itemso();

		itenso.setUid(uid);
		itenso.setDatafim(datafim);
		itenso.setDatainicio(datainicio);
		itenso.setHorafim(horafim);
		itenso.setHorainicio(horainicio);
		itenso.setServico(servico);
		itenso.setOrdemservico(ordemservico);
		itenso.setMecanico(mecanico);
		super.insert(itenso);

		return itenso;

	}

	public Itemso update(String uid, Date datafim, Date datainicio,
			Timestamp horafim, Timestamp horainicio, Servico servico,
			Ordemservico ordemservico, Mecanico mecanico) {

		Itemso itenso = super.find(Itemso.class, uid);

		itenso.setUid(uid);
		itenso.setDatafim(datafim);
		itenso.setDatainicio(datainicio);
		itenso.setHorafim(horafim);
		itenso.setHorainicio(horainicio);
		itenso.setServico(servico);
		itenso.setOrdemservico(ordemservico);
		itenso.setMecanico(mecanico);
		super.update(itenso);

		return itenso;
	}

	public Itemso find(String uid) {

		return super.find(Itemso.class, uid);
	}

	public void delete(String uid) {
		super.delete(Itemso.class, uid);
	}

	public List<Itemso> findAll() {
		return super.findAll(Itemso.class);

	}
}
