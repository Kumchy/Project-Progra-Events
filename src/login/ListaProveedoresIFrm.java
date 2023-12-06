package login;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ListaProveedoresIFrm extends javax.swing.JInternalFrame {
    
    private ListaEnlazadaProveedor listaProveedores;

    public ListaProveedoresIFrm(ListaEnlazadaProveedor listaProveedores) {
        initComponents();
        this.listaProveedores = listaProveedores;
        actualizarTabla();
    }
    
    public void actualizarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Contacto");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");
        modelo.addColumn("Productos suministrados");

        List<Proveedor> proveedores = listaProveedores.getProveedores();

        for (Proveedor proveedor : proveedores) {
            Object[] fila = {
                proveedor.getNombreProveedor(),
                proveedor.getContacto(),
                proveedor.getTelefono(),
                proveedor.getCorreoElectronico(),
                proveedor.getProductosSuministrados()
            };
            modelo.addRow(fila);
        }

        jTableProveedores.setModel(modelo);
    }
    
    public void mostrarProveedoresRegistrados(List<Proveedor> proveedores) {
        DefaultTableModel model = (DefaultTableModel) jTableProveedores.getModel();
        model.setRowCount(0);

        for (Proveedor proveedor : proveedores) {
            model.addRow(new Object[]{
                proveedor.getNombreProveedor(),
                proveedor.getContacto(),
                proveedor.getTelefono(),
                proveedor.getCorreoElectronico(),
                proveedor.getProductosSuministrados()
            });
        }
    }

        public void setListaProveedores(ListaEnlazadaProveedor listaProveedores) {
        this.listaProveedores = listaProveedores;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProveedores = new javax.swing.JTable();
        jbActualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Lista de Proveedores");

        jPanel3.setBackground(new java.awt.Color(52, 17, 87));

        jPanel4.setBackground(new java.awt.Color(133, 77, 191));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista Proveedores");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(183, 183, 183)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(183, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(jLabel1)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        jTableProveedores.setBackground(new java.awt.Color(255, 255, 255));
        jTableProveedores.setForeground(new java.awt.Color(0, 0, 0));
        jTableProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre:", "Contacto:", "Télefono:", "Correo electrónico:", "Tipo de producto:"
            }
        ));
        jScrollPane2.setViewportView(jTableProveedores);

        jbActualizar.setBackground(new java.awt.Color(98, 57, 179));
        jbActualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jbActualizar.setText("Actualizar");
        jbActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        actualizarTabla();
    }//GEN-LAST:event_jbActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableProveedores;
    private javax.swing.JButton jbActualizar;
    // End of variables declaration//GEN-END:variables
}
