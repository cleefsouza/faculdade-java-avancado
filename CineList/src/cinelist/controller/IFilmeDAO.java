package cinelist.controller;

import cinelist.model.Filme;
import java.util.List;

/**
 *
 * @author cleefsouza
 */
public interface IFilmeDAO {

    // cadastrar objeto filme no banco de dados
    void cadastrar(Filme filme);

    // listar filmes de acordo com o gênero
    List<Filme> listarPorGenero(int cod);
}
