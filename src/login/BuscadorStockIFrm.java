package login;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BuscadorStockIFrm extends javax.swing.JInternalFrame {

    private List<CategoriaProductos> listaCategorias;
    
    public BuscadorStockIFrm() {
        initComponents();
        inicializarProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbLimpiar2 = new javax.swing.JButton();
        jbLimpiar3 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setIconifiable(true);
        setTitle("Buscar Stock por Categoria");

        jPanel1.setBackground(new java.awt.Color(52, 17, 87));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(133, 77, 191));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Stock por Categoría");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 40));

        jTextField2.setBackground(new java.awt.Color(51, 51, 51));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 62, 270, 25));

        jLabel2.setBackground(new java.awt.Color(52, 17, 87));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Categoría:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 62, -1, -1));

        jbLimpiar2.setBackground(new java.awt.Color(98, 57, 179));
        jbLimpiar2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbLimpiar2.setForeground(new java.awt.Color(255, 255, 255));
        jbLimpiar2.setText("Buscar");
        jbLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiar2ActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpiar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 100, 35));

        jbLimpiar3.setBackground(new java.awt.Color(98, 57, 179));
        jbLimpiar3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbLimpiar3.setForeground(new java.awt.Color(255, 255, 255));
        jbLimpiar3.setText("Limpiar");
        jbLimpiar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiar3ActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpiar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 100, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicializarProductos() {
        listaCategorias = new ArrayList<>();
        listaCategorias.add(new CategoriaProductos("Smartphones", "Alta", "Smartphones calidad precio.", 1, true));
        listaCategorias.add(new CategoriaProductos("Laptops", "Media", "Laptops de alta gama.", 2, true));
        listaCategorias.add(new CategoriaProductos("Accesorios", "Alta", "Accesorios de celular y computo.", 3, true));
    }
    
    private void jbLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLimpiar2ActionPerformed

    private void jbLimpiar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLimpiar3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbLimpiar2;
    private javax.swing.JButton jbLimpiar3;
    // End of variables declaration//GEN-END:variables
}
