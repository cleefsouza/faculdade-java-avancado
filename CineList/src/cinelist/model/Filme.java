package cinelist.model;

/**
 *
 * @author cleefsouza
 */
public class Filme {

    private int cod_fil;
    private String nome_fil;
    private String descricao_fil;
    private Genero genero_fil;
    private Diretor diretor_fil;

    // construtores
    public Filme() {
    }

    public Filme(int co, String no, String de, Genero ge, Diretor di) {
        this.cod_fil = co;
        this.nome_fil = no;
        this.descricao_fil = de;
        this.genero_fil = ge;
        this.diretor_fil = di;
    }

    /**
     * getters e setters
     */
    /**
     * @return the cod_fil
     */
    public int getCod_fil() {
        return cod_fil;
    }

    /**
     * @param cod_fil the cod_fil to set
     */
    public void setCod_fil(int cod_fil) {
        this.cod_fil = cod_fil;
    }

    /**
     * @return the nome_fil
     */
    public String getNome_fil() {
        return nome_fil;
    }

    /**
     * @param nome_fil the nome_fil to set
     */
    public void setNome_fil(String nome_fil) {
        this.nome_fil = nome_fil;
    }

    /**
     * @return the descricao_fil
     */
    public String getDescricao_fil() {
        return descricao_fil;
    }

    /**
     * @param descricao_fil the descricao_fil to set
     */
    public void setDescricao_fil(String descricao_fil) {
        this.descricao_fil = descricao_fil;
    }

    /**
     * @return the genero_fil
     */
    public Genero getGenero_fil() {
        return genero_fil;
    }

    /**
     * @param genero_fil the genero_fil to set
     */
    public void setGenero_fil(Genero genero_fil) {
        this.genero_fil = genero_fil;
    }

    /**
     * @return the diretor_fil
     */
    public Diretor getDiretor_fil() {
        return diretor_fil;
    }

    /**
     * @param diretor_fil the diretor_fil to set
     */
    public void setDiretor_fil(Diretor diretor_fil) {
        this.diretor_fil = diretor_fil;
    }
}
