package formularios;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class principal extends javax.swing.JFrame {
    public principal() {
        initComponents();
    }
    
    private void Crear_botonera_mant_usuarios() {
        JScrollPane jsp_botonera = new JScrollPane();
        JPanel jp_botonera = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.VERTICAL;
        
        jsp_botonera.setBounds(0, 0, 100, 508);
        jsp_botonera.setViewportView(jp_botonera);
        jsp_botonera.getViewport().setView(jp_botonera);
        jp_general.add(jsp_botonera);
        jp_general.updateUI();
        
        c.gridwidth = 1;
        c.weightx = 1;
        c.weighty = 1;
        
        JButton btn_nuevo = new JButton(new ImageIcon(
            getClass().getResource("/iconos/nuevo.png")
        ));
        c.gridx = 0;
        c.gridy = 0;
        jp_botonera.add(btn_nuevo, c);
        
        JButton btn_modificar = new JButton(new ImageIcon(
            getClass().getResource("/iconos/modificar.png")
        ));
        c.gridy = 1;
        jp_botonera.add(btn_modificar, c);
        
        JButton btn_eliminar = new JButton(new ImageIcon(
            getClass().getResource("/iconos/eliminar.png")
        ));
        c.gridy = 2;
        jp_botonera.add(btn_eliminar, c);
        
        JButton btn_aceptar = new JButton(new ImageIcon(
            getClass().getResource("/iconos/aceptar.png")
        ));
        c.gridy = 3;
        jp_botonera.add(btn_aceptar, c);
        
        JButton btn_cancelar = new JButton(new ImageIcon(
            getClass().getResource("/iconos/cancelar.png")
        ));
        c.gridy = 4;
        jp_botonera.add(btn_cancelar, c);
      
        jp_botonera.updateUI();
    }
  
    private void crear_formulario_mant_usuarios() {
        JScrollPane jsp_formulario = new JScrollPane();
        JPanel jp_formulario = new JPanel(new GridBagLayout());
        jp_formulario.setBorder(new EmptyBorder(1, 10, 1, 10));
        GridBagConstraints c = new GridBagConstraints();
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.weighty = 1;
        c.gridwidth = 1;
        
        jsp_formulario.setBounds(101, 0, 655, 508);
        jsp_formulario.setViewportView(jp_formulario);
        jsp_formulario.getViewport().setView(jp_formulario);
        jp_general.add(jsp_formulario);
        jp_general.updateUI();
        
        JLabel lbl_usuario = new JLabel("Usuario");
        c.gridx = 0;
        c.gridy = 0;
        jp_formulario.add(lbl_usuario, c);
        
        JTextField txt_usuario = new JTextField(30);
        c.gridx = 1;
        c.gridy = 0;
        jp_formulario.add(txt_usuario, c);
        
        JLabel lbl_nombre_usu = new JLabel("Nombre Usuario");
        c.gridx = 0;
        c.gridy = 1;
        jp_formulario.add(lbl_nombre_usu, c);
        
        JTextField txt_nombre_usu = new JTextField();
        c.gridx = 1;
        c.gridy = 1;
        jp_formulario.add(txt_nombre_usu, c);
        
        JLabel lbl_clave = new JLabel("Clave");
        c.gridx = 0;
        c.gridy = 2;
        jp_formulario.add(lbl_clave, c);
        
        JTextField txt_clave = new JTextField();
        c.gridx = 1;
        c.gridy = 2;
        jp_formulario.add(txt_clave, c);
        
        Object titulos []={"Identificador","Usuario", "Nombre"};
        Object celdas [][]=new Object[4][3];
        
        JTable grid_usuarios = new JTable(celdas, titulos);
        JScrollPane scp_grid_usu =new JScrollPane(grid_usuarios);
        getContentPane().add(scp_grid_usu);
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 3;
        jp_formulario.add(scp_grid_usu, c);
        
        jp_formulario.updateUI();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_general = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mn_clientes = new javax.swing.JMenu();
        it_mant_clientes = new javax.swing.JMenuItem();
        mn_proveedor = new javax.swing.JMenu();
        it_mant_proveedores = new javax.swing.JMenuItem();
        mn_productos = new javax.swing.JMenu();
        it_mant_productos = new javax.swing.JMenuItem();
        mn_entradas = new javax.swing.JMenu();
        mn_ventas = new javax.swing.JMenu();
        mn_usuarios = new javax.swing.JMenu();
        it_mant_usuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jp_generalLayout = new javax.swing.GroupLayout(jp_general);
        jp_general.setLayout(jp_generalLayout);
        jp_generalLayout.setHorizontalGroup(
            jp_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
        );
        jp_generalLayout.setVerticalGroup(
            jp_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Adobe Garamond Pro Bold", 0, 18)); // NOI18N

        mn_clientes.setText("Clientes");

        it_mant_clientes.setText("Mantenedor de Clientes");
        it_mant_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                it_mant_clientesActionPerformed(evt);
            }
        });
        mn_clientes.add(it_mant_clientes);

        jMenuBar1.add(mn_clientes);

        mn_proveedor.setText("Proveedores");

        it_mant_proveedores.setText("Mantenedor de Proveedores");
        mn_proveedor.add(it_mant_proveedores);

        jMenuBar1.add(mn_proveedor);

        mn_productos.setText("Productos");

        it_mant_productos.setText("Mantenedor de Productos");
        mn_productos.add(it_mant_productos);

        jMenuBar1.add(mn_productos);

        mn_entradas.setText("Entradas");
        jMenuBar1.add(mn_entradas);

        mn_ventas.setText("Ventas");
        jMenuBar1.add(mn_ventas);

        mn_usuarios.setText("Usuarios");

        it_mant_usuarios.setText("Mantenedor de Usuarios");
        it_mant_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                it_mant_usuariosActionPerformed(evt);
            }
        });
        mn_usuarios.add(it_mant_usuarios);

        jMenuBar1.add(mn_usuarios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_general, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_general, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void it_mant_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_it_mant_usuariosActionPerformed
        Crear_botonera_mant_usuarios();
        crear_formulario_mant_usuarios();
    }//GEN-LAST:event_it_mant_usuariosActionPerformed

    private void it_mant_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_it_mant_clientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_it_mant_clientesActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem it_mant_clientes;
    private javax.swing.JMenuItem it_mant_productos;
    private javax.swing.JMenuItem it_mant_proveedores;
    private javax.swing.JMenuItem it_mant_usuarios;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jp_general;
    private javax.swing.JMenu mn_clientes;
    private javax.swing.JMenu mn_entradas;
    private javax.swing.JMenu mn_productos;
    private javax.swing.JMenu mn_proveedor;
    private javax.swing.JMenu mn_usuarios;
    private javax.swing.JMenu mn_ventas;
    // End of variables declaration//GEN-END:variables

}
