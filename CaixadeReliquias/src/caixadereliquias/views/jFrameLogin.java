package caixadereliquias.views;

import caixadereliquias.dao.LoginDAO;
import caixadereliquias.model.Login;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author cleefsouza
 */
public class jFrameLogin extends javax.swing.JFrame {

    /**
     * Creates new form jFrameLogin
     */
    public jFrameLogin() {
        initComponents();
        personalizar();
        iconeBarra();
    }

    final void iconeBarra() {
        // coloca uma figura na barra de título da janela
        URL url = this.getClass().getResource("bau.png");
        Image icone = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(icone);
    }

    final void personalizar() {
        // janela inicia no centro
        this.setLocationRelativeTo(null);
    }

    final void framePrincipal(Login login) {
        jFramePrincipal jfmp = new jFramePrincipal();
        jfmp.buscarLogin(login);
        jfmp.setVisible(true);
        this.dispose();
    }

    Login login;
    LoginDAO logind;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caixa de Relíquias");
        setMinimumSize(new java.awt.Dimension(1106, 731));
        setPreferredSize(new java.awt.Dimension(1106, 731));
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(1106, 731));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuário");

        jTextField1.setBackground(new java.awt.Color(240, 240, 240));
        jTextField1.setToolTipText("Digite seu usuário");
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Senha:");

        jPasswordField1.setBackground(new java.awt.Color(240, 240, 240));
        jPasswordField1.setToolTipText("Digite sua senha");
        jPasswordField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("<html><u>Esqueceu a senha?</u></html>");
        jLabel4.setToolTipText("Recuperar Senha");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setBackground(new java.awt.Color(0, 204, 102));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Login");
        jLabel7.setToolTipText("Iniciar Sessão");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jPasswordField1))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(320, 280, 460, 260);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/0_logo.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(260, 140, 580, 140);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caixadereliquias/imgs/abstract.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1110, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        login = new Login(jTextField1.getText(), jPasswordField1.getText());
        logind = new LoginDAO();
        if (logind.autenticarLogin(login) == true) {
            URL url = this.getClass().getResource("information-icon.png");
            ImageIcon imgIcon = new ImageIcon(url);
            JOptionPane.showMessageDialog(null, "<html>Sessão iniciada com <b>sucesso</b>!</html>", "Information Message", JOptionPane.INFORMATION_MESSAGE, imgIcon);
            
            // buscando login no banco e enviando para proxima tela
            login = logind.buscarUsuario(login.getUser_log());
            framePrincipal(login);

        } else {
            URL url = this.getClass().getResource("error-icon.png");
            ImageIcon imgIcon = new ImageIcon(url);
            JOptionPane.showMessageDialog(null, "<html><b>Usuário</b> ou <b>senha</b> inválidos!</html>", "Error Message", JOptionPane.ERROR_MESSAGE, imgIcon);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(jFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
