package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class CadastroController {
    @FXML private TextField tfNome;
    @FXML private TextField tfLogin;
    @FXML private PasswordField tfSenha;
    @FXML private ComboBox<String> cbNivel;
    @FXML private ComboBox<String> cbStatus;
    @FXML private Button btnSalvar;
    @FXML private Button btnCancelar;

    @FXML
    private void initialize() {
        cbNivel.getItems().addAll("Admin", "Usuário");
        cbStatus.getItems().addAll("Ativo", "Inativo");
        btnCancelar.setOnAction(this::voltarLogin);
        btnSalvar.setOnAction(this::salvar);
    }

    private void salvar(ActionEvent ev) {
        System.out.println("Salvar usuário: " + tfNome.getText());
        // salvar futuro
    }

    private void voltarLogin(ActionEvent ev) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/views/Home/telaLogin.fxml"));
            Stage stage = (Stage)((Node)ev.getSource()).getScene().getWindow();
            stage.getScene().setRoot(root);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
