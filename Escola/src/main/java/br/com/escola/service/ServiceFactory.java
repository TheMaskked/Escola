package br.com.escola.service;

/**
 * Factory para criação de objetos Service
 */
public class ServiceFactory {

	private static ServiceFactory instance;
	
	private ServiceFactory() {
	}
	
	public static ServiceFactory getInstance() {
		if (instance == null) {
			instance = new ServiceFactory();
		}
		return instance;
	}
	
	public <T extends Service> T getService(Class<T> clazz) {
		try {
			T service = clazz.newInstance();
			return service;
		} catch (InstantiationException | IllegalAccessException e){
			throw new ServiceException(e);
		}
	}
}
