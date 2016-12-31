package br.com.escola.dao;

/**
 * Factory para criação de objetos DAO
 */
public class DAOFactory {

	private static DAOFactory instance;
	
	private DAOFactory() {
	}
	
	/**
	 * Retorna uma instancia de DAOFactory
	 * @return
	 */
	public static DAOFactory getInstance() {
		if (instance == null) {
			instance = new DAOFactory();
		}
		return instance;
	}
	
	/**
	 * Retorna um objeto que extenda de DAO
	 * @param clazz
	 * @return
	 * @throws DAOException
	 */
	public <T extends DAO> T getDAO(Class<T> clazz) throws DAOException {
		try {
			T dao = clazz.newInstance();
			return dao;
		} catch (InstantiationException | IllegalAccessException e) {
			throw new DAOException(e);
		}
	}
}
