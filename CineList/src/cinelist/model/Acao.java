package cinelist.model;

/**
 *
 * @author cleefsouza
 */
public class Acao {

    private int cod_aca;
    private String descricao_aca;
    private String nome_usuario_aca;
    private String horario_aca;

    // construtores
    public Acao() {

    }
    
    public Acao(String de, String no) {
        this.descricao_aca = de;
        this.nome_usuario_aca = no;
    }
    
    public Acao(String de, String no, String ho) {
        this.descricao_aca = de;
        this.nome_usuario_aca = no;
        this.horario_aca = ho;
    }

    public Acao(int co, String de, String no, String ho) {
        this.cod_aca = co;
        this.descricao_aca = de;
        this.nome_usuario_aca = no;
        this.horario_aca = ho;
    }

    /**
     * @return the cod_aca
     */
    public int getCod_aca() {
        return cod_aca;
    }

    /**
     * @param cod_aca the cod_aca to set
     */
    public void setCod_aca(int cod_aca) {
        this.cod_aca = cod_aca;
    }

    /**
     * @return the descricao_aca
     */
    public String getDescricao_aca() {
        return descricao_aca;
    }

    /**
     * @param descricao_aca the descricao_aca to set
     */
    public void setDescricao_aca(String descricao_aca) {
        this.descricao_aca = descricao_aca;
    }

    /**
     * @return the nome_usuario_aca
     */
    public String getNome_usuario_aca() {
        return nome_usuario_aca;
    }

    /**
     * @param nome_usuario_aca the nome_usuario_aca to set
     */
    public void setNome_usuario_aca(String nome_usuario_aca) {
        this.nome_usuario_aca = nome_usuario_aca;
    }

    /**
     * @return the horario_aca
     */
    public String getHorario_aca() {
        return horario_aca;
    }

    /**
     * @param horario_aca the horario_aca to set
     */
    public void setHorario_aca(String horario_aca) {
        this.horario_aca = horario_aca;
    }
}
