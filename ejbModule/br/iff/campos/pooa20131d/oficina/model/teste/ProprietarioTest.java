package br.iff.campos.pooa20131d.oficina.model.teste;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.UUID;

import org.junit.Test;

import br.iff.campos.pooa20131d.oficina.model.controller.ProprietarioPersistence;
import br.iff.campos.pooa20131d.oficina.model.entity.Proprietario;

public class ProprietarioTest {

	private String uid = "001";

	@Test
	public void testInserir() {
		ProprietarioPersistence pprop = new ProprietarioPersistence();
		Proprietario prop = pprop.inserir(uid, "bairro", "cidade",
				"complemento", "cpf", 20, "nome", "rua", "uf");
		assertEquals(prop.getUid(), uid);
		pprop.delete(uid);
	}

	@Test
	public void testUpdate() {
		ProprietarioPersistence pprop = new ProprietarioPersistence();
		pprop.inserir(uid, "bairro", "cidade", "complemento", "cpf", 20,
				"nome", "rua", "uf");
		Proprietario prop = pprop.update(uid, "bairroUPDATE", "cidade",
				"complemento", "cpf", 20, "nome", "rua", "uf");
		assertEquals(prop.getBairro(), "bairroUPDATE");
		pprop.delete(uid);
	}

	@Test
	public void testFind() {
		ProprietarioPersistence pprop = new ProprietarioPersistence();
		pprop.inserir(uid, "bairro", "cidade", "complemento", "cpf", 20,
				"nome", "rua", "uf");
		Proprietario prop = pprop.find(uid);
		assertEquals(prop.getCidade(), "cidade");
		pprop.delete(uid);

	}

	@Test
	public void testFindAll() {
		ProprietarioPersistence pprop = new ProprietarioPersistence();
		pprop.inserir(uid, "bairro", "cidade", "complemento", "cpf", 20,
				"nome", "rua", "uf");
		List<Proprietario> lprpop = pprop.findAll();
		for (Proprietario prop : lprpop) {
			assertEquals(prop.getCidade(), "cidade");

		}
		pprop.delete(uid);

	}

	@Test
	public void testDelete() {
		ProprietarioPersistence pprop = new ProprietarioPersistence();
		pprop.inserir(uid, "bairro", "cidade", "complemento", "cpf", 20,
				"nome", "rua", "uf");
		pprop.delete(uid);

	}

}
