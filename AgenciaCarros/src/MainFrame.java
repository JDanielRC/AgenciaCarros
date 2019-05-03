
import java.awt.CardLayout;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class MainFrame extends javax.swing.JFrame {
    
    private ImageIcon adminLogo = new ImageIcon("isc.png");
    private ImageIcon nullLogo = new ImageIcon("Null.png");
    private CardLayout cardLayout = new CardLayout();
    
    public MainFrame(String matricula) {
        super("Venta y compra de carros - " + matricula);
        initComponents();
        
        //Settear el CardLayout para administrar paneles variables
        variableP.setLayout(cardLayout);
        
        //Crear paneles posibles
        PanelResumen pr = new PanelResumen();
        PanelInventario pi = new PanelInventario();
        PanelEmpleados pe = new PanelEmpleados();
        PanelSettings ps = new PanelSettings();
        PanelCompras pc = new PanelCompras();
        PanelVentas pv = new PanelVentas();
        
        //Asignar paneles al CardLayout
        variableP.add(pr, "resumen");
        variableP.add(pi, "inventario");
        variableP.add(pe, "empleados");
        variableP.add(ps, "settings");
        variableP.add(pc, "compras");
        variableP.add(pv, "ventas");
          
        //Resumen esta selecionado por defecto
        resumen.setSelected(true);
        //Settear fecha del acceso actual
        Date fecha = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");  
        accesoActualL.setText("Acceso actual: ");
        fechaActualL.setText(formatter.format(fecha));
        
        //Desplegar foto de la persona y configurar menú de acceso
        //Verifica si el usuairo es Admin
        if(matricula.equals("harnex")) {      
            fotoUsuarioL.setIcon(adminLogo);

            resumen.setVisible(true);
            inventario.setVisible(true);
            empleados.setVisible(true);
            editarSistema.setVisible(true);
            compras.setVisible(false);
            ventas.setVisible(false);
            
            //Settear bienvenida del GUI
            bienvenidaL.setText("Bienvenid@ master");
            
            //Si es gerente o empleado
        } else {
            
            //Adquirir referencia al empleado actual
            ListaEmpleados le = DataLoader.loadEmployees(new File("Database.bin"));
            Empleado empleadoActual = le.obtener(matricula);

            //Settear bienvenida del GUI
            bienvenidaL.setText("Bienvenid@ " + empleadoActual.getPrimerNombre() + " " + empleadoActual.getApellidoPaterno());
            
            //Verifica si el usuario es Gerente
            if(empleadoActual.getCargo().equals("Gerente")) {
                resumen.setVisible(true);
                inventario.setVisible(true);
                empleados.setVisible(true);
                editarSistema.setVisible(false);
                compras.setVisible(true);
                ventas.setVisible(true);
                
                //Verifica si tiene foto
                ImageIcon fotoEmpleado = new ImageIcon(empleadoActual.getFoto());
                if(fotoEmpleado != null) {
                    fotoUsuarioL.setIcon(fotoEmpleado);
                //Sino, utiliza la default
                } else {
                    fotoUsuarioL.setIcon(nullLogo);
                }
                
            //Verifica si el usuario es Empledao
            } else {
                resumen.setVisible(true);
                inventario.setVisible(true);
                empleados.setVisible(false);
                editarSistema.setVisible(false);
                compras.setVisible(false);
                ventas.setVisible(false);
                
                //Verifica si tiene foto
                ImageIcon fotoEmpleado = new ImageIcon(empleadoActual.getFoto());
                if(fotoEmpleado != null) {
                    fotoUsuarioL.setIcon(fotoEmpleado);
                //Sino, utiliza la default
                } else {
                    fotoUsuarioL.setIcon(nullLogo);
                }
            }  
        } 
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuSeleccionBG = new javax.swing.ButtonGroup();
        menuP = new javax.swing.JPanel();
        fotoUsuarioL = new javax.swing.JLabel();
        cerrarSesion = new javax.swing.JButton();
        bienvenidaL = new javax.swing.JLabel();
        accesoActualL = new javax.swing.JLabel();
        resumen = new javax.swing.JRadioButton();
        inventario = new javax.swing.JRadioButton();
        empleados = new javax.swing.JRadioButton();
        editarSistema = new javax.swing.JRadioButton();
        compras = new javax.swing.JRadioButton();
        ventas = new javax.swing.JRadioButton();
        fechaActualL = new javax.swing.JLabel();
        variableP = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1600, 1000));
        setMinimumSize(new java.awt.Dimension(1600, 1000));
        setPreferredSize(new java.awt.Dimension(1600, 1000));
        setResizable(false);
        setSize(new java.awt.Dimension(1600, 1000));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        menuP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        fotoUsuarioL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cerrarSesion.setText("Cerrar Sesion");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });

        bienvenidaL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bienvenidaL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bienvenidaL.setText("jLabel1");

        accesoActualL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        accesoActualL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        accesoActualL.setText("jLabel2");

        menuSeleccionBG.add(resumen);
        resumen.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        resumen.setText("Resumen");
        resumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumenActionPerformed(evt);
            }
        });

        menuSeleccionBG.add(inventario);
        inventario.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        inventario.setText("Inventario");
        inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioActionPerformed(evt);
            }
        });

        menuSeleccionBG.add(empleados);
        empleados.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        empleados.setText("Empleados");
        empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadosActionPerformed(evt);
            }
        });

        menuSeleccionBG.add(editarSistema);
        editarSistema.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        editarSistema.setText("Editar Sistema");
        editarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarSistemaActionPerformed(evt);
            }
        });

        menuSeleccionBG.add(compras);
        compras.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        compras.setText("Compras");
        compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasActionPerformed(evt);
            }
        });

        menuSeleccionBG.add(ventas);
        ventas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ventas.setText("Ventas");
        ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasActionPerformed(evt);
            }
        });

        fechaActualL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        fechaActualL.setText("jLabel1");

        javax.swing.GroupLayout menuPLayout = new javax.swing.GroupLayout(menuP);
        menuP.setLayout(menuPLayout);
        menuPLayout.setHorizontalGroup(
            menuPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(menuPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPLayout.createSequentialGroup()
                        .addGroup(menuPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resumen)
                            .addComponent(inventario))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(menuPLayout.createSequentialGroup()
                        .addGroup(menuPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ventas)
                            .addComponent(compras)
                            .addComponent(empleados)
                            .addComponent(editarSistema))
                        .addGap(0, 88, Short.MAX_VALUE))))
            .addGroup(menuPLayout.createSequentialGroup()
                .addGroup(menuPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(menuPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fotoUsuarioL, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(menuPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bienvenidaL)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(menuPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accesoActualL)
                    .addComponent(fechaActualL))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menuPLayout.setVerticalGroup(
            menuPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(fotoUsuarioL, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(bienvenidaL)
                .addGap(28, 28, 28)
                .addComponent(accesoActualL)
                .addGap(18, 18, 18)
                .addComponent(fechaActualL)
                .addGap(36, 36, 36)
                .addComponent(cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resumen)
                .addGap(18, 18, 18)
                .addComponent(inventario)
                .addGap(18, 18, 18)
                .addComponent(empleados)
                .addGap(18, 18, 18)
                .addComponent(editarSistema)
                .addGap(18, 18, 18)
                .addComponent(compras)
                .addGap(18, 18, 18)
                .addComponent(ventas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        variableP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout variablePLayout = new javax.swing.GroupLayout(variableP);
        variableP.setLayout(variablePLayout);
        variablePLayout.setHorizontalGroup(
            variablePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1229, Short.MAX_VALUE)
        );
        variablePLayout.setVerticalGroup(
            variablePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(variableP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(variableP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Controlar la salida del sistema del usuario
    //Ambas opciones del cuadro cierran la ventana
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(this, "Esta seguro de que desea cerrar el programa? Se cerrará su sesión", "Cerrar ventana?", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION){
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        } else {
            System.exit(0);
        }
        
    }//GEN-LAST:event_formWindowClosing

    private void inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioActionPerformed
        cardLayout.show(variableP, "inventario");
    }//GEN-LAST:event_inventarioActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Esta seguro de que desea cerrar su sesión?", "Cerrar sesión?", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            
            LoginFrame lf = new LoginFrame();
            lf.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void resumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumenActionPerformed
        cardLayout.show(variableP, "resumen");
    }//GEN-LAST:event_resumenActionPerformed

    private void empleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadosActionPerformed
        cardLayout.show(variableP, "empleados");
    }//GEN-LAST:event_empleadosActionPerformed

    private void editarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarSistemaActionPerformed
        cardLayout.show(variableP, "settings");
    }//GEN-LAST:event_editarSistemaActionPerformed

    private void comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasActionPerformed
        cardLayout.show(variableP, "compras");
    }//GEN-LAST:event_comprasActionPerformed

    private void ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasActionPerformed
        cardLayout.show(variableP, "ventas");
    }//GEN-LAST:event_ventasActionPerformed

    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
        */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accesoActualL;
    private javax.swing.JLabel bienvenidaL;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JRadioButton compras;
    private javax.swing.JRadioButton editarSistema;
    private javax.swing.JRadioButton empleados;
    private javax.swing.JLabel fechaActualL;
    private javax.swing.JLabel fotoUsuarioL;
    private javax.swing.JRadioButton inventario;
    private javax.swing.JPanel menuP;
    private javax.swing.ButtonGroup menuSeleccionBG;
    private javax.swing.JRadioButton resumen;
    private javax.swing.JPanel variableP;
    private javax.swing.JRadioButton ventas;
    // End of variables declaration//GEN-END:variables
}