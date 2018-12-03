package caixadereliquias.model;

import java.text.SimpleDateFormat;

/**
 *
 * @author cleefsouza
 */
public class Usuario {

    private int cod_usu;
    private String nome_usu;
    private String data_nascimento_usu;
    private Login login_usu;

    // construtores
    public Usuario() {

    }

    public Usuario(int co, String no, String da, Login lo) {
        this.cod_usu = co;
        this.nome_usu = no;
        this.data_nascimento_usu = da;
        this.login_usu = lo;
    }

    public Usuario(String no, String da, Login lo) {
        this.nome_usu = no;
        this.data_nascimento_usu = da;
        this.login_usu = lo;
    }

    // getters e setters
    /**
     * @return the cod_usu
     */
    public int getCod_usu() {
        return cod_usu;
    }

    /**
     * @param cod_usu the cod_usu to set
     */
    public void setCod_usu(int cod_usu) {
        this.cod_usu = cod_usu;
    }

    /**
     * @return the nome_usu
     */
    public String getNome_usu() {
        return nome_usu;
    }

    /**
     * @param nome_usu the nome_usu to set
     */
    public void setNome_usu(String nome_usu) {
        this.nome_usu = nome_usu;
    }

    /**
     * @return the data_nascimento_usu
     */
    public String getData_nascimento_usu() {
        return data_nascimento_usu;
    }

    /**
     * @param data_nascimento_usu the data_nascimento_usu to set
     */
    public void setData_nascimento_usu(String data_nascimento_usu) {
        this.data_nascimento_usu = data_nascimento_usu;
    }

    /**
     * @return the login_usu
     */
    public Login getLogin_usu() {
        return login_usu;
    }

    /**
     * @param login_usu the login_usu to set
     */
    public void setLogin_usu(Login login_usu) {
        this.login_usu = login_usu;
    }
}
