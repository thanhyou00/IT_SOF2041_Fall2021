package trucnvph17923;

import DAO.ChuyenDeDAO;
import Entity.NguoiHoc;
import Entity.ChuyenDe;
import Utils.Auth;
import Utils.MsgBox;
import Utils.XImage;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nguyen Truc
 */
public class ManaObjects extends javax.swing.JFrame {

    private ChuyenDeDAO dao = new ChuyenDeDAO();
    int row = 0;

    public ManaObjects() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Change default icon 
        ImageIcon icon = new ImageIcon("src\\Icons\\fpt.png");
        this.setIconImage(icon.getImage());
        this.fillTable();
        row = 0;
        this.updateStatus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pncapnhat = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblhinh = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txttencd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtmacd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txthocphi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtthoiluong = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtmota = new javax.swing.JTextArea();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnmoi = new javax.swing.JButton();
        btnfirst = new javax.swing.JButton();
        btnpre = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        pndanhsach = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblchuyende = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EDUSYS - QUẢN LÝ CHUYÊN ĐỀ");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ CHUYÊN ĐỀ");

        jLabel2.setText("Hình Logo");

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblhinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblhinhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblhinh, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblhinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );

        jLabel4.setText("Mã chuyên đề");

        jLabel5.setText("Tên chuyên đề");

        jLabel6.setText("Thời lượng (giờ)");

        jLabel7.setText("Học phí");

        jLabel8.setText("Mô tả chuyên đề");

        txtmota.setColumns(20);
        txtmota.setRows(5);
        jScrollPane2.setViewportView(txtmota);

        btnthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Add to basket.png"))); // NOI18N
        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Notes.png"))); // NOI18N
        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Task list.png"))); // NOI18N
        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnmoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Lists.png"))); // NOI18N
        btnmoi.setText("Mới");
        btnmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoiActionPerformed(evt);
            }
        });

        btnfirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/start.png"))); // NOI18N
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        btnpre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/left.png"))); // NOI18N
        btnpre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreActionPerformed(evt);
            }
        });

        btnnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/right.png"))); // NOI18N
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnlast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/end.png"))); // NOI18N
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pncapnhatLayout = new javax.swing.GroupLayout(pncapnhat);
        pncapnhat.setLayout(pncapnhatLayout);
        pncapnhatLayout.setHorizontalGroup(
            pncapnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pncapnhatLayout.createSequentialGroup()
                .addGroup(pncapnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pncapnhatLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnthem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnxoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnmoi)
                        .addGap(30, 30, 30)
                        .addComponent(btnfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnnext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlast))
                    .addGroup(pncapnhatLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(pncapnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(pncapnhatLayout.createSequentialGroup()
                                .addGroup(pncapnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2))
                                .addGap(79, 79, 79)
                                .addGroup(pncapnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtmacd, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(txttencd, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtthoiluong, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(txthocphi, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pncapnhatLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnfirst, btnlast, btnnext, btnpre});

        pncapnhatLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnmoi, btnsua, btnthem, btnxoa});

        pncapnhatLayout.setVerticalGroup(
            pncapnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pncapnhatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pncapnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pncapnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pncapnhatLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8))
                    .addGroup(pncapnhatLayout.createSequentialGroup()
                        .addComponent(txtmacd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txttencd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtthoiluong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txthocphi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(pncapnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnfirst, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnpre)
                    .addComponent(btnnext)
                    .addComponent(btnlast)
                    .addGroup(pncapnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnthem)
                        .addComponent(btnsua)
                        .addComponent(btnxoa)
                        .addComponent(btnmoi)))
                .addContainerGap())
        );

        pncapnhatLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnfirst, btnlast, btnnext, btnpre});

        pncapnhatLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txthocphi, txtmacd, txttencd, txtthoiluong});

        tabs.addTab("CẬP NHẬT", pncapnhat);

        tblchuyende.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã CĐ", "Tên chuyên đề", "Học phí", "Thời lượng", "Hình"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblchuyende.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblchuyendeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblchuyende);

        javax.swing.GroupLayout pndanhsachLayout = new javax.swing.GroupLayout(pndanhsach);
        pndanhsach.setLayout(pndanhsachLayout);
        pndanhsachLayout.setHorizontalGroup(
            pndanhsachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pndanhsachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                .addContainerGap())
        );
        pndanhsachLayout.setVerticalGroup(
            pndanhsachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pndanhsachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tabs.addTab("DANH SÁCH", pndanhsach);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        first();
    }//GEN-LAST:event_btnfirstActionPerformed

    private void lblhinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhinhMouseClicked
        chonAnh();
    }//GEN-LAST:event_lblhinhMouseClicked

    private void tblchuyendeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblchuyendeMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblchuyende.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblchuyendeMouseClicked

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
       if(checkAll()==false){
           return;
       } else {
            insert();
       }
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
       if(checkAll()==false){
           return;
       } else {
            update();
       }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        delete();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoiActionPerformed
        clear();
    }//GEN-LAST:event_btnmoiActionPerformed

    private void btnpreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreActionPerformed
        prev();
    }//GEN-LAST:event_btnpreActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        next();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        last();
    }//GEN-LAST:event_btnlastActionPerformed

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
            java.util.logging.Logger.getLogger(ManaObjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManaObjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManaObjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManaObjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManaObjects().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnmoi;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnpre;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblhinh;
    private javax.swing.JPanel pncapnhat;
    private javax.swing.JPanel pndanhsach;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblchuyende;
    private javax.swing.JTextField txthocphi;
    private javax.swing.JTextField txtmacd;
    private javax.swing.JTextArea txtmota;
    private javax.swing.JTextField txttencd;
    private javax.swing.JTextField txtthoiluong;
    // End of variables declaration//GEN-END:variables

    private void insert() {
        ChuyenDe cd = getForm();
        String macd = txtmacd.getText();
        if (macd.equals(cd.getMacd())) {
            MsgBox.alert(this, "Mã chuyên đề đã tồn tại !");
            return;
        } else {
            try {
                dao.insert(cd);
                this.fillTable();
                this.clear();
                MsgBox.alert(this, "Thêm mới thành công !");
                return;
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm mới thất bại !");
                return;
            }
        }
    }

    private void update() {
        ChuyenDe cd = getForm();
            try {
                dao.update(cd);
                this.fillTable();
                MsgBox.alert(this, "Cập nhật thành công !");
                return;
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhật thất bại !");
            }
    }

    private void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa chuyên đề !");
        } else {
            String manv = txtmacd.getText();
            if (MsgBox.confirm(this, "Bạn thực sự muốn xóa chuyên đề này ?")) {
                try {
                    dao.delete(manv);
                    this.fillTable();
                    this.clear();
                    MsgBox.alert(this, "Xóa thành công !");
                    return;
                } catch (Exception e) {
                    MsgBox.alert(this, "Xóa thất bại !");
                }
            }
        }
    }

    private void edit() {
        String macd = (String) tblchuyende.getValueAt(row, 0);
        ChuyenDe cd = dao.selectbyId(macd);
        this.setForm(cd);
        tabs.setSelectedIndex(0);
        this.updateStatus();
    }

    private void first() {
        this.row = 0;
        this.edit();
    }

    private void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    private void next() {
        if (this.row < tblchuyende.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    private void last() {
        this.row = tblchuyende.getRowCount() - 1;
        this.edit();
    }

    private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblchuyende.getModel();
        model.setRowCount(0);
        try {
            List<ChuyenDe> list = dao.selectAll();
            for (ChuyenDe cd : list) {
                Object[] rows = {
                    cd.getMacd(), cd.getTencd(), cd.getHocphi(), cd.getThoiluong(), cd.getHinh()
                };
                model.addRow(rows);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    private void setForm(ChuyenDe cd) {
        txtmacd.setText(cd.getMacd());
        txttencd.setText(cd.getTencd());
        txthocphi.setText(cd.getHocphi() + "");
        txtthoiluong.setText(cd.getThoiluong() + "");
        txtmota.setText(cd.getMota());
        if (cd.getHinh() != null) {
            lblhinh.setToolTipText(cd.getHinh());
            lblhinh.setIcon(XImage.read(cd.getHinh()));
        }
    }

    private ChuyenDe getForm() {
        ChuyenDe cd = new ChuyenDe();
        cd.setMacd(txtmacd.getText());
        cd.setTencd(txttencd.getText());
        cd.setHocphi(Float.parseFloat(txthocphi.getText()));
        cd.setThoiluong(Integer.parseInt(txtthoiluong.getText()));
        cd.setMota(txtmota.getText());
        cd.setHinh(lblhinh.getToolTipText());
        return cd;
    }

    private void updateStatus() {
        boolean edit = this.row >= 0;
        boolean first = this.row == 0;
        boolean last = this.row == tblchuyende.getRowCount() - 1;
        // Trạng thái form
        txtmacd.setEditable(!edit);
        btnthem.setEnabled(!edit);
        btnsua.setEnabled(edit);
        btnxoa.setEnabled(edit);
        // Trạng thái điều hướng
        btnfirst.setEnabled(edit && !first);
        btnpre.setEnabled(edit && !first);
        btnnext.setEnabled(edit && !last);
        btnlast.setEnabled(edit && !last);
    }

    private void clear() {
        ChuyenDe cd = new ChuyenDe();
        this.setForm(cd);
        this.row = -1;
        this.updateStatus();
    }

    private void chonAnh() {
        JFileChooser fchooser = new JFileChooser();
        if (fchooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fchooser.getSelectedFile();
            XImage.save(file);
            ImageIcon icon = XImage.read(file.getName());
            lblhinh.setIcon(icon);
            lblhinh.setToolTipText(file.getName());
        }
    }

    private boolean checkAll() {
        String macd = txtmacd.getText();
        String tencd = txttencd.getText();
        int thoiluong;
        float hocphi;
        String mota = txtmota.getText();
        try {
            thoiluong = Integer.parseInt(txtthoiluong.getText());
        } catch (Exception e) {
            MsgBox.alert(this, "Thời lượng phải là số và lớn hơn 0 !");
            return false;
        }
        try {
            hocphi = Float.parseFloat(txthocphi.getText());
        } catch (Exception e) {
            MsgBox.alert(this, "Học phí phải là số và lớn hơn 0 !");
            return false;
        }
        if (macd.length() == 0 || tencd.length() == 0 || (thoiluong+"").length() == 0 || (hocphi + "").length() == 0 || mota.length() == 0) {
            MsgBox.alert(this, "Không được để trống dữ liệu !");
            return false;
        }
        else if(thoiluong<=0) {
            MsgBox.alert(this, "Thời lượng phải lớn hơn 0 ");
            return false;
        }
        else if(hocphi<=0) {
            MsgBox.alert(this, "Học phí phải lớn hơn 0 ");
            return false;
        }        
        else {
            return true;
        }
    }

}
