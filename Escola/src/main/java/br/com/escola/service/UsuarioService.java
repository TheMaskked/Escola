package br.com.escola.service;

import javax.persistence.EntityManager;

import br.com.escola.dao.UsuarioDAO;
import br.com.escola.model.Usuario;
import br.com.escola.util.JPAUtil;
import br.com.escola.util.StringUtils;

/**
 * Classe de service do usuario
 */
public class UsuarioService extends Service {	
	/**
	 * Efetua o login do usuário
	 * @param nome do usuário
	 * @param senha do usuário
	 * @return Usuário 
	 * @throws ServiceException
	 */
	public Usuario logar(String nome, String senha) throws ServiceException {
		if (StringUtils.isEmpty(nome) || StringUtils.isEmpty(senha)) {
			return null;
		}
		
		EntityManager em = JPAUtil.createEntityManager();
		
		try {			
			UsuarioDAO usuarioDAO =	daoFactory.getDAO(UsuarioDAO.class);
			usuarioDAO.setEntityManager(em);
			
			Usuario usuario = usuarioDAO.getUsuarioByNome(nome);
			
			// Usuário não existe
			if (usuario == null) {
				return null;
			}
			
			// Senha digitada difere da senha cadastrada
			if (!usuario.getSenha().equals(senha)) {
				return null;
			}
			
			return usuario;
		} finally {
			em.close();
			em.getEntityManagerFactory().close();
		}
	}
	
	/**
	 * Salva um novo usuário
	 * @param usuario
	 */
	public void salvarUsuario(Usuario usuario) {
		if (usuario == null) {
			throw new ServiceException("Usuário é nullo");
		}
		
		EntityManager em = JPAUtil.createEntityManager();
		
		try {
			UsuarioDAO usuarioDAO = daoFactory.getDAO(UsuarioDAO.class);
			usuarioDAO.setEntityManager(em);
			
			// Inicia uma transação
			em.getTransaction().begin();
			
			// Verifica se o usuário com o mesmo nome já existe
			if (usuarioDAO.existeUsuario(usuario.getNome())) {
				throw new ServiceException("Usuário com o nome " + usuario.getNome() + " já existe");
			}
			
			// Salva o usuário 
			usuarioDAO.save(usuario);
			
			// Faz o commit da transação em andamento
			em.getTransaction().commit();
			
		} catch (RuntimeException e) {
			// Faz o rollback da transação em andamento se houver algum erro
			em.getTransaction().rollback();
			throw new ServiceException(e);
		} finally {
			em.close();
			em.getEntityManagerFactory().close();
		}		
	}
}
