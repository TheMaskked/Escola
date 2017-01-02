package br.com.escola.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Durante a execucao do projeto e possivel trabalhar com várias sessões com o banco de dados. Na JPA a sessão com o banco é representa pelo componente EntityManager.
 * 
 * <p>Essa classe é responsavel por disponibilizar o(s) componente(s) <code>EntityManager</code>. Utilizamos o <code>EntityManagerFactory</code> fornecedor (fábrica) de sessões com o banco de dados.</p>
 * 
 * <p>Caso não consiga carregar a fabrica de sessões, problemas com a conexão com banco ou não encontrou configurador, a execução da aplicação é interrompida (lança <code>ExceptionInInitializerError</code>).</p>
 * 
 * @see persistence.xml
 * 
 * @author YaW Tecnologia
 */
public abstract class JPAUtil {    
    /**
     * Unidade de persistencia definida no arquivo
     * <code>persistence.xml</code>
     */
    private static final String PERSISTENCE_UNIT_NAME = "escolaPU";
    private static EntityManagerFactory emf;

    static {
        try {
            emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError("N�o conseguiu carregar a EntityManagerFactory: " + ex.getMessage());
        }
    }

    /**
     * @return Cria e retorna um componente <code>EntityManager</code>.
     * @throws Lança <code>RuntimeException</code>
     * se <code>EntityManagerFactory</code> estiver fechada.
     */
    public static EntityManager createEntityManager() {
        if (!emf.isOpen()) {
        	emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return emf.createEntityManager();
    }

    /**
     * Fecha o
     * <code>EntityManagerFactory</code>.
     */
    public static void closeEntityManagerFactory() {
        if (emf.isOpen()) {
            emf.close();
        }
    }
}
