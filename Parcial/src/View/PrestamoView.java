package View;

import Controller.AsociadoController;
import Model.Asociado;
import Model.Cuota;
import Model.Prestamo;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PrestamoView extends javax.swing.JFrame {

    private AsociadoController Asociados = new AsociadoController();
    private int Select;

    public PrestamoView() {
        initComponents();
        this.setLocationRelativeTo(null);
        Asociados.Crear(new Asociado("00001", "JUAN", 700000, "SIN PRESTAMO"));
        Asociados.Crear(new Asociado("00002", "MARIA", 800000, "SIN PRESTAMO"));
        Asociados.Crear(new Asociado("00003", "ORLANDO", 8000000, "SIN PRESTAMO"));
        Asociados.Crear(new Asociado("00004", "BATTY", 600000, "SIN PRESTAMO"));
        Asociados.Crear(new Asociado("00005", "VENECO", 300000, "SIN PRESTAMO"));
        Asociados.Crear(new Asociado("00006", "MELVIN", 8000000, "SIN PRESTAMO"));
        Listar((DefaultTableModel) tblAsociados.getModel(), Asociados.ReadAsociados());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAsociados = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBanc = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtAsociado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPlazo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtInteres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtValorC = new javax.swing.JTextField();
        btnProyec = new javax.swing.JButton();
        btnAprobar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblAsociados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Salario", "Estado"
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
        tblAsociados.getTableHeader().setReorderingAllowed(false);
        tblAsociados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAsociadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAsociados);
        if (tblAsociados.getColumnModel().getColumnCount() > 0) {
            tblAsociados.getColumnModel().getColumn(0).setResizable(false);
            tblAsociados.getColumnModel().getColumn(1).setResizable(false);
            tblAsociados.getColumnModel().getColumn(2).setResizable(false);
            tblAsociados.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 11, 260, 447));

        tblBanc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Cuota", "Valor Cuota", "Valor Pagar", "Saldo", "Pagar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBanc.getTableHeader().setReorderingAllowed(false);
        tblBanc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBancMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblBanc);
        if (tblBanc.getColumnModel().getColumnCount() > 0) {
            tblBanc.getColumnModel().getColumn(0).setResizable(false);
            tblBanc.getColumnModel().getColumn(1).setResizable(false);
            tblBanc.getColumnModel().getColumn(2).setResizable(false);
            tblBanc.getColumnModel().getColumn(3).setResizable(false);
            tblBanc.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, 280));

        btnBuscar.setText("Select");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, 34));

        jLabel1.setText("Asociados : ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, 25));

        txtAsociado.setEditable(false);
        txtAsociado.setEnabled(false);
        getContentPane().add(txtAsociado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 130, -1));

        jLabel2.setText("Valor :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 58, -1));
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 140, -1));

        jLabel3.setText("Plazo Meses: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));
        getContentPane().add(txtPlazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 140, -1));

        jLabel4.setText("Interes : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));
        getContentPane().add(txtInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 140, -1));

        jLabel5.setText("Valor Total : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        txtValorC.setEditable(false);
        txtValorC.setEnabled(false);
        getContentPane().add(txtValorC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 120, -1));

        btnProyec.setText("Proyectar");
        btnProyec.setEnabled(false);
        btnProyec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProyecActionPerformed(evt);
            }
        });
        getContentPane().add(btnProyec, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, -1));

        btnAprobar.setText("Aprobar");
        btnAprobar.setEnabled(false);
        btnAprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAprobarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAprobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 80, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (tblAsociados.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado en la tabla", "Error", 0);
        } else if (tblAsociados.getValueAt(tblAsociados.getSelectedRow(), 3).equals("SIN PRESTAMO")) {
            Select = tblAsociados.getSelectedRow();
            btnProyec.setEnabled(true);
            txtAsociado.setText(tblAsociados.getValueAt(tblAsociados.getSelectedRow(), 1).toString());
        } else {
            JOptionPane.showMessageDialog(null, "No se puede proyectar su prestamo", "Error", 0);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnProyecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProyecActionPerformed
        try {
            if (Integer.parseInt(txtPlazo.getText()) < 1 || Integer.parseInt(txtPlazo.getText()) > 48) {
                JOptionPane.showMessageDialog(null, "Plazo debe ser entre 1 y 48 meses", "Error", 0);
            } else if (Integer.parseInt(txtInteres.getText()) < 1 || Integer.parseInt(txtInteres.getText()) > 8) {
                JOptionPane.showMessageDialog(null, "El interes debe ser entre 1% y 8% meses", "Error", 0);
            } else if (Double.parseDouble(txtValor.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, "El valor debe ser mayor 0", "Error", 0);
            } else {
                double ValorTotal = Double.parseDouble(txtValor.getText()) + (Double.parseDouble(txtValor.getText()) * Integer.parseInt(txtInteres.getText()) / 100);
                if (ValorTotal >= (Double.parseDouble(tblAsociados.getValueAt(Select, 2).toString()) * 4)) {
                    JOptionPane.showMessageDialog(null, "El valor total no debe exceder 4 veces el salario del asociado", "Error", 0);
                } else {
                    txtValorC.setText(ValorTotal + "");
                    btnProyec.setEnabled(false);
                    btnAprobar.setEnabled(true);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe ser valores numerico,", "Error", 0);
        }
    }//GEN-LAST:event_btnProyecActionPerformed

    private void btnAprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprobarActionPerformed
        Asociados.CambiarEstado(tblAsociados.getValueAt(Select, 0).toString(), "CON PRESTAMO");
        Asociados.CrearPrestamo(new Prestamo(Double.parseDouble(txtValor.getText()) + (Double.parseDouble(txtValor.getText()) * Integer.parseInt(txtInteres.getText()) / 100),
                Integer.parseInt(txtInteres.getText()), Integer.parseInt(txtPlazo.getText()), Asociados.Read(tblAsociados.getValueAt(Select, 0).toString())));
        btnCancelar.doClick();
        JOptionPane.showMessageDialog(null, "Prestamo Creado", "Aprobado", 1);
        Asociados.CrearCuotas(Asociados.GetPrestamo(), 1, new Vector<Cuota>(), Select);
        Listar((DefaultTableModel) tblAsociados.getModel(), Asociados.ReadAsociados());
    }//GEN-LAST:event_btnAprobarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtAsociado.setText(null);
        txtInteres.setText(null);
        txtPlazo.setText(null);
        txtValor.setText(null);
        txtValorC.setText(null);
        btnProyec.setEnabled(false);
        btnAprobar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblAsociadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAsociadosMouseClicked
        if (tblAsociados.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado en la tabla", "Error", 0);
        } else if (tblAsociados.getValueAt(tblAsociados.getSelectedRow(), 3).equals("CON PRESTAMO")) {
            Select = tblAsociados.getSelectedRow();
            Listar((DefaultTableModel) tblBanc.getModel(), Asociados.ReadCuotas((String) tblAsociados.getValueAt(tblAsociados.getSelectedRow(), 0)));
        }
    }//GEN-LAST:event_tblAsociadosMouseClicked

    private void tblBancMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBancMouseClicked
        if (tblBanc.getSelectedColumn() == 4 && tblBanc.getValueAt(tblBanc.getSelectedRow(), 4).equals("false")) {
            Asociados.CambiarEstadoCuota(Asociados.IndexCuota(Select), Integer.parseInt(tblBanc.getValueAt(tblBanc.getSelectedRow(), 0).toString()));
            if (Asociados.ValidarEstadoPrestamo(Asociados.IndexCuota(Select))) {
                ((DefaultTableModel) tblBanc.getModel()).setNumRows(0);
                JOptionPane.showMessageDialog(null, "Prestamo Pagado", "Pagado", 1);
                Asociados.CambiarEstado(tblAsociados.getValueAt(Select, 0).toString(), "SIN PRESTAMO");
                Listar((DefaultTableModel) tblAsociados.getModel(), Asociados.ReadAsociados());
            } else {
                Listar((DefaultTableModel) tblBanc.getModel(), Asociados.ReadCuotas((String) tblAsociados.getValueAt(Select, 0)));
            }
        }
    }//GEN-LAST:event_tblBancMouseClicked

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
            java.util.logging.Logger.getLogger(PrestamoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrestamoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrestamoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrestamoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrestamoView().setVisible(true);
            }
        });
    }

    private void Listar(DefaultTableModel Modelo, Vector<String[]> Array) {
        Modelo.setNumRows(0);
        Array.forEach(Item -> {
            Modelo.addRow(Item);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAprobar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnProyec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAsociados;
    private javax.swing.JTable tblBanc;
    private javax.swing.JTextField txtAsociado;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextField txtPlazo;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtValorC;
    // End of variables declaration//GEN-END:variables
}
