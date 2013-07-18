package br.iff.campos.pooa20131d.oficina.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The persistent class for the mecanico database table.
 * 
 */
@Entity
@XmlRootElement
public class Mecanico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String uid;

	private String especialidade;

	private String nome;

	private String telefone;

	//bi-directional many-to-one association to Itemso
	@OneToMany(mappedBy="mecanico")
	private List<Itemso> itemsos;

	public Mecanico() {
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getEspecialidade() {
		return this.especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Itemso> getItemsos() {
		return this.itemsos;
	}

	public void setItemsos(List<Itemso> itemsos) {
		this.itemsos = itemsos;
	}

	public Itemso addItemso(Itemso itemso) {
		getItemsos().add(itemso);
		itemso.setMecanico(this);

		return itemso;
	}

	public Itemso removeItemso(Itemso itemso) {
		getItemsos().remove(itemso);
		itemso.setMecanico(null);

		return itemso;
	}

}