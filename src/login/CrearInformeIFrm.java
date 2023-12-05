package login;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

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
        jbnLimpiar = new javax.swing.JButton();
        jtfFecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtfInforme = new javax.swing.JTextArea();
        jbnRegistrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtfProducto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfProveedor = new javax.swing.JTextField();

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

        jbnLimpiar.setBackground(new java.awt.Color(98, 57, 179));
        jbnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jbnLimpiar.setText("Limpiar");
        jbnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnLimpiarActionPerformed(evt);
            }
        });

        jtfFecha.setBackground(new java.awt.Color(51, 51, 51));
        jtfFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfFecha.setForeground(new java.awt.Color(255, 255, 255));
        jtfFecha.setBorder(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha:");

        jtfCodigo.setBackground(new java.awt.Color(51, 51, 51));
        jtfCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jtfCodigo.setBorder(null);
        jtfCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCodigoKeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Código:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripcion:");

        jtfInforme.setBackground(new java.awt.Color(51, 51, 51));
        jtfInforme.setColumns(20);
        jtfInforme.setForeground(new java.awt.Color(255, 255, 255));
        jtfInforme.setRows(5);
        jtfInforme.setBorder(null);
        jScrollPane1.setViewportView(jtfInforme);

        jbnRegistrar.setBackground(new java.awt.Color(98, 57, 179));
        jbnRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbnRegistrar.setText("Registrar");
        jbnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnRegistrarActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Producto:");

        jtfProducto.setBackground(new java.awt.Color(51, 51, 51));
        jtfProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfProducto.setForeground(new java.awt.Color(255, 255, 255));
        jtfProducto.setBorder(null);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Proveedor:");

        jtfProveedor.setBackground(new java.awt.Color(51, 51, 51));
        jtfProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfProveedor.setForeground(new java.awt.Color(255, 255, 255));
        jtfProveedor.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(jbnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(53, 53, 53)
                        .addComponent(jtfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44)
                        .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbRegresar)
                .addGap(132, 132, 132)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbRegresar)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnRegistrarActionPerformed
        String fecha = jtfFecha.getText();
        int codigo = Integer.parseInt(jtfCodigo.getText());
        String producto = jtfProducto.getText();
        String proveedor = jtfProveedor.getText();
        String descripcion = jtfInforme.getText();

        NodoReportes nuevoReporte = new NodoReportes(fecha, codigo, producto, proveedor, descripcion);

        pilaReportes.push(fecha, codigo, producto, proveedor, descripcion);
        System.out.println("registro terminado");
        System.out.println(nuevoReporte.getFecha());
        System.out.println(nuevoReporte.getCodigo());
        System.out.println(nuevoReporte.getProducto());
        System.out.println(nuevoReporte.getProveedor());
        System.out.println(nuevoReporte.getDescripcion());

        jtfFecha.setText("");
        jtfCodigo.setText("");
        jtfProducto.setText("");
        jtfProveedor.setText("");
        jtfInforme.setText("");
    }//GEN-LAST:event_jbnRegistrarActionPerformed

    private void jbnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnLimpiarActionPerformed
        jtfFecha.setText("");
        jtfCodigo.setText("");
        jtfProducto.setText("");
        jtfProveedor.setText("");
        jtfInforme.setText("");
    }//GEN-LAST:event_jbnLimpiarActionPerformed

    private void jlbRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbRegresarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jlbRegresarMouseClicked

    private void jtfCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoKeyTyped
    char caracter = evt.getKeyChar();   //obtener el caracter presionando
    
        //validar que permita solo numeros
        if(!Character.isDigit(caracter)){
            getToolkit().beep();    //emite un sonido de alerta
            evt.consume();  //evita que el caracter se muestre
            JOptionPane.showMessageDialog(this, "Solo ingresar numeros");
        }//if
    }//GEN-LAST:event_jtfCodigoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbnLimpiar;
    private javax.swing.JButton jbnRegistrar;
    private javax.swing.JLabel jlbRegresar;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfFecha;
    private javax.swing.JTextArea jtfInforme;
    private javax.swing.JTextField jtfProducto;
    private javax.swing.JTextField jtfProveedor;
    // End of variables declaration//GEN-END:variables
}
