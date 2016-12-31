package br.com.escola.dao;

import javax.persistence.Query;

import br.com.escola.model.Usuario;

/**
 * Classe de DAO do usuario
 */
public class UsuarioDAO extends DAO {	
	/**
	 * Verifica se o usu�rio existe
	 * @param nome do usu�rio
	 * @return true se existe
	 */
	public boolean existeUsuario(String nome) {
		Usuario usuario = getUsuarioByNome(nome);		
		return usuario == null ? false : true;
	}
	
	/**
	 * Retorna um usu�rio com base no nome
	 * @param nome do usu�rio
	 * @return Usu�rio encontrado ou null se n�o encontrar
	 */
	public Usuario getUsuarioByNome(String nome) {
		Query q = createQuery("SELECT u FROM Usuario u WHERE u.nome = '" + nome + "'");
		
		if (q.getResultList().isEmpty()) {
			return null;
		} else {
			Usuario usuario = (Usuario) q.getResultList().get(0);
			return usuario.getNome().equals(nome) ? usuario : null;
		}
	}
}
