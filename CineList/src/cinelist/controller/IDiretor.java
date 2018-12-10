package cinelist.controller;

import cinelist.model.Diretor;
import cinelist.model.Filme;
import java.util.List;

/**
 *
 * @author cleefsouza
 */
public interface IDiretor {

    // cadastrar diretor
    void cadastrar(Diretor diretor);

    //alterar diretor
    void alterar(Diretor diretor);

    // listar diretores
    List<Diretor> listar();

    // buscar diretor
    Diretor buscar(int cod);

    // remover diretor
    void remover(int cod);

    // quantidade de filmes
    int qtdFilmePorDiretor(int cod);

    // remover filmes por diretor
    void removerPorDiretor(int cod);
}
