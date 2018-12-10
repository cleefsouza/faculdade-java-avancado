package cinelist.model;

/**
 *
 * @author cleefsouza
 */
public class Historico {

    private int cod_his;
    private String nome_item_his;
    private Acao acao_his;

    //construtores
    public Historico() {

    }

    public Historico(String no, Acao ac) {
        this.nome_item_his = no;
        this.acao_his = ac;
    }

    public Historico(int co, String no, Acao ac) {
        this.cod_his = co;
        this.nome_item_his = no;
        this.acao_his = ac;
    }

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
     * @return the nome_item_his
     */
    public String getNome_item_his() {
        return nome_item_his;
    }

    /**
     * @param nome_item_his the nome_item_his to set
     */
    public void setNome_item_his(String nome_item_his) {
        this.nome_item_his = nome_item_his;
    }

    /**
     * @return the acao_his
     */
    public Acao getAcao_his() {
        return acao_his;
    }

    /**
     * @param acao_his the acao_his to set
     */
    public void setAcao_his(Acao acao_his) {
        this.acao_his = acao_his;
    }
}
