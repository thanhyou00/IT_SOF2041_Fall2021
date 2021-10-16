package trucnvph17923;

import DAO.ChuyenDeDAO;
import DAO.HocVienDAO;
import DAO.KhoaHocDAO;
import DAO.NguoiHocDAO;
import Entity.KhoaHoc;
import Entity.NguoiHoc;
import Entity.ChuyenDe;
import Entity.HocVien;
import Utils.Auth;
import Utils.MsgBox;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nguyen Truc
 */
public class ManaStudents extends javax.swing.JFrame {

    /**
     * Done Testing
     */
    public ManaStudents() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Change default icon 
        ImageIcon icon = new ImageIcon("src\\Icons\\fpt.png");
        this.setIconImage(icon.getImage());
        init();
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
        pnchuyende = new javax.swing.JPanel();
        cbochuyende = new javax.swing.JComboBox<>();
        pnkhoahoc = new javax.swing.JPanel();
        cbokhoahoc = new javax.swing.JComboBox<>();
        tabs = new javax.swing.JTabbedPane();
        pnhocvien = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblhocvien = new javax.swing.JTable();
        btnxoa = new javax.swing.JButton();
        btncapnhat = new javax.swing.JButton();
        pnnguoihoc = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pntimkiem = new javax.swing.JPanel();
        txttimkiem = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblnguoihoc = new javax.swing.JTable();
        btnthem = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EDUSYS - QUẢN LÝ HỌC VIÊN");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("KHÓA HỌC");

