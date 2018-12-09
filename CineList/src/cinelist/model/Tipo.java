package cinelist.model;

/**
 *
 * @author cleefsouza
 */
public class Tipo {

    private int cod_tip;
    private String descricao_tip;

    // construtores
    public Tipo() {

    }

    public Tipo(int co, String de) {
        this.cod_tip = co;
        this.descricao_tip = de;
    }

    /**
     * @return the cod_tip
     */
    public int getCod_tip() {
        return cod_tip;
    }

    /**
     * @param cod_tip the cod_tip to set
     */
    public void setCod_tip(int cod_tip) {
        this.cod_tip = cod_tip;
    }

    /**
     * @return the descricao_tip
     */
    public String getDescricao_tip() {
        return descricao_tip;
    }

    /**
     * @param descricao_tip the descricao_tip to set
     */
    public void setDescricao_tip(String descricao_tip) {
        this.descricao_tip = descricao_tip;
    }
}
