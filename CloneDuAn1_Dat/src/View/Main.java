
package View;

import Helper.DialogHelper;
import Helper.ShareHelper;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;


public class Main extends javax.swing.JFrame {

    int timerun = 0;
    
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        init();
    }
    
    void init() {
        setIconImage(ShareHelper.APP_ICON);
        setLocationRelativeTo(null);
        new Timer(1000, new ActionListener() {
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");       
            public void actionPerformed(ActionEvent e) {              
            }
        }).start();
        this.openWelcome();
        this.openLogin();
    }

    void openLogin() {
        new DangNhapJDialog(this, true).setVisible(true);
    }

    void openChangePass() {
        new DoiMatKhauJDialog(this, true).setVisible(true);
    }
        
    void openWelcome() {
        new ChaoJDialog(this, true).setVisible(true);
    }

    void logoff() {
        ShareHelper.logoff();
        this.openLogin();
    }
    
    void exit() {
        if (DialogHelper.confirm(this, "Bạn thực sự muốn kết thúc?")) {
            System.exit(0);
        }
    }
    
    void openAbout() {
        new GioiThieuJDialog(this, true).setVisible(true);
    }
        
    void openNhanVien() {
        if (ShareHelper.authenticated()) {
            new NhanVienJFrame().setVisible(true);
        } else {
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }
   
        void openSanPham() {
        if (ShareHelper.authenticated()) {
            new SanPhamJFrame().setVisible(true);
        } else {
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }
   
        void openHoaDon() {
        if (ShareHelper.authenticated()) {
            new HoaDonJFrame().setVisible(true);
        } else {
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }
    
        void openThongKe(int index){
        if (ShareHelper.authenticated()) {
            ThongKeJFrame tk = new ThongKeJFrame(index);
            tk.setVisible(true);
            tk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }else{
            DialogHelper.alert(this, "Vui lòng đăng nhập");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        QLSanPham = new javax.swing.JButton();
        QLNhanVien = new javax.swing.JButton();
        HoaDon = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        GioiThieu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mniDangNhap = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        DoiMatKhau = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniKetThuc = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mniThongKeTheoNgay = new javax.swing.JMenuItem();
        mniThongKeTheoThang = new javax.swing.JMenuItem();
        mniThongKeTheoNam = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar1.setRollover(true);

        btnDangXuat.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exit.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setMargin(new java.awt.Insets(5, 18, 5, 18));
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangXuat);

        btnKetThuc.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete.png"))); // NOI18N
        btnKetThuc.setText("Kết thúc");
        btnKetThuc.setFocusable(false);
        btnKetThuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKetThuc.setMargin(new java.awt.Insets(5, 18, 5, 18));
        btnKetThuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKetThuc);
        jToolBar1.add(jSeparator4);

        QLSanPham.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        QLSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Full basket.png"))); // NOI18N
        QLSanPham.setText("Sản phẩm");
        QLSanPham.setFocusable(false);
        QLSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        QLSanPham.setMargin(new java.awt.Insets(5, 18, 5, 18));
        QLSanPham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        QLSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLSanPhamActionPerformed(evt);
            }
        });
        jToolBar1.add(QLSanPham);

        QLNhanVien.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        QLNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User group.png"))); // NOI18N
        QLNhanVien.setText("Nhân viên");
        QLNhanVien.setFocusable(false);
        QLNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        QLNhanVien.setMargin(new java.awt.Insets(5, 18, 5, 18));
        QLNhanVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        QLNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLNhanVienActionPerformed(evt);
            }
        });
        jToolBar1.add(QLNhanVien);

        HoaDon.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        HoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Lists.png"))); // NOI18N
        HoaDon.setText("Hóa đơn");
        HoaDon.setFocusable(false);
        HoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HoaDon.setMargin(new java.awt.Insets(5, 18, 5, 18));
        HoaDon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        HoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoaDonActionPerformed(evt);
            }
        });
        jToolBar1.add(HoaDon);
        jToolBar1.add(jSeparator5);

        GioiThieu.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        GioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Globe.png"))); // NOI18N
        GioiThieu.setText("Giới thiệu");
        GioiThieu.setFocusable(false);
        GioiThieu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GioiThieu.setMargin(new java.awt.Insets(5, 18, 5, 18));
        GioiThieu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GioiThieuActionPerformed(evt);
            }
        });
        jToolBar1.add(GioiThieu);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/welcome.png"))); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/system.png"))); // NOI18N
        jMenu1.setText("Hệ thống");
        jMenu1.setMargin(new java.awt.Insets(5, 5, 5, 5));

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exit.png"))); // NOI18N
        jMenuItem1.setText("Đăng xuất");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        mniDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mniDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Key.png"))); // NOI18N
        mniDangNhap.setText("Đăng nhập");
        mniDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangNhapActionPerformed(evt);
            }
        });
        jMenu1.add(mniDangNhap);
        jMenu1.add(jSeparator1);

        DoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Refresh.png"))); // NOI18N
        DoiMatKhau.setText("Đổi mật khẩu");
        DoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoiMatKhauActionPerformed(evt);
            }
        });
        jMenu1.add(DoiMatKhau);
        jMenu1.add(jSeparator2);

        mniKetThuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mniKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete.png"))); // NOI18N
        mniKetThuc.setText("Kết thúc");
        mniKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKetThucActionPerformed(evt);
            }
        });
        jMenu1.add(mniKetThuc);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Clien list.png"))); // NOI18N
        jMenu2.setText("Quản lý ");
        jMenu2.setMargin(new java.awt.Insets(5, 5, 5, 5));

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Full basket.png"))); // NOI18N
        jMenuItem5.setText("Sản phẩm");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User group.png"))); // NOI18N
        jMenuItem6.setText("Nhân viên");
        jMenu2.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cash register.png"))); // NOI18N
        jMenuItem7.setText("Hóa đơn");
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1234.png"))); // NOI18N
        jMenu3.setText("Thống kê");
        jMenu3.setMargin(new java.awt.Insets(5, 5, 5, 5));

        mniThongKeTheoNgay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Bar chart.png"))); // NOI18N
        mniThongKeTheoNgay.setText("Theo ngày");
        mniThongKeTheoNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThongKeTheoNgayActionPerformed(evt);
            }
        });
        jMenu3.add(mniThongKeTheoNgay);

        mniThongKeTheoThang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Bar chart.png"))); // NOI18N
        mniThongKeTheoThang.setText("Theo tháng");
        mniThongKeTheoThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThongKeTheoThangActionPerformed(evt);
            }
        });
        jMenu3.add(mniThongKeTheoThang);

        mniThongKeTheoNam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Bar chart.png"))); // NOI18N
        mniThongKeTheoNam.setText("Theo năm");
        mniThongKeTheoNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThongKeTheoNamActionPerformed(evt);
            }
        });
        jMenu3.add(mniThongKeTheoNam);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        logoff();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void QLNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLNhanVienActionPerformed
        NhanVienJFrame nv = new NhanVienJFrame();
        nv.setVisible(true);
        nv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_QLNhanVienActionPerformed

    private void QLSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLSanPhamActionPerformed
        SanPhamJFrame nv = new SanPhamJFrame();
        nv.setVisible(true);
        nv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_QLSanPhamActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        exit();
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void mniDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangNhapActionPerformed
        DangNhapJDialog login = new DangNhapJDialog(this, true);
        login.setVisible(true);
        login.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_mniDangNhapActionPerformed

    private void mniKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKetThucActionPerformed
        exit();
    }//GEN-LAST:event_mniKetThucActionPerformed

    private void mniThongKeTheoNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThongKeTheoNgayActionPerformed
        openThongKe(0);
    }//GEN-LAST:event_mniThongKeTheoNgayActionPerformed

    private void HoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoaDonActionPerformed
        openHoaDon();
    }//GEN-LAST:event_HoaDonActionPerformed

    private void GioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GioiThieuActionPerformed
        openAbout();
    }//GEN-LAST:event_GioiThieuActionPerformed

    private void DoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoiMatKhauActionPerformed
        openChangePass();
    }//GEN-LAST:event_DoiMatKhauActionPerformed

    private void mniThongKeTheoNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThongKeTheoNamActionPerformed
        openThongKe(1);
    }//GEN-LAST:event_mniThongKeTheoNamActionPerformed

    private void mniThongKeTheoThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThongKeTheoThangActionPerformed
        openThongKe(2);
    }//GEN-LAST:event_mniThongKeTheoThangActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DoiMatKhau;
    private javax.swing.JButton GioiThieu;
    private javax.swing.JButton HoaDon;
    private javax.swing.JButton QLNhanVien;
    private javax.swing.JButton QLSanPham;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mniDangNhap;
    private javax.swing.JMenuItem mniKetThuc;
    private javax.swing.JMenuItem mniThongKeTheoNam;
    private javax.swing.JMenuItem mniThongKeTheoNgay;
    private javax.swing.JMenuItem mniThongKeTheoThang;
    // End of variables declaration//GEN-END:variables
}
