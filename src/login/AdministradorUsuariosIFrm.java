package login;

import javax.swing.JOptionPane;

public class AdministradorUsuariosIFrm extends javax.swing.JInternalFrame {

    public AdministradorUsuariosIFrm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfCorreo = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbEliminar = new javax.swing.JButton();
        jbRegistrar = new javax.swing.JButton();
        jtfEdad = new javax.swing.JTextField();
        jtfRol = new javax.swing.JTextField();
        jbModificar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(52, 17, 87));
        setClosable(true);
        setIconifiable(true);
        setTitle("Administrador de Usuarios");

        jPanel1.setBackground(new java.awt.Color(133, 77, 191));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrador de usuarios");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(52, 17, 87));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Correo:");

        jtfPassword.setBackground(new java.awt.Color(255, 255, 255));
        jtfPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfPassword.setForeground(new java.awt.Color(0, 0, 0));
        jtfPassword.setBorder(null);
        jtfPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        jtfPassword.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario:");

        jtfCorreo.setBackground(new java.awt.Color(255, 255, 255));
        jtfCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfCorreo.setForeground(new java.awt.Color(0, 0, 0));
        jtfCorreo.setBorder(null);
        jtfCorreo.setCaretColor(new java.awt.Color(255, 255, 255));
        jtfCorreo.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jtfNombre.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(0, 0, 0));
        jtfNombre.setBorder(null);
        jtfNombre.setCaretColor(new java.awt.Color(255, 255, 255));
        jtfNombre.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rol:");

        jbEliminar.setBackground(new java.awt.Color(98, 57, 179));
        jbEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbEliminar.setText("Eliminar");
        jbEliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(45, 45, 45)));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbRegistrar.setBackground(new java.awt.Color(98, 57, 179));
        jbRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistrar.setText("Registrar");
        jbRegistrar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(45, 45, 45)));
        jbRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jtfEdad.setBackground(new java.awt.Color(255, 255, 255));
        jtfEdad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfEdad.setForeground(new java.awt.Color(0, 0, 0));
        jtfEdad.setBorder(null);
        jtfEdad.setCaretColor(new java.awt.Color(255, 255, 255));
        jtfEdad.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jtfRol.setBackground(new java.awt.Color(255, 255, 255));
        jtfRol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfRol.setForeground(new java.awt.Color(0, 0, 0));
        jtfRol.setBorder(null);
        jtfRol.setCaretColor(new java.awt.Color(255, 255, 255));
        jtfRol.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jbModificar.setBackground(new java.awt.Color(98, 57, 179));
        jbModificar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(255, 255, 255));
        jbModificar.setText("Modificar");
        jbModificar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(45, 45, 45)));
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbBuscar.setBackground(new java.awt.Color(98, 57, 179));
        jbBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscar.setText("Buscar");
        jbBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(45, 45, 45)));
        jbBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addGap(47, 47, 47)
                        .addComponent(jtfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(68, 68, 68)
                                .addComponent(jtfRol, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(40, 40, 40)
                                .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(17, 17, 17)
                                .addComponent(jtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(57, 57, 57)
                                .addComponent(jtfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(10, 18, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jtfRol, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        if (!jtfNombre.getText().isEmpty()&&
            !jtfPassword.getText().isEmpty()&&
            !jtfCorreo.getText().isEmpty()&&
            !jtfEdad.getText().isEmpty()&&
            !jtfRol.getText().isEmpty()){

            Usuario usuario = new Usuario(jtfNombre.getText(),
                jtfPassword.getText(), jtfCorreo.getText(), jtfEdad.getText(), jtfRol.getText());
            if(UsuarioLogic.modificar(usuario)){
                JOptionPane.showMessageDialog(this, "Usuario modificado");
            } else {
                JOptionPane.showMessageDialog(this, "Usuario no encontrado");
            }
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        if (!jtfNombre.getText().isEmpty()&&
            !jtfPassword.getText().isEmpty()&&
            !jtfCorreo.getText().isEmpty()&&
            !jtfEdad.getText().isEmpty()&&
            !jtfRol.getText().isEmpty()){

            Usuario usuario = new Usuario(jtfNombre.getText(),
                jtfPassword.getText(), jtfCorreo.getText(), jtfEdad.getText(), jtfRol.getText());
            if(UsuarioLogic.insertar(usuario)){
                JOptionPane.showMessageDialog(this, "Usuario registrado");
            } else {
                JOptionPane.showMessageDialog(this, "Usuario ya existente");
            }
        }
        
        jtfNombre.setText("");
        jtfPassword.setText("");
        jtfCorreo.setText("");
        jtfEdad.setText(""); 
        jtfRol.setText(""); 

    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if (!jtfNombre.getText().isEmpty()){

            if(UsuarioLogic.eliminar(jtfNombre.getText())){
                JOptionPane.showMessageDialog(this, "Usuario Eliminado");
            } else {
                JOptionPane.showMessageDialog(this, "Usuario no encontrado");
            }
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
    if (!jtfNombre.getText().isEmpty()){
         Usuario usuario = UsuarioLogic.buscar(jtfNombre.getText());
        if (usuario != null) {
            jtfCorreo.setText(usuario.getCorreo());
            jtfPassword.setText(usuario.getPassword());
            jtfEdad.setText(usuario.getEdad());
            jtfRol.setText(usuario.getRol());
        } else {
            JOptionPane.showMessageDialog(this, "Usuario no encontrado");
            }
        }
    }//GEN-LAST:event_jbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JTextField jtfCorreo;
    private javax.swing.JTextField jtfEdad;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPassword;
    private javax.swing.JTextField jtfRol;
    // End of variables declaration//GEN-END:variables
}
