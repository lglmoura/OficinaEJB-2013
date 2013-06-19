package br.iff.campos.pooa20131d.oficina.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the servico database table.
 * 
 */
@Entity
public class Servico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String uid;

	private String descricao;

	private float preco;

	private float tempo;

	//bi-directional many-to-one association to Itemso
	@OneToMany(mappedBy="servico")
	private List<Itemso> itemsos;

	public Servico() {
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return this.preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getTempo() {
		return this.tempo;
	}

	public void setTempo(float tempo) {
		this.tempo = tempo;
	}

	public List<Itemso> getItemsos() {
		return this.itemsos;
	}

	public void setItemsos(List<Itemso> itemsos) {
		this.itemsos = itemsos;
	}

	public Itemso addItemso(Itemso itemso) {
		getItemsos().add(itemso);
		itemso.setServico(this);

		return itemso;
	}

	public Itemso removeItemso(Itemso itemso) {
		getItemsos().remove(itemso);
		itemso.setServico(null);

		return itemso;
	}

}