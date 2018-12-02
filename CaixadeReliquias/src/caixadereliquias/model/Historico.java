package caixadereliquias.model;

/**
 *
 * @author cleefsouza
 */
public class Historico {

    /**
     * @return the descricao_his
     */
    public String getDescricao_his() {
        return descricao_his;
    }

    /**
     * @param descricao_his the descricao_his to set
     */
    public void setDescricao_his(String descricao_his) {
        this.descricao_his = descricao_his;
    }

    private int cod_his;
    private String hora_atualizacao_his;
    private String data_atualizacao_his;
    private String usuario_his;
    private String colecao_his;
    private String colecionavel_his;
    private String descricao_his;

    // construtores
    public Historico() {

    }

    public Historico(int co, String des, String ho, String da, String us, String col, String cole) {
        this.cod_his = co;
        this.descricao_his = des;
        this.hora_atualizacao_his = ho;
        this.data_atualizacao_his = da;
        this.usuario_his = us;
        this.colecao_his = col;
        this.colecionavel_his = cole;
    }

    // getters e setters
    /**
     * @return the cod_his
     */
    public int getCod_his() {
        return cod_his;
    }

    /**
     * @param cod_his the cod_his to set
     */
    public void setCod_his(int cod_his) {
        this.cod_his = cod_his;
    }

    /**
     * @return the hora_atualizacao_his
     */
    public String getHora_atualizacao_his() {
        return hora_atualizacao_his;
    }

    /**
     * @param hora_atualizacao_his the hora_atualizacao_his to set
     */
    public void setHora_atualizacao_his(String hora_atualizacao_his) {
        this.hora_atualizacao_his = hora_atualizacao_his;
    }

    /**
     * @return the data_atualizacao_his
     */
    public String getData_atualizacao_his() {
        return data_atualizacao_his;
    }

    /**
     * @param data_atualizacao_his the data_atualizacao_his to set
     */
    public void setData_atualizacao_his(String data_atualizacao_his) {
        this.data_atualizacao_his = data_atualizacao_his;
    }

    /**
     * @return the usuario_his
     */
    public String getUsuario_his() {
        return usuario_his;
    }

    /**
     * @param usuario_his the usuario_his to set
     */
    public void setUsuario_his(String usuario_his) {
        this.usuario_his = usuario_his;
    }

    /**
     * @return the colecao_his
     */
    public String getColecao_his() {
        return colecao_his;
    }

    /**
     * @param colecao_his the colecao_his to set
     */
    public void setColecao_his(String colecao_his) {
        this.colecao_his = colecao_his;
    }

    /**
     * @return the colecionavel_his
     */
    public String getColecionavel_his() {
        return colecionavel_his;
    }

    /**
     * @param colecionavel_his the colecionavel_his to set
     */
    public void setColecionavel_his(String colecionavel_his) {
        this.colecionavel_his = colecionavel_his;
    }
}
