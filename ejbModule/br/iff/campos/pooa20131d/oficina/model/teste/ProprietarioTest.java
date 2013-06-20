package br.iff.campos.pooa20131d.oficina.model.teste;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.UUID;

import org.junit.Test;

import br.iff.campos.pooa20131d.oficina.model.controller.ProprietarioPersistence;
import br.iff.campos.pooa20131d.oficina.model.entity.Proprietario;

public class ProprietarioTest {

	private ProprietarioPersistence pprop = new ProprietarioPersistence();
	private String uid = "001";

	@Test
	public void testInserir() {
		Proprietario prop = pprop.inserir(uid, "bairro", "cidade",
				"complemento", "cpf", 20, "nome", "rua", "uf");
		assertEquals(prop.getUid(), uid);
	}

	@Test
	public void testUpdate() {
		Proprietario prop = pprop.update(uid, "bairroUPDATE", "cidade",
				"complemento", "cpf", 20, "nome", "rua", "uf");
		assertEquals(prop.getBairro(), "bairroUPDATE");
	}

	@Test
	public void testFind() {
		Proprietario prop = pprop.find(uid);
		assertEquals(prop.getCidade(), "cidade");

	}

	@Test
	public void testFindAll() {
		List<Proprietario> lprpop = pprop.findAll();
		for (Proprietario prop : lprpop) {
			assertEquals(prop.getCidade(), "cidade");

		}

	}

	@Test
	public void testDelete() {
		pprop.delete(uid);
		

	}

}
