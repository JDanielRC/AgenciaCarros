
import java.awt.Font;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PanelEmpleados extends javax.swing.JPanel {

    private ListaEmpleados le;

    public PanelEmpleados() {
        initComponents();
        this.le = DataLoader.loadEmployees(new File("EmployeeDatabase.bin"));
        this.llenarTabla();
        tablaEmpleados.setRowHeight(30);
        tablaEmpleados.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 24));
    }
    
    //Llena la tabla con los datos de los empleados de la lista
    private void llenarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tablaEmpleados.getModel();
        
        System.out.println("La base de datos actualmente cuenta con " + this.le.getSize() + " empleados");
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        
        for (int i = 0; i < this.le.getListaEmpleados().getTabla().length; i++) {
                if (this.le.getListaEmpleados().getTabla()[i].size() > 0) {
                        for (int j = 0; j < this.le.getListaEmpleados().getTabla()[i].size(); j++) {
                                Empleado empleado = this.le.getListaEmpleados().getTabla()[i].getEn(j).valor;
                                modelo.addRow(new Object[]{empleado.getMatricula(),
                                                           empleado.getPrimerNombre(),
                                                           empleado.getSegundoNombre(),
                                                           empleado.getApellidoPaterno(),
                                                           empleado.getApellidoMaterno(),
                                                           empleado.getCargo(),
                                                           empleado.getRfc(),
                                                           empleado.getFoto()});
                        }
                }
        }

        if(modelo.getRowCount() < 14) {
            for(int i = 0; i < 14 - modelo.getRowCount(); i++) {
                modelo.addRow(new Object[8]);
            }
        }
    }
    
    /* Falta implementar busqueda
    //Busca el modelo especificado en el inventario actual
    //Si lo encuentra, devuelve una lista de carros lista para ser procesada
    //Sino lo encuentra, o el modelo esta vacio/es nulo, devuelve la lista
    //de carros del inventario actual
    private Carro[] buscarEnTabla(String modelo) {
        //Corroborar que no sea un texto vacio o nulo
        if(modelo != "" && modelo != null) {
            if(this.inventario.containsModelo(modelo)) {
                return this.inventario.listaCarrosPorModelo(modelo);
            }
            JOptionPane.showMessageDialog(this, "No se cuenta con el modelo especificado actualmente");
            return this.inventario.listaCarros();
        }
        //Si no se ingresa texto y se presiona el boton
        //Se realiza el llenado normal de la tabla
        return this.inventario.listaCarros();
    }
    */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        empleadosL = new javax.swing.JLabel();
        buscarTF = new javax.swing.JTextField();
        buscarB = new javax.swing.JButton();
        variableP = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(1231, 1000));
        setMinimumSize(new java.awt.Dimension(1231, 1000));
        setPreferredSize(new java.awt.Dimension(1231, 1000));

        tablaEmpleados.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Primer Nombre", "Segundo Nombre", "Apellido Paterno", "Apellido Materno", "Cargo", "RFC", "Foto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaEmpleados);

        empleadosL.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        empleadosL.setText("Empleados");

        buscarTF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        buscarB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buscarB.setText("Buscar");
        buscarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout variablePLayout = new javax.swing.GroupLayout(variableP);
        variableP.setLayout(variablePLayout);
        variablePLayout.setHorizontalGroup(
            variablePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        variablePLayout.setVerticalGroup(
            variablePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1231, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(empleadosL, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscarB, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buscarTF, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(variableP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(empleadosL, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscarTF)
                            .addComponent(buscarB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(variableP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buscarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBActionPerformed
        //((DefaultTableModel)tablaEmpleados.getModel()).setRowCount(0);
        //this.llenarTabla(this.buscarEnTabla(buscarTF.getText()));
    }//GEN-LAST:event_buscarBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarB;
    private javax.swing.JTextField buscarTF;
    private javax.swing.JLabel empleadosL;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JPanel variableP;
    // End of variables declaration//GEN-END:variables
}