package br.iff.campos.pooa20131d.oficina.model.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the itemsos database table.
 * 
 */
@Entity
@Table(name = "itemsos")
@XmlRootElement
public class Itemso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String uid;

	@Temporal(TemporalType.DATE)
	private Date datafim;

	@Temporal(TemporalType.DATE)
	private Date datainicio;

	@Temporal(TemporalType.DATE)
	private Date horafim;

	@Temporal(TemporalType.DATE)
	private Date horainicio;

	// bi-directional many-to-one association to Mecanico
	@ManyToOne
	@JoinColumn(name = "uidmecanico")
	private Mecanico mecanico;

	// bi-directional many-to-one association to Ordemservico
	@ManyToOne
	@JoinColumn(name = "uidordemservico")
	private Ordemservico ordemservico;

	// bi-directional many-to-one association to Servico
	@ManyToOne
	@JoinColumn(name = "uidservico")
	private Servico servico;

	public Itemso() {
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Date getDatafim() {
		return this.datafim;
	}

	public void setDatafim(Date datafim) {
		this.datafim = datafim;
	}

	public Date getDatainicio() {
		return this.datainicio;
	}

	public void setDatainicio(Date datainicio) {
		this.datainicio = datainicio;
	}

	public Date getHorafim() {
		return this.horafim;
	}

	public void setHorafim(Timestamp horafim) {
		this.horafim = horafim;
	}

	public Date getHorainicio() {
		return this.horainicio;
	}

	public void setHorainicio(Timestamp horainicio) {
		this.horainicio = horainicio;
	}

	public Mecanico getMecanico() {
		return this.mecanico;
	}

	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}

	public Ordemservico getOrdemservico() {
		return this.ordemservico;
	}

	public void setOrdemservico(Ordemservico ordemservico) {
		this.ordemservico = ordemservico;
	}

	public Servico getServico() {
		return this.servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

}