        pnchuyende.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbochuyende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbochuyendeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnchuyendeLayout = new javax.swing.GroupLayout(pnchuyende);
        pnchuyende.setLayout(pnchuyendeLayout);
        pnchuyendeLayout.setHorizontalGroup(
            pnchuyendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnchuyendeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbochuyende, 0, 418, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnchuyendeLayout.setVerticalGroup(
            pnchuyendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnchuyendeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbochuyende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnkhoahoc.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnkhoahocLayout = new javax.swing.GroupLayout(pnkhoahoc);
        pnkhoahoc.setLayout(pnkhoahocLayout);
        pnkhoahocLayout.setHorizontalGroup(
            pnkhoahocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnkhoahocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbokhoahoc, 0, 418, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnkhoahocLayout.setVerticalGroup(
            pnkhoahocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnkhoahocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbokhoahoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblhocvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TT", "Mã HV", "Mã người học", "Họ tên", "Điểm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblhocvien);

        btnxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Task list.png"))); // NOI18N
        btnxoa.setText("Xóa khỏi khóa học");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btncapnhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Notes.png"))); // NOI18N
        btncapnhat.setText("Cập nhật điểm");
        btncapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncapnhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnhocvienLayout = new javax.swing.GroupLayout(pnhocvien);
        pnhocvien.setLayout(pnhocvienLayout);
        pnhocvienLayout.setHorizontalGroup(
            pnhocvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnhocvienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnhocvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnhocvienLayout.createSequentialGroup()
                        .addGap(0, 493, Short.MAX_VALUE)
                        .addComponent(btnxoa)
                        .addGap(153, 153, 153)
                        .addComponent(btncapnhat)))
                .addContainerGap())
        );
        pnhocvienLayout.setVerticalGroup(
            pnhocvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnhocvienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnhocvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnxoa)
                    .addComponent(btncapnhat))
                .addContainerGap())
        );

        tabs.addTab("HỌC VIÊN", pnhocvien);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("TÌM KIẾM");

        pntimkiem.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txttimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimkiemActionPerformed(evt);
            }
        });
        txttimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttimkiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pntimkiemLayout = new javax.swing.GroupLayout(pntimkiem);
        pntimkiem.setLayout(pntimkiemLayout);
        pntimkiemLayout.setHorizontalGroup(
            pntimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pntimkiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txttimkiem)
                .addContainerGap())
        );
        pntimkiemLayout.setVerticalGroup(
            pntimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pntimkiemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tblnguoihoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NH", "Họ tên", "Giới tính", "Ngày sinh", "Điện thoại", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblnguoihoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblnguoihocMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblnguoihoc);

        btnthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Add to basket.png"))); // NOI18N
        btnthem.setText("Thêm vào khóa học");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnnguoihocLayout = new javax.swing.GroupLayout(pnnguoihoc);
        pnnguoihoc.setLayout(pnnguoihocLayout);
        pnnguoihocLayout.setHorizontalGroup(
            pnnguoihocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnnguoihocLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnnguoihocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnnguoihocLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pntimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnnguoihocLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnthem)))
                .addContainerGap())
        );
        pnnguoihocLayout.setVerticalGroup(
            pnnguoihocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnnguoihocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pntimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnthem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("NGƯỜI HỌC", pnnguoihoc);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("CHUYÊN ĐỀ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tabs)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnchuyende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnkhoahoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(31, 31, 31))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pnchuyende, pnkhoahoc});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnchuyende, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnkhoahoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void tblnguoihocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblnguoihocMouseClicked

    }//GEN-LAST:event_tblnguoihocMouseClicked

    private void btncapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncapnhatActionPerformed
        if (check() == false) {
            this.fillTableHocvien();
            return;
        } else {
            updateDiem();
        }
    }//GEN-LAST:event_btncapnhatActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        deleteHocvien();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        addHocvien();
    }//GEN-LAST:event_btnthemActionPerformed

    private void cbochuyendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbochuyendeActionPerformed
        fillComboKhoahoc();
    }//GEN-LAST:event_cbochuyendeActionPerformed

    private void txttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimkiemActionPerformed

    }//GEN-LAST:event_txttimkiemActionPerformed

    private void txttimkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimkiemKeyReleased
        fillTableNguoihoc();
    }//GEN-LAST:event_txttimkiemKeyReleased

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
            java.util.logging.Logger.getLogger(ManaStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManaStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManaStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManaStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManaStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncapnhat;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<String> cbochuyende;
    private javax.swing.JComboBox<String> cbokhoahoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnchuyende;
    private javax.swing.JPanel pnhocvien;
    private javax.swing.JPanel pnkhoahoc;
    private javax.swing.JPanel pnnguoihoc;
    private javax.swing.JPanel pntimkiem;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblhocvien;
    private javax.swing.JTable tblnguoihoc;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables

    ChuyenDeDAO cddao = new ChuyenDeDAO();
    KhoaHocDAO khdao = new KhoaHocDAO();
    NguoiHocDAO nhdao = new NguoiHocDAO();
    HocVienDAO hvdao = new HocVienDAO();

    private void init() {
        this.fillComboChuyende();
    }

    private void fillComboChuyende() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbochuyende.getModel();
        model.removeAllElements();
        List<ChuyenDe> list = cddao.selectAll();
        for (ChuyenDe cd : list) {
            model.addElement(cd);
        }
        this.fillComboKhoahoc();
    }

    private void fillComboKhoahoc() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbokhoahoc.getModel();
        model.removeAllElements();
        ChuyenDe cd = (ChuyenDe) cbochuyende.getSelectedItem();
        if (cd != null) {
            List<KhoaHoc> list = khdao.selectbyChuyende(cd.getMacd());
            for (KhoaHoc kh : list) {
                model.addElement(kh);
            }
        }
        this.fillTableHocvien();
    }

    private void fillTableHocvien() {
        DefaultTableModel model = (DefaultTableModel) tblhocvien.getModel();
        model.setRowCount(0);
        KhoaHoc kh = (KhoaHoc) cbokhoahoc.getSelectedItem();
        if (kh != null) {
            List<HocVien> list = hvdao.selectByKhoahoc(kh.getMakh());
            for (int i = 0; i < list.size(); i++) {
                HocVien hv = list.get(i);
                String hoten = nhdao.selectbyId(hv.getManh()).getHoten();
                model.addRow(new Object[]{
                    i + 1, hv.getMahv(), hv.getManh(), hoten, hv.getDiem()
                });
            }
            this.fillTableNguoihoc();
        }
    }

    private void fillTableNguoihoc() {
        DefaultTableModel model = (DefaultTableModel) tblnguoihoc.getModel();
        model.setRowCount(0);
        KhoaHoc kh = (KhoaHoc) cbokhoahoc.getSelectedItem();
        String keyword = txttimkiem.getText();
        List<NguoiHoc> list = nhdao.selectNotinCourse(kh.getMakh(), keyword);
        for (NguoiHoc nh : list) {
            model.addRow(new Object[]{
                nh.getManh(), nh.getHoten(), nh.getGioitinh() ? "Nam" : "Nữ",
                nh.getNgaysinh(), nh.getDienthoai(), nh.getEmail()
            });
        }
    }

    private void addHocvien() {
        KhoaHoc kh = (KhoaHoc) cbokhoahoc.getSelectedItem();
        for (int row : tblnguoihoc.getSelectedRows()) {
            HocVien hv = new HocVien();
            hv.setMakh(kh.getMakh());
            hv.setDiem(0);
            hv.setManh(tblnguoihoc.getValueAt(row, 0).toString());
            hvdao.insert(hv);
        }
        this.fillTableHocvien();
        this.tabs.setSelectedIndex(0);
    }

    private void deleteHocvien() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa học viên !");
        } else {
            if (MsgBox.confirm(this, "Bạn muốn xóa các học viên được chọn ?")) {
                for (int row : tblhocvien.getSelectedRows()) {
                    int mahv = (int) tblhocvien.getValueAt(row, 1);
                    hvdao.delete(mahv + "");
                }
            }
            this.fillTableHocvien();
        }
    }

    private void updateDiem() {
        for (int i = 0; i < tblhocvien.getRowCount(); i++) {
            String mahv = tblhocvien.getValueAt(i, 1).toString();
            HocVien hv = hvdao.selectbyId(mahv);
            hv.setDiem(Float.valueOf(tblhocvien.getValueAt(i, 4).toString()));
            hvdao.update(hv);
        }
        MsgBox.alert(this, "Cập nhật điểm thành công !");
    }

    private boolean check() {
        try {
            for (int i = 0; i < tblhocvien.getRowCount(); i++) {
                float diem = Float.valueOf(tblhocvien.getValueAt(i, 4).toString());
                if (diem < 0 || diem > 10) {
                    MsgBox.alert(this, "Điểm phải là số từ 0 đến 10");
                    return false;
                }
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Điểm không được để trống !");
            return false;
        }
        return true;
    }
}
