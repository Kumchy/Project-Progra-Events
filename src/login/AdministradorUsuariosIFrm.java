package login;

import javax.swing.JOptionPane;
import login.login_logic.UsuarioLogic;

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
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Correo:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 30, -1, -1));

        jtfPassword.setBackground(new java.awt.Color(51, 51, 51));
        jtfPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfPassword.setBorder(null);
        jtfPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        jtfPassword.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(jtfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 250, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jtfCorreo.setBackground(new java.awt.Color(51, 51, 51));
        jtfCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jtfCorreo.setBorder(null);
        jtfCorreo.setCaretColor(new java.awt.Color(255, 255, 255));
        jtfCorreo.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(jtfCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 250, 25));

        jtfNombre.setBackground(new java.awt.Color(51, 51, 51));
        jtfNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfNombre.setBorder(null);
        jtfNombre.setCaretColor(new java.awt.Color(255, 255, 255));
        jtfNombre.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 250, 25));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rol:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jbEliminar.setBackground(new java.awt.Color(98, 57, 179));
        jbEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbEliminar.setText("Eliminiar");
        jbEliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(45, 45, 45)));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 100, 35));

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
        jPanel2.add(jbRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 100, 35));

        jtfEdad.setBackground(new java.awt.Color(51, 51, 51));
        jtfEdad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfEdad.setBorder(null);
        jtfEdad.setCaretColor(new java.awt.Color(255, 255, 255));
        jtfEdad.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(jtfEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 250, 25));

        jtfRol.setBackground(new java.awt.Color(51, 51, 51));
        jtfRol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfRol.setBorder(null);
        jtfRol.setCaretColor(new java.awt.Color(255, 255, 255));
        jtfRol.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(jtfRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 250, 25));

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
        jPanel2.add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 100, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if (!jtfNombre.getText().isEmpty()){

            if(UsuarioLogic.eliminar(jtfNombre.getText())){
                JOptionPane.showMessageDialog(this, "Usuario Eliminado");
            } else {
                JOptionPane.showMessageDialog(this, "Usuario no encontrado");
            }
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

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

    }//GEN-LAST:event_jbRegistrarActionPerformed

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
