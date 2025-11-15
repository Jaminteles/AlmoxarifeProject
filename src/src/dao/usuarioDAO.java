package dao;

public class UsuarioDAO {

    public boolean login(String login, String senhaCriptografada) { ... }

    public void inserir(Usuario u) { ... }

    public void atualizar(Usuario u) { ... }

    public void deletar(int id) { ... }

    public Usuario buscarPorLogin(String login) { ... }

    public List<Usuario> listarTodos() { ... }
}
