package Vista;

import Controlador.MercanciaControlador;
import Modelo.Mercancia;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Vista extends javax.swing.JFrame {

    MercanciaControlador MerCont = new MercanciaControlador();

    public Vista() {
        initComponents();
        Listar((DefaultTableModel) tbl_Mercancia.getModel(), MerCont.ReadMercancia());
        Listar((DefaultTableModel) tbl_MercanciaN.getModel(), MerCont.ReadMercanciaImport());
        Listar((DefaultTableModel) tbl_Cola.getModel(), MerCont.ReadMercanciaCola(MerCont.getMercanciaInspeccion(), "EN PROCESO"));
        Listar((DefaultTableModel) tbl_Cola1.getModel(), MerCont.ReadMercanciaCola(MerCont.getMercanciaRevision(), "REVISADO FISICAMENTE"));
        Listar((DefaultTableModel) tbl_Cola2.getModel(), MerCont.ReadMercanciaCola(MerCont.getMercanciaImpor(), "LICENCIA REVISADA"));
        try {
            CambiarLabel(lbl_Codigo, lbl_Nombre, lbl_Peso, lbl_Fecha,
                    MerCont.getMercanciaInspeccion().element(), MerCont.getMercanciaInspeccion().element().getFechaSalida());
        } catch (Exception e) {
        }
        try {
            CambiarLabel(lbl_Codigo1, lbl_Nombre1, lbl_Peso1, lbl_Fecha1,
                    MerCont.getMercanciaRevision().element(), MerCont.getMercanciaRevision().element().getFechaInspeccion());
        } catch (Exception e) {
        }
        try {
            CambiarLabel(lbl_Codigo2, lbl_Nombre2, lbl_Peso2, lbl_Fecha2,
                    MerCont.getMercanciaImpor().element(), MerCont.getMercanciaImpor().element().getFechaRevision());
        } catch (Exception e) {
        }
    }

    private void Listar(DefaultTableModel Tabla, ArrayList<String[]> Array) {
        Tabla.setNumRows(0);
        Array.forEach(Tabla::addRow);
    }

    private void CambiarLabel(JLabel LCodigo, JLabel JNombre, JLabel JPeso, JLabel JFecha, Mercancia Mer, String Fecha) {
        if (Mer != null) {
            LCodigo.setText(Mer.getCodigo());
            JNombre.setText(Mer.getNombre());
            JPeso.setText(Mer.getPeso() + "");
            JFecha.setText(Fecha);
        } else {
            LCodigo.setText("Codigo: ");
            JNombre.setText("Nombre: ");
            JPeso.setText("Peso: ");
            JFecha.setText("Fecha: ");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Mercancia = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_Sacar = new javax.swing.JButton();
        btn_Inspeccion = new javax.swing.JButton();
        btn_Revesion = new javax.swing.JButton();
        btn_Impor = new javax.swing.JButton();
        pn_Fisica = new javax.swing.JPanel();
        lbl_Codigo = new javax.swing.JLabel();
        lbl_Nombre = new javax.swing.JLabel();
        lbl_Peso = new javax.swing.JLabel();
        lbl_Fecha = new javax.swing.JLabel();
        pn_Licencia = new javax.swing.JPanel();
        lbl_Codigo1 = new javax.swing.JLabel();
        lbl_Nombre1 = new javax.swing.JLabel();
        lbl_Peso1 = new javax.swing.JLabel();
        lbl_Fecha1 = new javax.swing.JLabel();
        pn_Importacion = new javax.swing.JPanel();
        lbl_Codigo2 = new javax.swing.JLabel();
        lbl_Nombre2 = new javax.swing.JLabel();
        lbl_Peso2 = new javax.swing.JLabel();
        lbl_Fecha2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_MercanciaN = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_Cola = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_Cola2 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_Cola1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tbl_Mercancia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Peso", "Altura", "Color"
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
        tbl_Mercancia.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_Mercancia.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_Mercancia);
        if (tbl_Mercancia.getColumnModel().getColumnCount() > 0) {
            tbl_Mercancia.getColumnModel().getColumn(0).setResizable(false);
            tbl_Mercancia.getColumnModel().getColumn(1).setResizable(false);
            tbl_Mercancia.getColumnModel().getColumn(2).setResizable(false);
            tbl_Mercancia.getColumnModel().getColumn(3).setResizable(false);
            tbl_Mercancia.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setText("Mercancia dentro del container");

        btn_Sacar.setText("SACAR");
        btn_Sacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SacarActionPerformed(evt);
            }
        });

        btn_Inspeccion.setText("Inspeccion Fisica");
        btn_Inspeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InspeccionActionPerformed(evt);
            }
        });

        btn_Revesion.setText("Revision Licencia");
        btn_Revesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RevesionActionPerformed(evt);
            }
        });

        btn_Impor.setText("Importacion");
        btn_Impor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ImporActionPerformed(evt);
            }
        });

        pn_Fisica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pn_Fisica.setMaximumSize(new java.awt.Dimension(244, 113));
        pn_Fisica.setMinimumSize(new java.awt.Dimension(244, 113));

        lbl_Codigo.setText("Codigo: ");

        lbl_Nombre.setText("Nombre: ");

        lbl_Peso.setText("Peso: ");

        lbl_Fecha.setText("Fecha: ");

        javax.swing.GroupLayout pn_FisicaLayout = new javax.swing.GroupLayout(pn_Fisica);
        pn_Fisica.setLayout(pn_FisicaLayout);
        pn_FisicaLayout.setHorizontalGroup(
            pn_FisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_FisicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_FisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Codigo)
                    .addComponent(lbl_Nombre)
                    .addComponent(lbl_Peso)
                    .addComponent(lbl_Fecha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_FisicaLayout.setVerticalGroup(
            pn_FisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_FisicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Codigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Peso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Fecha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_Licencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pn_Licencia.setMaximumSize(new java.awt.Dimension(244, 113));
        pn_Licencia.setMinimumSize(new java.awt.Dimension(244, 113));
        pn_Licencia.setPreferredSize(new java.awt.Dimension(244, 113));

        lbl_Codigo1.setText("Codigo: ");

        lbl_Nombre1.setText("Nombre: ");

        lbl_Peso1.setText("Peso: ");

        lbl_Fecha1.setText("Fecha: ");

        javax.swing.GroupLayout pn_LicenciaLayout = new javax.swing.GroupLayout(pn_Licencia);
        pn_Licencia.setLayout(pn_LicenciaLayout);
        pn_LicenciaLayout.setHorizontalGroup(
            pn_LicenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_LicenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_LicenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Codigo1)
                    .addComponent(lbl_Nombre1)
                    .addComponent(lbl_Peso1)
                    .addComponent(lbl_Fecha1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_LicenciaLayout.setVerticalGroup(
            pn_LicenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_LicenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Codigo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Nombre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Peso1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Fecha1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_Importacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pn_Importacion.setMaximumSize(new java.awt.Dimension(244, 113));
        pn_Importacion.setMinimumSize(new java.awt.Dimension(244, 113));
        pn_Importacion.setPreferredSize(new java.awt.Dimension(244, 113));

        lbl_Codigo2.setText("Codigo: ");

        lbl_Nombre2.setText("Nombre: ");

        lbl_Peso2.setText("Peso: ");

        lbl_Fecha2.setText("Fecha: ");

        javax.swing.GroupLayout pn_ImportacionLayout = new javax.swing.GroupLayout(pn_Importacion);
        pn_Importacion.setLayout(pn_ImportacionLayout);
        pn_ImportacionLayout.setHorizontalGroup(
            pn_ImportacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_ImportacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_ImportacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Codigo2)
                    .addComponent(lbl_Nombre2)
                    .addComponent(lbl_Peso2)
                    .addComponent(lbl_Fecha2))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        pn_ImportacionLayout.setVerticalGroup(
            pn_ImportacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_ImportacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Codigo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Nombre2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Peso2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Fecha2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_MercanciaN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Fecha de Salida", "Fecha de Inspeccion", "Fecha de Revision", "Fecha de Importancion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_MercanciaN.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbl_MercanciaN);
        if (tbl_MercanciaN.getColumnModel().getColumnCount() > 0) {
            tbl_MercanciaN.getColumnModel().getColumn(0).setResizable(false);
            tbl_MercanciaN.getColumnModel().getColumn(1).setResizable(false);
            tbl_MercanciaN.getColumnModel().getColumn(2).setResizable(false);
            tbl_MercanciaN.getColumnModel().getColumn(3).setResizable(false);
            tbl_MercanciaN.getColumnModel().getColumn(4).setResizable(false);
            tbl_MercanciaN.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel5.setText("Mercancias nacionalizadas");

        tbl_Cola.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Cola.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tbl_Cola);
        if (tbl_Cola.getColumnModel().getColumnCount() > 0) {
            tbl_Cola.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel6.setText("Cola Inspeccion Fisica");

        jLabel7.setText("Cola Importacionç");

        tbl_Cola2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Cola2.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tbl_Cola2);
        if (tbl_Cola2.getColumnModel().getColumnCount() > 0) {
            tbl_Cola2.getColumnModel().getColumn(0).setResizable(false);
        }

        tbl_Cola1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Cola1.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tbl_Cola1);
        if (tbl_Cola1.getColumnModel().getColumnCount() > 0) {
            tbl_Cola1.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel8.setText("Cola Licenciada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(btn_Sacar)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_Inspeccion, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(pn_Fisica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(65, 65, 65)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel8)
                        .addGap(0, 99, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(pn_Licencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Revesion, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pn_Importacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_Impor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(457, 457, 457))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Inspeccion)
                            .addComponent(btn_Revesion)
                            .addComponent(btn_Impor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pn_Fisica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pn_Importacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pn_Licencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel6)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Sacar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SacarActionPerformed
        if (tbl_Mercancia.getRowCount() <= 0) {
            JOptionPane.showMessageDialog(null, "No hay mas elementos", "Error", 0);
        } else {
            MerCont.Sacar();
            Listar((DefaultTableModel) tbl_Mercancia.getModel(), MerCont.ReadMercancia());
            Listar((DefaultTableModel) tbl_Cola.getModel(), MerCont.ReadMercanciaCola(MerCont.getMercanciaInspeccion(), "EN PROCESO"));
            try {
                CambiarLabel(lbl_Codigo, lbl_Nombre, lbl_Peso, lbl_Fecha,
                        MerCont.getMercanciaInspeccion().element(), MerCont.getMercanciaInspeccion().element().getFechaSalida());
            } catch (Exception e) {
                CambiarLabel(lbl_Codigo, lbl_Nombre, lbl_Peso, lbl_Fecha, null, "");
            }
        }
    }//GEN-LAST:event_btn_SacarActionPerformed

    private void btn_ImporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ImporActionPerformed
        if (lbl_Codigo2.getText().contains("Codigo:")) {
            JOptionPane.showMessageDialog(null, "No hay mas elementos", "Error", 0);
        } else {
            MerCont.Importar();
            Listar((DefaultTableModel) tbl_Cola2.getModel(), MerCont.ReadMercanciaCola(MerCont.getMercanciaImpor(), "LICENCIA REVISADA"));
            Listar((DefaultTableModel) tbl_MercanciaN.getModel(), MerCont.ReadMercanciaImport());
            try {
                CambiarLabel(lbl_Codigo2, lbl_Nombre2, lbl_Peso2, lbl_Fecha2,
                        MerCont.getMercanciaImpor().element(), MerCont.getMercanciaImpor().element().getFechaRevision());
            } catch (Exception e) {
                CambiarLabel(lbl_Codigo2, lbl_Nombre2, lbl_Peso2, lbl_Fecha2, null, "");
            }
        }
    }//GEN-LAST:event_btn_ImporActionPerformed

    private void btn_RevesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RevesionActionPerformed
        if (lbl_Codigo1.getText().contains("Codigo:")) {
            JOptionPane.showMessageDialog(null, "No hay mas elementos", "Error", 0);
        } else {
            MerCont.Revisar();
            Listar((DefaultTableModel) tbl_Cola2.getModel(), MerCont.ReadMercanciaCola(MerCont.getMercanciaImpor(), "LICENCIA REVISADA"));
            Listar((DefaultTableModel) tbl_Cola1.getModel(), MerCont.ReadMercanciaCola(MerCont.getMercanciaRevision(), "REVISADO FISICAMENTE"));
            try {
                CambiarLabel(lbl_Codigo2, lbl_Nombre2, lbl_Peso2, lbl_Fecha2,
                        MerCont.getMercanciaImpor().element(), MerCont.getMercanciaImpor().element().getFechaRevision());
            } catch (Exception e) {
                CambiarLabel(lbl_Codigo2, lbl_Nombre2, lbl_Peso2, lbl_Fecha2, null, "");
            }
            try {
                CambiarLabel(lbl_Codigo1, lbl_Nombre1, lbl_Peso1, lbl_Fecha1,
                        MerCont.getMercanciaRevision().element(), MerCont.getMercanciaRevision().element().getFechaInspeccion());
            } catch (Exception e) {
                CambiarLabel(lbl_Codigo1, lbl_Nombre1, lbl_Peso1, lbl_Fecha1, null, "");
            }
        }
    }//GEN-LAST:event_btn_RevesionActionPerformed

    private void btn_InspeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InspeccionActionPerformed
        if (lbl_Codigo.getText().contains("Codigo:")) {
            JOptionPane.showMessageDialog(null, "No hay mas elementos", "Error", 0);
        } else {
            MerCont.Inspeccionar();
            Listar((DefaultTableModel) tbl_Cola1.getModel(), MerCont.ReadMercanciaCola(MerCont.getMercanciaRevision(), "REVISADO FISICAMENTE"));
            Listar((DefaultTableModel) tbl_Cola.getModel(), MerCont.ReadMercanciaCola(MerCont.getMercanciaInspeccion(), "EN PROCESO"));
            try {
                CambiarLabel(lbl_Codigo, lbl_Nombre, lbl_Peso, lbl_Fecha,
                        MerCont.getMercanciaInspeccion().element(), MerCont.getMercanciaInspeccion().element().getFechaSalida());
            } catch (Exception e) {
                CambiarLabel(lbl_Codigo, lbl_Nombre, lbl_Peso, lbl_Fecha, null, "");
            }
            try {
                CambiarLabel(lbl_Codigo1, lbl_Nombre1, lbl_Peso1, lbl_Fecha1,
                        MerCont.getMercanciaRevision().element(), MerCont.getMercanciaRevision().element().getFechaInspeccion());
            } catch (Exception e) {
                CambiarLabel(lbl_Codigo1, lbl_Nombre1, lbl_Peso1, lbl_Fecha1, null, "");
            }
        }
    }//GEN-LAST:event_btn_InspeccionActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Impor;
    private javax.swing.JButton btn_Inspeccion;
    private javax.swing.JButton btn_Revesion;
    private javax.swing.JButton btn_Sacar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbl_Codigo;
    private javax.swing.JLabel lbl_Codigo1;
    private javax.swing.JLabel lbl_Codigo2;
    private javax.swing.JLabel lbl_Fecha;
    private javax.swing.JLabel lbl_Fecha1;
    private javax.swing.JLabel lbl_Fecha2;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Nombre1;
    private javax.swing.JLabel lbl_Nombre2;
    private javax.swing.JLabel lbl_Peso;
    private javax.swing.JLabel lbl_Peso1;
    private javax.swing.JLabel lbl_Peso2;
    private javax.swing.JPanel pn_Fisica;
    private javax.swing.JPanel pn_Importacion;
    private javax.swing.JPanel pn_Licencia;
    private javax.swing.JTable tbl_Cola;
    private javax.swing.JTable tbl_Cola1;
    private javax.swing.JTable tbl_Cola2;
    private javax.swing.JTable tbl_Mercancia;
    private javax.swing.JTable tbl_MercanciaN;
    // End of variables declaration//GEN-END:variables
}
