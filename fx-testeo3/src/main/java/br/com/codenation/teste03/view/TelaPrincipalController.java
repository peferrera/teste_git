package br.com.codenation.teste03.view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXML;

public class TelaPrincipalController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	@FXML
	public void cadastrar() {
		Alert alerta = new Alert(AlertType.CONFIRMATION);
		alerta.setContentText("Content Text");
		alerta.setHeaderText("Header Meu");

		alerta.show();
	}

}
