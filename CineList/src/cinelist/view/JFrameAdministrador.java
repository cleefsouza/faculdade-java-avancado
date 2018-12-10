package cinelist.view;

import cinelist.dao.AcaoDAO;
import cinelist.dao.HistoricoDAO;
import cinelist.dao.LoginDAO;
import cinelist.dao.TipoDAO;
import cinelist.dao.UsuarioDAO;
import cinelist.model.Acao;
import cinelist.model.Historico;
import cinelist.model.Login;
import cinelist.model.Tipo;
import cinelist.model.Usuario;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author cleefsouza
 */
public class JFrameAdministrador extends javax.swing.JFrame {

    Usuario usuario;
    UsuarioDAO usuariod;
    Login login;
    LoginDAO logind;
    Acao acao;
    AcaoDAO acaod;
    Historico historico;
    HistoricoDAO historicod;
    Tipo tipo;
    TipoDAO tipod;

    String nomeUsuario;
    int codUsuario;

    /**
     * Creates new form JFrameAdministrador
     */
    public JFrameAdministrador() {
        initComponents();
        setLocationRelativeTo(null);
    }

    final void buscarUsuario(int cod, String usu) {
        this.nomeUsuario = usu;
        this.codUsuario = cod;

        cancelarAcao();
        listarUsuarios();
        listarTipos();
    }

    final void acaoHistorico(String ac, String no) {
        // ação e historico
        this.acao = new Acao(ac, nomeUsuario);
        this.acaod = new AcaoDAO();
        acaod.cadastrar(acao);

        acao.setCod_aca(acaod.buscarUltimaAcao());
        this.historico = new Historico(no, acao);
        this.historicod = new HistoricoDAO();
        historicod.registrarAcao(historico);
    }

    final void cancelarAcao() {
        jTextFieldNomeUsuario.setText("");
        jTextFieldLoginUsuario.setText("");
        jPasswordFieldLoginSenha.setText("");

        listarUsuarios();
        listarTipos();
    }

    final void listarUsuarios() {
        //preenchendo combobox
        usuariod = new UsuarioDAO();
        jComboBoxNomeUsuario.removeAllItems();
        jComboBoxNomeUsuario.addItem("Selecione um");
        for (Usuario u : usuariod.listarNaoLogado(codUsuario)) {
            jComboBoxNomeUsuario.addItem(u.getCod_usu() + " - " + u.getNome_usu());
        }
    }

