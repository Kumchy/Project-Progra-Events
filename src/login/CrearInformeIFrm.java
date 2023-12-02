package login;

public class CrearInformeIFrm extends javax.swing.JInternalFrame {

    private PilaReportes pilaReportes = new PilaReportes();
    public CrearInformeIFrm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlbRegresar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbLimpiar = new javax.swing.JButton();
        jtfFecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtfInforme = new javax.swing.JTextArea();
        jbRegistrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Informe [crear]");

        jPanel1.setBackground(new java.awt.Color(133, 77, 191));

        jlbRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-volver-35.png"))); // NOI18N
        jlbRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbRegresarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear Informe");

        jPanel2.setBackground(new java.awt.Color(52, 17, 87));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbLimpiar.setBackground(new java.awt.Color(98, 57, 179));
        jbLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 130, 33));

        jtfFecha.setBackground(new java.awt.Color(51, 51, 51));
        jtfFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfFecha.setForeground(new java.awt.Color(255, 255, 255));
        jtfFecha.setBorder(null);
        jPanel2.add(jtfFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 16, 366, 26));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 16, -1, 26));

        jtfCodigo.setBackground(new java.awt.Color(51, 51, 51));
        jtfCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jtfCodigo.setBorder(null);
        jPanel2.add(jtfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 60, 366, 26));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Código:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 60, -1, 26));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Informe:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 104, -1, 26));

        jtfInforme.setBackground(new java.awt.Color(51, 51, 51));
        jtfInforme.setColumns(20);
        jtfInforme.setForeground(new java.awt.Color(255, 255, 255));
        jtfInforme.setRows(5);
        jtfInforme.setBorder(null);
        jScrollPane1.setViewportView(jtfInforme);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 114, 366, 227));

        jbRegistrar.setBackground(new java.awt.Color(98, 57, 179));
        jbRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistrar.setText("Registrar");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(jbRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 130, 33));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbRegresar)
                .addGap(163, 163, 163)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbRegresar)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlbRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbRegresarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jlbRegresarMouseClicked

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jtfFecha.setText("");
        jtfCodigo.setText("");
        jtfInforme.setText("");
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        String fecha = jtfFecha.getText();
        int codigo = Integer.parseInt(jtfCodigo.getText());
        String informe = jtfInforme.getText();

        NodoReportes nuevoReporte = new NodoReportes(fecha, codigo, informe);

        pilaReportes.push(fecha, codigo, informe);
        System.out.println("registro terminado");
        System.out.println(nuevoReporte.getFecha());
        System.out.println(nuevoReporte.getCodigo());
        System.out.println(nuevoReporte.getContenido());

        jtfFecha.setText("");
        jtfCodigo.setText("");
        jtfInforme.setText("");
    }//GEN-LAST:event_jbRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JLabel jlbRegresar;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfFecha;
    private javax.swing.JTextArea jtfInforme;
    // End of variables declaration//GEN-END:variables
}
