//Autores:
//Carlos Ernesto Lopez Solano A01633683
//Juan Daniel Rubio Camacho A01633924
//Nombre de la clase: PanelEmpleados.java
//Fecha: 05/05/2019
//Comentarios u observaciones.
//------------------------------------------------------------------------------

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class PanelEmpleados extends javax.swing.JPanel {

    private ListaEmpleados le;
    public CardLayout cardLayout = new CardLayout();
    private Empleado empleadoSeleccionado;

    public PanelEmpleados() {
        initComponents();
        this.le = DataLoader.loadEmployees(new File("EmployeeDatabase.bin"));
        this.llenarTabla();
        this.tablaEmpleados.setRowHeight(150);
        int contar = this.tablaEmpleados.getColumnModel().getColumnCount();
        this.tablaEmpleados.getColumnModel().getColumn(contar-1).setPreferredWidth(160);
        this.tablaEmpleados.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 24));
        
        //Settear el CardLayout para administrar paneles variables
        this.variableP.setLayout(this.cardLayout);
        
        //Crear paneles posibles
        PanelContratar pc = new PanelContratar(this);
        
        //Asignar paneles al CardLayout
        this.variableP.add(pc, "contratar");
        this.cardLayout.show(this.variableP, "contratar");
        
        this.tablaEmpleados.addMouseListener(new MouseAdapter() {
        	@Override
            public void mouseClicked(MouseEvent e) {
            	System.out.println(e.getX());
                System.out.println(190);
                if(e.getButton() == MouseEvent.BUTTON1) {
                    mostrarEditar();  
                }
            }
        });
    }
    
    public void mostrarEditar() {
        int row = this.tablaEmpleados.getSelectedRow();
        try {
        	this.empleadoSeleccionado = this.le.obtener(this.tablaEmpleados.getValueAt(row, 0).toString());
        } catch (NullPointerException e) {
        	casoBase();
        	return;
        }
        PanelEditar pe = new PanelEditar(this, this.empleadoSeleccionado);
        this.variableP.add(pe, "editar");
        this.cardLayout.show(this.variableP, "editar");
    }
    
    //Llena la tabla con los datos de los empleados de la lista
    private void llenarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) this.tablaEmpleados.getModel();
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

        if(modelo.getRowCount() < 3) {
            for(int i = 0; i < 3 - modelo.getRowCount(); i++) {
                modelo.addRow(new Object[8]);
            }
        }
    }
    
    public void casoBase() {
        tablaEmpleados.clearSelection();
        this.cardLayout.show(variableP, "contratar");
    }
    
    public void actualizarTabla() {
        ((DefaultTableModel)tablaEmpleados.getModel()).setRowCount(0);
        this.le = DataLoader.loadEmployees(new File("EmployeeDatabase.bin"));
        this.llenarTabla();
    }
    

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
        variableP = new javax.swing.JPanel();
        reloadB = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1231, 1000));
        setMinimumSize(new java.awt.Dimension(1231, 1000));
        setPreferredSize(new java.awt.Dimension(1231, 1000));

        tablaEmpleados.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "P. Nombre", "S. Nombre", "Apellido P.", "Apellido M.", "Cargo", "RFC", "Foto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, ImageIcon.class
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
        tablaEmpleados.setRowHeight(40);
        jScrollPane2.setViewportView(tablaEmpleados);

        empleadosL.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        empleadosL.setText("Empleados");

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

        reloadB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        reloadB.setText("Actualizar");
        reloadB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1231, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(empleadosL, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reloadB)
                .addGap(23, 23, 23))
            .addComponent(variableP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(empleadosL, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reloadB, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(variableP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reloadBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadBActionPerformed
        this.actualizarTabla();
    }//GEN-LAST:event_reloadBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel empleadosL;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton reloadB;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JPanel variableP;
    // End of variables declaration//GEN-END:variables

}
