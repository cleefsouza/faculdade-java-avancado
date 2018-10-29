package com.controlcine.model;
import java.sql.Date;

/**
 *
 * @author cleefsouza
 */
public class Filme {

    // Atributos
    private int filCod;
    private String filNome;
    private String filDuracao;
    private Date filAnoLancamento;
    private Produtora filProdutora;
    private Diretor filDiretor;
    private ClassificacaoENUM filClassificacao;
    private IdiomaENUM filIdioma;
    private GeneroENUM filGenero;
    
    // Contrutor
    public Filme(){
        
    }

    /**
     * @return the filProdutora
     */
    public Produtora getFilProdutora() {
        return filProdutora;
    }

    /**
     * @param filProdutora the filProdutora to set
     */
    public void setFilProdutora(Produtora filProdutora) {
        this.filProdutora = filProdutora;
    }

    /**
     * @return the filDiretor
     */
    public Diretor getFilDiretor() {
        return filDiretor;
    }

    /**
     * @param filDiretor the filDiretor to set
     */
    public void setFilDiretor(Diretor filDiretor) {
        this.filDiretor = filDiretor;
    }

    /**
     * @return the filNome
     */
    public String getFilNome() {
        return filNome;
    }

    /**
     * @param filNome the filNome to set
     */
    public void setFilNome(String filNome) {
        this.filNome = filNome;
    }

    /**
     * @return the filDuracao
     */
    public String getFilDuracao() {
        return filDuracao;
    }

    /**
     * @param filDuracao the filDuracao to set
     */
    public void setFilDuracao(String filDuracao) {
        this.filDuracao = filDuracao;
    }

    /**
     * @return the filAnoLancamento
     */
    public Date getFilAnoLancamento() {
        return filAnoLancamento;
    }

    /**
     * @param filAnoLancamento the filAnoLancamento to set
     */
    public void setFilAnoLancamento(Date filAnoLancamento) {
        this.filAnoLancamento = filAnoLancamento;
    }

    /**
     * @return the filCod
     */
    public int getFilCod() {
        return filCod;
    }

    /**
     * @param filCod the filCod to set
     */
    public void setFilCod(int filCod) {
        this.filCod = filCod;
    }

    /**
     * @return the filClassificacao
     */
    public ClassificacaoENUM getFilClassificacao() {
        return filClassificacao;
    }

    /**
     * @param filClassificacao the filClassificacao to set
     */
    public void setFilClassificacao(ClassificacaoENUM filClassificacao) {
        this.filClassificacao = filClassificacao;
    }

    /**
     * @return the filIdioma
     */
    public IdiomaENUM getFilIdioma() {
        return filIdioma;
    }

    /**
     * @param filIdioma the filIdioma to set
     */
    public void setFilIdioma(IdiomaENUM filIdioma) {
        this.filIdioma = filIdioma;
    }

    /**
     * @return the filGenero
     */
    public GeneroENUM getFilGenero() {
        return filGenero;
    }

    /**
     * @param filGenero the filGenero to set
     */
    public void setFilGenero(GeneroENUM filGenero) {
        this.filGenero = filGenero;
    }
    
}
