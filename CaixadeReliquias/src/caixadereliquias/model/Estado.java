package caixadereliquias.model;

/**
 *
 * @author cleefsouza
 */
public class Estado {

    private int cod_est;
    private String descricao_est;

    // construtores
    public Estado() {
    }

    public Estado(int co, String de) {
        this.cod_est = co;
        this.descricao_est = de;
    }

    // getters e setters
    /**
     * @return the cod_est
     */
    public int getCod_est() {
        return cod_est;
    }

    /**
     * @param cod_est the cod_est to set
     */
    public void setCod_est(int cod_est) {
        this.cod_est = cod_est;
    }

    /**
     * @return the descricao_est
     */
    public String getDescricao_est() {
        return descricao_est;
    }

    /**
     * @param descricao_est the descricao_est to set
     */
    public void setDescricao_est(String descricao_est) {
        this.descricao_est = descricao_est;
    }
}
