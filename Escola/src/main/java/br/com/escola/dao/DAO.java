package br.com.escola.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * Superclasse das classes de DAO (Data Access Object) da aplicação
 */
public abstract class DAO {
	
	private EntityManager entityManager;
	
	public void setEntityManager(EntityManager em) {
		if (em == null) {
			throw new DAOException("EntityManager é nulo");
		}
		this.entityManager = em;
	}
	
	/**
	 * Carrega uma entidade com base na chave primária
	 */
	public <T> T load(Object key, Class<T> clazz) {
		return entityManager.find(clazz, key);
	}

	/**
	 * Persiste uma entidade
	 */
	public <T> void save(T entity) {
		entityManager.persist(entity);
	}

	/**
	 * Altera uma entidade existente
	 */
	public <T> void update(T entity) {
		entityManager.merge(entity);
	}

	/**
	 * Exclui uma entidade
	 */
	public <T> void remove(T entity) {
		entityManager.remove(entity);
	}

	/**
	 * Cria um objeto Query para uma query JPQL
	 */
	public Query createQuery(String query) {
		return entityManager.createQuery(query);
	}
}
