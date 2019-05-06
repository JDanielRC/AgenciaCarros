//Autores:
//Carlos Ernesto Lopez Solano A01633683
//Juan Daniel Rubio Camacho A01633924
//Nombre de la clase: PanelCompraVenta.java
//Fecha: 05/05/2019
//Comentarios u observaciones.
//------------------------------------------------------------------------------

import java.io.File;
import javax.swing.JOptionPane;


public class PanelCompraVenta extends javax.swing.JPanel {

    private Inventario inventario;
    
    public PanelCompraVenta() {
        initComponents();
        this.inventario = DataLoader.loadInventory(new File("CarDatabase.bin"));
    }

    private void llenarRecuadrosVenta(Carro carro) {
        String year = "" + carro.getYear();
        String precio = "" + carro.getPrecio();
        
        this.placaTFV.setText(carro.getPlaca());
        this.modeloTFV.setText(carro.getModelo());
        this.anoTFV.setText(year);
        this.marcaTFV.setText(carro.getMarca());
        this.colorTFV.setText(carro.getColor());
        this.tamanoTFV.setText(carro.getSize());
        this.precioTFV.setText(precio);
    }
    
    private void vaciarRecuadrosVenta() {
        this.placaTFV.setText("");
        this.modeloTFV.setText("");
        this.anoTFV.setText("");
        this.marcaTFV.setText("");
        this.colorTFV.setText("");
        this.tamanoTFV.setText("");
        this.precioTFV.setText("");
    }
    
