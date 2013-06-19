package br.iff.campos.pooa20131d.oficina.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ordemservico database table.
 * 
 */
@Entity
public class Ordemservico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String uid;

	@Temporal(TemporalType.DATE)
	private Date dataos;

	//bi-directional many-to-one association to Itemso
	@OneToMany(mappedBy="ordemservico")
	private List<Itemso> itemsos;

	//bi-directional many-to-one association to Veiculo
	@ManyToOne
	@JoinColumn(name="uidveiculo")
	private Veiculo veiculo;

	public Ordemservico() {
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Date getDataos() {
		return this.dataos;
	}

	public void setDataos(Date dataos) {
		this.dataos = dataos;
	}

	public List<Itemso> getItemsos() {
		return this.itemsos;
	}

	public void setItemsos(List<Itemso> itemsos) {
		this.itemsos = itemsos;
	}

	public Itemso addItemso(Itemso itemso) {
		getItemsos().add(itemso);
		itemso.setOrdemservico(this);

		return itemso;
	}

	public Itemso removeItemso(Itemso itemso) {
		getItemsos().remove(itemso);
		itemso.setOrdemservico(null);

		return itemso;
	}

	public Veiculo getVeiculo() {
		return this.veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

}