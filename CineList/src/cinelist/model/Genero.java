package cinelist.model;

/**
 *
 * @author cleefsouza
 */
public class Genero {

    private int cod_gen;
    private String nome_gen;

    // construtores
    public Genero() {
    }

    public Genero(int co, String no) {
        this.cod_gen = co;
        this.nome_gen = no;
    }

    /**
     * getters e setters
     */
    /**
     * @return the cod_gen
     */
    public int getCod_gen() {
        return cod_gen;
    }

    /**
     * @param cod_gen the cod_gen to set
     */
    public void setCod_gen(int cod_gen) {
        this.cod_gen = cod_gen;
    }

    /**
     * @return the nome_gen
     */
    public String getNome_gen() {
        return nome_gen;
    }

    /**
     * @param nome_gen the nome_gen to set
     */
    public void setNome_gen(String nome_gen) {
        this.nome_gen = nome_gen;
    }
}
