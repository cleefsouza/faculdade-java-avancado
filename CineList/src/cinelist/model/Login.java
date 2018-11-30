package cinelist.model;

/**
 *
 * @author cleefsouza
 */
public class Login {

    private int cod_log;
    private String usuario_log;
    private String senha_log;

    // construtores
    public Login() {

    }

    /**
     * @return the cod_log
     */
    public int getCod_log() {
        return cod_log;
    }

    /**
     * @param cod_log the cod_log to set
     */
    public void setCod_log(int cod_log) {
        this.cod_log = cod_log;
    }

    /**
     * @return the usuario_log
     */
    public String getUsuario_log() {
        return usuario_log;
    }

    /**
     * @param usuario_log the usuario_log to set
     */
    public void setUsuario_log(String usuario_log) {
        this.usuario_log = usuario_log;
    }

    /**
     * @return the senha_log
     */
    public String getSenha_log() {
        return senha_log;
    }

    /**
     * @param senha_log the senha_log to set
     */
    public void setSenha_log(String senha_log) {
        this.senha_log = senha_log;
    }
}
