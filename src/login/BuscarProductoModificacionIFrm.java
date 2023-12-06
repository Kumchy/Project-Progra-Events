package login;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;
public class BuscarProductoModificacionIFrm extends javax.swing.JInternalFrame {
    private ListaProductos listaProductos;
    
    public BuscarProductoModificacionIFrm(ListaProductos listaProductos) {
        initComponents();
        this.listaProductos = listaProductos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbLimpiar = new javax.swing.JButton();
        jbBuscar1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Buscar Producto a  Modificar");

        jPanel1.setBackground(new java.awt.Color(52, 17, 87));

        jPanel2.setBackground(new java.awt.Color(133, 77, 191));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar para Modificación");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtfCodigo.setBackground(new java.awt.Color(51, 51, 51));
        jtfCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jtfCodigo.setBorder(null);

        jLabel2.setBackground(new java.awt.Color(98, 57, 179));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código:");

        jbLimpiar.setBackground(new java.awt.Color(98, 57, 179));
        jbLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbBuscar1.setBackground(new java.awt.Color(98, 57, 179));
        jbBuscar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscar1.setText("Buscar");
        jbBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jbBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2))
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
    jtfCodigo.setText("");
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscar1ActionPerformed
        int codigo = Integer.parseInt(jtfCodigo.getText());
        ProductoElectrónico productoEncontrado = listaProductos.buscarProductoPorCodigo(codigo);

        if (productoEncontrado != null) {
            mostrarDatosProducto(productoEncontrado);
        } else {
            JOptionPane.showMessageDialog(null, "Producto no encontrado. Intente con otro código.");
        }
    }

    private void mostrarDatosProducto(ProductoElectrónico producto) {
        String mensaje = "Código: " + producto.getCodigo() + "\n" +
                         "Nombre: " + producto.getNombre() + "\n" +
                         "Proveedor: " + producto.getProveedor() + "\n" +
                         "Precio: " + producto.getPrecio() + "\n" +
                         "Categoría: " + producto.getCategoria();

        int opcion = JOptionPane.showConfirmDialog(null, mensaje, "Datos del Producto", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if (opcion == JOptionPane.OK_OPTION) {
            abrirModificarIFrm(producto);
        }
    }

    private void abrirModificarIFrm(ProductoElectrónico producto) {
    ModificarIFrm modificarIFrm = new ModificarIFrm(producto);
    
    JDesktopPane escritorio = this.getDesktopPane();
    escritorio.add(modificarIFrm);
    modificarIFrm.setVisible(true);
    }//GEN-LAST:event_jbBuscar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbBuscar1;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JTextField jtfCodigo;
    // End of variables declaration//GEN-END:variables
}
