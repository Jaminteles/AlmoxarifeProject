/*
package controllers;

import dao.UsuarioDAO;
import model.Usuario;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.net.URL;
import java.util.ResourceBundle;

public class UsuariosController implements Initializable {

    @FXML private TableView<Usuario> tableUsers;
    @FXML private TableColumn<Usuario, String> colNome;
    @FXML private TableColumn<Usuario, String> colLogin;
    @FXML private TableColumn<Usuario, String> colNivel;
    @FXML private TableColumn<Usuario, String> colStatus;

    @FXML private AnchorPane paneEditUser;

    UsuarioDAO dao = new UsuarioDAO();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colLogin.setCellValueFactory(new PropertyValueFactory<>("login"));
        colNivel.setCellValueFactory(new PropertyValueFactory<>("nivel"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        carregarTabela();
    }

    private void carregarTabela() {
        tableUsers.setItems(FXCollections.observableArrayList(dao.listarTodos()));
    }

    @FXML
    private void novoUsuario() {
        paneEditUser.setVisible(true);
        // limpar campos
    }

    @FXML
    private void editarUsuario() {
        // pegar usuario selecionado
        // abrir modal e preencher campos
    }

    @FXML
    private void salvarUsuario() {
        // pegar dados do modal
        // dao.inserir ou dao.atualizar
        carregarTabela();
        paneEditUser.setVisible(false);
    }
}

*/