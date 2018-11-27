package cinelist.controller;

import cinelist.model.Critica;
import cinelist.model.Filme;
import java.util.List;

/**
 *
 * @author cleefsouza
 */
public interface ICriticaDAO {

    // cadastrar objeto critica no banco de dados
    void cadastrar(Critica critica);

    // listar filmes de acordo com sua nota
    List<Filme> listarFilmesPorNota(int nota);
}
