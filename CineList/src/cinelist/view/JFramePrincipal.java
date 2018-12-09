package cinelist.view;

import cinelist.dao.LoginDAO;
import cinelist.dao.UsuarioDAO;
import cinelist.model.Login;
import cinelist.model.Usuario;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author cleefsouza
 */
public class JFramePrincipal extends javax.swing.JFrame {

    Usuario usuario;
    UsuarioDAO usuariod;
    Login login;
    LoginDAO logind;

    /**
     * Creates new form JFramePrincipal
     */
    public JFramePrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        personalizarTables();
    }

    final void onHover(JLabel jlabel) {
        jlabel.setBackground(new Color(204, 255, 255));
    }

    final void offHover(JLabel jlabel) {
        jlabel.setBackground(new Color(255, 255, 255));
    }

    public void buscarLogin(Login log) {
        this.usuariod = new UsuarioDAO();
        this.login = log;
        this.usuario = usuariod.buscarPorLogin(this.login.getCod_log());

        jLabelUsuarioName.setText(this.usuario.getNome_usu());
        //this.showResumo();
    }

    final void personalizarTables() {
        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(SwingConstants.CENTER);

        // JTable Filmes
        jTableFilmes.getTableHeader().setFont(new Font("Dialog UI", Font.BOLD, 12));
        ((DefaultTableCellRenderer) jTableFilmes.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        jTableFilmes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableFilmes.setRowHeight(30);

        for (int i = 0; i < 5; i++) {
            jTableFilmes.getColumnModel().getColumn(i).setCellRenderer(center);
        }

        // JTable Diretores
        jTableDiretores.getTableHeader().setFont(new Font("Dialog UI", Font.BOLD, 12));
        ((DefaultTableCellRenderer) jTableDiretores.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        jTableDiretores.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableDiretores.setRowHeight(30);

        for (int i = 0; i < 3; i++) {
            jTableDiretores.getColumnModel().getColumn(i).setCellRenderer(center);
        }

        // JTable Generos
        jTableGeneros.getTableHeader().setFont(new Font("Dialog UI", Font.BOLD, 12));
        ((DefaultTableCellRenderer) jTableGeneros.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        jTableGeneros.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableGeneros.setRowHeight(30);

        for (int i = 0; i < 3; i++) {
            jTableGeneros.getColumnModel().getColumn(i).setCellRenderer(center);
        }

        // JTable Historico
        jTableHistorico.getTableHeader().setFont(new Font("Dialog UI", Font.BOLD, 12));
        ((DefaultTableCellRenderer) jTableHistorico.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        jTableHistorico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableHistorico.setRowHeight(30);

        for (int i = 0; i < 7; i++) {
            jTableHistorico.getColumnModel().getColumn(i).setCellRenderer(center);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCardPai = new javax.swing.JPanel();
        jPanelDashboard = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanelResumo1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabelResumo1 = new javax.swing.JLabel();
        jPanelResumo2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabelResumo2 = new javax.swing.JLabel();
        jPanelResumo3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabelResumo3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabelResumoImagem1 = new javax.swing.JLabel();
        jLabelResumoNome1 = new javax.swing.JLabel();
        jLabelResumoImagem2 = new javax.swing.JLabel();
        jLabelResumoNome2 = new javax.swing.JLabel();
        jLabelResumoNome3 = new javax.swing.JLabel();
        jLabelResumoImagem3 = new javax.swing.JLabel();
        jLabelResumoImagem4 = new javax.swing.JLabel();
        jLabelResumoNome4 = new javax.swing.JLabel();
        jPanelFilme = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFilmes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabelAlterarFilme = new javax.swing.JLabel();
        jLabelInserirFilme = new javax.swing.JLabel();
        jLabelRemoverFilme = new javax.swing.JLabel();
        jLabelDetalhesFilme = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelDiretor = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDiretores = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabelInserirDiretor = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jCheckBoxDiretor1 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabelAlterarDiretor = new javax.swing.JLabel();
        jLabelRemoverDiretor = new javax.swing.JLabel();
        jCheckBoxDiretor2 = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanelGenero = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableGeneros = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabelInserirGenero = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jCheckBoxGenero1 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jLabelAlterarGenero = new javax.swing.JLabel();
        jLabelRemoverGenero = new javax.swing.JLabel();
        jCheckBoxGenero2 = new javax.swing.JCheckBox();
        jTextField4 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jPanelPerfil = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jLabelAlterarPerfil = new javax.swing.JLabel();
        jCheckBoxPerfil = new javax.swing.JCheckBox();
        jTextFieldNomeUsuario = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabelRemoverGenero1 = new javax.swing.JLabel();
        jTextFieldTipoUsuario = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldUsuarioUsuario = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPasswordFieldSenhaUsuario = new javax.swing.JPasswordField();
        jCheckBoxRevelarSenha = new javax.swing.JCheckBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableHistorico = new javax.swing.JTable();
        jLabelAdministrador = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelUsuarioName = new javax.swing.JLabel();
        jLabelMenuItem1 = new javax.swing.JLabel();
        jLabelMenuItem2 = new javax.swing.JLabel();
        jLabelMenuItem3 = new javax.swing.JLabel();
        jLabelMenuItem4 = new javax.swing.JLabel();
        jLabelMenuItem5 = new javax.swing.JLabel();
        jLabelMenuItem6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CineList");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelCardPai.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCardPai.setLayout(new java.awt.CardLayout());

        jPanelDashboard.setBackground(new java.awt.Color(245, 255, 255));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/world.png"))); // NOI18N
        jLabel5.setText("Conectado    ");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabel5.setOpaque(true);
        jLabel5.setPreferredSize(new java.awt.Dimension(108, 27));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/application_view_tile.png"))); // NOI18N
        jLabel8.setText("Dashboard");

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        jPanelResumo1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelResumo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("FILMES");

        jLabelResumo1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelResumo1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabelResumo1.setForeground(new java.awt.Color(51, 51, 51));
        jLabelResumo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResumo1.setText("00");
        jLabelResumo1.setOpaque(true);

        javax.swing.GroupLayout jPanelResumo1Layout = new javax.swing.GroupLayout(jPanelResumo1);
        jPanelResumo1.setLayout(jPanelResumo1Layout);
        jPanelResumo1Layout.setHorizontalGroup(
            jPanelResumo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResumo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelResumo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelResumo1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanelResumo1Layout.setVerticalGroup(
            jPanelResumo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelResumo1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelResumo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(42, 42, 42))
        );

        jPanelResumo2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelResumo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CRÍTICAS");

        jLabelResumo2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelResumo2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabelResumo2.setForeground(new java.awt.Color(51, 51, 51));
        jLabelResumo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResumo2.setText("00");
        jLabelResumo2.setOpaque(true);

        javax.swing.GroupLayout jPanelResumo2Layout = new javax.swing.GroupLayout(jPanelResumo2);
        jPanelResumo2.setLayout(jPanelResumo2Layout);
        jPanelResumo2Layout.setHorizontalGroup(
            jPanelResumo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResumo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelResumo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelResumo2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanelResumo2Layout.setVerticalGroup(
            jPanelResumo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelResumo2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelResumo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(42, 42, 42))
        );

        jPanelResumo3.setBackground(new java.awt.Color(255, 255, 255));
        jPanelResumo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("NOTA MÉDIA");

        jLabelResumo3.setBackground(new java.awt.Color(255, 255, 255));
        jLabelResumo3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabelResumo3.setForeground(new java.awt.Color(51, 51, 51));
        jLabelResumo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResumo3.setText("00");
        jLabelResumo3.setOpaque(true);

        javax.swing.GroupLayout jPanelResumo3Layout = new javax.swing.GroupLayout(jPanelResumo3);
        jPanelResumo3.setLayout(jPanelResumo3Layout);
        jPanelResumo3Layout.setHorizontalGroup(
            jPanelResumo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResumo3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelResumo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelResumo3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanelResumo3Layout.setVerticalGroup(
            jPanelResumo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelResumo3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelResumo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(42, 42, 42))
        );

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/film.png"))); // NOI18N
        jLabel12.setText("Útimos assistidos");

        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        jLabelResumoImagem1.setFont(new java.awt.Font("Dialog", 1, 108)); // NOI18N
        jLabelResumoImagem1.setForeground(new java.awt.Color(51, 51, 51));
        jLabelResumoImagem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResumoImagem1.setText("X");
        jLabelResumoImagem1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));

        jLabelResumoNome1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelResumoNome1.setForeground(new java.awt.Color(51, 51, 51));
        jLabelResumoNome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResumoNome1.setText("Nome do Filme");

        jLabelResumoImagem2.setFont(new java.awt.Font("Dialog", 1, 108)); // NOI18N
        jLabelResumoImagem2.setForeground(new java.awt.Color(51, 51, 51));
        jLabelResumoImagem2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResumoImagem2.setText("X");
        jLabelResumoImagem2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));

        jLabelResumoNome2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelResumoNome2.setForeground(new java.awt.Color(51, 51, 51));
        jLabelResumoNome2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResumoNome2.setText("Nome do Filme");

        jLabelResumoNome3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelResumoNome3.setForeground(new java.awt.Color(51, 51, 51));
        jLabelResumoNome3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResumoNome3.setText("Nome do Filme");

        jLabelResumoImagem3.setFont(new java.awt.Font("Dialog", 1, 108)); // NOI18N
        jLabelResumoImagem3.setForeground(new java.awt.Color(51, 51, 51));
        jLabelResumoImagem3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResumoImagem3.setText("X");
        jLabelResumoImagem3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));

        jLabelResumoImagem4.setFont(new java.awt.Font("Dialog", 1, 108)); // NOI18N
        jLabelResumoImagem4.setForeground(new java.awt.Color(51, 51, 51));
        jLabelResumoImagem4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResumoImagem4.setText("X");
        jLabelResumoImagem4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));

        jLabelResumoNome4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelResumoNome4.setForeground(new java.awt.Color(51, 51, 51));
        jLabelResumoNome4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResumoNome4.setText("Nome do Filme");

        javax.swing.GroupLayout jPanelDashboardLayout = new javax.swing.GroupLayout(jPanelDashboard);
        jPanelDashboard.setLayout(jPanelDashboardLayout);
        jPanelDashboardLayout.setHorizontalGroup(
            jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelDashboardLayout.createSequentialGroup()
                .addGroup(jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDashboardLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addGroup(jPanelDashboardLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelResumoNome1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelResumoImagem1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelResumoNome2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelResumoImagem2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelResumoNome3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelResumoImagem3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelResumoNome4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelResumoImagem4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelDashboardLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jPanelResumo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelResumo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelResumo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 19, Short.MAX_VALUE))
        );
        jPanelDashboardLayout.setVerticalGroup(
            jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDashboardLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelResumo1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelResumo2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelResumo3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDashboardLayout.createSequentialGroup()
                        .addComponent(jLabelResumoImagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelResumoNome1))
                    .addGroup(jPanelDashboardLayout.createSequentialGroup()
                        .addComponent(jLabelResumoImagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelResumoNome2))
                    .addGroup(jPanelDashboardLayout.createSequentialGroup()
                        .addComponent(jLabelResumoImagem3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelResumoNome3))
                    .addGroup(jPanelDashboardLayout.createSequentialGroup()
                        .addComponent(jLabelResumoImagem4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelResumoNome4)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanelCardPai.add(jPanelDashboard, "cardDashboard");

        jPanelFilme.setBackground(new java.awt.Color(245, 255, 255));

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/world.png"))); // NOI18N
        jLabel6.setText("Conectado    ");
        jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabel6.setOpaque(true);
        jLabel6.setPreferredSize(new java.awt.Dimension(108, 27));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/film.png"))); // NOI18N
        jLabel13.setText("Filmes");

        jSeparator4.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTableFilmes.setBackground(new java.awt.Color(255, 255, 255));
        jTableFilmes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Filme", "Qtd. Filmes", "Gênero", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFilmes.setSelectionBackground(new java.awt.Color(245, 255, 255));
        jTableFilmes.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jTableFilmes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableFilmes);
        if (jTableFilmes.getColumnModel().getColumnCount() > 0) {
            jTableFilmes.getColumnModel().getColumn(0).setResizable(false);
            jTableFilmes.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTableFilmes.getColumnModel().getColumn(1).setMinWidth(208);
            jTableFilmes.getColumnModel().getColumn(2).setMinWidth(300);
            jTableFilmes.getColumnModel().getColumn(3).setMinWidth(100);
            jTableFilmes.getColumnModel().getColumn(4).setResizable(false);
            jTableFilmes.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));

        jLabelAlterarFilme.setBackground(new java.awt.Color(255, 204, 0));
        jLabelAlterarFilme.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelAlterarFilme.setForeground(new java.awt.Color(51, 51, 51));
        jLabelAlterarFilme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAlterarFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/pencil.png"))); // NOI18N
        jLabelAlterarFilme.setText("Alterar");
        jLabelAlterarFilme.setToolTipText("Alterar filme");
        jLabelAlterarFilme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelAlterarFilme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAlterarFilme.setOpaque(true);

        jLabelInserirFilme.setBackground(new java.awt.Color(0, 204, 153));
        jLabelInserirFilme.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelInserirFilme.setForeground(new java.awt.Color(51, 51, 51));
        jLabelInserirFilme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInserirFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/add.png"))); // NOI18N
        jLabelInserirFilme.setText("Inserir");
        jLabelInserirFilme.setToolTipText("Inserir filme");
        jLabelInserirFilme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelInserirFilme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelInserirFilme.setOpaque(true);

        jLabelRemoverFilme.setBackground(new java.awt.Color(255, 102, 102));
        jLabelRemoverFilme.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelRemoverFilme.setForeground(new java.awt.Color(51, 51, 51));
        jLabelRemoverFilme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRemoverFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/delete.png"))); // NOI18N
        jLabelRemoverFilme.setText("Remover");
        jLabelRemoverFilme.setToolTipText("Remover filme");
        jLabelRemoverFilme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelRemoverFilme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRemoverFilme.setOpaque(true);

        jLabelDetalhesFilme.setBackground(new java.awt.Color(102, 153, 255));
        jLabelDetalhesFilme.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelDetalhesFilme.setForeground(new java.awt.Color(51, 51, 51));
        jLabelDetalhesFilme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDetalhesFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/book_open.png"))); // NOI18N
        jLabelDetalhesFilme.setText("Detalhes");
        jLabelDetalhesFilme.setToolTipText("Mais detalhes");
        jLabelDetalhesFilme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelDetalhesFilme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelDetalhesFilme.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelInserirFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelAlterarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelRemoverFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDetalhesFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelInserirFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAlterarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRemoverFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDetalhesFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/cog.png"))); // NOI18N
        jLabel4.setText("Opções");

        javax.swing.GroupLayout jPanelFilmeLayout = new javax.swing.GroupLayout(jPanelFilme);
        jPanelFilme.setLayout(jPanelFilmeLayout);
        jPanelFilmeLayout.setHorizontalGroup(
            jPanelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
            .addGroup(jPanelFilmeLayout.createSequentialGroup()
                .addGroup(jPanelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFilmeLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanelFilmeLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelFilmeLayout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(jLabel4)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFilmeLayout.setVerticalGroup(
            jPanelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFilmeLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        jPanelCardPai.add(jPanelFilme, "cardFilme");

        jPanelDiretor.setBackground(new java.awt.Color(245, 255, 255));

        jLabel14.setBackground(new java.awt.Color(51, 51, 51));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/world.png"))); // NOI18N
        jLabel14.setText("Conectado    ");
        jLabel14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabel14.setOpaque(true);
        jLabel14.setPreferredSize(new java.awt.Dimension(108, 27));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/page_white_camera.png"))); // NOI18N
        jLabel15.setText("Diretores");

        jSeparator5.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTableDiretores.setBackground(new java.awt.Color(255, 255, 255));
        jTableDiretores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Diretor", "Qtd. Filmes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDiretores.setSelectionBackground(new java.awt.Color(245, 255, 255));
        jTableDiretores.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jTableDiretores.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableDiretores);
        if (jTableDiretores.getColumnModel().getColumnCount() > 0) {
            jTableDiretores.getColumnModel().getColumn(0).setResizable(false);
            jTableDiretores.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTableDiretores.getColumnModel().getColumn(1).setResizable(false);
            jTableDiretores.getColumnModel().getColumn(1).setPreferredWidth(208);
            jTableDiretores.getColumnModel().getColumn(2).setResizable(false);
            jTableDiretores.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));

        jLabelInserirDiretor.setBackground(new java.awt.Color(0, 204, 153));
        jLabelInserirDiretor.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelInserirDiretor.setForeground(new java.awt.Color(51, 51, 51));
        jLabelInserirDiretor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInserirDiretor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/add.png"))); // NOI18N
        jLabelInserirDiretor.setText("Inserir");
        jLabelInserirDiretor.setToolTipText("Inserir diretor");
        jLabelInserirDiretor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelInserirDiretor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelInserirDiretor.setOpaque(true);

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Nome:");

        jCheckBoxDiretor1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jCheckBoxDiretor1.setText("Habilitar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelInserirDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxDiretor1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBoxDiretor1)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabelInserirDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));

        jLabelAlterarDiretor.setBackground(new java.awt.Color(255, 204, 0));
        jLabelAlterarDiretor.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelAlterarDiretor.setForeground(new java.awt.Color(51, 51, 51));
        jLabelAlterarDiretor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAlterarDiretor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/pencil.png"))); // NOI18N
        jLabelAlterarDiretor.setText("Alterar");
        jLabelAlterarDiretor.setToolTipText("Alterar diretor");
        jLabelAlterarDiretor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelAlterarDiretor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAlterarDiretor.setOpaque(true);

        jLabelRemoverDiretor.setBackground(new java.awt.Color(255, 102, 102));
        jLabelRemoverDiretor.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelRemoverDiretor.setForeground(new java.awt.Color(51, 51, 51));
        jLabelRemoverDiretor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRemoverDiretor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/delete.png"))); // NOI18N
        jLabelRemoverDiretor.setText("Remover");
        jLabelRemoverDiretor.setToolTipText("Remover diretor");
        jLabelRemoverDiretor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelRemoverDiretor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRemoverDiretor.setOpaque(true);

        jCheckBoxDiretor2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jCheckBoxDiretor2.setText("Habilitar");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Nome:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelAlterarDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelRemoverDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxDiretor2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxDiretor2)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAlterarDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRemoverDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelDiretorLayout = new javax.swing.GroupLayout(jPanelDiretor);
        jPanelDiretor.setLayout(jPanelDiretorLayout);
        jPanelDiretorLayout.setHorizontalGroup(
            jPanelDiretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
            .addGroup(jPanelDiretorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelDiretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDiretorLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDiretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDiretorLayout.setVerticalGroup(
            jPanelDiretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDiretorLayout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDiretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDiretorLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(256, 256, 256))
                    .addGroup(jPanelDiretorLayout.createSequentialGroup()
                        .addGroup(jPanelDiretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62))))
        );

        jPanelCardPai.add(jPanelDiretor, "cardDiretor");

        jPanelGenero.setBackground(new java.awt.Color(245, 255, 255));

        jLabel18.setBackground(new java.awt.Color(51, 51, 51));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/world.png"))); // NOI18N
        jLabel18.setText("Conectado    ");
        jLabel18.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabel18.setOpaque(true);
        jLabel18.setPreferredSize(new java.awt.Dimension(108, 27));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/male.png"))); // NOI18N
        jLabel19.setText("Gêneros");

        jSeparator6.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTableGeneros.setBackground(new java.awt.Color(255, 255, 255));
        jTableGeneros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Gênero", "Qtd. Filmes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableGeneros.setSelectionBackground(new java.awt.Color(245, 255, 255));
        jTableGeneros.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jTableGeneros.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTableGeneros);
        if (jTableGeneros.getColumnModel().getColumnCount() > 0) {
            jTableGeneros.getColumnModel().getColumn(0).setResizable(false);
            jTableGeneros.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTableGeneros.getColumnModel().getColumn(1).setMinWidth(208);
            jTableGeneros.getColumnModel().getColumn(2).setResizable(false);
            jTableGeneros.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));

        jLabelInserirGenero.setBackground(new java.awt.Color(0, 204, 153));
        jLabelInserirGenero.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelInserirGenero.setForeground(new java.awt.Color(51, 51, 51));
        jLabelInserirGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInserirGenero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/add.png"))); // NOI18N
        jLabelInserirGenero.setText("Inserir");
        jLabelInserirGenero.setToolTipText("Inserir gênero");
        jLabelInserirGenero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelInserirGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelInserirGenero.setOpaque(true);

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Nome:");

        jCheckBoxGenero1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jCheckBoxGenero1.setText("Habilitar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelInserirGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField3)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxGenero1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBoxGenero1)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabelInserirGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));

        jLabelAlterarGenero.setBackground(new java.awt.Color(255, 204, 0));
        jLabelAlterarGenero.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelAlterarGenero.setForeground(new java.awt.Color(51, 51, 51));
        jLabelAlterarGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAlterarGenero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/pencil.png"))); // NOI18N
        jLabelAlterarGenero.setText("Alterar");
        jLabelAlterarGenero.setToolTipText("Alterar gênero");
        jLabelAlterarGenero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelAlterarGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAlterarGenero.setOpaque(true);

        jLabelRemoverGenero.setBackground(new java.awt.Color(255, 102, 102));
        jLabelRemoverGenero.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelRemoverGenero.setForeground(new java.awt.Color(51, 51, 51));
        jLabelRemoverGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRemoverGenero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/delete.png"))); // NOI18N
        jLabelRemoverGenero.setText("Remover");
        jLabelRemoverGenero.setToolTipText("Remover gênero");
        jLabelRemoverGenero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelRemoverGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRemoverGenero.setOpaque(true);

        jCheckBoxGenero2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jCheckBoxGenero2.setText("Habilitar");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Nome:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelAlterarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelRemoverGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField4)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxGenero2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxGenero2)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAlterarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRemoverGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelGeneroLayout = new javax.swing.GroupLayout(jPanelGenero);
        jPanelGenero.setLayout(jPanelGeneroLayout);
        jPanelGeneroLayout.setHorizontalGroup(
            jPanelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
            .addGroup(jPanelGeneroLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelGeneroLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelGeneroLayout.setVerticalGroup(
            jPanelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGeneroLayout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGeneroLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(256, 256, 256))
                    .addGroup(jPanelGeneroLayout.createSequentialGroup()
                        .addGroup(jPanelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62))))
        );

        jPanelCardPai.add(jPanelGenero, "cardGenero");

        jPanelPerfil.setBackground(new java.awt.Color(245, 255, 255));

        jLabel22.setBackground(new java.awt.Color(51, 51, 51));
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/world.png"))); // NOI18N
        jLabel22.setText("Conectado    ");
        jLabel22.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabel22.setOpaque(true);
        jLabel22.setPreferredSize(new java.awt.Dimension(108, 27));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/user_1.png"))); // NOI18N
        jLabel23.setText("Perfil");

        jSeparator7.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator7.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));

        jLabelAlterarPerfil.setBackground(new java.awt.Color(255, 204, 0));
        jLabelAlterarPerfil.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelAlterarPerfil.setForeground(new java.awt.Color(51, 51, 51));
        jLabelAlterarPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAlterarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/pencil.png"))); // NOI18N
        jLabelAlterarPerfil.setText("Alterar");
        jLabelAlterarPerfil.setToolTipText("Alterar perfil");
        jLabelAlterarPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelAlterarPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAlterarPerfil.setOpaque(true);

        jCheckBoxPerfil.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jCheckBoxPerfil.setText("Habilitar");

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Nome:");

        jLabelRemoverGenero1.setBackground(new java.awt.Color(255, 102, 102));
        jLabelRemoverGenero1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelRemoverGenero1.setForeground(new java.awt.Color(51, 51, 51));
        jLabelRemoverGenero1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRemoverGenero1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/cross.png"))); // NOI18N
        jLabelRemoverGenero1.setText("Cancelar");
        jLabelRemoverGenero1.setToolTipText("Cancelar ação");
        jLabelRemoverGenero1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelRemoverGenero1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRemoverGenero1.setOpaque(true);

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("Tipo:");

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("Usuário");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("Senha:");

        jPasswordFieldSenhaUsuario.setText("jPasswordField1");

        jCheckBoxRevelarSenha.setToolTipText("Revelar senha");
        jCheckBoxRevelarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBoxRevelarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/eye.png"))); // NOI18N
        jCheckBoxRevelarSenha.setOpaque(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNomeUsuario)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelRemoverGenero1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAlterarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldTipoUsuario)
                    .addComponent(jTextFieldUsuarioUsuario)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jPasswordFieldSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBoxRevelarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxPerfil)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUsuarioUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBoxRevelarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordFieldSenhaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAlterarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRemoverGenero1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTableHistorico.setBackground(new java.awt.Color(255, 255, 255));
        jTableHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Item", "Ação", "Horário", "Usuário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableHistorico.setSelectionBackground(new java.awt.Color(245, 255, 255));
        jTableHistorico.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane4.setViewportView(jTableHistorico);
        if (jTableHistorico.getColumnModel().getColumnCount() > 0) {
            jTableHistorico.getColumnModel().getColumn(0).setResizable(false);
            jTableHistorico.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTableHistorico.getColumnModel().getColumn(1).setMinWidth(200);
            jTableHistorico.getColumnModel().getColumn(2).setMinWidth(100);
            jTableHistorico.getColumnModel().getColumn(3).setMinWidth(100);
            jTableHistorico.getColumnModel().getColumn(4).setMinWidth(150);
        }

        jLabelAdministrador.setBackground(new java.awt.Color(204, 51, 255));
        jLabelAdministrador.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelAdministrador.setForeground(new java.awt.Color(51, 51, 51));
        jLabelAdministrador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/star.png"))); // NOI18N
        jLabelAdministrador.setText("Administrador");
        jLabelAdministrador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        jLabelAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAdministrador.setOpaque(true);

        javax.swing.GroupLayout jPanelPerfilLayout = new javax.swing.GroupLayout(jPanelPerfil);
        jPanelPerfil.setLayout(jPanelPerfilLayout);
        jPanelPerfilLayout.setHorizontalGroup(
            jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelPerfilLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPerfilLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabelAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanelPerfilLayout.setVerticalGroup(
            jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPerfilLayout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelPerfilLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanelCardPai.add(jPanelPerfil, "cardPerfil");

        getContentPane().add(jPanelCardPai, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 0, 720, 500));

        jPanelMenu.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 120)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));
        jLabel2.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Menu");

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        jLabelUsuarioName.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelUsuarioName.setForeground(new java.awt.Color(51, 51, 51));
        jLabelUsuarioName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsuarioName.setText("Usuário");

        jLabelMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMenuItem1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelMenuItem1.setForeground(new java.awt.Color(51, 51, 51));
        jLabelMenuItem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/application_view_tile.png"))); // NOI18N
        jLabelMenuItem1.setText("Dashboard");
        jLabelMenuItem1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMenuItem1.setOpaque(true);
        jLabelMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuItem1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMenuItem1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMenuItem1MouseExited(evt);
            }
        });

        jLabelMenuItem2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMenuItem2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelMenuItem2.setForeground(new java.awt.Color(51, 51, 51));
        jLabelMenuItem2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/film.png"))); // NOI18N
        jLabelMenuItem2.setText("Filme");
        jLabelMenuItem2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMenuItem2.setOpaque(true);
        jLabelMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuItem2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMenuItem2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMenuItem2MouseExited(evt);
            }
        });

        jLabelMenuItem3.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMenuItem3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelMenuItem3.setForeground(new java.awt.Color(51, 51, 51));
        jLabelMenuItem3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/page_white_camera.png"))); // NOI18N
        jLabelMenuItem3.setText("Diretor");
        jLabelMenuItem3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMenuItem3.setOpaque(true);
        jLabelMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuItem3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMenuItem3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMenuItem3MouseExited(evt);
            }
        });

        jLabelMenuItem4.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMenuItem4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelMenuItem4.setForeground(new java.awt.Color(51, 51, 51));
        jLabelMenuItem4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/male.png"))); // NOI18N
        jLabelMenuItem4.setText("Gênero");
        jLabelMenuItem4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMenuItem4.setOpaque(true);
        jLabelMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuItem4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMenuItem4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMenuItem4MouseExited(evt);
            }
        });

        jLabelMenuItem5.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMenuItem5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelMenuItem5.setForeground(new java.awt.Color(51, 51, 51));
        jLabelMenuItem5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/user_1.png"))); // NOI18N
        jLabelMenuItem5.setText("Perfil");
        jLabelMenuItem5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMenuItem5.setOpaque(true);
        jLabelMenuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMenuItem5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMenuItem5MouseExited(evt);
            }
        });

        jLabelMenuItem6.setBackground(new java.awt.Color(255, 102, 102));
        jLabelMenuItem6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelMenuItem6.setForeground(new java.awt.Color(51, 51, 51));
        jLabelMenuItem6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/door_in.png"))); // NOI18N
        jLabelMenuItem6.setText("Encerrar");
        jLabelMenuItem6.setToolTipText("Encerrar Sessão");
        jLabelMenuItem6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        jLabelMenuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMenuItem6.setOpaque(true);
        jLabelMenuItem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuItem6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelUsuarioName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMenuItem5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMenuItem4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMenuItem3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMenuItem2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMenuItem1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelMenuItem6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUsuarioName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabelMenuItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMenuItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMenuItem3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMenuItem4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMenuItem5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jLabelMenuItem6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 530));

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, -4, 10, 530));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Disciplina: Métodologia de Linguagem de Programação Avançada - Prof: Thiago Medeiros - Projeto Final: CineList");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 496, 720, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuItem1MouseClicked
        CardLayout cl = (CardLayout) jPanelCardPai.getLayout();
        cl.show(jPanelCardPai, "cardDashboard");
    }//GEN-LAST:event_jLabelMenuItem1MouseClicked

    private void jLabelMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuItem2MouseClicked
        CardLayout cl = (CardLayout) jPanelCardPai.getLayout();
        cl.show(jPanelCardPai, "cardFilme");
    }//GEN-LAST:event_jLabelMenuItem2MouseClicked

    private void jLabelMenuItem1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuItem1MouseEntered
        onHover(jLabelMenuItem1);
    }//GEN-LAST:event_jLabelMenuItem1MouseEntered

    private void jLabelMenuItem1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuItem1MouseExited
        offHover(jLabelMenuItem1);
    }//GEN-LAST:event_jLabelMenuItem1MouseExited

    private void jLabelMenuItem2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuItem2MouseEntered
        onHover(jLabelMenuItem2);
    }//GEN-LAST:event_jLabelMenuItem2MouseEntered

    private void jLabelMenuItem2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuItem2MouseExited
        offHover(jLabelMenuItem2);
    }//GEN-LAST:event_jLabelMenuItem2MouseExited

    private void jLabelMenuItem3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuItem3MouseEntered
        onHover(jLabelMenuItem3);
    }//GEN-LAST:event_jLabelMenuItem3MouseEntered

    private void jLabelMenuItem3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuItem3MouseExited
        offHover(jLabelMenuItem3);
    }//GEN-LAST:event_jLabelMenuItem3MouseExited

    private void jLabelMenuItem4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuItem4MouseEntered
        onHover(jLabelMenuItem4);
    }//GEN-LAST:event_jLabelMenuItem4MouseEntered

    private void jLabelMenuItem4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuItem4MouseExited
        offHover(jLabelMenuItem4);
    }//GEN-LAST:event_jLabelMenuItem4MouseExited

    private void jLabelMenuItem5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuItem5MouseEntered
        onHover(jLabelMenuItem5);
    }//GEN-LAST:event_jLabelMenuItem5MouseEntered

    private void jLabelMenuItem5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuItem5MouseExited
        offHover(jLabelMenuItem5);
    }//GEN-LAST:event_jLabelMenuItem5MouseExited

    private void jLabelMenuItem6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuItem6MouseClicked
        URL url = this.getClass().getResource("warnning-icon.png");
        ImageIcon imgIcon = new ImageIcon(url);
        int opc = JOptionPane.showConfirmDialog(null, "<html>Tem <b>certeza</b>?</html>", "Encerrar Sessão", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, imgIcon);
        if (opc == 0) {
            JFrameLogin jfml = new JFrameLogin();
            jfml.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabelMenuItem6MouseClicked

    private void jLabelMenuItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuItem3MouseClicked
        CardLayout cl = (CardLayout) jPanelCardPai.getLayout();
        cl.show(jPanelCardPai, "cardDiretor");
    }//GEN-LAST:event_jLabelMenuItem3MouseClicked

    private void jLabelMenuItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuItem4MouseClicked
        CardLayout cl = (CardLayout) jPanelCardPai.getLayout();
        cl.show(jPanelCardPai, "cardGenero");
    }//GEN-LAST:event_jLabelMenuItem4MouseClicked

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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBoxDiretor1;
    private javax.swing.JCheckBox jCheckBoxDiretor2;
    private javax.swing.JCheckBox jCheckBoxGenero1;
    private javax.swing.JCheckBox jCheckBoxGenero2;
    private javax.swing.JCheckBox jCheckBoxPerfil;
    private javax.swing.JCheckBox jCheckBoxRevelarSenha;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAdministrador;
    private javax.swing.JLabel jLabelAlterarDiretor;
    private javax.swing.JLabel jLabelAlterarFilme;
    private javax.swing.JLabel jLabelAlterarGenero;
    private javax.swing.JLabel jLabelAlterarPerfil;
    private javax.swing.JLabel jLabelDetalhesFilme;
    private javax.swing.JLabel jLabelInserirDiretor;
    private javax.swing.JLabel jLabelInserirFilme;
    private javax.swing.JLabel jLabelInserirGenero;
    private javax.swing.JLabel jLabelMenuItem1;
    private javax.swing.JLabel jLabelMenuItem2;
    private javax.swing.JLabel jLabelMenuItem3;
    private javax.swing.JLabel jLabelMenuItem4;
    private javax.swing.JLabel jLabelMenuItem5;
    private javax.swing.JLabel jLabelMenuItem6;
    private javax.swing.JLabel jLabelRemoverDiretor;
    private javax.swing.JLabel jLabelRemoverFilme;
    private javax.swing.JLabel jLabelRemoverGenero;
    private javax.swing.JLabel jLabelRemoverGenero1;
    private javax.swing.JLabel jLabelResumo1;
    private javax.swing.JLabel jLabelResumo2;
    private javax.swing.JLabel jLabelResumo3;
    private javax.swing.JLabel jLabelResumoImagem1;
    private javax.swing.JLabel jLabelResumoImagem2;
    private javax.swing.JLabel jLabelResumoImagem3;
    private javax.swing.JLabel jLabelResumoImagem4;
    private javax.swing.JLabel jLabelResumoNome1;
    private javax.swing.JLabel jLabelResumoNome2;
    private javax.swing.JLabel jLabelResumoNome3;
    private javax.swing.JLabel jLabelResumoNome4;
    private javax.swing.JLabel jLabelUsuarioName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelCardPai;
    private javax.swing.JPanel jPanelDashboard;
    private javax.swing.JPanel jPanelDiretor;
    private javax.swing.JPanel jPanelFilme;
    private javax.swing.JPanel jPanelGenero;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelPerfil;
    private javax.swing.JPanel jPanelResumo1;
    private javax.swing.JPanel jPanelResumo2;
    private javax.swing.JPanel jPanelResumo3;
    private javax.swing.JPasswordField jPasswordFieldSenhaUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTableDiretores;
    private javax.swing.JTable jTableFilmes;
    private javax.swing.JTable jTableGeneros;
    private javax.swing.JTable jTableHistorico;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextFieldNomeUsuario;
    private javax.swing.JTextField jTextFieldTipoUsuario;
    private javax.swing.JTextField jTextFieldUsuarioUsuario;
    // End of variables declaration//GEN-END:variables

}
