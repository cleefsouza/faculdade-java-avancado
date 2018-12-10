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
public class JFrameInserirFilme extends javax.swing.JFrame {

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
     * Creates new form JFrameInserirFilme
     */
    public JFrameInserirFilme() {
        initComponents();
        setLocationRelativeTo(null);
    }

    final void buscarUsuario(String usu) {
        this.nomeUsuario = usu;

        //preenchendo combobox
        generod = new GeneroDAO();
        jComboBoxInserirGenero.removeAllItems();
        jComboBoxInserirGenero.addItem("Selecione um");
        for (Genero g : generod.listar()) {
            jComboBoxInserirGenero.addItem(g.getNome_ite());
        }

        diretord = new DiretorDAO();
        jComboBoxInserirDiretor.removeAllItems();
        jComboBoxInserirDiretor.addItem("Selecione um");
        for (Diretor d : diretord.listar()) {
            jComboBoxInserirDiretor.addItem(d.getNome_ite());
        }
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

        jPanelInserirFilme = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelInserirImagem = new javax.swing.JLabel();
        jTextFieldInserirNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxInserirGenero = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxInserirDiretor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaInserirCritica = new javax.swing.JTextArea();
        jLabelCancelarFilme = new javax.swing.JLabel();
        jLabelSalvarFilme = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldInserirNota = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaInserirSinopse = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Alterar Filme");
        setUndecorated(true);
        setResizable(false);

        jPanelInserirFilme.setBackground(new java.awt.Color(0, 204, 153));
        jPanelInserirFilme.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Filme:");

        jLabelInserirImagem.setFont(new java.awt.Font("Dialog", 1, 108)); // NOI18N
        jLabelInserirImagem.setForeground(new java.awt.Color(51, 51, 51));
        jLabelInserirImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInserirImagem.setText("X");
        jLabelInserirImagem.setToolTipText("Capa Promocional");
        jLabelInserirImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));

        jTextFieldInserirNome.setToolTipText("Digite o nome do filme");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Sinopse:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Gênero:");

        jComboBoxInserirGenero.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxInserirGenero.setToolTipText("Selecione um gênero");
        jComboBoxInserirGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Diretor:");

        jComboBoxInserirDiretor.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxInserirDiretor.setToolTipText("Selecione um diretor");
        jComboBoxInserirDiretor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Crítica:");

        jTextAreaInserirCritica.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaInserirCritica.setColumns(20);
        jTextAreaInserirCritica.setForeground(new java.awt.Color(51, 51, 51));
        jTextAreaInserirCritica.setLineWrap(true);
        jTextAreaInserirCritica.setRows(5);
        jTextAreaInserirCritica.setToolTipText("Digite sua crítica ao filme");
        jScrollPane2.setViewportView(jTextAreaInserirCritica);

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

        jLabelSalvarFilme.setBackground(new java.awt.Color(0, 204, 153));
        jLabelSalvarFilme.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelSalvarFilme.setForeground(new java.awt.Color(51, 51, 51));
        jLabelSalvarFilme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSalvarFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinelist/img/disk.png"))); // NOI18N
        jLabelSalvarFilme.setText("Salvar");
        jLabelSalvarFilme.setToolTipText("Salvar informações");
        jLabelSalvarFilme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelSalvarFilme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSalvarFilme.setOpaque(true);
        jLabelSalvarFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalvarFilmeMouseClicked(evt);
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

        jTextAreaInserirSinopse.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaInserirSinopse.setColumns(20);
        jTextAreaInserirSinopse.setForeground(new java.awt.Color(51, 51, 51));
        jTextAreaInserirSinopse.setLineWrap(true);
        jTextAreaInserirSinopse.setRows(5);
        jTextAreaInserirSinopse.setToolTipText("Digite a sinopse do filme");
        jScrollPane3.setViewportView(jTextAreaInserirSinopse);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelSalvarFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCancelarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxInserirDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldInserirNota)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldInserirNome, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxInserirGenero, 0, 270, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelInserirImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldInserirNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(jComboBoxInserirGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelInserirImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldInserirNota)
                    .addComponent(jComboBoxInserirDiretor, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelSalvarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCancelarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
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

    private void jLabelCancelarFilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelarFilmeMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelCancelarFilmeMouseClicked

    private void jLabelSalvarFilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalvarFilmeMouseClicked
        // converte nota em int
        int nota = Integer.parseInt(jTextFieldInserirNota.getText());

        if (jTextFieldInserirNome.getText().equals("") || jTextAreaInserirSinopse.getText().equals("")
                || jTextFieldInserirNota.getText().equals("") || jTextAreaInserirCritica.getText().equals("")
                || jComboBoxInserirGenero.getSelectedIndex() == 0 || jComboBoxInserirDiretor.getSelectedIndex() == 0) {
            URL url = this.getClass().getResource("error-icon.png");
            ImageIcon imgIcon = new ImageIcon(url);
            JOptionPane.showMessageDialog(null, "<html>Preencha os <b>campos corretamente</b>.</html>", "Error Message", JOptionPane.ERROR_MESSAGE, imgIcon);
        } else if (nota < 1 || nota > 5) {
            URL url = this.getClass().getResource("error-icon.png");
            ImageIcon imgIcon = new ImageIcon(url);
            JOptionPane.showMessageDialog(null, "<html>Digite uma <b>nota válida</b>.</html>", "Error Message", JOptionPane.ERROR_MESSAGE, imgIcon);
        } else {
            this.filmed = new FilmeDAO();
            this.genero = new GeneroDAO().buscar(jComboBoxInserirGenero.getSelectedIndex());
            this.diretor = new DiretorDAO().buscar(jComboBoxInserirDiretor.getSelectedIndex());
            this.filme = new Filme(jTextFieldInserirNome.getText(), jTextAreaInserirSinopse.getText(), genero, diretor, jTextAreaInserirCritica.getText(), nota);

            filmed.cadastrar(filme);

            URL url2 = this.getClass().getResource("information-icon.png");
            ImageIcon imgIcon2 = new ImageIcon(url2);
            JOptionPane.showMessageDialog(null, "<html>Filme <b>inserido</b> com <b>sucesso</b>.</html>", "Information Message", JOptionPane.INFORMATION_MESSAGE, imgIcon2);

            acaoHistorico("Inserção", filme.getNome_ite());

            this.dispose();
        }
    }//GEN-LAST:event_jLabelSalvarFilmeMouseClicked

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
            java.util.logging.Logger.getLogger(JFrameInserirFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameInserirFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameInserirFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameInserirFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameInserirFilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxInserirDiretor;
    private javax.swing.JComboBox<String> jComboBoxInserirGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCancelarFilme;
    private javax.swing.JLabel jLabelInserirImagem;
    private javax.swing.JLabel jLabelSalvarFilme;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelInserirFilme;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextAreaInserirCritica;
    private javax.swing.JTextArea jTextAreaInserirSinopse;
    private javax.swing.JTextField jTextFieldInserirNome;
    private javax.swing.JTextField jTextFieldInserirNota;
    // End of variables declaration//GEN-END:variables
}
