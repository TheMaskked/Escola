package br.com.escola.model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/* Classe Inicial da aplicacao (main) */
public class JavaFXApplication extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("/br/com/escola/view/scenaBase/splash/SplashFXML.fxml"));
		Scene scene = new Scene(root);
		scene.setFill(null);
		stage.setScene(scene);
		stage.initStyle(StageStyle.TRANSPARENT);
		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
		// EntityManagerFactory emf =
		// Persistence.createEntityManagerFactory("escolaUP");
		// EntityManager em = emf.createEntityManager();		
	}
}
