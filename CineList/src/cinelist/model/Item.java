package cinelist.model;

/**
 *
 * @author cleefsouza
 */
public abstract class Item {

    private int cod_ite;
    private String nome_ite;

    //construtores
    public Item() {

    }

    public Item(String no) {
        this.nome_ite = no;
    }

    public Item(int co, String no) {
        this.cod_ite = co;
        this.nome_ite = no;
    }

    /**
     * @return the cod_ite
     */
    public int getCod_ite() {
        return cod_ite;
    }

    /**
     * @param cod_ite the cod_ite to set
     */
    public void setCod_ite(int cod_ite) {
        this.cod_ite = cod_ite;
    }

    /**
     * @return the nome_ite
     */
    public String getNome_ite() {
        return nome_ite;
    }

    /**
     * @param nome_ite the nome_ite to set
     */
    public void setNome_ite(String nome_ite) {
        this.nome_ite = nome_ite;
    }
}
