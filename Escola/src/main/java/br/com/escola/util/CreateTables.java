package br.com.escola.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.escola.model.Usuario;

public class CreateTables {

	// Nome do Persistence-unit
	public static final String PERSISTENCE_UNIT_NAME = "escolaPU";
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	
	static {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		manager = factory.createEntityManager();
	}
	
	public static void main(String[] args) {
		try {
				Date data = criarDate("30/07/2016");
				System.out.println(data);
				
				// Dados a serem salvos no banco de dados.
				iniciarTransacao();				
				
//				salvar(null);
//				carregar(null, null);
//				alterar(null);
//				excluir(null);
//				criarQuery(null);
				
				// descomente as linhas abaixo pra criar as tabelas 
				// (primeiro cria o banco com o nome EscolaDB)
//				Usuario user1 = new Usuario("Lukaz", "abc2016");
//				Usuario user2 = new Usuario("Mauricio", "1232015");				
//				salvar(user1);
//				salvar(user2);
				
				fecharTransacao();
				
		} catch (Exception e) {
			cancelarTransacao();
			e.printStackTrace();
		} finally {			
			manager.close();
			factory.close();
		}
	}
	
	// Inicia a transação
	private static void iniciarTransacao() {
		if (!manager.getTransaction().isActive()) {
			manager.getTransaction().begin();
			System.out.println("-> Transação iniciada.");
		}
	}
	
	// Fecha a transação
	private static void fecharTransacao() {
		if (manager.getTransaction().isActive()) {
			manager.getTransaction().commit();
			System.out.println("-> Transação concluída.");
		}			
	}
	
	// Cancela a transação se houver alguma exceção
	private static void cancelarTransacao() {
		if (manager.getTransaction().isActive()) {
			manager.getTransaction().rollback();
			System.out.println("-> Transação cancelada.");
		}
	}
	
	// Salva uma entidade no banco de dados
	private static <T> void salvar(T entity) {
		manager.persist(entity);
	}
	
	// Carrega uma entida do banco de dados
	private static <T> T carregar(Object key, Class<T> clazz) {
		return manager.find(clazz, key);
	}
	
	// Altera uma entidade já existente no banco de dados
	private static <T> void alterar(T entity) {
		manager.merge(entity);
	}
	
	// Exclui uma entidade do banco de dados
	private static <T> void excluir(T entity) {
		manager.remove(entity);
	}
	
	// Cria um objeto Query para executar no banco de dados
	private static Query criarQuery(String query) {
		return manager.createQuery(query);
	}
	
	// Cria um objeto Date de acordo com o padrão fornecido
	private static Date criarDate(String data) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date date;
		date = format.parse(data);
		return date;
	}
}
