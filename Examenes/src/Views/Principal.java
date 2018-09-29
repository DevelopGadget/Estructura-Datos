package Views;

import Controller.Controlador;
import Models.Estudiante;
import java.util.UUID;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    private Controlador Cont = new Controlador();

    public Principal() {
        if (Cont.getExamen() == null) {
            new AgregarExamen(this);
        }
        initComponents();
        this.setLocationRelativeTo(null);
        Listar((DefaultTableModel) tbl_SC.getModel(), Cont.ReadPila());
        Listar((DefaultTableModel) tbl_C.getModel(), Cont.ReadExamenes());
        if(Cont.ReadExamenes().size() >= 0){
            btn_Calf.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_SC = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_C = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btn_Calf = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tbl_SC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_SC.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_SC);
        if (tbl_SC.getColumnModel().getColumnCount() > 0) {
            tbl_SC.getColumnModel().getColumn(0).setResizable(false);
            tbl_SC.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setText("Exmenes sin claificar");

        tbl_C.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Nota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_C.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbl_C);
        if (tbl_C.getColumnModel().getColumnCount() > 0) {
            tbl_C.getColumnModel().getColumn(0).setResizable(false);
            tbl_C.getColumnModel().getColumn(1).setResizable(false);
            tbl_C.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel2.setText("Exmenes calificados");

        btn_Calf.setText("Calificar");
        btn_Calf.setEnabled(false);
        btn_Calf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalfActionPerformed(evt);
            }
        });

        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Agregar)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Calf))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(120, 120, 120))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(btn_Calf)
                    .addComponent(btn_Agregar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        String Nombre = "";
        while (Nombre.isEmpty()) {
            Nombre = JOptionPane.showInputDialog("Escriba el nombre");
            if (Nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe digitar un nombre", "Error", 0);
            } else {
                Cont.AgregarExamen(new Estudiante(Nombre, UUID.randomUUID().toString()));
                Listar((DefaultTableModel) tbl_SC.getModel(), Cont.ReadPila());
                btn_Calf.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_CalfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CalfActionPerformed
        String Nota = "";
        while (Nota.isEmpty()) {
            Nota = JOptionPane.showInputDialog("Escriba un numero entero de preguntas buenas");
            if (Nota.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe digitar un numero entero", "Error", 0);
            } else {
                try {
                    if (Cont.ValidarPregunta(Integer.parseInt(Nota))) {
                        if (Cont.CalificarEstudiante(Integer.parseInt(Nota))) {
                            btn_Calf.setEnabled(false);
                        }
                        Listar((DefaultTableModel) tbl_SC.getModel(), Cont.ReadPila());
                        Listar((DefaultTableModel) tbl_C.getModel(), Cont.ReadExamenes());
                    } else {
                        JOptionPane.showMessageDialog(null, "Fuera de rango de preguntas", "Error", 0);
                        Nota = "";
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Debe digitar solo numeros enteros", "Error", 0);
                    Nota = "";
                }
            }
        }
    }//GEN-LAST:event_btn_CalfActionPerformed

    private void Listar(DefaultTableModel Model, Vector<String[]> Array) {
        Model.setNumRows(0);
        Array.forEach(Item -> {
            Model.addRow(Item);
        });
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Calf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_C;
    private javax.swing.JTable tbl_SC;
    // End of variables declaration//GEN-END:variables
}
