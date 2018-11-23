package cinelist.model;

/**
 *
 * @author cleefsouza
 */
public class Critica {

    private int cod_cri;
    private String descricao_cri;
    private double nota_cri;
    private Filme filme_cri;

    // construtor
    public Critica() {
    }

    /**
     * getters e setters
     */
    
    /**
     * @return the cod_cri
     */
    public int getCod_cri() {
        return cod_cri;
    }

    /**
     * @param cod_cri the cod_cri to set
     */
    public void setCod_cri(int cod_cri) {
        this.cod_cri = cod_cri;
    }

    /**
     * @return the descricao_cri
     */
    public String getDescricao_cri() {
        return descricao_cri;
    }

    /**
     * @param descricao_cri the descricao_cri to set
     */
    public void setDescricao_cri(String descricao_cri) {
        this.descricao_cri = descricao_cri;
    }

    /**
     * @return the nota_cri
     */
    public double getNota_cri() {
        return nota_cri;
    }

    /**
     * @param nota_cri the nota_cri to set
     */
    public void setNota_cri(double nota_cri) {
        this.nota_cri = nota_cri;
    }

    /**
     * @return the filme_cri
     */
    public Filme getFilme_cri() {
        return filme_cri;
    }

    /**
     * @param filme_cri the filme_cri to set
     */
    public void setFilme_cri(Filme filme_cri) {
        this.filme_cri = filme_cri;
    }
}