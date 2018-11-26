package caixadereliquias.model;

/**
 *
 * @author cleefsouza
 */
public class Login {

    private int cod_log;
    private String user_log;
    private String password_log;

    // construtores
    public Login() {

    }

    public Login(int co, String us, String pa) {
        this.cod_log = co;
        this.user_log = us;
        this.password_log = pa;
    }

    // getters e setters
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
     * @return the user_log
     */
    public String getUser_log() {
        return user_log;
    }

    /**
     * @param user_log the user_log to set
     */
    public void setUser_log(String user_log) {
        this.user_log = user_log;
    }

    /**
     * @return the password_log
     */
    public String getPassword_log() {
        return password_log;
    }

    /**
     * @param password_log the password_log to set
     */
    public void setPassword_log(String password_log) {
        this.password_log = password_log;
    }
}