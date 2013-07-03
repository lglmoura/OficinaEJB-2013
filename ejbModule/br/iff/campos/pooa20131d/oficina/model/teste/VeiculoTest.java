package br.iff.campos.pooa20131d.oficina.model.teste;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.iff.campos.pooa20131d.oficina.model.controller.ProprietarioPersistence;
import br.iff.campos.pooa20131d.oficina.model.controller.VeiculoPersistence;
import br.iff.campos.pooa20131d.oficina.model.entity.Proprietario;
import br.iff.campos.pooa20131d.oficina.model.entity.Veiculo;

public class VeiculoTest {

	private ProprietarioPersistence pprop;
	private String uid;
	private Proprietario prop;
	
	@Before
	public void setUp() throws Exception {
		pprop = new ProprietarioPersistence();
		uid = "001";
		prop = pprop.inserir(uid, "bairro", "cidade",
				"complemento", "cpf", 20, "nome", "rua", "uf");
	}

	@After
	public void tearDown() throws Exception {
		pprop.delete(uid);
	}

	@Test
	public void testInserir() {
		VeiculoPersistence pveic = new VeiculoPersistence();
		Veiculo veic = pveic.inserir(uid, 2013, "preta", "ferrari", "12344",
				pprop.find(uid));
		assertEquals(veic.getUid(), uid);
		pveic.delete(uid);
	}

	@Test
	public void testUpdate() {
		VeiculoPersistence pveic = new VeiculoPersistence();
		pveic.inserir(uid, 2013, "preta", "ferrari", "12344", pprop.find(uid));
		Veiculo veic = pveic.update(uid, 2013, "preta", "ferrari", "12344",
				pprop.find(uid));
		assertEquals(veic.getUid(), uid);
		pveic.delete(uid);
	}

	@Test
	public void testFind() {
		VeiculoPersistence pveic = new VeiculoPersistence();
		pveic.inserir(uid, 2013, "preta", "ferrari", "12344", pprop.find(uid));
		Veiculo veic = pveic.find(uid);
		assertEquals(veic.getUid(), uid);
		pveic.delete(uid);
	}

	@Test
	public void testDelete() {
		VeiculoPersistence pveic = new VeiculoPersistence();
		pveic.inserir(uid, 2013, "preta", "ferrari", "12344", pprop.find(uid));
		pveic.delete(uid);
		
	}

	@Test
	public void testFindAll() {
		VeiculoPersistence pveic = new VeiculoPersistence();
		pveic.inserir(uid, 2013, "preta", "ferrari", "12344", pprop.find(uid));
		List<Veiculo> lveic = pveic.findAll();
		for(Veiculo veic : lveic){
			assertEquals(veic.getUid(), uid);
			
		}
		pveic.delete(uid);
		
	}

}
