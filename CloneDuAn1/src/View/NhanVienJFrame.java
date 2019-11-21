
package View;

public class NhanVienJFrame extends javax.swing.JFrame {

    public NhanVienJFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtHoVaTen = new javax.swing.JPanel();
        lblManhanvien2 = new javax.swing.JLabel();
        txtManhanvien = new javax.swing.JTextField();
        lblMatkhau2 = new javax.swing.JLabel();
        lblHoten2 = new javax.swing.JLabel();
        txtHoten = new javax.swing.JTextField();
        lblVaitro2 = new javax.swing.JLabel();
        rdoQuanTri = new javax.swing.JRadioButton();
        rdoNhanVien = new javax.swing.JRadioButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        txtMatKhau = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGridView = new javax.swing.JTable();
        txtXacNhanMK = new javax.swing.JPasswordField();
        lblXacnhaMK = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ NHÂN VIÊN");
        setBackground(new java.awt.Color(204, 204, 255));

        txtHoVaTen.setBackground(new java.awt.Color(204, 204, 255));
        txtHoVaTen.setForeground(new java.awt.Color(255, 255, 153));

        lblManhanvien2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblManhanvien2.setText("Mã nhân viên");

        lblMatkhau2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMatkhau2.setText("Mật khẩu");

        lblHoten2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHoten2.setText("Họ và tên");

        lblVaitro2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVaitro2.setText("Vai trò");

        rdoQuanTri.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        rdoQuanTri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoQuanTri.setText("Quản trị");
        rdoQuanTri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoQuanTrirdoTruongphongActionPerformed(evt);
            }
        });

        rdoNhanVien.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        rdoNhanVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoNhanVien.setText("Nhân viên");

        btnInsert.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1/imgs/Add.png"))); // NOI18N
        btnInsert.setText("Thêm");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertbtnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1/imgs/Edit.png"))); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatebtnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1/imgs/Delete.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletebtnDeleteActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1/imgs/Text.png"))); // NOI18N
        btnClear.setText("Mới");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearbtnClearActionPerformed(evt);
            }
        });

        btnFirst.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnFirst.setForeground(new java.awt.Color(255, 0, 51));
        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstbtnFirstActionPerformed(evt);
            }
        });

        btnPrev.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPrev.setForeground(new java.awt.Color(255, 0, 51));
        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevbtnPrevActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 0, 51));
        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextbtnNextActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLast.setForeground(new java.awt.Color(255, 0, 51));
        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastbtnLastActionPerformed(evt);
            }
        });

        txtMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhauActionPerformed(evt);
            }
        });

        tblGridView.setBackground(new java.awt.Color(255, 255, 204));
        tblGridView.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblGridView.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblGridView.setForeground(new java.awt.Color(153, 51, 255));
        tblGridView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MÃ NV", "MẬT KHẨU", "HỌ VÀ TÊN", "VAI TRÒ"
            }
        ));
        tblGridView.setGridColor(new java.awt.Color(0, 51, 255));
        tblGridView.setSelectionBackground(new java.awt.Color(51, 51, 255));
        tblGridView.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblGridView.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblGridView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGridViewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGridView);

        lblXacnhaMK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblXacnhaMK.setText("Xác nhận mật khẩu");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1/imgs/Unknown person.png"))); // NOI18N
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        javax.swing.GroupLayout txtHoVaTenLayout = new javax.swing.GroupLayout(txtHoVaTen);
        txtHoVaTen.setLayout(txtHoVaTenLayout);
        txtHoVaTenLayout.setHorizontalGroup(
            txtHoVaTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtHoVaTenLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(txtHoVaTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtHoVaTenLayout.createSequentialGroup()
                        .addComponent(rdoQuanTri)
                        .addGap(18, 18, 18)
                        .addComponent(rdoNhanVien))
                    .addComponent(lblVaitro2)
                    .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHoten2)
                    .addComponent(txtXacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblXacnhaMK)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMatkhau2)
                    .addComponent(txtManhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblManhanvien2)
                    .addGroup(txtHoVaTenLayout.createSequentialGroup()
                        .addComponent(btnInsert)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(txtHoVaTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtHoVaTenLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(txtHoVaTenLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(txtHoVaTenLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnPrev)
                        .addGap(58, 58, 58)
                        .addComponent(btnNext)
                        .addGap(56, 56, 56)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(74, Short.MAX_VALUE))))
            .addGroup(txtHoVaTenLayout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        txtHoVaTenLayout.setVerticalGroup(
            txtHoVaTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtHoVaTenLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(txtHoVaTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtHoVaTenLayout.createSequentialGroup()
                        .addComponent(lblManhanvien2)
                        .addGap(18, 18, 18)
                        .addComponent(txtManhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMatkhau2)
                        .addGap(18, 18, 18)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblXacnhaMK)
                        .addGap(18, 18, 18)
                        .addComponent(txtXacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblHoten2)
                        .addGap(18, 18, 18)
                        .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtHoVaTenLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(txtHoVaTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrev)
                            .addComponent(btnFirst)
                            .addComponent(btnNext)
                            .addComponent(btnLast))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVaitro2)
                .addGap(18, 18, 18)
                .addGroup(txtHoVaTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoQuanTri)
                    .addComponent(rdoNhanVien))
                .addGap(18, 18, 18)
                .addGroup(txtHoVaTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear))
                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtHoVaTen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtHoVaTen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdoQuanTrirdoTruongphongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoQuanTrirdoTruongphongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoQuanTrirdoTruongphongActionPerformed

    private void btnInsertbtnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertbtnInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertbtnInsertActionPerformed

    private void btnUpdatebtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatebtnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdatebtnUpdateActionPerformed

    private void btnDeletebtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletebtnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletebtnDeleteActionPerformed

    private void btnClearbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearbtnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearbtnClearActionPerformed

    private void btnFirstbtnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstbtnFirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFirstbtnFirstActionPerformed

    private void btnPrevbtnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevbtnPrevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevbtnPrevActionPerformed

    private void btnNextbtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextbtnNextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextbtnNextActionPerformed

    private void btnLastbtnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastbtnLastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLastbtnLastActionPerformed

    private void tblGridViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGridViewMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tblGridViewMouseClicked

    private void txtMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauActionPerformed

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
            java.util.logging.Logger.getLogger(NhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVienJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHoten2;
    private javax.swing.JLabel lblManhanvien2;
    private javax.swing.JLabel lblMatkhau2;
    private javax.swing.JLabel lblVaitro2;
    private javax.swing.JLabel lblXacnhaMK;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoQuanTri;
    private javax.swing.JTable tblGridView;
    private javax.swing.JPanel txtHoVaTen;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtManhanvien;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtXacNhanMK;
    // End of variables declaration//GEN-END:variables
}
