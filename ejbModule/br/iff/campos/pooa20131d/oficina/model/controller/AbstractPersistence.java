/**
 * 
 */
package br.iff.campos.pooa20131d.oficina.model.controller;

/**
 * @author lglmoura
 *
 */
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

@Stateless
@LocalBean
public class AbstractPersistence {
	/*
	 * @PersistenceContext( unitName = "oficinaejb") EntityManager entityManager;
	 */
	/*protected static EntityManagerFactory entityManagerFactory;
	protected static EntityManager entityManager;

	protected static EntityTransaction transaction;

	static {
		entityManagerFactory = Persistence
				.createEntityManagerFactory("oficinaEJB");
		entityManager = entityManagerFactory.createEntityManager();

		transaction = entityManager.getTransaction();
	}
*/
	// @TransactionAttribute(TransactionAttributeType.REQUIRED)
	
	@PersistenceContext( type = PersistenceContextType.EXTENDED,unitName = "oficinaEJB")
	EntityManager entityManager; 

	public Object insert(Object object) {

		//transaction.begin();

		entityManager.persist(object);
		//transaction.commit();
		return object;
	}

	public Object update(Object object) {
		//transaction.begin();

		entityManager.merge(object);

		//transaction.commit();
		return object;
	}

	public void delete(Class<?> classe, String codigo) {
		Object object = find(classe, codigo);
		//transaction.begin();

		entityManager.remove(object);
		//transaction.commit();
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> findAll(Class<T> classe) {
		return entityManager.createQuery(
				"select e from " + classe.getName() + " e").getResultList();
	}

	public <T> T find(Class<T> classe, String codigo) {
		return entityManager.find(classe, codigo);
	}
}