package View;

import Model.DataModel.TAIKHOAN;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kiemtran
 */
public class RegisterDetailsForm extends javax.swing.JFrame {

    private static boolean isAdmin = true;
    public RegisterDetailsForm(boolean isadmin) {
        initComponents();
        isAdmin = isadmin;
        if (!isAdmin) {
            btnedit.setEnabled(false);
            btndel.setEnabled(false);
        }
        loadTableTaiKhoan();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtMatkhau = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        qtvrbtn = new javax.swing.JRadioButton();
        khrbtn = new javax.swing.JRadioButton();
        filllabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabletaikhoan = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnadd = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register Details");
        setLocation(new java.awt.Point(450, 150));

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setText("Tên");

        jLabel2.setText("Số điện thoại");

        jLabel3.setText("Username");

        jLabel4.setText("Mật khẩu");

        txtTen.setName("txtTen"); // NOI18N

        txtSdt.setName("txtSoDienThoai"); // NOI18N

        txtUsername.setName("txtUsername"); // NOI18N

        txtMatkhau.setName("txtMatKhau"); // NOI18N

        jLabel5.setText("Loại tài khoản");

        buttonGroup1.add(qtvrbtn);
        qtvrbtn.setText("Quản trị viên");

        buttonGroup1.add(khrbtn);
        khrbtn.setText("Khách hàng");

        filllabel.setForeground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTen)
                    .addComponent(txtSdt)
                    .addComponent(txtUsername)
                    .addComponent(txtMatkhau)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(qtvrbtn)
                        .addGap(44, 44, 44)
                        .addComponent(khrbtn)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(filllabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtvrbtn)
                    .addComponent(jLabel5)
                    .addComponent(khrbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(filllabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabletaikhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên", "Số điện thoại", "Username", "Loại tài khoản"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabletaikhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabletaikhoanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabletaikhoan);
        if (tabletaikhoan.getColumnModel().getColumnCount() > 0) {
            tabletaikhoan.getColumnModel().getColumn(0).setPreferredWidth(100);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnadd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(0, 204, 0));
        btnadd.setText("Add");
        btnadd.setName("btnAdd"); // NOI18N
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnedit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnedit.setForeground(new java.awt.Color(0, 0, 204));
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btndel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btndel.setForeground(new java.awt.Color(255, 0, 0));
        btndel.setText("Delete");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });

