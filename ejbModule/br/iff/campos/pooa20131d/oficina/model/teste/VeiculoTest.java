package br.iff.campos.pooa20131d.oficina.model.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import br.iff.campos.pooa20131d.oficina.model.controller.ProprietarioPersistence;
import br.iff.campos.pooa20131d.oficina.model.controller.VeiculoPersistence;
import br.iff.campos.pooa20131d.oficina.model.entity.Proprietario;
import br.iff.campos.pooa20131d.oficina.model.entity.Veiculo;

public class VeiculoTest {

	private ProprietarioPersistence pprop = new ProprietarioPersistence();
	private VeiculoPersistence pveic = new VeiculoPersistence();
	private String uid = "001";
	private Proprietario prop = pprop.inserir(uid, "bairro", "cidade",
			"complemento", "cpf", 20, "nome", "rua", "uf");

	@Test
	public void testInserir() {
		Veiculo veic = pveic.inserir(uid, 2013, "preta", "ferrari", "12344",
				pprop.find(uid));
		assertEquals(prop.getUid(), uid);
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testFind() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		pveic.delete(uid);
		pprop.delete(uid);
	}

	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

}
