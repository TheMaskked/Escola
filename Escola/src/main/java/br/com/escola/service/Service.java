package br.com.escola.service;

import br.com.escola.dao.DAOFactory;

/**
 * Superclasse de todos os services da aplicação
 */
public abstract class Service {
	
	protected ServiceFactory serviceFactory;
	protected DAOFactory daoFactory;
	
	protected Service() {
		this.serviceFactory = ServiceFactory.getInstance();
		this.daoFactory = DAOFactory.getInstance();
	}
}
