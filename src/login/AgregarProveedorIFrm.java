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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcbContacto = new javax.swing.JComboBox<>();
        jbnRegistrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jtfTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfCorreoElectronico = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        c = new javax.swing.JRadioButton();
        jrbOpcion2 = new javax.swing.JRadioButton();
        jrbOpcion3 = new javax.swing.JRadioButton();
        jbnLimpiar = new javax.swing.JButton();
        jbnCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Agregar Proveedor");

        jPanel1.setBackground(new java.awt.Color(52, 17, 87));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(133, 77, 191));

        jLabel2.setBackground(new java.awt.Color(98, 57, 179));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");

        jtfNombre.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Contacto:");

        jcbContacto.setBackground(new java.awt.Color(255, 255, 255));
        jcbContacto.setForeground(new java.awt.Color(0, 0, 0));
        jcbContacto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Persona Moral", "Persona física" }));

        jbnRegistrar.setBackground(new java.awt.Color(98, 57, 179));
        jbnRegistrar.setText("Registrar");
        jbnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnRegistrarActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(98, 57, 179));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Teléfono:");

        jtfTelefono.setBackground(new java.awt.Color(255, 255, 255));
        jtfTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfTelefono.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setBackground(new java.awt.Color(98, 57, 179));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Correo electrónico:");

        jtfCorreoElectronico.setBackground(new java.awt.Color(255, 255, 255));
        jtfCorreoElectronico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfCorreoElectronico.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setBackground(new java.awt.Color(98, 57, 179));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Tipo de producto:");

        c.setForeground(new java.awt.Color(255, 255, 255));
        c.setText("Smartphones");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        jrbOpcion2.setForeground(new java.awt.Color(255, 255, 255));
        jrbOpcion2.setText("Laptops");

        jrbOpcion3.setForeground(new java.awt.Color(255, 255, 255));
        jrbOpcion3.setText("Accesorios");

        jbnLimpiar.setBackground(new java.awt.Color(98, 57, 179));
        jbnLimpiar.setText("Limpiar");
        jbnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnLimpiarActionPerformed(evt);
            }
        });

        jbnCancelar.setBackground(new java.awt.Color(98, 57, 179));
        jbnCancelar.setText("Cancelar");
        jbnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbOpcion2)
                                    .addComponent(c)
                                    .addComponent(jrbOpcion3)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(56, 56, 56)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbContacto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfCorreoElectronico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jbnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(c)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbOpcion2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbOpcion3)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jbnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnRegistrarActionPerformed
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
    }//GEN-LAST:event_jbnRegistrarActionPerformed

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

    private void jbnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbnLimpiarActionPerformed

    private void jbnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbnCancelarActionPerformed


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
    private javax.swing.JButton jbnCancelar;
    private javax.swing.JButton jbnLimpiar;
    private javax.swing.JButton jbnRegistrar;
    private javax.swing.JComboBox<String> jcbContacto;
    private javax.swing.JRadioButton jrbOpcion2;
    private javax.swing.JRadioButton jrbOpcion3;
    private javax.swing.JTextField jtfCorreoElectronico;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables
}
