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
	 * Efetua o login do usu�rio
	 * @param nome do usu�rio
	 * @param senha do usu�rio
	 * @return Usu�rio 
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
			
			// Usu�rio n�o existe
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
	 * Salva um novo usu�rio
	 * @param usuario
	 */
	public void salvarUsuario(Usuario usuario) {
		if (usuario == null) {
			throw new ServiceException("Usu�rio � nullo");
		}
		
		EntityManager em = JPAUtil.createEntityManager();
		
		try {
			UsuarioDAO usuarioDAO = daoFactory.getDAO(UsuarioDAO.class);
			usuarioDAO.setEntityManager(em);
			
			// Inicia uma transa��o
			em.getTransaction().begin();
			
			// Verifica se o usu�rio com o mesmo nome j� existe
			if (usuarioDAO.existeUsuario(usuario.getNome())) {
				throw new ServiceException("Usu�rio com o nome " + usuario.getNome() + " j� existe");
			}
			
			// Salva o usu�rio 
			usuarioDAO.save(usuario);
			
			// Faz o commit da transa��o em andamento
			em.getTransaction().commit();
			
		} catch (RuntimeException e) {
			// Faz o rollback da transa��o em andamento se houver algum erro
			em.getTransaction().rollback();
			throw new ServiceException(e);
		} finally {
			em.close();
			em.getEntityManagerFactory().close();
		}		
	}
}
