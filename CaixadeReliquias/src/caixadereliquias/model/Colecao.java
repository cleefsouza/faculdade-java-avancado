package caixadereliquias.model;

import java.util.Date;

/**
 *
 * @author cleefsouza
 */
public class Colecao {

    private int cod_col;
    private String nome_col;
    private Date data_criacao_col;
    private String descricao_col;
    private Usuario usuario_col;

    // construtores
    public Colecao() {

    }

    public Colecao(int co, String no, String de, Date da, Usuario us) {
        this.cod_col = co;
        this.nome_col = no;
        this.data_criacao_col = da;
        this.descricao_col = de;
        this.usuario_col = us;
    }

    // getters e setters
    /**
     * @return the cod_col
     */
    public int getCod_col() {
        return cod_col;
    }

    /**
     * @param cod_col the cod_col to set
     */
    public void setCod_col(int cod_col) {
        this.cod_col = cod_col;
    }

    /**
     * @return the nome_col
     */
    public String getNome_col() {
        return nome_col;
    }

    /**
     * @param nome_col the nome_col to set
     */
    public void setNome_col(String nome_col) {
        this.nome_col = nome_col;
    }

    /**
     * @return the data_criacao_col
     */
    public Date getData_criacao_col() {
        return data_criacao_col;
    }

    /**
     * @param data_criacao_col the data_criacao_col to set
     */
    public void setData_criacao_col(Date data_criacao_col) {
        this.data_criacao_col = data_criacao_col;
    }

    /**
     * @return the descricao_col
     */
    public String getDescricao_col() {
        return descricao_col;
    }

    /**
     * @param descricao_col the descricao_col to set
     */
    public void setDescricao_col(String descricao_col) {
        this.descricao_col = descricao_col;
    }

    /**
     * @return the usuario_col
     */
    public Usuario getUsuario_col() {
        return usuario_col;
    }

    /**
     * @param usuario_col the usuario_col to set
     */
    public void setUsuario_col(Usuario usuario_col) {
        this.usuario_col = usuario_col;
    }
}
