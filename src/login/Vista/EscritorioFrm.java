package login.Vista;
import login.Modelo.ListaProveedor;
import login.Modelo.PilaReportes;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.HashMap;
import javax.swing.JInternalFrame;

public class EscritorioFrm extends javax.swing.JFrame {

    private TablaInventarioTotalIFrm inventarioTotal;
    private TablaProveedoresIFrm proveedores;
    private ModeloListaProducto listaProductos = new ModeloListaProducto();
    private ListaProveedor listaProveedores = new ListaProveedor();
    private HashMap<String, JInternalFrame> ventanasInternas;
    PilaReportes reportes;
    
    public EscritorioFrm() {
        initComponents();        
        this.reportes = new PilaReportes();
        listaProductos = new ModeloListaProducto();
        listaProveedores = new ListaProveedor();
        ventanasInternas = new HashMap<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpEscritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiCerrarSesion = new javax.swing.JMenuItem();
        jmiControlDeUsuarios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiInventarioTotal = new javax.swing.JMenuItem();
        jmiListaDeProveedores = new javax.swing.JMenuItem();
        jmiAgregarProveedores = new javax.swing.JMenuItem();
        jmiCrearInforme = new javax.swing.JMenuItem();
        jmiTablaInforme = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiConsultar = new javax.swing.JMenuItem();
        jmiRegistrar = new javax.swing.JMenuItem();
        jmiModificar = new javax.swing.JMenuItem();
        jmiEliminar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(899, 632));
        setResizable(false);

        jdpEscritorio.setBackground(new java.awt.Color(52, 17, 87));
        jdpEscritorio.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoProyecto.png"))); // NOI18N

        jdpEscritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpEscritorioLayout = new javax.swing.GroupLayout(jdpEscritorio);
        jdpEscritorio.setLayout(jdpEscritorioLayout);
        jdpEscritorioLayout.setHorizontalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdpEscritorioLayout.setVerticalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpEscritorioLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(133, 77, 191));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu1.setBackground(new java.awt.Color(220, 191, 255));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-usuario-masculino-en-círculo-20.png"))); // NOI18N
        jMenu1.setText("Cuenta");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jmiCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        jmiCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-eliminar-de-la-nube-20 (1).png"))); // NOI18N
        jmiCerrarSesion.setText("Cerrar Sesion");
        jmiCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(jmiCerrarSesion);

        jmiControlDeUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jmiControlDeUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-usuario-20.png"))); // NOI18N
        jmiControlDeUsuarios.setText("Administrador de usuarios");
        jmiControlDeUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiControlDeUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiControlDeUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(jmiControlDeUsuarios);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-administración-20 (1).png"))); // NOI18N
        jMenu2.setText("Gestion");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jmiInventarioTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-informe-gráfico-20.png"))); // NOI18N
        jmiInventarioTotal.setText("Inventario Total");
        jmiInventarioTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiInventarioTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInventarioTotalActionPerformed(evt);
            }
        });
        jMenu2.add(jmiInventarioTotal);

        jmiListaDeProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-en-inventario-20 (1).png"))); // NOI18N
        jmiListaDeProveedores.setText("Lista de Proveedores");
        jmiListaDeProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiListaDeProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListaDeProveedoresActionPerformed(evt);
            }
        });
        jMenu2.add(jmiListaDeProveedores);

        jmiAgregarProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-usuario-20.png"))); // NOI18N
        jmiAgregarProveedores.setText("Agregar Proveedores");
        jmiAgregarProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiAgregarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgregarProveedoresActionPerformed(evt);
            }
        });
        jMenu2.add(jmiAgregarProveedores);

        jmiCrearInforme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-salida-20.png"))); // NOI18N
        jmiCrearInforme.setText("Crear Informe");
        jmiCrearInforme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiCrearInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCrearInformeActionPerformed(evt);
            }
        });
        jMenu2.add(jmiCrearInforme);

        jmiTablaInforme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-panel-de-control-20.png"))); // NOI18N
        jmiTablaInforme.setText("Tabla de Informe");
        jmiTablaInforme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiTablaInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTablaInformeActionPerformed(evt);
            }
        });
        jMenu2.add(jmiTablaInforme);

        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-producto-20 (1).png"))); // NOI18N
        jMenu3.setText("Productos");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jmiConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-en-inventario-20 (1).png"))); // NOI18N
        jmiConsultar.setText("Consultar");
        jmiConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarActionPerformed(evt);
            }
        });
        jMenu3.add(jmiConsultar);

        jmiRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-panel-de-control-20.png"))); // NOI18N
        jmiRegistrar.setText("Registrar");
        jmiRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistrarActionPerformed(evt);
            }
        });
        jMenu3.add(jmiRegistrar);

        jmiModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-editar-archivo-20.png"))); // NOI18N
        jmiModificar.setText("Modificar");
        jmiModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificarActionPerformed(evt);
            }
        });
        jMenu3.add(jmiModificar);

        jmiEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        jmiEliminar.setText("Eliminar");
        jmiEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmiEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEliminarActionPerformed(evt);
            }
        });
        jMenu3.add(jmiEliminar);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Image getIconImage(){
        Image valorRetorno = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/TechpsilonLogo.png"));
        return valorRetorno;
    }
    
    private void mostrarVentanaInterna(String identificador, JInternalFrame ventana) {
    if (ventanasInternas.containsKey(identificador)) {
        JInternalFrame ventanaExistente = ventanasInternas.get(identificador);
        if (!ventanaExistente.isVisible()) {
            ventanaExistente.setVisible(true);
            if (!jdpEscritorio.isAncestorOf(ventanaExistente)) {
                jdpEscritorio.add(ventanaExistente);
            }
        }
        ventanaExistente.moveToFront();
    } else {
        ventanasInternas.put(identificador, ventana);
        ventana.setVisible(true);
        jdpEscritorio.add(ventana);
    }
    ventana.moveToFront();
    }
    
    private void jmiCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCerrarSesionActionPerformed
        LoginFrm Login = new LoginFrm();
        Login.setVisible(true);
        Login.pack();
        Login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jmiCerrarSesionActionPerformed

    private void jmiControlDeUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiControlDeUsuariosActionPerformed
        AdministradorUsuariosIFrm administrarUsuarios = new AdministradorUsuariosIFrm();
        jdpEscritorio.add(administrarUsuarios);
        administrarUsuarios.show();
    }//GEN-LAST:event_jmiControlDeUsuariosActionPerformed

    private void jmiEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarActionPerformed
        BuscarProductoEliminarIFrm eliminar = new BuscarProductoEliminarIFrm(listaProductos);
        jdpEscritorio.add(eliminar);
        eliminar.show();
    }//GEN-LAST:event_jmiEliminarActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jmiBuscarInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBuscarInformesActionPerformed
        TablaInformesTablaIFrm mostrarInformes = new TablaInformesTablaIFrm(reportes);
        jdpEscritorio.add(mostrarInformes);
        mostrarInformes.show();
    }//GEN-LAST:event_jmiBuscarInformesActionPerformed

    private void jmiConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarActionPerformed
        BuscarProductoConsultarIFrm consultar = new BuscarProductoConsultarIFrm();
        consultar.setListaProductos(listaProductos);
        jdpEscritorio.add(consultar);
        consultar.setVisible(true);
    }//GEN-LAST:event_jmiConsultarActionPerformed

    private void jmiModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarActionPerformed
        BuscarProductoModificacionIFrm modificar = new BuscarProductoModificacionIFrm(listaProductos);
        jdpEscritorio.add(modificar);
        modificar.show();
    }//GEN-LAST:event_jmiModificarActionPerformed

    private void jmiRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistrarActionPerformed
    RegistrarProductoIFrm registrar = new RegistrarProductoIFrm();
    registrar.setListaProductos(listaProductos);
    registrar.setInventarioTotal(inventarioTotal);
    registrar.setVisible(true);
    mostrarVentanaInterna("RegistrarProducto", registrar);
    }//GEN-LAST:event_jmiRegistrarActionPerformed

    private void jmiCrearInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCrearInformeActionPerformed
        RegistrarInformeIFrm crearInforme = new RegistrarInformeIFrm(reportes);
        jdpEscritorio.add(crearInforme);
        crearInforme.show();
    }//GEN-LAST:event_jmiCrearInformeActionPerformed

    private void jmiAgregarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgregarProveedoresActionPerformed
    RegistrarProveedorIFrm agregarProveedor = new RegistrarProveedorIFrm();
    agregarProveedor.setListaProveedores(listaProveedores);
    agregarProveedor.setVisible(true);
    mostrarVentanaInterna("AgregarProveedores", agregarProveedor);
    }//GEN-LAST:event_jmiAgregarProveedoresActionPerformed

    private void jmiListaDeProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListaDeProveedoresActionPerformed
        if (proveedores == null) {
            proveedores = new TablaProveedoresIFrm(listaProveedores);
        }
        proveedores.setListaProveedores(listaProveedores);
        mostrarVentanaInterna("ListaProveedores", proveedores);
    }//GEN-LAST:event_jmiListaDeProveedoresActionPerformed

    private void jmiInventarioTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInventarioTotalActionPerformed
        if (inventarioTotal == null) {
            inventarioTotal = new TablaInventarioTotalIFrm(listaProductos);
        }
        inventarioTotal.setListaProductos(listaProductos);
        mostrarVentanaInterna("InventarioTotal", inventarioTotal);
    }//GEN-LAST:event_jmiInventarioTotalActionPerformed

    private void jmiTablaInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTablaInformeActionPerformed
        TablaInformesTablaIFrm mostrarInformes = new TablaInformesTablaIFrm(reportes);
        jdpEscritorio.add(mostrarInformes);
        mostrarInformes.show();
    }//GEN-LAST:event_jmiTablaInformeActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EscritorioFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscritorioFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscritorioFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscritorioFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscritorioFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JDesktopPane jdpEscritorio;
    private javax.swing.JMenuItem jmiAgregarProveedores;
    private javax.swing.JMenuItem jmiCerrarSesion;
    private javax.swing.JMenuItem jmiConsultar;
    private javax.swing.JMenuItem jmiControlDeUsuarios;
    private javax.swing.JMenuItem jmiCrearInforme;
    private javax.swing.JMenuItem jmiEliminar;
    private javax.swing.JMenuItem jmiInventarioTotal;
    private javax.swing.JMenuItem jmiListaDeProveedores;
    private javax.swing.JMenuItem jmiModificar;
    private javax.swing.JMenuItem jmiRegistrar;
    private javax.swing.JMenuItem jmiTablaInforme;
    // End of variables declaration//GEN-END:variables
}
