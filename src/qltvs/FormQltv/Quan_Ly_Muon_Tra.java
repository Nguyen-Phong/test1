package FormQltv;

import LopQltv.Them_Sua_Xoa_Find_TV;
import LopQltv.MuonTra_ThuVien;
import LopQltv.Sach_ThuVien;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import sun.nio.ch.IOUtil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JOS LINH NGUYEN
 */
public class Quan_Ly_Muon_Tra extends javax.swing.JFrame {

    DefaultTableModel tbMuontra;
    List<MuonTra_ThuVien> slmt = new ArrayList<>();

    public Quan_Ly_Muon_Tra() {
        initComponents();
        tbMuontra = (DefaultTableModel) tabMuontra.getModel();
        ShowMuonTraSach();
        ShowDuLieuSachMuon();
    }

    private void ShowMuonTraSach() {
        slmt = Them_Sua_Xoa_Find_TV.HienThiAllMuonTra();
        tbMuontra.setRowCount(0);
        for (MuonTra_ThuVien muonTra_ThuVien : slmt) {
            tbMuontra.addRow(new Object[]{muonTra_ThuVien.getMSV(), muonTra_ThuVien.getMAsACH(), muonTra_ThuVien.getNGAYMUON(), muonTra_ThuVien.getNGAYTRA(), muonTra_ThuVien.getSOLUONG(), muonTra_ThuVien.getQLTHUVIEN()});
        }
    }

