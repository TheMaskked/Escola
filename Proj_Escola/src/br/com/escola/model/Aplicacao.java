package br.com.escola.model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/* Classe Inicial da aplica��o (main) */
public class Aplicacao extends Application{


	@Override
	public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/br/com/escola/view/loginFXML/SplashFXML.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

	public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("escolaUP");
        EntityManager em = emf.createEntityManager();
        launch(args);

	}

}
