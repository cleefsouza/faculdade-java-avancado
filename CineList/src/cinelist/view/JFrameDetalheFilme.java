package cinelist.view;

import cinelist.dao.AcaoDAO;
import cinelist.dao.DiretorDAO;
import cinelist.dao.FilmeDAO;
import cinelist.dao.GeneroDAO;
import cinelist.dao.HistoricoDAO;
import cinelist.model.Acao;
import cinelist.model.Diretor;
import cinelist.model.Filme;
import cinelist.model.Genero;
import cinelist.model.Historico;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author cleefsouza
 */
public class JFrameDetalheFilme extends javax.swing.JFrame {

    Filme filme;
    FilmeDAO filmed;
    Diretor diretor;
    DiretorDAO diretord;
    Genero genero;
    GeneroDAO generod;
    Acao acao;
    AcaoDAO acaod;
    Historico historico;
    HistoricoDAO historicod;

    String nomeUsuario;

    /**
     * Creates new form JFrameFilmeDetalhado
     */
    public JFrameDetalheFilme() {
        initComponents();
        setLocationRelativeTo(null);
    }

    final void buscarFilme(int cod, String usu) {
        this.filme = new Filme();
        this.filmed = new FilmeDAO();

        filme = filmed.buscar(cod);
        this.nomeUsuario = usu;

        // preenchendo campos de texto
        jLabelCodFilme.setText("N#: " + filme.getCod_ite());
        jTextFieldDetalheNome.setText(filme.getNome_ite());
        jTextAreaDetalheSinopse.setText(filme.getSinopse_fil());
        jTextAreaDetalheCritica.setText(filme.getCritica_fil());
        jTextFieldDetalheNota.setText("" + filme.getNota_fil());

        //preenchendo combobox
        generod = new GeneroDAO();
        jComboBoxDetalheGenero.removeAllItems();
        jComboBoxDetalheGenero.addItem("Selecione um");
        for (Genero g : generod.listar()) {
            jComboBoxDetalheGenero.addItem(g.getNome_ite());
        }
        jComboBoxDetalheGenero.setSelectedItem(filme.getGenero_fil().getNome_ite());

        diretord = new DiretorDAO();
        jComboBoxDetalheDiretor.removeAllItems();
        jComboBoxDetalheDiretor.addItem("Selecione um");
        for (Diretor d : diretord.listar()) {
            jComboBoxDetalheDiretor.addItem(d.getNome_ite());
        }
        jComboBoxDetalheDiretor.setSelectedItem(filme.getDiretor_fil().getNome_ite());
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDetalheFilme = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelCodFilme = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelAlterarImagem = new javax.swing.JLabel();
        jTextFieldDetalheNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDetalheSinopse = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxDetalheGenero = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxDetalheDiretor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDetalheCritica = new javax.swing.JTextArea();
        jLabelCancelarFilme = new javax.swing.JLabel();
        jLabelAlterarFilme = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDetalheNota = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Alterar Filme");
        setUndecorated(true);
        setResizable(false);

        jPanelDetalheFilme.setBackground(new java.awt.Color(102, 153, 255));
        jPanelDetalheFilme.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCodFilme.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelCodFilme.setForeground(new java.awt.Color(51, 51, 51));
        jLabelCodFilme.setText("N#: X");
        jLabelCodFilme.setToolTipText("Código do filme");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Filme:");

        jLabelAlterarImagem.setFont(new java.awt.Font("Dialog", 1, 108)); // NOI18N
        jLabelAlterarImagem.setForeground(new java.awt.Color(51, 51, 51));
        jLabelAlterarImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAlterarImagem.setText("X");
        jLabelAlterarImagem.setToolTipText("Capa Promocional");
        jLabelAlterarImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));

        jTextAreaDetalheSinopse.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaDetalheSinopse.setColumns(20);
        jTextAreaDetalheSinopse.setForeground(new java.awt.Color(51, 51, 51));
        jTextAreaDetalheSinopse.setLineWrap(true);
        jTextAreaDetalheSinopse.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDetalheSinopse);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Sinopse:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Gênero:");

        jComboBoxDetalheGenero.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxDetalheGenero.setToolTipText("Selecione um gênero");
        jComboBoxDetalheGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Diretor:");

        jComboBoxDetalheDiretor.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxDetalheDiretor.setToolTipText("Selecione um diretor");
        jComboBoxDetalheDiretor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Crítica:");

        jTextAreaDetalheCritica.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaDetalheCritica.setColumns(20);
        jTextAreaDetalheCritica.setForeground(new java.awt.Color(51, 51, 51));
        jTextAreaDetalheCritica.setLineWrap(true);
        jTextAreaDetalheCritica.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDetalheCritica);

        jLabelCancelarFilme.setBackground(new java.awt.Color(255, 102, 102));
        jLabelCancelarFilme.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelCancelarFilme.setForeground(new java.awt.Color(51, 51, 51));
        jLabelCancelarFilme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCancelarFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/cross.png"))); // NOI18N
        jLabelCancelarFilme.setText("Cancelar");
        jLabelCancelarFilme.setToolTipText("Cancelar ação");
        jLabelCancelarFilme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelCancelarFilme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCancelarFilme.setOpaque(true);
        jLabelCancelarFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCancelarFilmeMouseClicked(evt);
            }
        });

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
        jLabelAlterarFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAlterarFilmeMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nota: [1 - 5]");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Capa Promocional");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelAlterarFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCancelarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxDetalheDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldDetalheNota)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDetalheNome, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxDetalheGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelAlterarImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelCodFilme)
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldDetalheNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(jComboBoxDetalheGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelAlterarImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldDetalheNota)
                    .addComponent(jComboBoxDetalheDiretor, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelAlterarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCancelarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelDetalheFilmeLayout = new javax.swing.GroupLayout(jPanelDetalheFilme);
        jPanelDetalheFilme.setLayout(jPanelDetalheFilmeLayout);
        jPanelDetalheFilmeLayout.setHorizontalGroup(
            jPanelDetalheFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetalheFilmeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDetalheFilmeLayout.setVerticalGroup(
            jPanelDetalheFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetalheFilmeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDetalheFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDetalheFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCancelarFilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelarFilmeMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelCancelarFilmeMouseClicked

    private void jLabelAlterarFilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAlterarFilmeMouseClicked
        // converte nota em int
        int nota = Integer.parseInt(jTextFieldDetalheNota.getText());

        if (jTextFieldDetalheNome.getText().equals("") || jTextAreaDetalheSinopse.getText().equals("")
                || jTextFieldDetalheNota.getText().equals("") || jTextAreaDetalheCritica.getText().equals("")
                || jComboBoxDetalheGenero.getSelectedIndex() == 0 || jComboBoxDetalheDiretor.getSelectedIndex() == 0) {
            URL url = this.getClass().getResource("error-icon.png");
            ImageIcon imgIcon = new ImageIcon(url);
            JOptionPane.showMessageDialog(null, "<html>Preencha os <b>campos corretamente</b>.</html>", "Error Message", JOptionPane.ERROR_MESSAGE, imgIcon);
        } else if (nota < 1 || nota > 5) {
            URL url = this.getClass().getResource("error-icon.png");
            ImageIcon imgIcon = new ImageIcon(url);
            JOptionPane.showMessageDialog(null, "<html>Digite uma <b>nota válida</b>.</html>", "Error Message", JOptionPane.ERROR_MESSAGE, imgIcon);
        } else {
            URL url = this.getClass().getResource("warnning-icon.png");
            ImageIcon imgIcon = new ImageIcon(url);
            int opc = JOptionPane.showConfirmDialog(null, "<html>Tem <b>certeza</b> disso?</html>", "Warning Message", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, imgIcon);
            if (opc == 0) {
                this.filmed = new FilmeDAO();
                this.genero = new GeneroDAO().buscar(jComboBoxDetalheGenero.getSelectedIndex());
                this.diretor = new DiretorDAO().buscar(jComboBoxDetalheDiretor.getSelectedIndex());
                this.filme = new Filme(filme.getCod_ite(), jTextFieldDetalheNome.getText(), jTextAreaDetalheSinopse.getText(), genero, diretor, jTextAreaDetalheCritica.getText(), nota);

                filmed.alterar(filme);

                URL url2 = this.getClass().getResource("information-icon.png");
                ImageIcon imgIcon2 = new ImageIcon(url2);
                JOptionPane.showMessageDialog(null, "<html>Filme <b>atualizado</b> com <b>sucesso</b>.</html>", "Information Message", JOptionPane.INFORMATION_MESSAGE, imgIcon2);

                acaoHistorico("Atualização", filme.getNome_ite());

                this.dispose();
            }
        }
    }//GEN-LAST:event_jLabelAlterarFilmeMouseClicked

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
            java.util.logging.Logger.getLogger(JFrameDetalheFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameDetalheFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameDetalheFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameDetalheFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameDetalheFilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxDetalheDiretor;
    private javax.swing.JComboBox<String> jComboBoxDetalheGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelAlterarFilme;
    private javax.swing.JLabel jLabelAlterarImagem;
    private javax.swing.JLabel jLabelCancelarFilme;
    private javax.swing.JLabel jLabelCodFilme;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDetalheFilme;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaDetalheCritica;
    private javax.swing.JTextArea jTextAreaDetalheSinopse;
    private javax.swing.JTextField jTextFieldDetalheNome;
    private javax.swing.JTextField jTextFieldDetalheNota;
    // End of variables declaration//GEN-END:variables
}
