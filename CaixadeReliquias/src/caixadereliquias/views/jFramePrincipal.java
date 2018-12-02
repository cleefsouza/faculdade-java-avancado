/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixadereliquias.views;

import caixadereliquias.dao.ColecaoDAO;
import caixadereliquias.dao.ColecionavelDAO;
import caixadereliquias.dao.EstadoDAO;
import caixadereliquias.dao.HistoricoDAO;
import caixadereliquias.dao.UsuarioDAO;
import caixadereliquias.model.Colecao;
import caixadereliquias.model.Colecionavel;
import caixadereliquias.model.Estado;
import caixadereliquias.model.Historico;
import caixadereliquias.model.Login;
import caixadereliquias.model.Usuario;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Icon;
import java.awt.Toolkit;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wendeley
 */
public class jFramePrincipal extends javax.swing.JFrame {

    Login login;
    Usuario usuario;
    UsuarioDAO usuariod;
    Colecao colecao;
    ColecaoDAO colecaod;
    Colecionavel colecionavel;
    ColecionavelDAO colecionaveld;
    Historico historico;
    HistoricoDAO historicod;
    Estado estado;
    EstadoDAO estadod;

    /**
     * Creates new form jFramePrincipal
     */
    public jFramePrincipal() {
        initComponents();
        personalizarJFrame();
        personalizarJTable();
        iconeBarra();
    }

    final void iconeBarra() {
        // coloca uma figura na barra de título da janela
        URL url = this.getClass().getResource("bau.png");
        Image icone = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(icone);
    }

    final void personalizarJFrame() {
        // janela inicia no centro
        this.setLocationRelativeTo(null);
        jPanel1.setBackground(new Color(1, 1, 1, 0.7f));
    }

