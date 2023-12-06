package login;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.ImageIcon;

public class EscritorioFrm extends javax.swing.JFrame {

    private InventarioTotalIFrm inventarioTotal;
    private ListaProveedoresIFrm proveedores;
    private ListaProductos listaProductos = new ListaProductos();
    private ListaEnlazadaProveedor listaProveedores = new ListaEnlazadaProveedor();
    PilaReportes reportes;
    
    public EscritorioFrm() {
        initComponents();
        
        this.reportes = new PilaReportes();
        listaProductos = new ListaProductos();
        listaProveedores = new ListaEnlazadaProveedor();
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
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiStockPorCategoria = new javax.swing.JMenuItem();
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
        setMaximumSize(new java.awt.Dimension(899, 632));
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

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Cuenta");

        jmiCerrarSesion.setText("Cerrar Sesion");
        jmiCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(jmiCerrarSesion);

        jmiControlDeUsuarios.setText("Administrador de usuarios");
        jmiControlDeUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiControlDeUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(jmiControlDeUsuarios);

        jMenuItem1.setText("Control de Usuarios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Gestion");

        jmiStockPorCategoria.setText("Stock por Categoria");
        jmiStockPorCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiStockPorCategoriaActionPerformed(evt);
            }
        });
        jMenu2.add(jmiStockPorCategoria);

        jmiInventarioTotal.setText("Inventario Total");
        jmiInventarioTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInventarioTotalActionPerformed(evt);
            }
        });
        jMenu2.add(jmiInventarioTotal);

        jmiListaDeProveedores.setText("Lista de Proveedores");
        jmiListaDeProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListaDeProveedoresActionPerformed(evt);
            }
        });
        jMenu2.add(jmiListaDeProveedores);

        jmiAgregarProveedores.setText("Agregar Proveedores");
        jmiAgregarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgregarProveedoresActionPerformed(evt);
            }
        });
        jMenu2.add(jmiAgregarProveedores);

        jmiCrearInforme.setText("Crear Informe");
        jmiCrearInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCrearInformeActionPerformed(evt);
            }
        });
        jMenu2.add(jmiCrearInforme);

        jmiTablaInforme.setText("Tabla de Informe");
        jmiTablaInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTablaInformeActionPerformed(evt);
            }
        });
        jMenu2.add(jmiTablaInforme);

        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Productos");

        jmiConsultar.setText("Consultar");
        jmiConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarActionPerformed(evt);
            }
        });
        jMenu3.add(jmiConsultar);

        jmiRegistrar.setText("Registrar");
        jmiRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistrarActionPerformed(evt);
            }
        });
        jMenu3.add(jmiRegistrar);

        jmiModificar.setText("Modificar");
        jmiModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificarActionPerformed(evt);
            }
        });
        jMenu3.add(jmiModificar);

        jmiEliminar.setText("Eliminar");
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
    
    private void jmiCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCerrarSesionActionPerformed
        LoginFrame Login = new LoginFrame();
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
        InformesTablaIFrm mostrarInformes = new InformesTablaIFrm(reportes);
        jdpEscritorio.add(mostrarInformes);
        mostrarInformes.show();
    }//GEN-LAST:event_jmiBuscarInformesActionPerformed

    private void jmiConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarActionPerformed
        ConsultarIFrm consultar = new ConsultarIFrm();
        consultar.setListaProductos(listaProductos);
        jdpEscritorio.add(consultar);
        consultar.setVisible(true);
    }//GEN-LAST:event_jmiConsultarActionPerformed

    private void jmiModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarActionPerformed
        BuscarProductoModificacionIFrm modificar = new BuscarProductoModificacionIFrm();
        jdpEscritorio.add(modificar);
        modificar.show();
    }//GEN-LAST:event_jmiModificarActionPerformed

    private void jmiRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistrarActionPerformed
    RegistrarIFrm registrar = new RegistrarIFrm();
    registrar.setListaProductos(listaProductos);
    registrar.setInventarioTotal(inventarioTotal);
    registrar.setVisible(true);
    jdpEscritorio.add(registrar);
    }//GEN-LAST:event_jmiRegistrarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ControlUsuariosIFrm control = new ControlUsuariosIFrm();
        jdpEscritorio.add(control);
        control.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmiCrearInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCrearInformeActionPerformed
        CrearInformeIFrm crearInforme = new CrearInformeIFrm(reportes);
        jdpEscritorio.add(crearInforme);
        crearInforme.show();
    }//GEN-LAST:event_jmiCrearInformeActionPerformed

    private void jmiAgregarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgregarProveedoresActionPerformed
        AgregarProveedorIFrm agregarProveedor = new AgregarProveedorIFrm();
        agregarProveedor.setListaProveedores(listaProveedores);
        agregarProveedor.setVisible(true);
        jdpEscritorio.add(agregarProveedor);
    }//GEN-LAST:event_jmiAgregarProveedoresActionPerformed

    private void jmiListaDeProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListaDeProveedoresActionPerformed
        if (proveedores == null) {
            proveedores = new ListaProveedoresIFrm(listaProveedores);
        }
        proveedores.setListaProveedores(listaProveedores);
        proveedores.setVisible(true);
        jdpEscritorio.add(proveedores);
    }//GEN-LAST:event_jmiListaDeProveedoresActionPerformed

    private void jmiInventarioTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInventarioTotalActionPerformed
        if (inventarioTotal == null) {
            inventarioTotal = new InventarioTotalIFrm(listaProductos);
        }
        inventarioTotal.setListaProductos(listaProductos);
        inventarioTotal.setVisible(true);
        jdpEscritorio.add(inventarioTotal);
    }//GEN-LAST:event_jmiInventarioTotalActionPerformed

    private void jmiStockPorCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiStockPorCategoriaActionPerformed
        BuscadorStockIFrm stockCategorias = new BuscadorStockIFrm();
        jdpEscritorio.add(stockCategorias);
        stockCategorias.show();
    }//GEN-LAST:event_jmiStockPorCategoriaActionPerformed

    private void jmiTablaInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTablaInformeActionPerformed
        InformesTablaIFrm mostrarInformes = new InformesTablaIFrm(reportes);
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
    private javax.swing.JMenuItem jMenuItem1;
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
    private javax.swing.JMenuItem jmiStockPorCategoria;
    private javax.swing.JMenuItem jmiTablaInforme;
    // End of variables declaration//GEN-END:variables
}