        btnclose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnclose.setForeground(new java.awt.Color(255, 0, 0));
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(btndel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btnedit)
                    .addComponent(btndel)
                    .addComponent(btnclose))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetField() {
        txtMatkhau.setText("");
        txtSdt.setText("");
        txtTen.setText("");
        txtUsername.setText("");
        txtUsername.enable(true);
    }
    private void loadTableTaiKhoan() {
        DefaultTableModel tableModel = (DefaultTableModel)tabletaikhoan.getModel();
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
        List<TAIKHOAN> tks = Controller.TAIKHOANService.getAllTaikhoans();
        for (TAIKHOAN taikhoan:tks) {
            Object o[] = {taikhoan.getTen(), taikhoan.getSoDienThoai(), taikhoan.getUsername(), taikhoan.getLoaiTaiKhoan()};
            tableModel.addRow(o);
        }
    }
    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        String usString = txtUsername.getText(),
                pwString = txtMatkhau.getText(),
                tenString = txtTen.getText(),
                sdtString = txtSdt.getText(),
                loaitk = "";
        if (khrbtn.isSelected()) 
            loaitk = "Khách Hàng";
        if (qtvrbtn.isSelected())
            loaitk = "Quản Trị";
        if (usString.equals("") || pwString.equals("") || tenString.equals("") || sdtString.equals("") || loaitk.equals("")) {
            filllabel.setText("Vui lòng điền đầy đủ thông tin.");
        } else {
            if (!Controller.TAIKHOANService.checkNewUser(usString, sdtString)) {
                TAIKHOAN account = new TAIKHOAN(usString, pwString, tenString, sdtString, loaitk);
                if (Controller.TAIKHOANService.insertTaiKhoan(account) == 0) {
                    JOptionPane.showMessageDialog(this, "Đăng kí thất bại.");
                }
                else {
                    filllabel.setText("");
                    JOptionPane.showMessageDialog(this, "Đăng kí thành công.");
                    resetField();
                }
            }
            else {
                filllabel.setText("Tên đăng nhập hoặc Số điện thoại đã tồn tại.");
            }
        }
        loadTableTaiKhoan();
    }//GEN-LAST:event_btnaddActionPerformed

    private void tabletaikhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabletaikhoanMouseClicked
        if (evt.getClickCount() == 2) {
            String username = String.valueOf(tabletaikhoan.getValueAt(tabletaikhoan.getSelectedRow(), 2));
            List<TAIKHOAN> tks = Controller.TAIKHOANService.getAllTaikhoans();
            for (TAIKHOAN taikhoan:tks) {
                if (taikhoan.getUsername().equals(username)) {
                    txtTen.setText(taikhoan.getTen());
                    txtSdt.setText(taikhoan.getSoDienThoai());
                    txtUsername.setText(String.valueOf(taikhoan.getUsername()));
                    txtMatkhau.setText("");
                    if(taikhoan.getLoaiTaiKhoan().equals("Quản Trị")) {
                        qtvrbtn.setSelected(true);
                    } else {
                        khrbtn.setSelected(true);
                    }
                    break;
                }
            }
            txtUsername.setEnabled(false);
        }
    }//GEN-LAST:event_tabletaikhoanMouseClicked

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        if (tabletaikhoan.getRowCount() != 0 && tabletaikhoan.getSelectedRow() != -1) {
            String usString = txtUsername.getText(),
                pwString = txtMatkhau.getText(),
                tenString = txtTen.getText(),
                sdtString = txtSdt.getText(),
                loaitk = "";
            if (khrbtn.isSelected()) 
                loaitk = "Khách Hàng";
            if (qtvrbtn.isSelected())
                loaitk = "Quản Trị";
            if (pwString.equals("") || tenString.equals("") || sdtString.equals("") || loaitk.equals("")) {
                filllabel.setText("Vui lòng điền đầy đủ thông tin.");
            } else {
                TAIKHOAN account = new TAIKHOAN(usString, pwString, tenString, sdtString, loaitk);
                if (Controller.TAIKHOANService.updateTaiKhoan(account) != 0) {
                    filllabel.setText("");
                    JOptionPane.showMessageDialog(this, "Sửa tài khoản thành công.");
                }
                else {
                    filllabel.setText("");
                    JOptionPane.showMessageDialog(this, "Sửa tài khoản thất bại.");
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Chọn tài khoản cần sửa.");
        }
        loadTableTaiKhoan();
        resetField();
    }//GEN-LAST:event_btneditActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        if (tabletaikhoan.getRowCount() != 0 && tabletaikhoan.getSelectedRow() != -1) {
            String username = String.valueOf(tabletaikhoan.getValueAt(tabletaikhoan.getSelectedRow(), 2));
            if (Controller.TAIKHOANService.deleteTaiKhoan(username) != 0) {
                DefaultTableModel tableModel = (DefaultTableModel)tabletaikhoan.getModel();
                tableModel.removeRow(tabletaikhoan.getSelectedRow());
                JOptionPane.showMessageDialog(this, "Xóa tài khoản thành công.");
            }
            else 
                JOptionPane.showMessageDialog(this, "Xóa tài khoản thất bại.");
        } 
        else {
            JOptionPane.showMessageDialog(this, "Chọn tài khoản trước khi xóa.");
        }
        loadTableTaiKhoan();
        resetField();
    }//GEN-LAST:event_btndelActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterDetailsForm(isAdmin).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnedit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel filllabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton khrbtn;
    private javax.swing.JRadioButton qtvrbtn;
    private javax.swing.JTable tabletaikhoan;
    private javax.swing.JTextField txtMatkhau;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
