package cinelist.controller;

import cinelist.model.Acao;

/**
 *
 * @author cleefsouza
 */
public interface IAcao {

    // cadastrar ação
    void cadastrar(Acao acao);
    
    // buscar ação
    Acao buscar(int cod);
}
