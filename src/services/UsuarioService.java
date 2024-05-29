package model.reposirory;

import java.util.List;

import model.Usuario;

public interface UsuarioRepository {
    void criar(Usuario usuario) ;

    Usuario buscarPorEmail(String email);

    List<Usuario> obterTodos();

    Usuario atualizar(Usuario usuario);

    void excluir(Integer id);
}