    final void listarTipos() {
        //preenchendo combobox
        tipod = new TipoDAO();
        jComboBoxTipoUsuario.removeAllItems();
        jComboBoxTipoUsuario.addItem("Selecione um");
        for (Tipo t : tipod.listar()) {
            jComboBoxTipoUsuario.addItem(t.getDescricao_tip());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelInserirFilme = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelCancelarUsuario = new javax.swing.JLabel();
        jLabelSalvarFilme = new javax.swing.JLabel();
        jTextFieldNomeUsuario = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextFieldLoginUsuario = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jPasswordFieldLoginSenha = new javax.swing.JPasswordField();
        jComboBoxTipoUsuario = new javax.swing.JComboBox<>();
        jLabelEncerrarAdministrador = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jComboBoxNomeUsuario = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jLabelRemoverUsuario = new javax.swing.JLabel();
        jLabelFotoUsuário = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Alterar Filme");
        setUndecorated(true);
        setResizable(false);

        jPanelInserirFilme.setBackground(new java.awt.Color(153, 0, 153));
        jPanelInserirFilme.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCancelarUsuario.setBackground(new java.awt.Color(255, 153, 0));
        jLabelCancelarUsuario.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelCancelarUsuario.setForeground(new java.awt.Color(51, 51, 51));
        jLabelCancelarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCancelarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/cross.png"))); // NOI18N
        jLabelCancelarUsuario.setText("Cancelar");
        jLabelCancelarUsuario.setToolTipText("Cancelar ação");
        jLabelCancelarUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelCancelarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCancelarUsuario.setOpaque(true);
        jLabelCancelarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCancelarUsuarioMouseClicked(evt);
            }
        });

        jLabelSalvarFilme.setBackground(new java.awt.Color(0, 204, 153));
        jLabelSalvarFilme.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelSalvarFilme.setForeground(new java.awt.Color(51, 51, 51));
        jLabelSalvarFilme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSalvarFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/disk.png"))); // NOI18N
        jLabelSalvarFilme.setText("Inserir");
        jLabelSalvarFilme.setToolTipText("Inserir novo usuário");
        jLabelSalvarFilme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelSalvarFilme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSalvarFilme.setOpaque(true);
        jLabelSalvarFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalvarFilmeMouseClicked(evt);
            }
        });

        jTextFieldNomeUsuario.setToolTipText("Digite o nome");

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/group.png"))); // NOI18N
        jLabel25.setText("Usuários Cadastrados");

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("Tipo:");

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("Usuário");

        jTextFieldLoginUsuario.setToolTipText("Digite um usuário para login");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("Senha:");

        jPasswordFieldLoginSenha.setToolTipText("Digite uma senha para login");

        jComboBoxTipoUsuario.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxTipoUsuario.setToolTipText("Selecione o tipo do usuário");
        jComboBoxTipoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelEncerrarAdministrador.setBackground(new java.awt.Color(204, 102, 255));
        jLabelEncerrarAdministrador.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelEncerrarAdministrador.setForeground(new java.awt.Color(51, 51, 51));
        jLabelEncerrarAdministrador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEncerrarAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/door_in.png"))); // NOI18N
        jLabelEncerrarAdministrador.setText("Encerrar");
        jLabelEncerrarAdministrador.setToolTipText("Encerrar painel administrador");
        jLabelEncerrarAdministrador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelEncerrarAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEncerrarAdministrador.setOpaque(true);
        jLabelEncerrarAdministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEncerrarAdministradorMouseClicked(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("Nome:");

        jComboBoxNomeUsuario.setToolTipText("Usuário cadastrado");
        jComboBoxNomeUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setText("Nome:");

        jLabelRemoverUsuario.setBackground(new java.awt.Color(255, 102, 102));
        jLabelRemoverUsuario.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelRemoverUsuario.setForeground(new java.awt.Color(51, 51, 51));
        jLabelRemoverUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRemoverUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/user_delete.png"))); // NOI18N
        jLabelRemoverUsuario.setText("Remover");
        jLabelRemoverUsuario.setToolTipText("Remover usuário");
        jLabelRemoverUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelRemoverUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRemoverUsuario.setOpaque(true);
        jLabelRemoverUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRemoverUsuarioMouseClicked(evt);
            }
        });

        jLabelFotoUsuário.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFotoUsuário.setFont(new java.awt.Font("Dialog", 0, 120)); // NOI18N
        jLabelFotoUsuário.setForeground(new java.awt.Color(51, 51, 51));
        jLabelFotoUsuário.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFotoUsuário.setText("X");
        jLabelFotoUsuário.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));
        jLabelFotoUsuário.setOpaque(true);

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 51));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Foto Usuário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldLoginUsuario)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNomeUsuario)
                            .addComponent(jPasswordFieldLoginSenha)
                            .addComponent(jComboBoxTipoUsuario, 0, 250, Short.MAX_VALUE)
                            .addComponent(jLabel25))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFotoUsuário, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBoxNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelRemoverUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelEncerrarAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelCancelarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelSalvarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRemoverUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelFotoUsuário, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)))
                .addGap(14, 14, 14)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldLoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCancelarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSalvarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEncerrarAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanelInserirFilmeLayout = new javax.swing.GroupLayout(jPanelInserirFilme);
        jPanelInserirFilme.setLayout(jPanelInserirFilmeLayout);
        jPanelInserirFilmeLayout.setHorizontalGroup(
            jPanelInserirFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInserirFilmeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelInserirFilmeLayout.setVerticalGroup(
            jPanelInserirFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInserirFilmeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInserirFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInserirFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCancelarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelarUsuarioMouseClicked
        cancelarAcao();
    }//GEN-LAST:event_jLabelCancelarUsuarioMouseClicked

    private void jLabelSalvarFilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalvarFilmeMouseClicked
        if (jTextFieldNomeUsuario.getText().equals("") || jTextFieldLoginUsuario.getText().equals("")
                || jPasswordFieldLoginSenha.getText().equals("") || jComboBoxTipoUsuario.getSelectedIndex() == 0) {
            URL url = this.getClass().getResource("error-icon.png");
            ImageIcon imgIcon = new ImageIcon(url);
            JOptionPane.showMessageDialog(null, "<html>Preencha os <b>campos corretamente</b>.</html>", "Error Message", JOptionPane.ERROR_MESSAGE, imgIcon);
        } else {
            this.login = new Login(jTextFieldLoginUsuario.getText(), jPasswordFieldLoginSenha.getText());
            this.logind = new LoginDAO();
            logind.cadastrar(login);
            acaoHistorico("Inserção", login.getUsuario_log());

            this.tipo = new TipoDAO().buscar(jComboBoxTipoUsuario.getSelectedIndex());
            this.login = logind.buscarPorUsuario(this.login.getUsuario_log());
            this.usuario = new Usuario(jTextFieldNomeUsuario.getText(), login, tipo);
            usuariod = new UsuarioDAO();
            usuariod.cadastrar(usuario);
            acaoHistorico("Inserção", usuario.getNome_usu());

            URL url2 = this.getClass().getResource("information-icon.png");
            ImageIcon imgIcon2 = new ImageIcon(url2);
            JOptionPane.showMessageDialog(null, "<html>Usuário <b>inserido</b> com <b>sucesso</b>.</html>", "Information Message", JOptionPane.INFORMATION_MESSAGE, imgIcon2);

            cancelarAcao();
        }
    }//GEN-LAST:event_jLabelSalvarFilmeMouseClicked

    private void jLabelEncerrarAdministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEncerrarAdministradorMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelEncerrarAdministradorMouseClicked

    private void jLabelRemoverUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRemoverUsuarioMouseClicked
        if (jComboBoxNomeUsuario.getSelectedIndex() == 0) {
            URL url = this.getClass().getResource("error-icon.png");
            ImageIcon imgIcon = new ImageIcon(url);
            JOptionPane.showMessageDialog(null, "<html>Selecione um <b>usuário</b>.</html>", "Error Message", JOptionPane.ERROR_MESSAGE, imgIcon);
        } else {
            URL url = this.getClass().getResource("warnning-icon.png");
            ImageIcon imgIcon = new ImageIcon(url);
            int opc = JOptionPane.showConfirmDialog(null, "<html>Tem <b>certeza</b> disso?</html>", "Warning Message", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, imgIcon);
            if (opc == 0) {
                this.usuariod = new UsuarioDAO();
                String usuarioSelecionado = jComboBoxNomeUsuario.getSelectedItem().toString();
                int codUsu = Integer.parseInt(usuarioSelecionado.substring(0, 1));
                usuariod.remover(codUsu);

                URL url2 = this.getClass().getResource("information-icon.png");
                ImageIcon imgIcon2 = new ImageIcon(url2);
                JOptionPane.showMessageDialog(null, "<html>Usuário <b>removido</b> com <b>sucesso</b>.</html>", "Information Message", JOptionPane.INFORMATION_MESSAGE, imgIcon2);

                acaoHistorico("Remoção", usuarioSelecionado.substring(4));
                listarUsuarios();
            }
        }
    }//GEN-LAST:event_jLabelRemoverUsuarioMouseClicked

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
            java.util.logging.Logger.getLogger(JFrameAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxNomeUsuario;
    private javax.swing.JComboBox<String> jComboBoxTipoUsuario;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabelCancelarUsuario;
    private javax.swing.JLabel jLabelEncerrarAdministrador;
    private javax.swing.JLabel jLabelFotoUsuário;
    private javax.swing.JLabel jLabelRemoverUsuario;
    private javax.swing.JLabel jLabelSalvarFilme;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelInserirFilme;
    private javax.swing.JPasswordField jPasswordFieldLoginSenha;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldLoginUsuario;
    private javax.swing.JTextField jTextFieldNomeUsuario;
    // End of variables declaration//GEN-END:variables
}
