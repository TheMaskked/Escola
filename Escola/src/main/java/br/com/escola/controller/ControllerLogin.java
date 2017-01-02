package br.com.escola.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import br.com.escola.model.Usuario;
import br.com.escola.service.ServiceFactory;
import br.com.escola.service.UsuarioService;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * Created by Lucas-PC atualizado 11/12/2016.
 */

public class ControllerLogin implements Initializable {
	
	@FXML
	private Button tbCancelar;
	
	@FXML
	private Button btnConfirmar;
	
	@FXML
	private JFXTextField txtUsuario;
	
	@FXML
	private JFXPasswordField txtSenha;	
	
	private ServiceFactory serviceFactory;
	private UsuarioService usuarioService;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		serviceFactory = ServiceFactory.getInstance();
		usuarioService = serviceFactory.getService(UsuarioService.class);
	}
	
	public void logar() {
		Usuario usuario = usuarioService.logar(txtUsuario.getText(), txtSenha.getText());
		
		if (usuario != null) {
			 //TODO se os dados estiverem corretos, carrega a próxima tela
			System.out.println("Usuário encontrado => " + usuario);
		} else {
			// dados digitados estão incorretos
			System.out.println("Usuário não encontrado");
		}
	}

	public void tbCancelarAction(ActionEvent event) {
		Platform.exit();
	}
}
