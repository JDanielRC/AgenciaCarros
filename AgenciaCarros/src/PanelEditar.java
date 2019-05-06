
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.filechooser.FileNameExtensionFilter;


public class PanelEditar extends javax.swing.JPanel {
    
    private ImageIcon foto;
    private ListaEmpleados le;
    private Empleado empleadoSeleccionado;
    private PanelEmpleados pe;

    public PanelEditar(PanelEmpleados pe, Empleado empleado) {
        initComponents();
        this.le = DataLoader.loadEmployees(new File("EmployeeDatabase.bin"));
        this.foto = null;
        this.pe = pe;
        this.empleadoSeleccionado = empleado;
        this.llenarCampos(empleadoSeleccionado);
    }
    
    public void llenarCampos(Empleado empleado) {
        try {
        	this.empleadoSeleccionado = empleado;
            primerNombreTF.setText(empleado.getPrimerNombre());
            segundoNombreTF.setText(empleado.getSegundoNombre());
            apellidoPaternoTF.setText(empleado.getApellidoPaterno());
            apellidoMaternoTF.setText(empleado.getApellidoMaterno());
            rfcTF.setText(empleado.getRfc());
            cargoTF.setText(empleado.getCargo());
            this.foto = empleado.getFoto();
            archivoL.setText(this.foto.toString());
        } catch(NullPointerException e) {
        	
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

        editarL = new javax.swing.JLabel();
        despedirB = new javax.swing.JButton();
        primerNombreL = new javax.swing.JLabel();
        segundoNombreL = new javax.swing.JLabel();
        apellidoPaternoL = new javax.swing.JLabel();
        apellidoMaternoL = new javax.swing.JLabel();
        cargoL = new javax.swing.JLabel();
        fotoL = new javax.swing.JLabel();
        rfcL = new javax.swing.JLabel();
        selectFotoB = new javax.swing.JButton();
        archivoL = new javax.swing.JLabel();
        primerNombreTF = new javax.swing.JTextField();
        segundoNombreTF = new javax.swing.JTextField();
        apellidoPaternoTF = new javax.swing.JTextField();
        apellidoMaternoTF = new javax.swing.JTextField();
        cargoTF = new javax.swing.JTextField();
        rfcTF = new javax.swing.JTextField();
        editarB = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1231, 449));
        setMinimumSize(new java.awt.Dimension(1231, 449));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1231, 449));
        setRequestFocusEnabled(false);

        editarL.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        editarL.setText("Editar");

        despedirB.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        despedirB.setText("Despedir");
        despedirB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despedirBActionPerformed(evt);
            }
        });

        primerNombreL.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        primerNombreL.setText("Primer Nombre");

        segundoNombreL.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        segundoNombreL.setText("Segundo Nombre");

        apellidoPaternoL.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        apellidoPaternoL.setText("Apellido Paterno");

        apellidoMaternoL.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        apellidoMaternoL.setText("Apellido Materno");

        cargoL.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        cargoL.setText("Cargo");

        fotoL.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        fotoL.setText("Foto");

        rfcL.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        rfcL.setText("RFC");

        selectFotoB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        selectFotoB.setText("Elegir archivo");
        selectFotoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFotoBActionPerformed(evt);
            }
        });

        archivoL.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        archivoL.setText("Seleccionar");

        primerNombreTF.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N

        segundoNombreTF.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N

        apellidoPaternoTF.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N

        apellidoMaternoTF.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N

        cargoTF.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N

        rfcTF.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N

        editarB.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        editarB.setText("Editar");
        editarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(apellidoMaternoL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(despedirB))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editarL)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(primerNombreL)
                                    .addComponent(segundoNombreL)
                                    .addComponent(apellidoPaternoL))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apellidoPaternoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(segundoNombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(primerNombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(87, 87, 87)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(fotoL)
                                                .addGap(50, 50, 50)
                                                .addComponent(selectFotoB)
                                                .addGap(18, 18, 18)
                                                .addComponent(archivoL))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cargoL)
                                                    .addComponent(rfcL))
                                                .addGap(31, 31, 31)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(rfcTF, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cargoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(apellidoMaternoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(133, 133, 133)
                                        .addComponent(editarB)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editarL)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(primerNombreL)
                    .addComponent(cargoL)
                    .addComponent(primerNombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(segundoNombreL)
                    .addComponent(rfcL)
                    .addComponent(segundoNombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rfcTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoPaternoL)
                    .addComponent(fotoL)
                    .addComponent(selectFotoB)
                    .addComponent(archivoL)
                    .addComponent(apellidoPaternoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(despedirB)
                            .addComponent(editarB)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellidoMaternoL)
                            .addComponent(apellidoMaternoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void despedirBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despedirBActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Esta seguro de que desea despedir a " + empleadoSeleccionado.getPrimerNombre() + " " + empleadoSeleccionado.getApellidoPaterno()
                + "? Esta acción no se puede deshacer", "Despedir empleado?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            this.le.despedir(empleadoSeleccionado.getMatricula());
            this.le.almacenarEmpleados();
            this.pe.casoBase();
        } 
    }//GEN-LAST:event_despedirBActionPerformed

    private void selectFotoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFotoBActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("JPG, GIF and PNG Images", "jpg", "gif", "png"));
        int choosed = chooser.showOpenDialog(null);
        if(choosed == JFileChooser.APPROVE_OPTION) {
            try {
            	BufferedImage fotin = ImageIO.read(chooser.getSelectedFile());
                Image img = fotin.getScaledInstance(150, 30, Image.SCALE_SMOOTH);
                this.foto = new ImageIcon(img);
            } catch(IOException ex) {
                System.out.println("El archivo no pudo ser leido correctamente");
            }
            archivoL.setText(chooser.getSelectedFile().getName());
        } else if(choosed == JFileChooser.CANCEL_OPTION) {
            
        } else {
            JOptionPane.showMessageDialog(this, "Por favor intentelo de nuevo");
        }
    }//GEN-LAST:event_selectFotoBActionPerformed

    private void editarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBActionPerformed
        Empleado empleadoEditado = new Empleado(primerNombreTF.getText(), segundoNombreTF.getText(), apellidoPaternoTF.getText(),
                                              apellidoMaternoTF.getText(), rfcTF.getText(), cargoTF.getText(), this.foto);
        
        if(empleadoEditado.equals(empleadoSeleccionado)) {
            JOptionPane.showMessageDialog(this, "No se realizaron cambios al empleado seleccionado");
        } else if(primerNombreTF.getText().equals("") || apellidoPaternoTF.getText().equals("") || apellidoMaternoTF.getText().equals("") ||
           rfcTF.getText().equals("") || cargoTF.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos los espacios son obligatorios excepto Segundo Nombre y Foto");
        } else if(!cargoTF.getText().equals("Gerente") && !cargoTF.getText().equals("Empleado")) {
            JOptionPane.showMessageDialog(this, "Por el momento solo existen las posiciones de Empleado y Gerente. Por favor seleccione una de las mismas");
        } else {
            this.le.modificarEmpleado(empleadoSeleccionado.getMatricula(), primerNombreTF.getText(), segundoNombreTF.getText(), apellidoPaternoTF.getText(),
                                              apellidoMaternoTF.getText(), rfcTF.getText(), cargoTF.getText(), this.foto);
            this.le.almacenarEmpleados();
            JOptionPane.showMessageDialog(this, "La edición ha sido exitosa");
        }
    }//GEN-LAST:event_editarBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoMaternoL;
    private javax.swing.JTextField apellidoMaternoTF;
    private javax.swing.JLabel apellidoPaternoL;
    private javax.swing.JTextField apellidoPaternoTF;
    private javax.swing.JLabel archivoL;
    private javax.swing.JLabel cargoL;
    private javax.swing.JTextField cargoTF;
    private javax.swing.JButton despedirB;
    private javax.swing.JButton editarB;
    private javax.swing.JLabel editarL;
    private javax.swing.JLabel fotoL;
    private javax.swing.JLabel primerNombreL;
    private javax.swing.JTextField primerNombreTF;
    private javax.swing.JLabel rfcL;
    private javax.swing.JTextField rfcTF;
    private javax.swing.JLabel segundoNombreL;
    private javax.swing.JTextField segundoNombreTF;
    private javax.swing.JButton selectFotoB;
    // End of variables declaration//GEN-END:variables
}