    final void personalizarJTable() {
        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(SwingConstants.CENTER);

        jTable5.getTableHeader().setFont(new Font("Dialog UI", Font.BOLD, 12));
        ((DefaultTableCellRenderer) jTable5.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        jTable5.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable5.setRowHeight(30);

        for (int i = 0; i < 6; i++) {
            jTable5.getColumnModel().getColumn(i).setCellRenderer(center);
        }

        jTable4.getTableHeader().setFont(new Font("Dialog UI", Font.BOLD, 12));
        ((DefaultTableCellRenderer) jTable4.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        jTable4.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable4.setRowHeight(30);

        for (int i = 0; i < 4; i++) {
            jTable4.getColumnModel().getColumn(i).setCellRenderer(center);
        }

        jTable6.getTableHeader().setFont(new Font("Dialog UI", Font.BOLD, 12));
        ((DefaultTableCellRenderer) jTable6.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        jTable6.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable6.setRowHeight(30);

        for (int i = 0; i < 4; i++) {
            jTable6.getColumnModel().getColumn(i).setCellRenderer(center);
        }

        jTable7.getTableHeader().setFont(new Font("Dialog UI", Font.BOLD, 12));
        ((DefaultTableCellRenderer) jTable7.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        jTable7.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable7.setRowHeight(30);

        for (int i = 0; i < 4; i++) {
            jTable7.getColumnModel().getColumn(i).setCellRenderer(center);
        }

        jTable8.getTableHeader().setFont(new Font("Dialog UI", Font.BOLD, 12));
        ((DefaultTableCellRenderer) jTable8.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        jTable8.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable8.setRowHeight(30);

        for (int i = 0; i < 6; i++) {
            jTable8.getColumnModel().getColumn(i).setCellRenderer(center);
        }

        jTable9.getTableHeader().setFont(new Font("Dialog UI", Font.BOLD, 12));
        ((DefaultTableCellRenderer) jTable9.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        jTable9.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable9.setRowHeight(30);

        for (int i = 0; i < 4; i++) {
            jTable9.getColumnModel().getColumn(i).setCellRenderer(center);
        }

        jTable10.getTableHeader().setFont(new Font("Dialog UI", Font.BOLD, 12));
        ((DefaultTableCellRenderer) jTable10.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        jTable10.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable10.setRowHeight(30);

        for (int i = 0; i < 4; i++) {
            jTable10.getColumnModel().getColumn(i).setCellRenderer(center);
        }
    }

    public void buscarLogin(Login log) {
        this.usuariod = new UsuarioDAO();
        this.login = log;
        this.usuario = usuariod.buscarPorLogin(this.login.getCod_log());

        // usuario está conectado
        jLabel11.setText("<html>Bem vindo, <b>" + this.usuario.getNome_usu() + "</b></html>");
        jLabel30.setText(this.usuario.getNome_usu());
        jLabel37.setText(this.usuario.getNome_usu());
        jLabel41.setText(this.usuario.getNome_usu());
        jLabel60.setText(this.usuario.getNome_usu());
        jLabel69.setText(this.usuario.getNome_usu());

        this.showResumo();
    }

    final void showResumo() {
        /*
        * resumo
         */

        // labels
        this.colecaod = new ColecaoDAO();
        this.colecionaveld = new ColecionavelDAO();

        if (this.colecaod.qtdColecoes() < 10) {
            jLabel22.setText("0" + this.colecaod.qtdColecoes());
        } else {
            jLabel22.setText("" + this.colecaod.qtdColecoes());
        }

        if (this.colecionaveld.qtdTotal() < 10) {
            jLabel16.setText("0" + this.colecionaveld.qtdTotal());
        } else {
            jLabel16.setText("" + this.colecionaveld.qtdTotal());
        }

        if (this.colecionaveld.qtdNovo() < 10) {
            jLabel24.setText("0" + this.colecionaveld.qtdNovo());
        } else {
            jLabel24.setText("" + this.colecionaveld.qtdNovo());
        }

        if (this.colecionaveld.qtdSeminovo() < 10) {
            jLabel26.setText("0" + this.colecionaveld.qtdSeminovo());
        } else {
            jLabel26.setText("" + this.colecionaveld.qtdSeminovo());
        }

        // tables
        this.historicod = new HistoricoDAO();
        DefaultTableModel dtmHis = (DefaultTableModel) jTable5.getModel();
        dtmHis.setNumRows(0);
        for (Historico h : historicod.listarRecentes(7)) {
            dtmHis.addRow(new String[]{h.getDescricao_his(), h.getColecionavel_his(), h.getColecao_his(), h.getData_atualizacao_his(), h.getHora_atualizacao_his(), h.getUsuario_his()});
        }

        this.colecionaveld = new ColecionavelDAO();
        DefaultTableModel dtmCol = (DefaultTableModel) jTable4.getModel();
        dtmCol.setNumRows(0);
        for (Colecionavel c : colecionaveld.listarRecentes(7)) {
            dtmCol.addRow(new String[]{c.getNome_cole(), c.getDescricao_cole(), c.getEstado_cole().getDescricao_est(), c.getColecao_cole().getNome_col()});
        }
    }

    final void showHistoricoPerfil() {
        this.historicod = new HistoricoDAO();
        DefaultTableModel dtmHis = (DefaultTableModel) jTable8.getModel();
        dtmHis.setNumRows(0);
        for (Historico h : historicod.listar()) {
            dtmHis.addRow(new String[]{h.getDescricao_his(), h.getColecionavel_his(), h.getColecao_his(), h.getData_atualizacao_his(), h.getHora_atualizacao_his(), h.getUsuario_his()});
        }
    }

    final void showColecionaveisMenu1() {
        this.colecionaveld = new ColecionavelDAO();
        DefaultTableModel dtmCol = (DefaultTableModel) jTable6.getModel();
        dtmCol.setNumRows(0);
        for (Colecionavel c : colecionaveld.listarRecentes(14)) {
            dtmCol.addRow(new String[]{c.getNome_cole(), c.getDescricao_cole(), c.getEstado_cole().getDescricao_est(), c.getColecao_cole().getNome_col()});
        }
    }

    final void showColecionaveisMenu2() {
        this.colecionaveld = new ColecionavelDAO();
        DefaultTableModel dtmCol = (DefaultTableModel) jTable9.getModel();
        dtmCol.setNumRows(0);
        for (Colecionavel c : colecionaveld.listar()) {
            dtmCol.addRow(new String[]{c.getNome_cole(), c.getDescricao_cole(), c.getEstado_cole().getDescricao_est(), c.getColecao_cole().getNome_col()});
        }
    }

    final void showColecaoMenu1() {
        this.colecaod = new ColecaoDAO();
        DefaultTableModel dtmCol = (DefaultTableModel) jTable7.getModel();
        dtmCol.setNumRows(0);
        for (Colecao c : colecaod.listarRecentes(14)) {
            dtmCol.addRow(new String[]{c.getNome_col(), c.getDescricao_col(), "" + colecaod.qtdColecionaveis(c.getCod_col()), c.getData_criacao_col()});
        }
    }

    final void showColecaoMenu2() {
        this.colecaod = new ColecaoDAO();
        DefaultTableModel dtmCol = (DefaultTableModel) jTable10.getModel();
        dtmCol.setNumRows(0);
        for (Colecao c : colecaod.listar()) {
            dtmCol.addRow(new String[]{c.getNome_col(), c.getDescricao_col(), "" + colecaod.qtdColecionaveis(c.getCod_col()), c.getData_criacao_col()});
        }
    }

    final void preencherCombobox() {
        colecaod = new ColecaoDAO();
        jComboBox1.removeAllItems();
        jComboBox1.addItem("Selecione um");
        for (Colecao c : colecaod.listar()) {
            jComboBox1.addItem(c.getNome_col());
        }

        estadod = new EstadoDAO();
        jComboBox2.removeAllItems();
        jComboBox2.addItem("Selecione um");
        for (Estado c : estadod.listar()) {
            jComboBox2.addItem(c.getDescricao_est());
        }
    }

    final void limparCamposColecionavel() {
        jTextField1.setText("");
        jTextArea1.setText("");
        this.preencherCombobox();
    }

    final void limparCamposColecao() {
        jTextField4.setText("");
        jTextArea3.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPai = new javax.swing.JPanel();
        jPanelPrincipal = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jPanelColecionaveis = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanelListarColecionaveis = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jPanelColecoes = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanelPerfil = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel14 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jPanelListarColecao = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jLabel67 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel17 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caixa de Relíquias");
        setPreferredSize(new java.awt.Dimension(1106, 731));
        setResizable(false);

        jPanelPai.setLayout(new java.awt.CardLayout());

        jPanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(1106, 731));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(102, 204, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/sport_8ball.png"))); // NOI18N
        jLabel6.setText("Colecionáveis");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 200, 50));

        jLabel16.setBackground(new java.awt.Color(102, 204, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("00");
        jLabel16.setOpaque(true);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 100));

        jLabel21.setBackground(new java.awt.Color(255, 204, 0));
        jLabel21.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/box.png"))); // NOI18N
        jLabel21.setText("Coleções");
        jLabel21.setOpaque(true);
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 200, 50));

        jLabel22.setBackground(new java.awt.Color(255, 204, 0));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("00");
        jLabel22.setOpaque(true);
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 200, 100));

        jLabel23.setBackground(new java.awt.Color(0, 204, 102));
        jLabel23.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/star.png"))); // NOI18N
        jLabel23.setText("Novos");
        jLabel23.setOpaque(true);
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 200, 50));

