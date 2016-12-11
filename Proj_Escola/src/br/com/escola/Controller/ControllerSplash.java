package br.com.escola.Controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.imageio.IIOException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Lucas-PC on 08/12/2016.
 * aqui controller da imagem inicial que e chamada de splash
 */
public class ControllerSplash implements Initializable{

    @FXML
    private StackPane roott;


    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }



    class  SplashScreee extends Thread{

        @Override
        public void run()  {

            try {
                Thread.sleep(5000);



                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {


                        Parent root;
                        root = null;
                        try {
                            root =FXMLLoader.load(getClass().getResource("/br/com/escola/view/scenaBase/splash/SplashFXML.fxml"));

                        } catch (IIOException ex) {
                            Logger.getAnonymousLogger(ControllerSplash.class.getName()).log(Level.SEVERE,null,ex);


                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        Scene scene = new Scene(root);
                        Stage stage = new Stage();
                        stage.setScene(scene);
                        stage.initStyle(StageStyle.UNDECORATED);
                        stage.show();
                        roott.getScene().getWindow().hide();

                    }
                });




            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }


}


}
