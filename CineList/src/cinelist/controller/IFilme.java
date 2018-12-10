package cinelist.controller;

import cinelist.model.Filme;
import java.util.List;

/**
 *
 * @author cleefsouza
 */
public interface IFilme {

    // cadastrar filme
    void cadastrar(Filme filme);

    // alterar filme
    void alterar(Filme filme);

    // buscar filme
    Filme buscar(int cod);

    // listar filmes
    List<Filme> listar();

    // remover filme
    void remover(int cod);

    // listar filmes por genero
    List<Filme> listarPorGenero(int cod);

    // listar filmes por nota
    List<Filme> listarPorNota(int nota);
    
    // quantidade de filmes
    int qtdFilmes();
    
    // quantidade de criticas
    int qtdCriticas();
    
    // média das notas
    double mediaNotas();
    
    // filmes recentes
    List<String> filmesRecentes();
}
