package br.com.escola.application;

import java.util.logging.Level;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Classe Inicial da aplicaï¿½ï¿½o
 */
public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("/view/SplashFXML.fxml"));

		Scene scene = new Scene(root);
		scene.setFill(null);
		stage.setScene(scene);
		stage.initStyle(StageStyle.TRANSPARENT);
		stage.show();
	}

	public static void main(String[] args) {
		// Nível dos logs da aplicação (Teste)
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);

		launch(args);		
	}
}
