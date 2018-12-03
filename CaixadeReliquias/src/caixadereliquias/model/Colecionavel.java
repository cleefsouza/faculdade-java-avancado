package caixadereliquias.model;

/**
 *
 * @author cleefsouza
 */
public class Colecionavel {

    private int cod_cole;
    private String nome_cole;
    private String descricao_cole;
    private Colecao colecao_cole;
    private Estado estado_cole;

    //construtores
    public Colecionavel() {

    }

    public Colecionavel(int co, String no, String de, Colecao col, Estado es) {
        this.cod_cole = co;
        this.nome_cole = no;
        this.descricao_cole = de;
        this.colecao_cole = col;
        this.estado_cole = es;
    }

    public Colecionavel(String no, String de, Colecao col, Estado es) {
        this.nome_cole = no;
        this.descricao_cole = de;
        this.colecao_cole = col;
        this.estado_cole = es;
    }

    // getters e setters
    /**
     * @return the cod_cole
     */
    public int getCod_cole() {
        return cod_cole;
    }

    /**
     * @param cod_cole the cod_cole to set
     */
    public void setCod_cole(int cod_cole) {
        this.cod_cole = cod_cole;
    }

    /**
     * @return the nome_cole
     */
    public String getNome_cole() {
        return nome_cole;
    }

    /**
     * @param nome_cole the nome_cole to set
     */
    public void setNome_cole(String nome_cole) {
        this.nome_cole = nome_cole;
    }

    /**
     * @return the descricao_cole
     */
    public String getDescricao_cole() {
        return descricao_cole;
    }

    /**
     * @param descricao_cole the descricao_cole to set
     */
    public void setDescricao_cole(String descricao_cole) {
        this.descricao_cole = descricao_cole;
    }

    /**
     * @return the colecao_cole
     */
    public Colecao getColecao_cole() {
        return colecao_cole;
    }

    /**
     * @param colecao_cole the colecao_cole to set
     */
    public void setColecao_cole(Colecao colecao_cole) {
        this.colecao_cole = colecao_cole;
    }

    /**
     * @return the estado_cole
     */
    public Estado getEstado_cole() {
        return estado_cole;
    }

    /**
     * @param estado_cole the estado_cole to set
     */
    public void setEstado_cole(Estado estado_cole) {
        this.estado_cole = estado_cole;
    }
}