        jLabel24.setBackground(new java.awt.Color(0, 204, 102));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("00");
        jLabel24.setOpaque(true);
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 200, 100));

        jLabel25.setBackground(new java.awt.Color(255, 111, 102));
        jLabel25.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/wrench_orange.png"))); // NOI18N
        jLabel25.setText("Semi-novos");
        jLabel25.setOpaque(true);
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 200, 50));

        jLabel26.setBackground(new java.awt.Color(255, 111, 102));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("00");
        jLabel26.setOpaque(true);
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 200, 100));

        jPanel11.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 880, 138));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/application_view_tile.png"))); // NOI18N
        jLabel13.setText("Resumo Geral");
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 169, 32));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel11.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 859, 10));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/clock_add.png"))); // NOI18N
        jLabel14.setText("Colecionáveis Inseridos Recentemente");
        jPanel11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 360, 32));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/table_multiple.png"))); // NOI18N
        jLabel15.setText("Histórico de Ações");
        jPanel11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 350, 32));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(null);

        jLabel35.setBackground(new java.awt.Color(255, 153, 0));
        jLabel35.setOpaque(true);
        jPanel12.add(jLabel35);
        jLabel35.setBounds(192, 0, 18, 70);

        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Bem vindo, Usuário!");
        jLabel11.setToolTipText("");
        jPanel12.add(jLabel11);
        jLabel11.setBounds(5, 2, 132, 70);

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("-");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jLabel12.setOpaque(true);
        jPanel12.add(jLabel12);
        jLabel12.setBounds(143, 14, 37, 41);

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 210, 70));

        jLabel7.setBackground(new java.awt.Color(255, 153, 0));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Professor: Ricardo Roberto    -    Disciplina: Análse e Projeto de Sistemas    -    Projeto: Caixa de Relíquias                                                                                                                                                                                vs.  2.0.1      ");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel7.setOpaque(true);
        jPanel11.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1110, 50));

        jScrollPane8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane8.setFocusable(false);
        jScrollPane8.setOpaque(false);

        jTable5.setAutoCreateRowSorter(true);
        jTable5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable5.setForeground(new java.awt.Color(51, 51, 51));
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ação", "Colecionável", "Coleçao", "Data", "Hora", "Usuário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.setColumnSelectionAllowed(true);
        jTable5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable5.setGridColor(new java.awt.Color(102, 102, 102));
        jTable5.setRowHeight(25);
        jTable5.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTable5.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jTable5.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(jTable5);
        jTable5.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setMinWidth(80);
            jTable5.getColumnModel().getColumn(1).setMinWidth(120);
            jTable5.getColumnModel().getColumn(2).setMinWidth(90);
            jTable5.getColumnModel().getColumn(3).setMinWidth(70);
            jTable5.getColumnModel().getColumn(4).setMinWidth(60);
            jTable5.getColumnModel().getColumn(4).setPreferredWidth(60);
            jTable5.getColumnModel().getColumn(5).setMinWidth(60);
        }

        jPanel11.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 420, 250));

        jScrollPane7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane7.setFocusable(false);
        jScrollPane7.setOpaque(false);

        jTable4.setAutoCreateRowSorter(true);
        jTable4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable4.setForeground(new java.awt.Color(51, 51, 51));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Colecionável", "Descrição", "Estado", "Coleçao"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setColumnSelectionAllowed(true);
        jTable4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable4.setGridColor(new java.awt.Color(102, 102, 102));
        jTable4.setOpaque(false);
        jTable4.setRowHeight(25);
        jTable4.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTable4.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jTable4.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable4.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(jTable4);
        jTable4.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setMinWidth(120);
            jTable4.getColumnModel().getColumn(1).setMinWidth(150);
            jTable4.getColumnModel().getColumn(2).setMinWidth(60);
            jTable4.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTable4.getColumnModel().getColumn(3).setMinWidth(90);
        }

        jPanel11.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 420, 250));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel11.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 420, 20));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel11.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 420, 20));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/abstract.jpg"))); // NOI18N
        jPanel11.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 710));

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );

        jPanelPai.add(jPanelPrincipal, "cardPrincipal");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(1, 1, 1, 0.7f));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nome:");

        jTextField1.setToolTipText("Digite o Nome");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Coleção");

        jComboBox1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox1.setToolTipText("Selecione uma coleção");
        jComboBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Estado:");

        jComboBox2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox2.setToolTipText("Selecione um estado");
        jComboBox2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Descrição:");

        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("Descrição do colecionável");
        jScrollPane2.setViewportView(jTextArea1);

        jLabel27.setBackground(new java.awt.Color(0, 204, 102));
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/book_add.png"))); // NOI18N
        jLabel27.setText("Inserir");
        jLabel27.setToolTipText("Inserir colecionável");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.setOpaque(true);
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(255, 102, 102));
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/delete.png"))); // NOI18N
        jLabel28.setText("Limpar Campos");
        jLabel28.setToolTipText("LImpar todos os campos");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.setOpaque(true);
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 163, Short.MAX_VALUE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 470));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/clock_add.png"))); // NOI18N
        jLabel18.setText("Últimos Adicionados");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 610, 10));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/add.png"))); // NOI18N
        jLabel20.setText("Inserir Colecionável");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 420, 10));

        jLabel29.setBackground(new java.awt.Color(255, 153, 0));
        jLabel29.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Professor: Ricardo Roberto    -    Disciplina: Análse e Projeto de Sistemas    -    Projeto: Caixa de Relíquias                                                                                                                                                                                vs.  2.0.1      ");
        jLabel29.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel29.setOpaque(true);
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1110, 50));

        jTable6.setAutoCreateRowSorter(true);
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Colecionável", "Descrição", "Estado", "Coleção"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable6.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTable6.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jTable6.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setMinWidth(160);
            jTable6.getColumnModel().getColumn(1).setMinWidth(350);
            jTable6.getColumnModel().getColumn(2).setMinWidth(110);
            jTable6.getColumnModel().getColumn(3).setMinWidth(160);
        }

        jPanel2.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 610, 470));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel32.setBackground(new java.awt.Color(255, 153, 0));
        jLabel32.setOpaque(true);

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("Usuário");
        jLabel30.setToolTipText("Conectado");
        jLabel30.setMaximumSize(new java.awt.Dimension(140, 30));
        jLabel30.setMinimumSize(new java.awt.Dimension(140, 30));
        jLabel30.setPreferredSize(new java.awt.Dimension(140, 30));

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 51));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/world.png"))); // NOI18N
        jLabel31.setText("está conectado!");
        jLabel31.setMaximumSize(new java.awt.Dimension(140, 30));
        jLabel31.setMinimumSize(new java.awt.Dimension(140, 30));
        jLabel31.setPreferredSize(new java.awt.Dimension(140, 30));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 210, 70));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/abstract.jpg"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 710));

        javax.swing.GroupLayout jPanelColecionaveisLayout = new javax.swing.GroupLayout(jPanelColecionaveis);
        jPanelColecionaveis.setLayout(jPanelColecionaveisLayout);
        jPanelColecionaveisLayout.setHorizontalGroup(
            jPanelColecionaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelColecionaveisLayout.setVerticalGroup(
            jPanelColecionaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelPai.add(jPanelColecionaveis, "cardColecionavel");

        jPanelListarColecionaveis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel58.setBackground(new java.awt.Color(255, 153, 0));
        jLabel58.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(51, 51, 51));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel58.setText("Professor: Ricardo Roberto    -    Disciplina: Análse e Projeto de Sistemas    -    Projeto: Caixa de Relíquias                                                                                                                                                                                vs.  2.0.1      ");
        jLabel58.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel58.setOpaque(true);
        jPanelListarColecionaveis.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1110, 50));

        jTable9.setAutoCreateRowSorter(true);
        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Colecionável", "Descrição", "Estado", "Coleção"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable9.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTable9.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jTable9.getTableHeader().setReorderingAllowed(false);
        jScrollPane12.setViewportView(jTable9);
        if (jTable9.getColumnModel().getColumnCount() > 0) {
            jTable9.getColumnModel().getColumn(0).setMinWidth(160);
            jTable9.getColumnModel().getColumn(1).setMinWidth(604);
            jTable9.getColumnModel().getColumn(2).setMinWidth(120);
            jTable9.getColumnModel().getColumn(3).setMinWidth(160);
        }

        jPanelListarColecionaveis.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 1050, 410));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel59.setBackground(new java.awt.Color(255, 153, 0));
        jLabel59.setOpaque(true);

        jLabel60.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(51, 51, 51));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel60.setText("Usuário");
        jLabel60.setToolTipText("Conectado");
        jLabel60.setMaximumSize(new java.awt.Dimension(140, 30));
        jLabel60.setMinimumSize(new java.awt.Dimension(140, 30));
        jLabel60.setPreferredSize(new java.awt.Dimension(140, 30));

        jLabel61.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(51, 51, 51));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/world.png"))); // NOI18N
        jLabel61.setText("está conectado!");
        jLabel61.setMaximumSize(new java.awt.Dimension(140, 30));
        jLabel61.setMinimumSize(new java.awt.Dimension(140, 30));
        jLabel61.setPreferredSize(new java.awt.Dimension(140, 30));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelListarColecionaveis.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 210, 70));

        jLabel62.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/star.png"))); // NOI18N
        jLabel62.setText("Meus Colecionáveis");
        jPanelListarColecionaveis.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanelListarColecionaveis.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 1050, 10));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/abstract.jpg"))); // NOI18N
        jPanelListarColecionaveis.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 710));

        jPanelPai.add(jPanelListarColecionaveis, "cardListarColecionaveis");

        jPanelColecoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/add.png"))); // NOI18N
        jLabel33.setText("Inserir Coleção");
        jPanelColecoes.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanelColecoes.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 420, 10));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanelColecoes.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 610, 10));

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/clock_add.png"))); // NOI18N
        jLabel34.setText("Últimas Adicionados");
        jPanelColecoes.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel36.setBackground(new java.awt.Color(255, 153, 0));
        jLabel36.setOpaque(true);

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 51, 51));
        jLabel37.setText("Usuário");
        jLabel37.setToolTipText("Conectado");
        jLabel37.setMaximumSize(new java.awt.Dimension(140, 30));
        jLabel37.setMinimumSize(new java.awt.Dimension(140, 30));
        jLabel37.setPreferredSize(new java.awt.Dimension(140, 30));

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/world.png"))); // NOI18N
        jLabel38.setText("está conectado!");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelColecoes.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 210, 70));

        jPanel4.setBackground(new java.awt.Color(1, 1, 1, 0.7f));
        jPanel4.setForeground(new java.awt.Color(51, 51, 51));

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 51, 51));
        jLabel39.setText("Nome:");

        jTextField4.setToolTipText("Digite o Nome");

        jLabel42.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 51, 51));
        jLabel42.setText("Descrição:");

        jTextArea3.setColumns(20);
        jTextArea3.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea3.setRows(5);
        jTextArea3.setToolTipText("Descrição do colecionável");
        jScrollPane9.setViewportView(jTextArea3);

        jLabel43.setBackground(new java.awt.Color(0, 204, 102));
        jLabel43.setForeground(new java.awt.Color(51, 51, 51));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/book_add.png"))); // NOI18N
        jLabel43.setText("Inserir");
        jLabel43.setToolTipText("Inserir colecionável");
        jLabel43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel43.setOpaque(true);
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });

        jLabel44.setBackground(new java.awt.Color(255, 102, 102));
        jLabel44.setForeground(new java.awt.Color(51, 51, 51));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/delete.png"))); // NOI18N
        jLabel44.setText("Limpar Campos");
        jLabel44.setToolTipText("LImpar todos os campos");
        jLabel44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel44.setOpaque(true);
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 163, Short.MAX_VALUE)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane9)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(jLabel42))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelColecoes.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 470));

        jTable7.setAutoCreateRowSorter(true);
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Coleção", "Descrição", "Total de Itens", "Data Criação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable7.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTable7.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jTable7.getTableHeader().setReorderingAllowed(false);
        jScrollPane10.setViewportView(jTable7);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(0).setMinWidth(160);
            jTable7.getColumnModel().getColumn(1).setMinWidth(310);
            jTable7.getColumnModel().getColumn(2).setMinWidth(80);
            jTable7.getColumnModel().getColumn(3).setMinWidth(100);
        }

        jPanelColecoes.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 610, 470));

        jLabel45.setBackground(new java.awt.Color(255, 153, 0));
        jLabel45.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(51, 51, 51));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("Professor: Ricardo Roberto    -    Disciplina: Análse e Projeto de Sistemas    -    Projeto: Caixa de Relíquias                                                                                                                                                                                vs.  2.0.1      ");
        jLabel45.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel45.setOpaque(true);
        jPanelColecoes.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1110, 50));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/abstract.jpg"))); // NOI18N
        jPanelColecoes.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 710));

        jPanelPai.add(jPanelColecoes, "cardColecoes");

        jPanelPerfil.setName(""); // NOI18N

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable8.setAutoCreateRowSorter(true);
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ação", "Colecionável", "Coleção", "Data", "Hora", "Usuário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable8.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTable8.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jTable8.getTableHeader().setReorderingAllowed(false);
        jScrollPane11.setViewportView(jTable8);
        if (jTable8.getColumnModel().getColumnCount() > 0) {
            jTable8.getColumnModel().getColumn(0).setMinWidth(80);
            jTable8.getColumnModel().getColumn(1).setMinWidth(110);
            jTable8.getColumnModel().getColumn(2).setMinWidth(150);
            jTable8.getColumnModel().getColumn(3).setMinWidth(100);
            jTable8.getColumnModel().getColumn(4).setMinWidth(80);
            jTable8.getColumnModel().getColumn(5).setMinWidth(150);
        }

        jPanel5.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 610, 420));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel5.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 610, 10));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel40.setBackground(new java.awt.Color(255, 153, 0));
        jLabel40.setOpaque(true);

        jLabel41.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 51, 51));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel41.setText("Usuário");
        jLabel41.setToolTipText("Conectado");
        jLabel41.setMaximumSize(new java.awt.Dimension(140, 30));
        jLabel41.setMinimumSize(new java.awt.Dimension(140, 30));
        jLabel41.setPreferredSize(new java.awt.Dimension(140, 30));

        jLabel47.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(51, 51, 51));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/world.png"))); // NOI18N
        jLabel47.setText("está conectado!");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 210, 70));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel5.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 420, 10));

        jLabel48.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/table_multiple.png"))); // NOI18N
        jLabel48.setText("Histórico de Ações");
        jPanel5.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        jLabel49.setBackground(new java.awt.Color(255, 153, 0));
        jLabel49.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(51, 51, 51));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel49.setText("Professor: Ricardo Roberto    -    Disciplina: Análse e Projeto de Sistemas    -    Projeto: Caixa de Relíquias                                                                                                                                                                                vs.  2.0.1      ");
        jLabel49.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel49.setOpaque(true);
        jPanel5.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1110, 50));

        jLabel50.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/user_1.png"))); // NOI18N
        jLabel50.setText("Perfil do Usuário");
        jPanel5.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jPanel6.setBackground(new java.awt.Color(1, 1, 1, 0.7f));
        jPanel6.setForeground(new java.awt.Color(51, 51, 51));

        jLabel51.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(51, 51, 51));
        jLabel51.setText("Nome:");

        jTextField5.setEditable(false);
        jTextField5.setToolTipText("Digite o Nome");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 51, 51));
        jLabel52.setText("Idade:");

        jLabel53.setBackground(new java.awt.Color(0, 153, 204));
        jLabel53.setForeground(new java.awt.Color(51, 51, 51));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/user_edit.png"))); // NOI18N
        jLabel53.setText("Atualizar");
        jLabel53.setToolTipText("Inserir colecionável");
        jLabel53.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel53.setOpaque(true);

        jLabel54.setBackground(new java.awt.Color(255, 153, 0));
        jLabel54.setForeground(new java.awt.Color(51, 51, 51));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/cross.png"))); // NOI18N
        jLabel54.setText("Cancelar");
        jLabel54.setToolTipText("Cancelar ação");
        jLabel54.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel54.setOpaque(true);

        jFormattedTextField1.setEditable(false);
        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("## anos")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setToolTipText("");

        jFormattedTextField2.setEditable(false);
        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField2.setToolTipText("");

        jLabel55.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(51, 51, 51));
        jLabel55.setText("Aniversário:");

        jLabel56.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(51, 51, 51));
        jLabel56.setText("User:");

        jTextField6.setEditable(false);
        jTextField6.setToolTipText("Digite o Nome");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(51, 51, 51));
        jLabel57.setText("Password:");

        jPasswordField1.setEditable(false);
        jPasswordField1.setText("jPasswordField1");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/eye.png"))); // NOI18N
        jLabel8.setToolTipText("Revelar senha");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jCheckBox1.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setText("Atualizar Informações?");
        jCheckBox1.setToolTipText("Marque se deseja alterar algo");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel55)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jFormattedTextField2)))
                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addComponent(jLabel56)
                            .addComponent(jLabel57)
                            .addComponent(jCheckBox1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 420, 420));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/abstract.jpg"))); // NOI18N
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 710));

        javax.swing.GroupLayout jPanelPerfilLayout = new javax.swing.GroupLayout(jPanelPerfil);
        jPanelPerfil.setLayout(jPanelPerfilLayout);
        jPanelPerfilLayout.setHorizontalGroup(
            jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelPerfilLayout.setVerticalGroup(
            jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelPai.add(jPanelPerfil, "cardPerfil");

        jPanelListarColecao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel63.setBackground(new java.awt.Color(255, 153, 0));
        jLabel63.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(51, 51, 51));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel63.setText("Professor: Ricardo Roberto    -    Disciplina: Análse e Projeto de Sistemas    -    Projeto: Caixa de Relíquias                                                                                                                                                                                vs.  2.0.1      ");
        jLabel63.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel63.setOpaque(true);
        jPanelListarColecao.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1110, 50));

        jTable10.setAutoCreateRowSorter(true);
        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Coleção", "Descrição", "Total de Itens", "Data Criação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable10.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTable10.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jTable10.getTableHeader().setReorderingAllowed(false);
        jScrollPane13.setViewportView(jTable10);
        if (jTable10.getColumnModel().getColumnCount() > 0) {
            jTable10.getColumnModel().getColumn(0).setMinWidth(200);
            jTable10.getColumnModel().getColumn(1).setMinWidth(624);
            jTable10.getColumnModel().getColumn(2).setMinWidth(100);
            jTable10.getColumnModel().getColumn(3).setMinWidth(120);
        }

        jPanelListarColecao.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 1050, 410));

        jLabel67.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/star.png"))); // NOI18N
        jLabel67.setText("Minhas Coleções");
        jPanelListarColecao.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanelListarColecao.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 1050, 10));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel68.setBackground(new java.awt.Color(255, 153, 0));
        jLabel68.setOpaque(true);

        jLabel69.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(51, 51, 51));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel69.setText("Usuário");
        jLabel69.setToolTipText("Conectado");
        jLabel69.setMaximumSize(new java.awt.Dimension(140, 30));
        jLabel69.setMinimumSize(new java.awt.Dimension(140, 30));
        jLabel69.setPreferredSize(new java.awt.Dimension(140, 30));

        jLabel70.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(51, 51, 51));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/world.png"))); // NOI18N
        jLabel70.setText("está conectado!");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelListarColecao.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 210, 70));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/abstract.jpg"))); // NOI18N
        jPanelListarColecao.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 710));

        jPanelPai.add(jPanelListarColecao, "cardListarColecao");

        jMenuBar1.setBackground(new java.awt.Color(255, 153, 51));

        jMenu3.setBackground(new java.awt.Color(255, 153, 0));
        jMenu3.setForeground(new java.awt.Color(51, 51, 51));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/house.png"))); // NOI18N
        jMenu3.setText("Principal");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu1.setBackground(new java.awt.Color(255, 153, 0));
        jMenu1.setForeground(new java.awt.Color(51, 51, 51));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/sport_8ball.png"))); // NOI18N
        jMenu1.setText("Colecionáveis");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/wrench_orange.png"))); // NOI18N
        jMenuItem2.setText("Gerenciar Colecionáveis");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/text_list_bullets.png"))); // NOI18N
        jMenuItem3.setText("Listar Colecionáveis");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 153, 0));
        jMenu2.setForeground(new java.awt.Color(51, 51, 51));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/box.png"))); // NOI18N
        jMenu2.setText("Coleções");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/box.png"))); // NOI18N
        jMenuItem4.setText("Gerenciar Coleções");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/text_list_bullets.png"))); // NOI18N
        jMenuItem5.setText("Listar Coleções");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu4.setBackground(new java.awt.Color(255, 153, 0));
        jMenu4.setForeground(new java.awt.Color(51, 51, 51));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/user_1.png"))); // NOI18N
        jMenu4.setText("Perfil");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(255, 153, 0));
        jMenu5.setForeground(new java.awt.Color(51, 51, 51));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/door_out.png"))); // NOI18N
        jMenu5.setText("Encerrar Sessão");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        CardLayout cl = (CardLayout) jPanelPai.getLayout();
        cl.show(jPanelPai, "cardColecoes");

        // listar coleções recentes
        this.showColecaoMenu1();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        CardLayout cl = (CardLayout) jPanelPai.getLayout();
        cl.show(jPanelPai, "cardListarColecionaveis");

        // lista colecionáveis na tabela
        this.showColecionaveisMenu2();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CardLayout cl = (CardLayout) jPanelPai.getLayout();
        cl.show(jPanelPai, "cardColecionavel");

        // lista colecionáveis na tabela
        this.showColecionaveisMenu1();

        // preencher combobox
        this.preencherCombobox();

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        URL url = this.getClass().getResource("warnning-icon.png");
        ImageIcon imgIcon = new ImageIcon(url);
        int opc = JOptionPane.showConfirmDialog(null, "<html>Tem <b>certeza</b> disso?</html>", "Information Message", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, imgIcon);
        if (opc == 0) {
            jFrameLogin jfml = new jFrameLogin();
            jfml.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        CardLayout cl = (CardLayout) jPanelPai.getLayout();
        cl.show(jPanelPai, "cardPrincipal");

        // preenche tabelas de resumo
        this.showResumo();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed

    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        CardLayout cl = (CardLayout) jPanelPai.getLayout();
        cl.show(jPanelPai, "cardPerfil");

        // lista historico no perfil
        this.showHistoricoPerfil();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        CardLayout cl = (CardLayout) jPanelPai.getLayout();
        cl.show(jPanelPai, "cardListarColecao");

        // listar coleções na tabela
        this.showColecaoMenu2();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // limpar campos dor formulario
        this.limparCamposColecionavel();
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        if (jTextField1.getText().equals("") || jTextArea1.getText().equals("") || jComboBox1.getSelectedItem().equals("Selecione um") || jComboBox2.getSelectedItem().equals("Selecione um")) {
            URL url = this.getClass().getResource("error-icon.png");
            ImageIcon imgIcon = new ImageIcon(url);
            JOptionPane.showMessageDialog(null, "<html>Preencha os <b>campos corretamente</b></html>", "Error Message", JOptionPane.ERROR_MESSAGE, imgIcon);
        } else {

            // inserir colecionavel
            colecaod = new ColecaoDAO();
            estadod = new EstadoDAO();
            colecionavel = new Colecionavel(jTextField1.getText(), jTextArea1.getText(), colecaod.buscar(jComboBox1.getSelectedIndex()), estadod.buscar(jComboBox2.getSelectedIndex()));

            colecionaveld = new ColecionavelDAO();
            colecionaveld.adicionar(colecionavel);

            URL url = this.getClass().getResource("information-icon.png");
            ImageIcon imgIcon = new ImageIcon(url);
            JOptionPane.showMessageDialog(null, "<html>Colecionável <b>inserido</b> com <b>sucesso</>!</html>", "Information Message", JOptionPane.INFORMATION_MESSAGE, imgIcon);

            this.limparCamposColecionavel(); // limpar campos dor formulario
            this.showColecionaveisMenu1(); // atualizar table            
        }
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
        this.limparCamposColecao(); // limpar campos dor formulario
    }//GEN-LAST:event_jLabel44MouseClicked

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        if (jTextField4.getText().equals("") || jTextArea3.getText().equals("")) {
            URL url = this.getClass().getResource("error-icon.png");
            ImageIcon imgIcon = new ImageIcon(url);
            JOptionPane.showMessageDialog(null, "<html>Preencha os <b>campos corretamente</b></html>", "Error Message", JOptionPane.ERROR_MESSAGE, imgIcon);
        } else {

            // inserir coleção
            usuariod = new UsuarioDAO();
            Date data = new Date(System.currentTimeMillis()); // data atual
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            colecao = new Colecao(jTextField4.getText(), jTextArea3.getText(), sdf.format(data), usuario);

            colecaod = new ColecaoDAO();
            colecaod.adicionar(colecao);

            URL url = this.getClass().getResource("information-icon.png");
            ImageIcon imgIcon = new ImageIcon(url);
            JOptionPane.showMessageDialog(null, "<html>Coleção <b>inserida</b> com <b>sucesso</>!</html>", "Information Message", JOptionPane.INFORMATION_MESSAGE, imgIcon);

            this.limparCamposColecao(); // limpar campos dor formulario
            this.showColecaoMenu1(); // atualizar table            
        }
    }//GEN-LAST:event_jLabel43MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jFramePrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFramePrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFramePrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFramePrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelColecionaveis;
    private javax.swing.JPanel jPanelColecoes;
    private javax.swing.JPanel jPanelListarColecao;
    private javax.swing.JPanel jPanelListarColecionaveis;
    private javax.swing.JPanel jPanelPai;
    private javax.swing.JPanel jPanelPerfil;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
