/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.sql.*;
import DataBase.DBConnection;
import Process.ChucNang;
import Process.DataBaseManger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hieu Bom IT
 */
public class TTLopHoc extends javax.swing.JFrame {

    DefaultTable defaultTable;
    int chucNangChon = ChucNang.NONE;

    /**
     * Creates new form TTLopHoc
     */
    public TTLopHoc() {
        initComponents();
    }

    void reloadTableLopHoc() {
        if (DataBaseManger.LopHocToTable(tb_bang) == false) {
            JOptionPane.showMessageDialog(this, "Lấy dữ liệu lớp học có lỗi", "Có lỗi xảy ", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                DBConnection kn = null;
                kn = new DBConnection();
                ResultSet rs = null;
                rs = kn.getData("select * from sinhvien");
                DefaultTableModel m1 = (DefaultTableModel) tb_bang.getModel();
                m1.setRowCount(20);
                int i = 0;
                while (rs.next()) {
                    if (rs.getString(1) != null) {
                        tb_bang.setValueAt(rs.getString(1), i, 0);
                        tb_bang.setValueAt(rs.getString(2), i, 1);
                        tb_bang.setValueAt(rs.getString(3), i, 2);
                        tb_bang.setValueAt(200, i, 3);
                    }
                    i++;

                }
            } catch (SQLException ex) {
                System.out.println("Lỗi lấy bảng dữ liệu!");
                JOptionPane.showMessageDialog(null, "Lỗi lấy bảng dữ liệu", "Lỗi", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTenLop = new javax.swing.JTextField();
        txtGiaoVienCN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_Xoa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_Them = new javax.swing.JButton();
        btn_Thoat = new javax.swing.JButton();
        btn_LayDuLieu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_bang = new javax.swing.JTable();
        txtMaLop = new javax.swing.JTextField();
        btn_Sua = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTenLop.setName("txtTenLop"); // NOI18N

        txtGiaoVienCN.setName("txtGiaoVienCN"); // NOI18N

        jLabel1.setBackground(new java.awt.Color(102, 255, 102));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Thông tin lớp học");

        btn_Xoa.setBackground(new java.awt.Color(51, 153, 0));
        btn_Xoa.setForeground(new java.awt.Color(0, 102, 0));
        btn_Xoa.setText("Xóa");
        btn_Xoa.setName("btn_Xoa"); // NOI18N
        btn_Xoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_XoaMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 153, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã Lớp");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tên Lớp");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Giáo Viên CN");

        btn_Them.setBackground(new java.awt.Color(255, 0, 51));
        btn_Them.setForeground(new java.awt.Color(204, 0, 0));
        btn_Them.setText("Thêm");
        btn_Them.setName("btn_Them"); // NOI18N
        btn_Them.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ThemMouseClicked(evt);
            }
        });
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_Thoat.setBackground(new java.awt.Color(153, 0, 153));
        btn_Thoat.setText("Thoát");
        btn_Thoat.setName("btn_Thoat"); // NOI18N
        btn_Thoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ThoatMouseClicked(evt);
            }
        });

        btn_LayDuLieu.setBackground(new java.awt.Color(204, 255, 204));
        btn_LayDuLieu.setForeground(new java.awt.Color(0, 51, 255));
        btn_LayDuLieu.setText("Lấy Dữ Liệu");
        btn_LayDuLieu.setName("btn_LayDuLieu"); // NOI18N
        btn_LayDuLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LayDuLieuActionPerformed(evt);
            }
        });

        tb_bang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Số Lớp", "Tên Lớp", "Giáo Viên CN", "Tiền"
            }
        ));
        tb_bang.setName("tb_Bang"); // NOI18N
        jScrollPane1.setViewportView(tb_bang);

        txtMaLop.setName("txtMaLop"); // NOI18N

        btn_Sua.setText("Sửa");
        btn_Sua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SuaMouseClicked(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(71, 71, 71)
                                            .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(65, 65, 65)
                                        .addComponent(txtGiaoVienCN, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(136, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_LayDuLieu)
                                .addGap(72, 72, 72))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btn_Sua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn_Them, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_Xoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_Thoat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(jButton1)
                                        .addGap(29, 29, 29)
                                        .addComponent(jButton2)))
                                .addGap(14, 14, 14)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtGiaoVienCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_LayDuLieu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Them)
                            .addComponent(btn_Xoa))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Thoat)
                            .addComponent(btn_Sua))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThemMouseClicked

        String msLop = txtMaLop.getText();
        String tenLop = txtTenLop.getText();
        String giaovienCN = txtGiaoVienCN.getText();
        DataBaseManger.themLopHoc(msLop, tenLop, giaovienCN);

        reloadTableLopHoc();
    }//GEN-LAST:event_btn_ThemMouseClicked

    private void btn_ThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThoatMouseClicked

        this.dispose();
    }//GEN-LAST:event_btn_ThoatMouseClicked

    private void btn_LayDuLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LayDuLieuActionPerformed

        try {
            
            DBConnection kn = null;
            kn = new DBConnection();
            ResultSet rs = null;
            rs = kn.getData("select * from sinhvien");
            DefaultTableModel m1 = (DefaultTableModel) tb_bang.getModel();
            m1.setRowCount(20);
            int i = 0;
            while (rs.next()) {
                if (rs.getString(1) != null) {
                    tb_bang.setValueAt(rs.getString(1), i, 0);
                    tb_bang.setValueAt(rs.getString(2), i, 1);
                    tb_bang.setValueAt(rs.getString(3), i, 2);
                    tb_bang.setValueAt(200, i, 3);

                }
                i++;

            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy bảng dữ liệu!");
            JOptionPane.showMessageDialog(null, "Lỗi lấy bảng dữ liệu", "Lỗi", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_LayDuLieuActionPerformed

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_SuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SuaMouseClicked
        // TODO add your handling code here:
        String msLop = txtMaLop.getText();
        String tenLop = txtTenLop.getText();
        String giaovienCN = txtGiaoVienCN.getText();
        DataBaseManger.suaLopHoc(msLop, tenLop, giaovienCN);
        reloadTableLopHoc();
    }//GEN-LAST:event_btn_SuaMouseClicked

    private void btn_XoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_XoaMouseClicked
        // TODO add your handling code here:
        String msLop = txtMaLop.getText();
        DataBaseManger.xoaLopHoc(msLop);
        reloadTableLopHoc();
    }//GEN-LAST:event_btn_XoaMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
//        String msLop = txtTenLop.getText();
//        DataBaseManger.ABC();
        try {
            DBConnection kn = null;
            kn = new DBConnection();
            ResultSet rs = null;
            String ma = txtMaLop.getText();
//            rs = kn.getData("Select * From sinhvien"+" order by maLop DESC");
            rs = kn.getData("Select * From sinhvien where maLop='" + ma + "' ");
            DefaultTableModel m1 = (DefaultTableModel) tb_bang.getModel();
            m1.setRowCount(20);
            int i = 0;
            while (rs.next()) {
                if (rs.getString(1) != null) {
                    tb_bang.setValueAt(rs.getString(1), i, 0);
                    tb_bang.setValueAt(rs.getString(2), i, 1);
                    tb_bang.setValueAt(rs.getString(3), i, 2);

                }
                i++;

            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy bảng dữ liệu!");
            JOptionPane.showMessageDialog(null, "Lỗi lấy bảng dữ liệu", "Lỗi", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        int ma = Integer.parseInt(txtMaLop.getText());
         try {
            
            DBConnection kn = null;
            kn = new DBConnection();
            ResultSet rs = null;
            rs = kn.getData("select * from sinhvien");
            DefaultTableModel m1 = (DefaultTableModel) tb_bang.getModel();
            m1.setRowCount(20);
            int i = 0;
            while (rs.next()) {
                if (rs.getString(1) != null) {
                    tb_bang.setValueAt(rs.getString(1), i, 0);
                    tb_bang.setValueAt(rs.getString(2), i, 1);
                    tb_bang.setValueAt(rs.getString(3), i, 2);
                    

                }
                i++;
              
                
                tb_bang.setValueAt(200*ma, ma, 3);
                

            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy bảng dữ liệu!");
            JOptionPane.showMessageDialog(null, "Lỗi lấy bảng dữ liệu", "Lỗi", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TTLopHoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_LayDuLieu;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_bang;
    private javax.swing.JTextField txtGiaoVienCN;
    private javax.swing.JTextField txtMaLop;
    private javax.swing.JTextField txtTenLop;
    // End of variables declaration//GEN-END:variables
}
