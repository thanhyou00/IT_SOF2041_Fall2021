package trucnvph17923;

import DAO.NhanVienDAO;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Entity.NhanVien;
import Utils.Auth;
import Utils.MsgBox;
import Utils.XImage;

/**
 *
 * @author Nguyen Truc
 */
public class LoginUI extends javax.swing.JFrame {

    private NhanVienDAO dao = new NhanVienDAO();
    static int count = 1;

    public LoginUI() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Change default icon 
//        ImageIcon icon = new ImageIcon("src\\Icons\\fpt.png");
//        this.setIconImage(icon.getImage());
        this.setIconImage(XImage.getAppIcon());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlogo = new javax.swing.JPanel();
        lbllogo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblshowpass = new javax.swing.JLabel();
        txtmanv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EduSys - Đăng nhập");
        setFocusCycleRoot(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlogo.setBackground(new java.awt.Color(0, 153, 153));
        pnlogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbllogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Secure_big.png"))); // NOI18N
        pnlogo.add(lbllogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 420));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        pnlogo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 260, 40));

        getContentPane().add(pnlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 420));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ĐĂNG NHẬP");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("TÊN ĐĂNG NHẬP");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblshowpass.setBackground(new java.awt.Color(255, 255, 255));
        lblshowpass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblshowpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/show.png"))); // NOI18N
        lblshowpass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblshowpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblshowpassMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(lblshowpass, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblshowpass))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 229, 60, -1));

        txtmanv.setText("NV001");
        jPanel2.add(txtmanv, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 320, 37));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("MẬT KHẨU");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        txtpass.setText("mk00001");
        txtpass.setEchoChar('\u2022');
        jPanel2.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 320, 37));

        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Key.png"))); // NOI18N
        btnlogin.setText("ĐĂNG NHẬP");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel2.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, 40));

        btnthoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Log out.png"))); // NOI18N
        btnthoat.setText("THOÁT");
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });
        jPanel2.add(btnthoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 333, 129, 40));

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setAlignmentX(0.0F);
        jPanel4.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 580, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 580, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
        ketThuc();
    }//GEN-LAST:event_btnthoatActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        dangNhap();
    }//GEN-LAST:event_btnloginActionPerformed

    private void lblshowpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblshowpassMouseClicked
        count++;
        if (count % 2 == 0) {
            txtpass.setEchoChar('\u0000');
           // lblshowpass.setIcon(new ImageIcon("src\\Icons\\hidden.png"));
        } else {
            txtpass.setEchoChar('\u2022');
            //lblshowpass.setIcon(new ImageIcon("src\\Icons\\show.png"));
        }
    }//GEN-LAST:event_lblshowpassMouseClicked

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
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnthoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lblshowpass;
    private javax.swing.JPanel pnlogo;
    private javax.swing.JTextField txtmanv;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables

    private void dangNhap() {
        String manv = txtmanv.getText();
        String matkhau = new String(txtpass.getPassword());
        NhanVien nv = dao.selectbyId(manv);
        if(manv.length()==0||matkhau.length()==0) {
            MsgBox.alert(this, "Không được để trống !");
            return;
        }
        else if (nv == null) {
            MsgBox.alert(this, "Sai tên đăng nhập !");
            return;
        } else if ((!matkhau.equals(nv.getMatkhau()))) {
            MsgBox.alert(this, "Sai mật khẩu !");
            return;
        } else {
            Auth.user = nv;
            new MainUI().setVisible(true);
            this.dispose();
        }
    }

    private void ketThuc() {
        if (MsgBox.confirm(this, "Bạn có chắc muốn thoát ?")) {
            System.exit(0);
        }
    }
}
