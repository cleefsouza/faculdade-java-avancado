package cinelist.model;

/**
 *
 * @author cleefsouza
 */
public class Diretor {

    private int cod_dir;
    private String nome_dir;

    // construtores
    public Diretor() {
    }

    public Diretor(int co, String no) {
        this.cod_dir = co;
        this.nome_dir = no;
    }

    /**
     * getters e setters
     */
    /**
     * @return the cod_dir
     */
    public int getCod_dir() {
        return cod_dir;
    }

    /**
     * @param cod_dir the cod_dir to set
     */
    public void setCod_dir(int cod_dir) {
        this.cod_dir = cod_dir;
    }

    /**
     * @return the nome_dir
     */
    public String getNome_dir() {
        return nome_dir;
    }

    /**
     * @param nome_dir the nome_dir to set
     */
    public void setNome_dir(String nome_dir) {
        this.nome_dir = nome_dir;
    }
}
