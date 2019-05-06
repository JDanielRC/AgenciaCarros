//Autores:
//Carlos Ernesto Lopez Solano A01633683
//Juan Daniel Rubio Camacho A01633924
//Nombre de la clase: PanelSettings.java
//Fecha: 05/05/2019
//Comentarios u observaciones.
//------------------------------------------------------------------------------


import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class PanelSettings extends javax.swing.JPanel {

    private ImageIcon logoNuevo;
    private DatosEmpresa da;
    private MainFrame mf;
    
    public PanelSettings(MainFrame mf) {
        initComponents();
        this.da = DataLoader.loadCompany(new File("CompanyInformation.bin"));
        this.logoNuevo = null;
        this.mf = mf;
        this.llenarRecuadros();
    }

    private void llenarRecuadros() {
        
        try {
            this.nombreEmpresaTF.setText(this.da.getNombre());
            this.archivoL.setText("Seleccionar");
            this.rfcTF.setText(this.da.getRFC());
            this.direccionTF.setText(this.da.getDireccion());
        } catch (NullPointerException e) {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("");
            System.out.println("Archivo de empresa vacio. Se debe crear por administrador");
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

        jLabel1 = new javax.swing.JLabel();
        logoL = new javax.swing.JLabel();
        nombreEmpresaL = new javax.swing.JLabel();
        direccionL = new javax.swing.JLabel();
        settingsL = new javax.swing.JLabel();
        nombreEmpresaTF = new javax.swing.JTextField();
        selectB = new javax.swing.JButton();
        rfcTF = new javax.swing.JTextField();
        direccionTF = new javax.swing.JTextField();
        editarB = new javax.swing.JButton();
        archivoL = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1231, 1000));
        setMinimumSize(new java.awt.Dimension(1231, 1000));
        setPreferredSize(new java.awt.Dimension(1231, 1000));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Settings");

        logoL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        logoL.setText("Logo de la Empresa");

        nombreEmpresaL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        nombreEmpresaL.setText("Nombre de la empresa");

        direccionL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        direccionL.setText("Dirección");

        settingsL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        settingsL.setText("RFC");

        nombreEmpresaTF.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        nombreEmpresaTF.setToolTipText("");

        selectB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        selectB.setText("Seleccionar");
        selectB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBActionPerformed(evt);
            }
        });

        rfcTF.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        rfcTF.setToolTipText("");

        direccionTF.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        direccionTF.setToolTipText("");

        editarB.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        editarB.setText("Editar");
        editarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBActionPerformed(evt);
            }
        });

        archivoL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        archivoL.setText("Seleccionar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(editarB)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(direccionL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(direccionTF, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreEmpresaL)
                                    .addComponent(logoL))
                                .addGap(128, 128, 128)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nombreEmpresaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selectB, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(settingsL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(archivoL)
                                    .addComponent(rfcTF, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombreEmpresaL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreEmpresaTF))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logoL)
                            .addComponent(archivoL))
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(selectB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(settingsL)
                    .addComponent(rfcTF))
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionL)
                    .addComponent(direccionTF))
                .addGap(84, 84, 84)
                .addComponent(editarB, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBActionPerformed
        DatosEmpresa nuevoDA = new DatosEmpresa(this.rfcTF.getText(), this.direccionTF.getText(), this.nombreEmpresaTF.getText(), this.logoNuevo);
        
        if(this.nombreEmpresaTF.getText().equals(this.da.getNombre()) && this.direccionTF.getText().equals(this.da.getDireccion()) &&
           rfcTF.getText().equals(this.da.getRFC()) && this.logoNuevo == this.da.getLogo()) {
            JOptionPane.showMessageDialog(this, "No se realizaron cambios a la información de la empresa");
        } else if(this.nombreEmpresaTF.getText().equals("") || this.direccionTF.getText().equals("") ||
           rfcTF.getText().equals("") || this.logoNuevo == null) {
            JOptionPane.showMessageDialog(this, "Todos los espacios son obligatorios");
        } else {
            this.da.setNombre(nombreEmpresaTF.getText());
            this.da.setLogo(nuevoDA.getLogo());
            this.da.setDireccion(nuevoDA.getDireccion());
            this.da.setRFC(nuevoDA.getRFC());
            
            this.da.almacenarEmpresa();

            JOptionPane.showMessageDialog(this, "La edición ha sido exitosa");
            this.da = DataLoader.loadCompany(new File("CompanyInformation.bin"));
        }
    }//GEN-LAST:event_editarBActionPerformed

    private void selectBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("JPG, GIF and PNG Images", "jpg", "gif", "png"));
        int choosed = chooser.showOpenDialog(null);
        if(choosed == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage fotin = ImageIO.read(chooser.getSelectedFile());
                Image img = fotin.getScaledInstance(400, 200, Image.SCALE_SMOOTH);
                this.logoNuevo = new ImageIcon(img);
            } catch(IOException ex) {
                System.out.println("El archivo no pudo ser leido correctamente");
            }
            this.archivoL.setText(chooser.getSelectedFile().getName());
        } else if(choosed == JFileChooser.CANCEL_OPTION) {
            
        } else {
            JOptionPane.showMessageDialog(this, "Por favor intentelo de nuevo");
        }
    }//GEN-LAST:event_selectBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel archivoL;
    private javax.swing.JLabel direccionL;
    private javax.swing.JTextField direccionTF;
    private javax.swing.JButton editarB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logoL;
    private javax.swing.JLabel nombreEmpresaL;
    private javax.swing.JTextField nombreEmpresaTF;
    private javax.swing.JTextField rfcTF;
    private javax.swing.JButton selectB;
    private javax.swing.JLabel settingsL;
    // End of variables declaration//GEN-END:variables
}
