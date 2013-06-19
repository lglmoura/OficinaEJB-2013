package br.iff.campos.pooa20131d.oficina.model.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.UUID;

import org.junit.Test;

import br.iff.campos.pooa20131d.oficina.model.controller.ProprietarioPersistence;
import br.iff.campos.pooa20131d.oficina.model.entity.Proprietario;

public class ProprietarioTest {

	private ProprietarioPersistence pprop = new ProprietarioPersistence();
	private String uid = UUID.randomUUID().toString();

	@Test
	public void testInserir() {
		Proprietario prop = pprop.inserir(uid, "bairro", "cidade",
				"complemento", "cpf", 20, "nome", "rua", "uf");
		assertEquals(prop.getUid(),uid);
	}

	@Test
	public void testUpdateStringStringStringStringStringIntegerStringStringString() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindString() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteString() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

}
