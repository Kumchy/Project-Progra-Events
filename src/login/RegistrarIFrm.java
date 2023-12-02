package login;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistrarIFrm extends javax.swing.JInternalFrame {

    private ListaProductos listaProductos = new ListaProductos();
    private InventarioTotalIFrm inventarioTotal;
    
    public RegistrarIFrm() {
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
        jtfCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbRegresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jtfProveedor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfPrecio = new javax.swing.JTextField();
        jbEliminar = new javax.swing.JButton();
        jbRegistrar = new javax.swing.JButton();
        jtfNombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jrbSmart = new javax.swing.JRadioButton();
        jrbLaptop = new javax.swing.JRadioButton();
        jrbAccesorios = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registrar Producto");

        jPanel1.setBackground(new java.awt.Color(133, 77, 191));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar");

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(52, 17, 87));

        jLabel2.setBackground(new java.awt.Color(98, 57, 179));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo:");

        jtfCodigo.setBackground(new java.awt.Color(51, 51, 51));
        jtfCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfCodigo.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");

        jbRegresar.setBackground(new java.awt.Color(98, 57, 179));
        jbRegresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jbRegresar.setText("Regresar");
        jbRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegresarActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(98, 57, 179));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Proveedor:");

        jtfProveedor.setBackground(new java.awt.Color(51, 51, 51));
        jtfProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfProveedor.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setBackground(new java.awt.Color(98, 57, 179));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Precio:");

        jtfPrecio.setBackground(new java.awt.Color(51, 51, 51));
        jtfPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfPrecio.setForeground(new java.awt.Color(255, 255, 255));

        jbEliminar.setBackground(new java.awt.Color(98, 57, 179));
        jbEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbRegistrar.setBackground(new java.awt.Color(98, 57, 179));
        jbRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistrar.setText("Registrar");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jtfNombre.setBackground(new java.awt.Color(51, 51, 51));
        jtfNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setBackground(new java.awt.Color(98, 57, 179));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Categoría:");

        jrbSmart.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrbSmart.setForeground(new java.awt.Color(255, 255, 255));
        jrbSmart.setText("Smartphones");

        jrbLaptop.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrbLaptop.setForeground(new java.awt.Color(255, 255, 255));
        jrbLaptop.setText("Laptops");

        jrbAccesorios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrbAccesorios.setForeground(new java.awt.Color(255, 255, 255));
        jrbAccesorios.setText("Accesorios");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                                            .addComponent(jLabel11)))
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbSmart)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtfProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtfPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jrbLaptop)
                                    .addComponent(jrbAccesorios)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jrbSmart)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbLaptop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbAccesorios)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addGap(132, 132, 132)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(523, 523, 523))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setInventarioTotal(InventarioTotalIFrm inventarioTotal) {
        this.inventarioTotal = inventarioTotal;
    }
    
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        RegistrarIFrm registrarFrm = new RegistrarIFrm();
        EscritorioFrm Escritorio = new EscritorioFrm();
        Escritorio.setVisible(true);
        Escritorio.pack();
        Escritorio.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jbRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegresarActionPerformed
        EscritorioFrm escritorio = new EscritorioFrm();
        escritorio.setVisible(true);
        escritorio.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbRegresarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        String nombre = jtfNombre.getText();
        String proveedor = jtfProveedor.getText();
        int codigo = 0;
        double precio = 0;

        try {
            codigo = Integer.parseInt(jtfCodigo.getText());
            precio = Double.parseDouble(jtfPrecio.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un dato válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String categoria = "";
        if (jrbSmart.isSelected()) {
            categoria = "Smartphones";
        } else if (jrbLaptop.isSelected()) {
            categoria = "Laptops";
        } else if (jrbAccesorios.isSelected()) {
            categoria = "Accesorios";
        }

        ProductoElectrónico nuevoProducto = new ProductoElectrónico(nombre, proveedor, codigo, precio, categoria);

        // Agregar el producto a la lista de productos
        listaProductos.agregarProducto(nuevoProducto);

        // Actualizar la tabla en la interfaz InventarioTotalFrm
        if (inventarioTotal != null) {
            inventarioTotal.actualizarTabla();
        }

        listaProductos.agregarProducto(nuevoProducto);

        System.out.println("Producto registrado:");
        System.out.println("Nombre: " + nuevoProducto.getNombre());
        System.out.println("Proveedor: " + nuevoProducto.getProveedor());
        System.out.println("Código: " + nuevoProducto.getCodigo());
        System.out.println("Precio: " + nuevoProducto.getPrecio());
        System.out.println("Categoría: " + nuevoProducto.getCategoria());

        jtfNombre.setText("");
        jtfProveedor.setText("");
        jtfCodigo.setText("");
        jtfPrecio.setText("");

        JOptionPane.showMessageDialog(this, "Producto registrado exitosamente.", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jbRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JButton jbRegresar;
    private javax.swing.JRadioButton jrbAccesorios;
    private javax.swing.JRadioButton jrbLaptop;
    private javax.swing.JRadioButton jrbSmart;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPrecio;
    private javax.swing.JTextField jtfProveedor;
    // End of variables declaration//GEN-END:variables
}
