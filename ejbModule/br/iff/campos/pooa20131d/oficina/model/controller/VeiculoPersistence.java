package br.iff.campos.pooa20131d.oficina.model.controller;

import java.util.List;

import br.iff.campos.pooa20131d.oficina.model.entity.Proprietario;
import br.iff.campos.pooa20131d.oficina.model.entity.Veiculo;


public class VeiculoPersistence extends AbstractPersistence  {
	
	public Veiculo inserir(String uid, Integer ano, String cor,
			String modelo, String placa, Proprietario proprietario) {

		Veiculo veiculo = new Veiculo();
		
		veiculo.setUid(uid);
		veiculo.setAno(ano);
		veiculo.setCor(cor);
		veiculo.setPlaca(placa);
		veiculo.setModelo(modelo);
		veiculo.setProprietario(proprietario);
		
		super.insert(veiculo);

		return veiculo;

	}

	public Veiculo update(String uid, Integer ano, String cor,
			String modelo, String placa, Proprietario proprietario) {
		Veiculo veiculo = super.find(Veiculo.class, uid);

		veiculo.setUid(uid);
		veiculo.setAno(ano);
		veiculo.setCor(cor);
		veiculo.setPlaca(placa);
		veiculo.setModelo(modelo);
		veiculo.setProprietario(proprietario);
		super.update(proprietario);

		return veiculo;

	}

	public Veiculo find(String uid) {

		return super.find(Veiculo.class, uid);
	}

	public void delete(String uid) {
		super.delete(Veiculo.class, uid);
	}

	public List<Veiculo> findAll() {
		return super.findAll(Veiculo.class);

	}


}
