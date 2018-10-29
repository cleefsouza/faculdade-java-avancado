package com.controlcine.model;

/**
 *
 * @author cleefsouza
 */
public class Produtora {

    /**
     * @return the proNome
     */
    public String getProNome() {
        return proNome;
    }

    /**
     * @param proNome the proNome to set
     */
    public void setProNome(String proNome) {
        this.proNome = proNome;
    }
    
    // Atributos
    private int proCod;
    private String proNome;

    /**
     * @return the proCod
     */
    public int getProCod() {
        return proCod;
    }

    /**
     * @param proCod the proCod to set
     */
    public void setProCod(int proCod) {
        this.proCod = proCod;
    }
}
