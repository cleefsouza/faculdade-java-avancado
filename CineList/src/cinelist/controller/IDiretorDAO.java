package cinelist.controller;

import cinelist.model.Diretor;
import cinelist.model.Filme;
import java.util.List;

/**
 *
 * @author cleefsouza
 */
public interface IDiretorDAO {

    // cadastrar objeto diretor no banco de dados
    void cadastrar(Diretor diretor);

    // lista todos os filmes dirigidos pelo diretor
    List<Filme> listarFilmesDirigidos(int cod);
}
