package cinelist.model;

/**
 *
 * @author cleefsouza
 */
public class Filme extends Item {

    private String sinopse_fil;
    private Genero genero_fil;
    private Diretor diretor_fil;
    private String critica_fil;
    private int nota_fil;

    // construtores
    public Filme() {
    }

    public Filme(String no, String si, Genero ge, Diretor di, String cr, int not) {
        super(no);
        this.sinopse_fil = si;
        this.genero_fil = ge;
        this.diretor_fil = di;
        this.critica_fil = cr;
        this.nota_fil = not;
    }

    public Filme(int co, String no, String si, Genero ge, Diretor di, String cr, int not) {
        super(co, no);
        this.sinopse_fil = si;
        this.genero_fil = ge;
        this.diretor_fil = di;
        this.critica_fil = cr;
        this.nota_fil = not;
    }

    /**
     * @return the sinopse_fil
     */
    public String getSinopse_fil() {
        return sinopse_fil;
    }

    /**
     * @param sinopse_fil the sinopse_fil to set
     */
    public void setSinopse_fil(String sinopse_fil) {
        this.sinopse_fil = sinopse_fil;
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

    /**
     * @return the critica_fil
     */
    public String getCritica_fil() {
        return critica_fil;
    }

    /**
     * @param critica_fil the critica_fil to set
     */
    public void setCritica_fil(String critica_fil) {
        this.critica_fil = critica_fil;
    }

    /**
     * @return the nota_fil
     */
    public int getNota_fil() {
        return nota_fil;
    }

    /**
     * @param nota_fil the nota_fil to set
     */
    public void setNota_fil(int nota_fil) {
        this.nota_fil = nota_fil;
    }
}
