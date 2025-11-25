package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class LoginController {
    @FXML private TextField tfLogin;
    @FXML private PasswordField pfSenha;
    @FXML private Button btnEntrar;
    @FXML private Button btnCriarConta;

    @FXML
    private void initialize() {
        btnCriarConta.setOnAction(this::abrirCadastro);
        btnEntrar.setOnAction(this::entrar);
    }

    private void entrar(ActionEvent ev) {
        String login = tfLogin.getText();
        String senha = pfSenha.getText();
        System.out.println("Entrar: " + login);
        // autenticação futura
    }

    private void abrirCadastro(ActionEvent ev) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/views/Home/telaCadastro.fxml"));
            Stage stage = (Stage)((Node)ev.getSource()).getScene().getWindow();
            stage.getScene().setRoot(root);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
