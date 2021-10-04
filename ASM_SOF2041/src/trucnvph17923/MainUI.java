
package trucnvph17923;

import Utils.Auth;
import Utils.MsgBox;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author Nguyen Truc
 */
public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form MainUI
     */
    public MainUI() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Change default icon 
        ImageIcon icon = new ImageIcon("src\\Icons\\fpt.png");
        this.setIconImage(icon.getImage());
        // Setting clock
        new Thread() { //Start - Create a clock
            public void run() {
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa");
                while (true) {
                    Date d = new Date();
                    lblcock.setText(sdf.format(d));
                    try {
                        Thread.sleep(1000);
                    } catch (Exception ex) {
                        break;
                    }
                }
            }
        }.start();
        //End - Create a clock
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblcock = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuhethong = new javax.swing.JMenu();
        mnulogin = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnuketthuc = new javax.swing.JMenuItem();
        mnuquanly = new javax.swing.JMenu();
        mnuobjects = new javax.swing.JMenuItem();
        mnucourse = new javax.swing.JMenuItem();
        mnulearner = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        mnustaff = new javax.swing.JMenuItem();
        mnuthongke = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        mnutrogiup = new javax.swing.JMenu();
        mnuhd = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LẬP TRÌNH CITY EDUCATION");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Exit.png"))); // NOI18N
        jButton1.setText("Đăng xuất");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Stop.png"))); // NOI18N
        jButton2.setText("Kết thúc");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);
        jToolBar1.add(jSeparator2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Lists.png"))); // NOI18N
        jButton3.setText("Chuyên đề");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Conference.png"))); // NOI18N
        jButton4.setText("Người học");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Certificate.png"))); // NOI18N
        jButton5.setText("Khóa học");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User.png"))); // NOI18N
        jButton6.setText("Học viên");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton6);
        jToolBar1.add(jSeparator6);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Globe.png"))); // NOI18N
        jButton7.setText("Hướng dẫn");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton7);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1320, 50));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logofpoly.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1320, 590));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Alarm.png"))); // NOI18N
        lblcock.setText("05:06:08 PM");
        jPanel2.add(lblcock, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 120, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Info.png"))); // NOI18N
        jLabel2.setText("Hệ quản lý đào tạo");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1320, 50));

        mnuhethong.setText("Hệ thống");

        mnulogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mnulogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Key.png"))); // NOI18N
        mnulogin.setText("Đăng nhập");
        mnulogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuloginActionPerformed(evt);
            }
        });
        mnuhethong.add(mnulogin);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Exit.png"))); // NOI18N
        jMenuItem1.setText("Đăng xuất");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuhethong.add(jMenuItem1);
        mnuhethong.add(jSeparator3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Refresh.png"))); // NOI18N
        jMenuItem4.setText("Đổi mật khẩu");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mnuhethong.add(jMenuItem4);
        mnuhethong.add(jSeparator4);

        mnuketthuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mnuketthuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Stop.png"))); // NOI18N
        mnuketthuc.setText("Kết thúc");
        mnuketthuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuketthucActionPerformed(evt);
            }
        });
        mnuhethong.add(mnuketthuc);

        jMenuBar1.add(mnuhethong);

        mnuquanly.setText("Quản lý");

        mnuobjects.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_MASK));
        mnuobjects.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Lists.png"))); // NOI18N
        mnuobjects.setText("Chuyên đề");
        mnuobjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuobjectsActionPerformed(evt);
            }
        });
        mnuquanly.add(mnuobjects);

        mnucourse.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_MASK));
        mnucourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Certificate.png"))); // NOI18N
        mnucourse.setText("Khóa học");
        mnucourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnucourseActionPerformed(evt);
            }
        });
        mnuquanly.add(mnucourse);

        mnulearner.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_MASK));
        mnulearner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Conference.png"))); // NOI18N
        mnulearner.setText("Người học");
        mnulearner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnulearnerActionPerformed(evt);
            }
        });
        mnuquanly.add(mnulearner);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User.png"))); // NOI18N
        jMenuItem10.setText("Học viên");
        mnuquanly.add(jMenuItem10);
        mnuquanly.add(jSeparator7);

        mnustaff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_MASK));
        mnustaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User group.png"))); // NOI18N
        mnustaff.setText("Nhân viên");
        mnustaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnustaffActionPerformed(evt);
            }
        });
        mnuquanly.add(mnustaff);

        jMenuBar1.add(mnuquanly);

        mnuthongke.setText("Thống kê");

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Card file.png"))); // NOI18N
        jMenuItem12.setText("Bảng điểm");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        mnuthongke.add(jMenuItem12);
        mnuthongke.add(jSeparator8);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Clien list.png"))); // NOI18N
        jMenuItem14.setText("Lượng người học");
        mnuthongke.add(jMenuItem14);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Bar chart.png"))); // NOI18N
        jMenuItem13.setText("Điểm chuyên đề");
        mnuthongke.add(jMenuItem13);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Dollar.png"))); // NOI18N
        jMenuItem15.setText("Doanh thu");
        mnuthongke.add(jMenuItem15);

        jMenuBar1.add(mnuthongke);

        mnutrogiup.setText("Trợ giúp");

        mnuhd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mnuhd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Globe.png"))); // NOI18N
        mnuhd.setText("Hướng dẫn sử dụng");
        mnuhd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuhdActionPerformed(evt);
            }
        });
        mnutrogiup.add(mnuhd);
        mnutrogiup.add(jSeparator5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Brick house.png"))); // NOI18N
        jMenuItem6.setText("Giới thiệu sản phẩm");
        mnutrogiup.add(jMenuItem6);

        jMenuBar1.add(mnutrogiup);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void mnustaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnustaffActionPerformed
        openNhanvien();
    }//GEN-LAST:event_mnustaffActionPerformed

    private void mnulearnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnulearnerActionPerformed
        openNguoihoc();
    }//GEN-LAST:event_mnulearnerActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       if(Auth.isLogin()){
           new ChangePassUI().setVisible(true);
       } else {
           MsgBox.alert(this, "Vui lòng đăng nhập !");
           return;
       }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void mnuloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuloginActionPerformed
        new LoginUI().setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_mnuloginActionPerformed

    private void mnuhdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuhdActionPerformed
        openHuongdan();
    }//GEN-LAST:event_mnuhdActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        openDangxuat();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        openDangxuat();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        openHuongdan();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void mnuketthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuketthucActionPerformed
        openKetthuc();
    }//GEN-LAST:event_mnuketthucActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void mnuobjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuobjectsActionPerformed
        openChuyende();
    }//GEN-LAST:event_mnuobjectsActionPerformed

    private void mnucourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnucourseActionPerformed
        openKhoahoc();
    }//GEN-LAST:event_mnucourseActionPerformed

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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblcock;
    private javax.swing.JMenuItem mnucourse;
    private javax.swing.JMenuItem mnuhd;
    private javax.swing.JMenu mnuhethong;
    private javax.swing.JMenuItem mnuketthuc;
    private javax.swing.JMenuItem mnulearner;
    private javax.swing.JMenuItem mnulogin;
    private javax.swing.JMenuItem mnuobjects;
    private javax.swing.JMenu mnuquanly;
    private javax.swing.JMenuItem mnustaff;
    private javax.swing.JMenu mnuthongke;
    private javax.swing.JMenu mnutrogiup;
    // End of variables declaration//GEN-END:variables

    private void openHuongdan() {
        try {
            Desktop.getDesktop().browse(new File("").toURI());
        } catch (IOException e) {
            MsgBox.alert(this,"Không tìm thấy file hướng dẫn !");
            return;
       }
    }

    private void openDangxuat() {
        Auth.clear();
        new LoginUI().setVisible(true);
    }

    private void openKetthuc() {
        if(MsgBox.confirm(this, "Bạn có chắc muốn kết thúc ?")){
            System.exit(0);
        }
    }

    private void openNhanvien() {
        if(Auth.isLogin()) {
            new ManaStaff().setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập !");
        }
    }

    private void openNguoihoc() {
        if(Auth.isLogin()) {
            new ManaLearner().setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập !");
        }
    }
    
    private void openChuyende() {
        if(Auth.isLogin()) {
            new ManaObjects().setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập !");
        }
    }
    
    private void openKhoahoc() {
        if(Auth.isLogin()) {
            new ManaCourse().setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập !");
        }
    }
}
