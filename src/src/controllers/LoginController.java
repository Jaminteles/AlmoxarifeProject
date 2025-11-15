@FXML private TextField tfLogin;
@FXML private PasswordField tfSenha;

@FXML
private void entrar() {
    String login = tfLogin.getText();
    String senha = Criptografia.sha256(tfSenha.getText());

    UsuarioDAO dao = new UsuarioDAO();

    if (dao.login(login, senha)) {
        // abrir tela principal
    } else {
        // mostrar alerta
    }
}

void main() {
}
