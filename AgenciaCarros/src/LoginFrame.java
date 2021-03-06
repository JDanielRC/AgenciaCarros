//Autores:
//Carlos Ernesto Lopez Solano A01633683
//Juan Daniel Rubio Camacho A01633924
//Nombre de la clase: LoginFrame.java
//Fecha: 05/05/2019
//Comentarios u observaciones.
//------------------------------------------------------------------------------

import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LoginFrame extends javax.swing.JFrame {
    private String usuario,
                   contrasena;
    private final String adminMasterUsername = "harnex",
                         adminMasterPassword = "pitayo";
    
    private ListaEmpleados listaEmpleados;
    private DatosEmpresa da;
    
    private ImageIcon adminLogo;
    private ImageIcon nullLogo;
    
    public LoginFrame() {
        super("Login");
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setAlwaysOnTop(false);
        this.da = DataLoader.loadCompany(new File("CompanyInformation.bin"));
        this.adminLogo = new ImageIcon("isc.png");
        this.nullLogo = new ImageIcon("Null.png");
        
        //Settear logo, predeterminado o de la empresa
        try {
            if(this.da.getLogo() != null) {
                this.logoL.setIcon(this.da.getLogo());
            } else {
                this.logoL.setIcon(nullLogo);
            }
        } catch (NullPointerException e) {
            this.logoL.setIcon(nullLogo);
        }
            
            
        this.usuario = this.contrasena = "";
        this.revisarBD();
    }
    
    //Verifica si ya se cuenta con archivos consistentes, esten vacios o no
    private void revisarBD() {
        //Archivo Empleados
        this.listaEmpleados = DataLoader.loadEmployees(new File("EmployeeDatabase.bin"));
        
        //Archivo Inventario
        Inventario inventario = DataLoader.loadInventory(new File("CarDatabase.bin"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contrasenaTF = new javax.swing.JPasswordField();
        accederB = new javax.swing.JButton();
        logoL = new javax.swing.JLabel();
        matriculaTF = new javax.swing.JTextField();
        matriculaL = new javax.swing.JLabel();
        contrasenaL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(500, 550));
        setMinimumSize(new java.awt.Dimension(500, 550));
        setPreferredSize(new java.awt.Dimension(500, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 550));

        accederB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        accederB.setText("Acceder");
        accederB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accederBActionPerformed(evt);
            }
        });

        logoL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoL.setMaximumSize(new java.awt.Dimension(200, 200));
        logoL.setMinimumSize(new java.awt.Dimension(200, 200));
        logoL.setPreferredSize(new java.awt.Dimension(200, 200));

        matriculaL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        matriculaL.setText("Matrícula");

        contrasenaL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contrasenaL.setText("Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(matriculaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contrasenaL)
                    .addComponent(contrasenaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matriculaL))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 160, Short.MAX_VALUE)
                .addComponent(accederB, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logoL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(matriculaL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(matriculaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contrasenaL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contrasenaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(accederB, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Función de botón "Acceder"
    private void accederBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accederBActionPerformed
        //Leer datos de entrada de usuario y contraseña
        try {
            this.usuario = matriculaTF.getText();
            this.contrasena = String.valueOf(contrasenaTF.getPassword()); 
        } catch(NullPointerException e) {
            //Si no se pueden leer los campos
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese su usuario y contraseña");
        }
        System.out.println("Usuario ingresado: " + this.usuario);
        System.out.println("Contraseña ingresada: " + this.contrasena);
        //Falta poner la verificacion para la base de datos
        
        //Si los campos estan vacios
        try {
            if(this.usuario.equals("") || this.contrasena.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese su usuario y / o contraseña");
        //Si ambas entradas son correctas
        } else if((this.usuario.equals(adminMasterUsername) && this.contrasena.equals(adminMasterPassword)) ||
                (this.listaEmpleados.contains(this.usuario) && this.contrasena.equals(this.listaEmpleados.obtener(this.usuario).getContrasena()))) {
            System.out.println("-------------------------------------------------");
            System.out.println();
            System.out.println("Bienvenid@, " + this.usuario);
            
            MainFrame mf = new MainFrame(usuario);
            mf.setVisible(true);
            this.dispose();
        //Si el usuario es incorrecto
        } else if (!this.listaEmpleados.contains(this.usuario)) {
            JOptionPane.showMessageDialog(rootPane, "El usuario ingresado no existe en la base de datos");
        //Si solo el usuario es correcto
        } else if ((this.listaEmpleados.contains(this.usuario) && !this.contrasena.equals(this.listaEmpleados.obtener(this.usuario).getContrasena()))) {
            JOptionPane.showMessageDialog(rootPane, "Contraseña inválida para el usuario ingresado");
        }
        } catch(NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No existe archivo de empleados. Por favor ingresar con credenciales de administrador");
        }
        
    }//GEN-LAST:event_accederBActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accederB;
    private javax.swing.JLabel contrasenaL;
    private javax.swing.JPasswordField contrasenaTF;
    private javax.swing.JLabel logoL;
    private javax.swing.JLabel matriculaL;
    private javax.swing.JTextField matriculaTF;
    // End of variables declaration//GEN-END:variables
}
