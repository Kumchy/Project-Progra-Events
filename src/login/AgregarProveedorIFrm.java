package login;

public class AgregarProveedorIFrm extends javax.swing.JInternalFrame {

    private ListaEnlazadaProveedor listaProveedores;
    
    public AgregarProveedorIFrm() {
        initComponents();
        listaProveedores = new ListaEnlazadaProveedor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcbContacto = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jtfTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfCorreoElectronico = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        c = new javax.swing.JRadioButton();
        jrbOpcion2 = new javax.swing.JRadioButton();
        jrbOpcion3 = new javax.swing.JRadioButton();
        jbLimpiar = new javax.swing.JButton();
        jbRegistrar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setClosable(true);
        setIconifiable(true);
        setTitle("Agregar Proveedor");

        jPanel1.setBackground(new java.awt.Color(133, 77, 191));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Proveedor");

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addGap(67, 67, 67)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(52, 17, 87));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(98, 57, 179));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jtfNombre.setBackground(new java.awt.Color(51, 51, 51));
        jtfNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(255, 255, 255));
        jtfNombre.setBorder(null);
        jPanel2.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 250, 25));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contacto:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jcbContacto.setBackground(new java.awt.Color(51, 51, 51));
        jcbContacto.setForeground(new java.awt.Color(255, 255, 255));
        jcbContacto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Persona Moral", "Persona física" }));
        jcbContacto.setBorder(null);
        jPanel2.add(jcbContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 250, 28));

        jLabel8.setBackground(new java.awt.Color(98, 57, 179));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Teléfono:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jtfTelefono.setBackground(new java.awt.Color(51, 51, 51));
        jtfTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jtfTelefono.setBorder(null);
        jPanel2.add(jtfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 250, 25));

        jLabel9.setBackground(new java.awt.Color(98, 57, 179));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Correo electrónico:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jtfCorreoElectronico.setBackground(new java.awt.Color(51, 51, 51));
        jtfCorreoElectronico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfCorreoElectronico.setForeground(new java.awt.Color(255, 255, 255));
        jtfCorreoElectronico.setBorder(null);
        jPanel2.add(jtfCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 250, 25));

        jLabel10.setBackground(new java.awt.Color(98, 57, 179));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tipo de producto:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        c.setForeground(new java.awt.Color(255, 255, 255));
        c.setText("Smartphones");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        jPanel2.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        jrbOpcion2.setForeground(new java.awt.Color(255, 255, 255));
        jrbOpcion2.setText("Laptops");
        jPanel2.add(jrbOpcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        jrbOpcion3.setForeground(new java.awt.Color(255, 255, 255));
        jrbOpcion3.setText("Accesorios");
        jPanel2.add(jrbOpcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        jbLimpiar.setBackground(new java.awt.Color(98, 57, 179));
        jbLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 100, 35));

        jbRegistrar.setBackground(new java.awt.Color(98, 57, 179));
        jbRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistrar.setText("Registrar");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(jbRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 100, 35));

        jbCancelar.setBackground(new java.awt.Color(98, 57, 179));
        jbCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 100, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        EscritorioFrm Escritorio = new EscritorioFrm();
        Escritorio.setVisible(true);
        Escritorio.pack();
        Escritorio.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private String obtenerProductosSeleccionados() {
        if (c.isSelected()) {
            return "Smartphones";
        } else if (jrbOpcion2.isSelected()) {
            return "Laptops";
        } else if (jrbOpcion3.isSelected()) {
            return "Accesorios";
        } else {
            return ""; // Manejar el caso en que no se haya seleccionado nada
        }
    }
    
    private void limpiarCampos() {
        jtfNombre.setText("");
        jtfTelefono.setText("");
        jtfCorreoElectronico.setText("");
        jcbContacto.setSelectedIndex(0); // Puedes ajustar esto según tus necesidades
        c.setSelected(false);
        jrbOpcion2.setSelected(false);
        jrbOpcion3.setSelected(false);
    }
    
    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        String nombreProveedor = jtfNombre.getText();
        String contacto = jcbContacto.getSelectedItem().toString();
        int telefono = Integer.parseInt(jtfTelefono.getText());
        String correoElectronico = jtfCorreoElectronico.getText();
        String productosSuministrados = obtenerProductosSeleccionados();

        // Crear un nuevo proveedor
        Proveedor nuevoProveedor = new Proveedor(nombreProveedor, contacto, telefono, correoElectronico, productosSuministrados);

        // Agregar el proveedor a la lista enlazada
        listaProveedores.agregarProveedor(nuevoProveedor);

        // Limpiar los campos después de registrar
        limpiarCampos();
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton c;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JComboBox<String> jcbContacto;
    private javax.swing.JRadioButton jrbOpcion2;
    private javax.swing.JRadioButton jrbOpcion3;
    private javax.swing.JTextField jtfCorreoElectronico;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables
}
