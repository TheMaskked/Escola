package br.com.escola;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Classe Inicial da aplicação
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
		launch(args);
	}
}