    private void vaciarRecuadrosCompra() {
        this.placaTF.setText("");
        this.modeloTF.setText("");
        this.anoTF.setText("");
        this.marcaTF.setText("");
        this.colorTF.setText("");
        this.tamanoTF.setText("");
        this.precioTF.setText("");
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comprasL = new javax.swing.JLabel();
        modeloL = new javax.swing.JLabel();
        marcaL = new javax.swing.JLabel();
        anoL = new javax.swing.JLabel();
        colorL = new javax.swing.JLabel();
        tamanoL = new javax.swing.JLabel();
        precioL = new javax.swing.JLabel();
        modeloTF = new javax.swing.JTextField();
        marcaTF = new javax.swing.JTextField();
        anoTF = new javax.swing.JTextField();
        colorTF = new javax.swing.JTextField();
        tamanoTF = new javax.swing.JTextField();
        precioTF = new javax.swing.JTextField();
        comprarB = new javax.swing.JButton();
        ventasL = new javax.swing.JLabel();
        placaL = new javax.swing.JLabel();
        placaTF = new javax.swing.JTextField();
        modeloL1 = new javax.swing.JLabel();
        marcaL1 = new javax.swing.JLabel();
        anoL1 = new javax.swing.JLabel();
        placaLV = new javax.swing.JLabel();
        placaTFV = new javax.swing.JTextField();
        anoTFV = new javax.swing.JTextField();
        marcaTFV = new javax.swing.JTextField();
        modeloTFV = new javax.swing.JTextField();
        colorLV = new javax.swing.JLabel();
        colorTFV = new javax.swing.JTextField();
        tamanoLV = new javax.swing.JLabel();
        tamanoTFV = new javax.swing.JTextField();
        precioLV = new javax.swing.JLabel();
        precioTFV = new javax.swing.JTextField();
        venderB = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1231, 1000));
        setMinimumSize(new java.awt.Dimension(1231, 1000));
        setPreferredSize(new java.awt.Dimension(1231, 1000));

        comprasL.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        comprasL.setText("Compras");

        modeloL.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        modeloL.setText("Modelo");

        marcaL.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        marcaL.setText("Marca");

        anoL.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        anoL.setText("Año");

        colorL.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        colorL.setText("Color");

        tamanoL.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        tamanoL.setText("Tamaño");

        precioL.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        precioL.setText("Precio");

        tamanoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanoTFActionPerformed(evt);
            }
        });

        comprarB.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        comprarB.setText("Comprar");
        comprarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarBActionPerformed(evt);
            }
        });

        ventasL.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        ventasL.setText("Ventas");

        placaL.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        placaL.setText("Placa");

        modeloL1.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        modeloL1.setText("Modelo");

        marcaL1.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        marcaL1.setText("Marca");

        anoL1.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        anoL1.setText("Año");

        placaLV.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        placaLV.setText("Placa");

        anoTFV.setEditable(false);

        marcaTFV.setEditable(false);

        modeloTFV.setEditable(false);

        colorLV.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        colorLV.setText("Color");

        colorTFV.setEditable(false);

        tamanoLV.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        tamanoLV.setText("Tamaño");

        tamanoTFV.setEditable(false);
        tamanoTFV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanoTFVActionPerformed(evt);
            }
        });

        precioLV.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        precioLV.setText("Precio");

        precioTFV.setEditable(false);

        venderB.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        venderB.setText("Vender");
        venderB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venderBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comprasL)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ventasL)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anoL1)
                            .addComponent(modeloL1)
                            .addComponent(placaLV)
                            .addComponent(marcaL1))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(placaTFV, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                                .addComponent(colorLV)
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tamanoTFV, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(colorTFV, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(precioTFV, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(anoTFV, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modeloTFV, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(precioLV)
                                        .addGap(398, 398, 398))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(tamanoLV)
                                        .addGap(369, 369, 369))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(marcaTFV, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(venderB)
                                .addGap(88, 88, 88))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anoL)
                            .addComponent(modeloL)
                            .addComponent(placaL)
                            .addComponent(marcaL))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(placaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(colorL)
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tamanoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(colorTF, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(precioTF, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(marcaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comprarB)
                                .addGap(85, 85, 85))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(anoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modeloTF, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(precioL)
                                        .addGap(398, 398, 398))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(tamanoL)
                                        .addGap(369, 369, 369))))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(comprasL)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(colorL))
                    .addComponent(colorTF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placaL)
                    .addComponent(placaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tamanoL)
                            .addComponent(modeloL)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modeloTF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tamanoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(anoL))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(precioL)
                            .addComponent(anoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioTF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comprarB)
                            .addComponent(marcaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(marcaL)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(ventasL)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(colorLV))
                                            .addComponent(colorTFV, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(placaLV))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addComponent(tamanoLV))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addComponent(tamanoTFV, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(73, 73, 73)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(modeloTFV, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(modeloL1))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(71, 71, 71)
                                                .addComponent(anoL1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(precioLV)
                                                    .addComponent(anoTFV, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(precioTFV, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(placaTFV, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addComponent(marcaL1))
                            .addComponent(marcaTFV, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(venderB)
                        .addGap(23, 23, 23))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tamanoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamanoTFActionPerformed

    private void tamanoTFVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanoTFVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamanoTFVActionPerformed

    private void venderBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venderBActionPerformed
        String placa = placaTFV.getText();
        
        if(placa.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese una placa en el cuadro de texto");
        } else if(!this.inventario.containsModelo(placa)) {
            JOptionPane.showMessageDialog(this, "El carro con las placas indicadas no existe en el inventario");
        } else {
            this.llenarRecuadrosVenta(this.inventario.find(placa));
            
            if (JOptionPane.showConfirmDialog(this, "Esta seguro de que desea vender el carro seleccionado?", "Vender carro?", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            
                this.inventario.vender(placa);
                this.inventario.almacenarDatos();
                this.vaciarRecuadrosVenta();
                JOptionPane.showMessageDialog(this, "El carro se vendió con éxito!");
            }
        }
    }//GEN-LAST:event_venderBActionPerformed

    private void comprarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarBActionPerformed
        if(placaTF.getText().equals("") || modeloTF.getText().equals("") || anoTF.getText().equals("") ||
           marcaTF.getText().equals("") || colorTF.getText().equals("") || tamanoTF.getText().equals("") || precioTF.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos los espacios deben ser llenados para realizar la compra");
        } else if(this.inventario.contains(placa)) {
            JOptionPane.showMessageDialog(this, "El inventario ya cuenta con un carro con esa placa. Por favor intente de nuevo");
        } else {
            Carro carroComprado = new Carro(placaTF.getText(), Integer.parseInt(precioTF.getText()), colorTF.getText(), modeloTF.getText(), tamanoTF.getText(), Integer.parseInt(anoTF.getText()), marcaTF.getText());
            this.inventario.adquirir(carroComprado);
            this.inventario.almacenarDatos();
            this.vaciarRecuadrosCompra();
            JOptionPane.showMessageDialog(this, "La compra ha sido exitosa");
        }
    }//GEN-LAST:event_comprarBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anoL;
    private javax.swing.JLabel anoL1;
    private javax.swing.JTextField anoTF;
    private javax.swing.JTextField anoTFV;
    private javax.swing.JLabel colorL;
    private javax.swing.JLabel colorLV;
    private javax.swing.JTextField colorTF;
    private javax.swing.JTextField colorTFV;
    private javax.swing.JButton comprarB;
    private javax.swing.JLabel comprasL;
    private javax.swing.JLabel marcaL;
    private javax.swing.JLabel marcaL1;
    private javax.swing.JTextField marcaTF;
    private javax.swing.JTextField marcaTFV;
    private javax.swing.JLabel modeloL;
    private javax.swing.JLabel modeloL1;
    private javax.swing.JTextField modeloTF;
    private javax.swing.JTextField modeloTFV;
    private javax.swing.JLabel placaL;
    private javax.swing.JLabel placaLV;
    private javax.swing.JTextField placaTF;
    private javax.swing.JTextField placaTFV;
    private javax.swing.JLabel precioL;
    private javax.swing.JLabel precioLV;
    private javax.swing.JTextField precioTF;
    private javax.swing.JTextField precioTFV;
    private javax.swing.JLabel tamanoL;
    private javax.swing.JLabel tamanoLV;
    private javax.swing.JTextField tamanoTF;
    private javax.swing.JTextField tamanoTFV;
    private javax.swing.JButton venderB;
    private javax.swing.JLabel ventasL;
    // End of variables declaration//GEN-END:variables
}
