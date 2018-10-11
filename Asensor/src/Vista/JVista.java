package Vista;

import Controlador.Controlador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JVista extends javax.swing.JFrame {
    
    private final Controlador Cont = new Controlador();
    
    public JVista() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_Quitar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_4Piso = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btn_Plant = new javax.swing.JButton();
        btn_Recep = new javax.swing.JButton();
        btn_Sist = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_3Piso = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_Disponible = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_Ingreso = new javax.swing.JTable();
        btn_Agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setLabelFor(tbl_4Piso);
        jLabel1.setText("Personal Disponible");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 15, -1, -1));

        btn_Quitar.setText("-");
        btn_Quitar.setEnabled(false);
        btn_Quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuitarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Quitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        tbl_4Piso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Momento", "Momento", "Orden"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_4Piso.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_4Piso);
        if (tbl_4Piso.getColumnModel().getColumnCount() > 0) {
            tbl_4Piso.getColumnModel().getColumn(1).setResizable(false);
            tbl_4Piso.getColumnModel().getColumn(2).setResizable(false);
            tbl_4Piso.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 340, 150));

        jLabel2.setText("Personal Disponible");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 254, -1, -1));

        btn_Plant.setText("3 Planta");
        btn_Plant.setEnabled(false);
        jPanel1.add(btn_Plant, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 286, 84, 42));

        btn_Recep.setText("1 Recepcion");
        btn_Recep.setEnabled(false);
        jPanel1.add(btn_Recep, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 286, -1, 42));

        btn_Sist.setText("3 Sistemas");
        btn_Sist.setEnabled(false);
        jPanel1.add(btn_Sist, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 286, -1, 42));

        jLabel3.setLabelFor(tbl_3Piso);
        jLabel3.setText("Personal de Ingreso");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 346, -1, -1));

        tbl_3Piso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Peso", "Momento", "Orden"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_3Piso.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbl_3Piso);
        if (tbl_3Piso.getColumnModel().getColumnCount() > 0) {
            tbl_3Piso.getColumnModel().getColumn(1).setResizable(false);
            tbl_3Piso.getColumnModel().getColumn(2).setResizable(false);
            tbl_3Piso.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 156, 360, 140));

        jButton1.setText("Ingresar");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, 80, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Sin título.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        tbl_Disponible.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Codigo", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Disponible.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_Disponible.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_Disponible.getTableHeader().setReorderingAllowed(false);
        tbl_Disponible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_DisponibleMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_Disponible);
        if (tbl_Disponible.getColumnModel().getColumnCount() > 0) {
            tbl_Disponible.getColumnModel().getColumn(1).setResizable(false);
            tbl_Disponible.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 294, 196));

        tbl_Ingreso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Piso", "Momento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Ingreso.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_Ingreso.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_Ingreso.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tbl_Ingreso);
        if (tbl_Ingreso.getColumnModel().getColumnCount() > 0) {
            tbl_Ingreso.getColumnModel().getColumn(1).setResizable(false);
            tbl_Ingreso.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 378, 294, 196));

        btn_Agregar.setText("+");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 11, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_QuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuitarActionPerformed
        if (tbl_Disponible.getSelectedRow() >= 0) {
            Cont.QuitarPersona(tbl_Disponible.getSelectedRow());
            Listar((DefaultTableModel) tbl_Disponible.getModel(), Cont.ReadPersona());
            Botones(false);
        } else {
            JOptionPane.showConfirmDialog(null, "Debe escoger una persona", "Error", 0);
        }
    }//GEN-LAST:event_btn_QuitarActionPerformed

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        new Agregar(this, false);
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void tbl_DisponibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_DisponibleMouseClicked
        Botones(true);
    }//GEN-LAST:event_tbl_DisponibleMouseClicked
    
    public static void Listar(DefaultTableModel Tabla, ArrayList<String[]> Array) {
        Tabla.setNumRows(0);
        Array.forEach(Tabla::addRow);
    }
    
    private void Botones(boolean cond) {
        btn_Quitar.setEnabled(cond);
        btn_Recep.setEnabled(cond);
        btn_Plant.setEnabled(cond);
        btn_Sist.setEnabled(cond);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Plant;
    private javax.swing.JButton btn_Quitar;
    private javax.swing.JButton btn_Recep;
    private javax.swing.JButton btn_Sist;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbl_3Piso;
    private javax.swing.JTable tbl_4Piso;
    public static javax.swing.JTable tbl_Disponible;
    private javax.swing.JTable tbl_Ingreso;
    // End of variables declaration//GEN-END:variables
}
