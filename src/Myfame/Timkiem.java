/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Myfame;

/**
 *
 * @author Admin
 */
public class Timkiem extends javax.swing.JInternalFrame {

    public Timkiem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnten = new javax.swing.JButton();
        btndiem = new javax.swing.JButton();
        btnhocluc = new javax.swing.JButton();
        btnlop = new javax.swing.JButton();
        btnIndanhsach = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtmin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtmax = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBang = new javax.swing.JTable();
        btnsstt = new javax.swing.JButton();
        btnsstd = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Tìm kiếm sinh viên");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Tìm kiếm sinh viên");

        btnten.setIcon(new javax.swing.ImageIcon("C:\\Users\\yenph\\OneDrive\\Máy tính\\Images\\Zoom.png")); // NOI18N
        btnten.setText("Theo tên");

        btndiem.setIcon(new javax.swing.ImageIcon("C:\\Users\\yenph\\OneDrive\\Máy tính\\Images\\Zoom.png")); // NOI18N
        btndiem.setText("Theo DTB");

        btnhocluc.setIcon(new javax.swing.ImageIcon("C:\\Users\\yenph\\OneDrive\\Máy tính\\Images\\Zoom.png")); // NOI18N
        btnhocluc.setText("Theo học lực");

        btnlop.setIcon(new javax.swing.ImageIcon("C:\\Users\\yenph\\OneDrive\\Máy tính\\Images\\Zoom.png")); // NOI18N
        btnlop.setText("Theo lớp");

        btnIndanhsach.setIcon(new javax.swing.ImageIcon("C:\\Users\\yenph\\OneDrive\\Máy tính\\Images\\Numbered list.png")); // NOI18N
        btnIndanhsach.setText("In danh sách");

        jLabel2.setText("MIN");

        jLabel3.setText("MAX");

        tblBang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ tên", "Lớp", " Toán", "Lý", "Hóa", "Sinh", "Sử", "Địa", "Tin", "Văn", "Anh", "GDCD", "GDQP", "Thể dục", "TBT", "Hạnh Kiểm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBang);

        btnsstt.setText("Sắp xếp theo tên");

        btnsstd.setText("Sắp xếp theo điểm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtmin, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtmax)))
                .addContainerGap(871, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnten)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btndiem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnhocluc)
                                .addGap(18, 18, 18)
                                .addComponent(btnlop)
                                .addGap(18, 18, 18)
                                .addComponent(btnIndanhsach))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnsstt)
                        .addGap(30, 30, 30)
                        .addComponent(btnsstd)))
                .addGap(0, 480, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnsstd, btnsstt});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnten)
                    .addComponent(btndiem)
                    .addComponent(btnhocluc)
                    .addComponent(btnlop)
                    .addComponent(btnIndanhsach))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsstd)
                    .addComponent(btnsstt))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIndanhsach;
    private javax.swing.JButton btndiem;
    private javax.swing.JButton btnhocluc;
    private javax.swing.JButton btnlop;
    private javax.swing.JButton btnsstd;
    private javax.swing.JButton btnsstt;
    private javax.swing.JButton btnten;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblBang;
    private javax.swing.JTextField txtmax;
    private javax.swing.JTextField txtmin;
    // End of variables declaration//GEN-END:variables
}