    public void ShowDuLieuSachMuon() {
        try {
            tabMuontra.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (tabMuontra.getSelectedRow() >= 0) {
                        txtMsv.setText(tabMuontra.getValueAt(tabMuontra.getSelectedRow(), 0) + "");
                        txtms.setText(tabMuontra.getValueAt(tabMuontra.getSelectedRow(), 1) + "");
                        txtNm.setText(tabMuontra.getValueAt(tabMuontra.getSelectedRow(), 2) + "");
                        txtNt.setText(tabMuontra.getValueAt(tabMuontra.getSelectedRow(), 3) + "");
                        txtSl.setText(tabMuontra.getValueAt(tabMuontra.getSelectedRow(), 4) + "");
                        txtQltv.setText(tabMuontra.getValueAt(tabMuontra.getSelectedRow(), 5) + "");

                    }
                }
            });
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMsv = new javax.swing.JTextField();
        txtSl = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtQltv = new javax.swing.JTextField();
        txtNm = new javax.swing.JTextField();
        txtNt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtms = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnMuonmoi = new javax.swing.JButton();
        btnChomuon = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnTrasach = new javax.swing.JButton();
        txtTkiem = new javax.swing.JTextField();
        btnTk = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabMuontra = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnthoat1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnPint = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\New Folder (2)\\BaiTapCuoiKi\\QLTV\\src\\Icon\\icons8-book-shelf-48.png")); // NOI18N
        jLabel1.setText("QU???N L?? M?????N , TR??? S??CH");

        jPanel1.setBackground(new java.awt.Color(153, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setAutoscrolls(true);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName(""); // NOI18N

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("M?? SV");

        jLabel4.setBackground(new java.awt.Color(0, 153, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ng??y M?????n");

        jLabel5.setBackground(new java.awt.Color(0, 153, 153));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ng??y Tr???");

        jLabel6.setBackground(new java.awt.Color(0, 153, 153));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("S??? L?????ng M?????n");

        txtMsv.setBackground(new java.awt.Color(204, 204, 204));

        txtSl.setBackground(new java.awt.Color(204, 204, 204));
        txtSl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSlActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 153, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Qu???n L?? TV");

        txtQltv.setBackground(new java.awt.Color(204, 204, 204));

        txtNm.setBackground(new java.awt.Color(204, 204, 204));

        txtNt.setBackground(new java.awt.Color(204, 204, 204));

        jLabel9.setBackground(new java.awt.Color(0, 153, 153));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("M?? S??ch");

        txtms.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNt, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNm, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtms, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(59, 59, 59)
                            .addComponent(txtMsv, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQltv, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSl, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMsv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtQltv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanel2.setBackground(new java.awt.Color(51, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnMuonmoi.setBackground(new java.awt.Color(0, 102, 102));
        btnMuonmoi.setIcon(new javax.swing.ImageIcon("E:\\New Folder (2)\\BaiTapCuoiKi\\QLTV\\src\\Icon\\icons8-reset-24.png")); // NOI18N
        btnMuonmoi.setText("M?????n M???i");
        btnMuonmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuonmoiActionPerformed(evt);
            }
        });

        btnChomuon.setBackground(new java.awt.Color(0, 102, 102));
        btnChomuon.setForeground(new java.awt.Color(0, 51, 51));
        btnChomuon.setIcon(new javax.swing.ImageIcon("E:\\New Folder (2)\\BaiTapCuoiKi\\QLTV\\src\\Icon\\icons8-add-book-30.png")); // NOI18N
        btnChomuon.setText("Cho M?????n");
        btnChomuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChomuonActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(0, 102, 102));
        btnThoat.setForeground(new java.awt.Color(0, 51, 51));
        btnThoat.setIcon(new javax.swing.ImageIcon("E:\\New Folder (2)\\BaiTapCuoiKi\\QLTV\\src\\Icon\\icons8-logout-rounded-left-26.png")); // NOI18N
        btnThoat.setText("Tho??t");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnTrasach.setBackground(new java.awt.Color(0, 102, 102));
        btnTrasach.setForeground(new java.awt.Color(0, 51, 51));
        btnTrasach.setIcon(new javax.swing.ImageIcon("E:\\New Folder (2)\\BaiTapCuoiKi\\QLTV\\src\\Icon\\icons8-remove-book-30.png")); // NOI18N
        btnTrasach.setText("Tr??? S??ch");
        btnTrasach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrasachActionPerformed(evt);
            }
        });

        txtTkiem.setBackground(new java.awt.Color(204, 204, 204));

        btnTk.setBackground(new java.awt.Color(0, 102, 102));
        btnTk.setForeground(new java.awt.Color(0, 51, 51));
        btnTk.setText("T??m MSV");
        btnTk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMuonmoi)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnChomuon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTrasach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMuonmoi)
                    .addComponent(btnChomuon))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThoat)
                    .addComponent(btnTrasach)))
        );

        tabMuontra.setBackground(new java.awt.Color(204, 204, 204));
        tabMuontra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabMuontra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "M?? Sv", "M?? S??ch", "Ng??y M?????n", "Ng??y Tr???", "SL M?????n", "QL Th?? Vi???n"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabMuontra);

        jLabel2.setBackground(new java.awt.Color(204, 102, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\New Folder (2)\\BaiTapCuoiKi\\QLTV\\src\\Icon\\icons8-library-64.png")); // NOI18N
        jLabel2.setText("Th???c Hi???n M?????n ,Tr??? S??ch");

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("E:\\New Folder (2)\\BaiTapCuoiKi\\QLTV\\src\\Icon\\icons8-library-64.png")); // NOI18N
        jLabel7.setText("X??? L?? ");

        btnthoat1.setIcon(new javax.swing.ImageIcon("E:\\New Folder (2)\\BaiTapCuoiKi\\QLTV\\src\\Icon\\icons8-exit-26.png")); // NOI18N
        btnthoat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoat1ActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(0, 153, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon("E:\\New Folder (2)\\BaiTapCuoiKi\\QLTV\\src\\Icon\\unnamed.jpg")); // NOI18N

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon("E:\\New Folder (2)\\BaiTapCuoiKi\\QLTV\\src\\Icon\\icons8-book-and-pencil-48.png")); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(600, 457));

        btnPint.setBackground(new java.awt.Color(0, 102, 102));
        btnPint.setForeground(new java.awt.Color(0, 51, 51));
        btnPint.setIcon(new javax.swing.ImageIcon("E:\\New Folder (2)\\BaiTapCuoiKi\\QLTV\\src\\Icon\\icons8-print-48.png")); // NOI18N
        btnPint.setText("Print");
        btnPint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPint, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnthoat1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnthoat1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPint, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSlActionPerformed

    private void btnChomuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChomuonActionPerformed
        int th = JOptionPane.showConfirmDialog(this, "B???n c?? mu???n m?????n", "Confirm", JOptionPane.YES_NO_OPTION);
        if (th != JOptionPane.YES_OPTION) {
            return;
        }

        String msv = txtMsv.getText();
        String ms = txtms.getText();
        String ngaymuon = txtNm.getText();
        String ngaytra = txtNt.getText();
        int soluong = Integer.parseInt(txtSl.getText());
        String qltv = txtQltv.getText();
        MuonTra_ThuVien std = new MuonTra_ThuVien(msv, ms, ngaymuon, ngaytra, soluong, qltv);
        Them_Sua_Xoa_Find_TV.InsertMuonTra(std);
        JOptionPane.showMessageDialog(this, "M?????n th??nh c??ng");

        ShowMuonTraSach();
    }//GEN-LAST:event_btnChomuonActionPerformed

    private void btnMuonmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuonmoiActionPerformed
        // TODO add your handling code here:
        txtMsv.setText("");
        txtms.setText("");
        txtNm.setText("");
        txtNt.setText("");
        txtSl.setText("");
        txtQltv.setText("");
    }//GEN-LAST:event_btnMuonmoiActionPerformed

    private void btnTrasachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrasachActionPerformed
        // TODO add your handling code here:
        int chon = tabMuontra.getSelectedRow();
        if (chon >= 0) {
            MuonTra_ThuVien stv = slmt.get(chon);
            int Xoa = JOptionPane.showConfirmDialog(this, "B???n c?? mu???n Tr??? S??ch");
            System.out.println(":" + Xoa);
            if (Xoa == 0) {
                Them_Sua_Xoa_Find_TV.DeleteMuontra(stv.getMSV());
                JOptionPane.showMessageDialog(this, "Tr??? th??nh c??ng");
                ShowMuonTraSach();
            }
        }
    }//GEN-LAST:event_btnTrasachActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "B???n c?? ch???n mu???n tho??t kh??ng", "Th??ng b??o",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnTkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTkActionPerformed
        // TODO add your handling code here:
        String Search = txtTkiem.getText();
        if (Search.length() > 0) {
            slmt = Them_Sua_Xoa_Find_TV.findQLMT(Search);
            tbMuontra.setRowCount(0);
            for (MuonTra_ThuVien mt : slmt) {
                tbMuontra.addRow(new Object[]{mt.getMSV(), mt.getMAsACH(), mt.getNGAYMUON(), mt.getNGAYTRA(), mt.getSOLUONG(), mt.getQLTHUVIEN()});

            }
        }
    }//GEN-LAST:event_btnTkActionPerformed

    private void btnthoat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoat1ActionPerformed
        // TODO add your handling code here:
        int Exit = JOptionPane.showConfirmDialog(this, "B???n c?? mu???n r???i kh???i trang ?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (Exit != JOptionPane.YES_OPTION) {
            return;
        }
        QUAN_LY_THU_VIEN_SACH tvs = new QUAN_LY_THU_VIEN_SACH();
        tvs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnthoat1ActionPerformed

    private void btnPintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPintActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();//JFileChooser trong java l?? m???t ?????i t?????ng hi???n th??? khung cho ph??p b???n m??? ho???c l??u file
        fc.setDialogTitle("L??u T???p");//t??n ti??u ?????
        int userSelection = fc.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File filetosave = fc.getSelectedFile();
            try {
                FileWriter fw = new FileWriter(filetosave);//L???p FileWriter ???????c s??? d???ng ????? ghi c??c d??? li???u theo ?????nh d???ng k?? t??? v??o m???t file
                BufferedWriter bw = new BufferedWriter(fw);//L???p BufferedWriter ???????c s??? d???ng ????? cung c???p b??? ?????m cho c??c c??c th??? hi???n c???a l???p Writer
                for (int i = 0; i < tabMuontra.getRowCount(); i++) {
                    for (int j = 0; j < tabMuontra.getColumnCount(); j++) {
                        bw.write(tabMuontra.getValueAt(i, j).toString());
                    }
                    bw.newLine();
                }
                JOptionPane.showMessageDialog(this, "Th??nh C??ng ", "Th??ng Tin", JOptionPane.INFORMATION_MESSAGE);
                bw.close();
                fw.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error", "Error message", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnPintActionPerformed

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
            java.util.logging.Logger.getLogger(Quan_Ly_Muon_Tra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quan_Ly_Muon_Tra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quan_Ly_Muon_Tra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quan_Ly_Muon_Tra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quan_Ly_Muon_Tra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChomuon;
    private javax.swing.JButton btnMuonmoi;
    private javax.swing.JButton btnPint;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTk;
    private javax.swing.JButton btnTrasach;
    private javax.swing.JButton btnthoat1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabMuontra;
    private javax.swing.JTextField txtMsv;
    private javax.swing.JTextField txtNm;
    private javax.swing.JTextField txtNt;
    private javax.swing.JTextField txtQltv;
    private javax.swing.JTextField txtSl;
    private javax.swing.JTextField txtTkiem;
    private javax.swing.JTextField txtms;
    // End of variables declaration//GEN-END:variables
}
