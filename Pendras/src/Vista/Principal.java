package Vista;

import Controlador.PrendaController;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    private static DefaultTableModel TablaSucia, TablaJabonada, TablaEnjuagadas, TablaLimpias;
    private static PrendaController Prendas = new PrendaController();

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        TablaSucia = (DefaultTableModel) (Tbl_Sucia.getModel());
        TablaJabonada = (DefaultTableModel) (Tbl_Jabonadas.getModel());
        TablaEnjuagadas = (DefaultTableModel) (Tbl_Enjuagadas.getModel());
        TablaLimpias = (DefaultTableModel) (Tbl_Limpias.getModel());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Sucia = new javax.swing.JTable();
        btn_Add = new javax.swing.JButton();
        btn_J = new javax.swing.JButton();
        btn_E = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tbl_Jabonadas = new javax.swing.JTable();
        btn_P = new javax.swing.JButton();
        btn_EJ = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tbl_Enjuagadas = new javax.swing.JTable();
        btn_S = new javax.swing.JButton();
        btn_PE = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tbl_Limpias = new javax.swing.JTable();
        btn_U = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Tbl_Sucia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tipo", "Color", "Estado", "Talla"
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
        Tbl_Sucia.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tbl_Sucia);
        if (Tbl_Sucia.getColumnModel().getColumnCount() > 0) {
            Tbl_Sucia.getColumnModel().getColumn(0).setResizable(false);
            Tbl_Sucia.getColumnModel().getColumn(1).setResizable(false);
            Tbl_Sucia.getColumnModel().getColumn(2).setResizable(false);
            Tbl_Sucia.getColumnModel().getColumn(3).setResizable(false);
            Tbl_Sucia.getColumnModel().getColumn(4).setResizable(false);
        }

        btn_Add.setText("+");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });

        btn_J.setText("J");
        btn_J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_JActionPerformed(evt);
            }
        });

        btn_E.setText("E");
        btn_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EActionPerformed(evt);
            }
        });

        Tbl_Jabonadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tipo", "Color", "Estado", "Talla"
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
        Tbl_Jabonadas.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(Tbl_Jabonadas);
        if (Tbl_Jabonadas.getColumnModel().getColumnCount() > 0) {
            Tbl_Jabonadas.getColumnModel().getColumn(0).setResizable(false);
            Tbl_Jabonadas.getColumnModel().getColumn(1).setResizable(false);
            Tbl_Jabonadas.getColumnModel().getColumn(2).setResizable(false);
            Tbl_Jabonadas.getColumnModel().getColumn(3).setResizable(false);
            Tbl_Jabonadas.getColumnModel().getColumn(4).setResizable(false);
        }

        btn_P.setText("P");
        btn_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PActionPerformed(evt);
            }
        });

        btn_EJ.setText("E");
        btn_EJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EJActionPerformed(evt);
            }
        });

        Tbl_Enjuagadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tipo", "Color", "Estado", "Talla"
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
        Tbl_Enjuagadas.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(Tbl_Enjuagadas);
        if (Tbl_Enjuagadas.getColumnModel().getColumnCount() > 0) {
            Tbl_Enjuagadas.getColumnModel().getColumn(0).setResizable(false);
            Tbl_Enjuagadas.getColumnModel().getColumn(1).setResizable(false);
            Tbl_Enjuagadas.getColumnModel().getColumn(2).setResizable(false);
            Tbl_Enjuagadas.getColumnModel().getColumn(3).setResizable(false);
            Tbl_Enjuagadas.getColumnModel().getColumn(4).setResizable(false);
        }

        btn_S.setText("S");
        btn_S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SActionPerformed(evt);
            }
        });

        btn_PE.setText("P");
        btn_PE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PEActionPerformed(evt);
            }
        });

        Tbl_Limpias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tipo", "Color", "Estado", "Talla"
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
        Tbl_Limpias.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(Tbl_Limpias);
        if (Tbl_Limpias.getColumnModel().getColumnCount() > 0) {
            Tbl_Limpias.getColumnModel().getColumn(0).setResizable(false);
            Tbl_Limpias.getColumnModel().getColumn(1).setResizable(false);
            Tbl_Limpias.getColumnModel().getColumn(2).setResizable(false);
            Tbl_Limpias.getColumnModel().getColumn(3).setResizable(false);
            Tbl_Limpias.getColumnModel().getColumn(4).setResizable(false);
        }

        btn_U.setText("U");
        btn_U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_J, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_E, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_P, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_EJ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_PE, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_S, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_U, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_P)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_EJ))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_Add)
                                .addGap(18, 18, 18)
                                .addComponent(btn_J)
                                .addGap(18, 18, 18)
                                .addComponent(btn_E)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_PE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_S)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .addGap(50, 50, 50))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_U)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        new Agregar(this, false);
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_JActionPerformed
        Prendas.CambiarEstado("JABONADA", TablaSucia.getValueAt(Tbl_Sucia.getSelectedRow(), 0).toString());
        ListarTodo();
    }//GEN-LAST:event_btn_JActionPerformed

    private void btn_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EActionPerformed
        Prendas.CambiarEstado("ENJUAGADA", TablaSucia.getValueAt(Tbl_Sucia.getSelectedRow(), 0).toString());
        ListarTodo();
    }//GEN-LAST:event_btn_EActionPerformed

    private void btn_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PActionPerformed
        Prendas.CambiarEstado("SUCIA", TablaJabonada.getValueAt(Tbl_Jabonadas.getSelectedRow(), 0).toString());
        ListarTodo();
    }//GEN-LAST:event_btn_PActionPerformed

    private void btn_EJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EJActionPerformed
        Prendas.CambiarEstado("ENJUAGADA", TablaJabonada.getValueAt(Tbl_Jabonadas.getSelectedRow(), 0).toString());
        ListarTodo();
    }//GEN-LAST:event_btn_EJActionPerformed

    private void btn_PEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PEActionPerformed
        Prendas.CambiarEstado("SUCIA", TablaEnjuagadas.getValueAt(Tbl_Enjuagadas.getSelectedRow(), 0).toString());
        ListarTodo();
    }//GEN-LAST:event_btn_PEActionPerformed

    private void btn_SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SActionPerformed
        Prendas.CambiarEstado("LIMPIA", TablaEnjuagadas.getValueAt(Tbl_Enjuagadas.getSelectedRow(), 0).toString());
        ListarTodo();
    }//GEN-LAST:event_btn_SActionPerformed

    private void btn_UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UActionPerformed
        Prendas.CambiarEstado("SUCIA", TablaLimpias.getValueAt(Tbl_Limpias.getSelectedRow(), 0).toString());
        ListarTodo();
    }//GEN-LAST:event_btn_UActionPerformed

    public static void ListarTodo() {
        Listar(TablaSucia, "SUCIA");
        Listar(TablaJabonada, "JABONADA");
        Listar(TablaEnjuagadas, "ENJUAGADA");
        Listar(TablaLimpias, "LIMPIA");
    }

    private static void Listar(DefaultTableModel Tabla, String Estado) {
        Vector<String[]> Find = Prendas.ConsultarEstado(Estado);
        Tabla.setNumRows(0);
        if (Find != null || Find != new Vector()) {
            Find.forEach(Row -> {
                Tabla.addRow(Row);
            });
        }
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
    private javax.swing.JTable Tbl_Enjuagadas;
    private javax.swing.JTable Tbl_Jabonadas;
    private javax.swing.JTable Tbl_Limpias;
    private javax.swing.JTable Tbl_Sucia;
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_E;
    private javax.swing.JButton btn_EJ;
    private javax.swing.JButton btn_J;
    private javax.swing.JButton btn_P;
    private javax.swing.JButton btn_PE;
    private javax.swing.JButton btn_S;
    private javax.swing.JButton btn_U;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
