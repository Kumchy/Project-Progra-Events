package login;

public class EscritorioFrm extends javax.swing.JFrame {
    private ListaEnlazadaProveedor listaProveedores;
     
    public EscritorioFrm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiCerrarSesion = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jmiStockPorCategoria = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jmiInventarioTotal = new javax.swing.JMenuItem();
        jmiListaProveedor = new javax.swing.JMenuItem();
        jmiAgregarProveedores = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel1.setBackground(new java.awt.Color(52, 17, 87));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(465, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(215, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(98, 57, 179));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu1.setText("Cuenta");

        jmiCerrarSesion.setText("Cerrar Sesion");
        jmiCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(jmiCerrarSesion);

        jMenuItem2.setText("Control De Usuarios");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jmiStockPorCategoria.setText("Gestion");

        jMenuItem3.setText("Stock por Categoria");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jmiStockPorCategoria.add(jMenuItem3);

        jmiInventarioTotal.setText("Inventario Total");
        jmiStockPorCategoria.add(jmiInventarioTotal);

        jmiListaProveedor.setText("Lista de Proveedores");
        jmiListaProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListaProveedorActionPerformed(evt);
            }
        });
        jmiStockPorCategoria.add(jmiListaProveedor);

        jmiAgregarProveedores.setText("Agregar Proveedores");
        jmiAgregarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgregarProveedoresActionPerformed(evt);
            }
        });
        jmiStockPorCategoria.add(jmiAgregarProveedores);

        jMenuItem7.setText("Crear Informe");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jmiStockPorCategoria.add(jMenuItem7);

        jMenuItem8.setText("Buscar Informes");
        jmiStockPorCategoria.add(jMenuItem8);

        jMenuBar1.add(jmiStockPorCategoria);

        jMenu3.setText("Productos");

        jMenuItem9.setText("Consultar");
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Registrar");
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Modificar");
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("Eliminar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCerrarSesionActionPerformed
        LoginFrame Login = new LoginFrame();
        Login.setVisible(true);
        Login.pack();
        Login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jmiCerrarSesionActionPerformed

    private void jmiAgregarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgregarProveedoresActionPerformed
        AgregarProveedorFrm agregarProveedor = new AgregarProveedorFrm();

        // Mostrar el formulario AgregarProveedorFrm
        agregarProveedor.setVisible(true);
        agregarProveedor.pack();
        agregarProveedor.setLocationRelativeTo(null);

        // Cerrar el formulario actual (EscritorioFrm)
        this.dispose();
    }//GEN-LAST:event_jmiAgregarProveedoresActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        AdministradorUsuariosFrm UserControl = new AdministradorUsuariosFrm();
        UserControl.setVisible(true);
        UserControl.pack();
        UserControl.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jmiListaProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListaProveedorActionPerformed
        ListaProveedoresFrm listaProveedoresForm = new ListaProveedoresFrm(listaProveedores);

        // Mostrar el formulario ListaProveedoresFrm
        listaProveedoresForm.setVisible(true);
        listaProveedoresForm.pack();
        listaProveedoresForm.setLocationRelativeTo(null);

        // Cerrar el formulario actual (EscritorioFrm)
        this.dispose();
    }//GEN-LAST:event_jmiListaProveedorActionPerformed


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
            java.util.logging.Logger.getLogger(EscritorioFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscritorioFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscritorioFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscritorioFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscritorioFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jmiAgregarProveedores;
    private javax.swing.JMenuItem jmiCerrarSesion;
    private javax.swing.JMenuItem jmiInventarioTotal;
    private javax.swing.JMenuItem jmiListaProveedor;
    private javax.swing.JMenu jmiStockPorCategoria;
    // End of variables declaration//GEN-END:variables
}
