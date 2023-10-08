package gui;

import ipc.practica2.Appstate;
import ipc.practica2.Motocicleta1;
import ipc.practica2.Motocicleta2;
import ipc.practica2.Motocicleta3;
import ipc.practica2.Pedido;
import ipc.practica2.Productos;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danis
 */
public class FramePprincipal extends javax.swing.JFrame {
    
    /**
     * Creates new form Pprincipal
     */
    public FramePprincipal() {
        initComponents();
        
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Menu de pedidos");
        
        this.llenartablaproductos();
        this.Totalpedidos();
    }
    
    public void llenartablaproductos(){
        
        int tamano = Appstate.productos.size();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setRowCount(tamano);
        
        modelo.addColumn("Producto");
        modelo.addColumn("Precio");
        
        for(int i = 0; i<tamano; i++){
            Productos producto = Appstate.productos.get(i);
            modelo.setValueAt(producto.getNombre(), i, 0);
            modelo.setValueAt(producto.getPrecio(), i, 1);
        }
        
        this.jTableproductos.setModel(modelo);
    }
    
   public void Totalpedidos(){
       int columnap = 0 , total = 0;
       
       for(int i = 0; i < jTablePedido.getRowCount(); i++){
          columnap = Integer.parseInt(jTablePedido.getValueAt(i, 1).toString());    
          total += columnap;
       }
       
       jLabeltotal.setText("Total : Q" + total);
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableproductos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePedido = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButtonagregarpedido = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxvehiculo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDistancia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonconfirmarp = new javax.swing.JButton();
        jLabeltotal = new javax.swing.JLabel();
        jButtonenviarm = new javax.swing.JButton();
        jButtonagregarp = new javax.swing.JButton();
        HistorialdepedidosjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Pedido");

        jTableproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableproductos);

        jTablePedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTablePedido);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Productos");

        jButtonagregarpedido.setBackground(new java.awt.Color(51, 51, 255));
        jButtonagregarpedido.setText("Agregar Producto Seleccionado al Pedido");
        jButtonagregarpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonagregarpedidoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Vehiculo:");

        jComboBoxvehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motocicleta 1", "Motocicleta 2", "Motocicleta 3" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Distancia a recorrer:");

        jTextFieldDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDistanciaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Km");

        jButtonconfirmarp.setBackground(new java.awt.Color(51, 204, 0));
        jButtonconfirmarp.setText("Confirmar Pedido");
        jButtonconfirmarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonconfirmarpActionPerformed(evt);
            }
        });

        jLabeltotal.setText("Total: ");

        jButtonenviarm.setBackground(new java.awt.Color(255, 0, 0));
        jButtonenviarm.setText("Enviar Motocicleta");
        jButtonenviarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonenviarmActionPerformed(evt);
            }
        });

        jButtonagregarp.setBackground(new java.awt.Color(255, 102, 0));
        jButtonagregarp.setText("Agregar Producto");
        jButtonagregarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonagregarpActionPerformed(evt);
            }
        });

        HistorialdepedidosjButton.setBackground(new java.awt.Color(0, 255, 255));
        HistorialdepedidosjButton.setText("Historial de Pedidos");
        HistorialdepedidosjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialdepedidosjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonagregarpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabeltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addComponent(jButtonagregarp))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(HistorialdepedidosjButton)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonenviarm, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonconfirmarp))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(147, 147, 147))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(145, 145, 145)
                    .addComponent(jLabel2)
                    .addContainerGap(571, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonagregarpedido)
                    .addComponent(jLabeltotal))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonconfirmarp)
                    .addComponent(jButtonenviarm)
                    .addComponent(jButtonagregarp)
                    .addComponent(HistorialdepedidosjButton))
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jLabel2)
                    .addContainerGap(483, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonagregarpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonagregarpedidoActionPerformed
        //Seleccionar fila
        int row = jTableproductos.getSelectedRow();
        
        if(row != -1){
            String producto, precio;
            
            producto= jTableproductos.getValueAt(row, 0).toString();
            precio = jTableproductos.getValueAt(row, 1).toString();
            
            String datos[] = {producto, precio};
            DefaultTableModel modelop = (DefaultTableModel)jTablePedido.getModel();
            modelop.addRow(datos);
        }else{
            JOptionPane.showMessageDialog(this, "Error debe seleccionar un producto");
        }
        
        this.Totalpedidos();
    }//GEN-LAST:event_jButtonagregarpedidoActionPerformed

    private void jTextFieldDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDistanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDistanciaActionPerformed

    private void jButtonenviarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonenviarmActionPerformed
        FrameMotocicletas framemoto = new FrameMotocicletas();
    }//GEN-LAST:event_jButtonenviarmActionPerformed

    private void jButtonconfirmarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonconfirmarpActionPerformed
        if(Integer.parseInt(jTextFieldDistancia.getText()) > 0){
            if(Integer.parseInt(jTextFieldDistancia.getText()) <=  10){
                //Date date= new Date();
                String timestamp = ZonedDateTime.now(ZoneId.of("America/Guatemala")).
                        format(DateTimeFormatter.ofPattern("dd/MM/yyy - hh:mm:ss a"));
            DefaultTableModel tablapedidos = (DefaultTableModel) jTablePedido.getModel();
        int columnap = 0 , total = 0;
       for(int i = 0; i < jTablePedido.getRowCount(); i++){
          columnap = Integer.parseInt(jTablePedido.getValueAt(i, 1).toString());    
          total += columnap;
       }
              
        Pedido pedido = new Pedido(jComboBoxvehiculo.getSelectedItem().toString(),jTextFieldDistancia.getText()+" Km",
                "Q "+String.valueOf(total),timestamp);
        Appstate.pedidos.add(pedido);
        
        while (tablapedidos.getRowCount() > 0) {
            tablapedidos.removeRow(0);
        }  
        this.Totalpedidos();
        
        if(jComboBoxvehiculo.getSelectedItem().toString().equals("Motocicleta 1")){
            Motocicleta1 moto1 = new Motocicleta1(jTextFieldDistancia.getText(),"Motocicleta 1");
            Appstate.distancia1.add(moto1);
        }else if (jComboBoxvehiculo.getSelectedItem().toString().equals("Motocicleta 2")){
            Motocicleta2 moto2 = new Motocicleta2(jTextFieldDistancia.getText(),"Motocicleta 2");
            Appstate.distancia2.add(moto2);
        }else if (jComboBoxvehiculo.getSelectedItem().toString().equals("Motocicleta 3")){
            Motocicleta3 moto3 = new Motocicleta3(jTextFieldDistancia.getText(),"Motocicleta 3");
            Appstate.distancia3.add(moto3);
        }
        
        } else{
            JOptionPane.showMessageDialog(this, "Error la distancia debe ser menor o igual a 10 km");
        }
        } else{
            JOptionPane.showMessageDialog(this, "Error la distancia debe ser mayor a 0 km");
        }     
    }//GEN-LAST:event_jButtonconfirmarpActionPerformed

    private void HistorialdepedidosjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialdepedidosjButtonActionPerformed
        FrameHistorial historial = new FrameHistorial();
    }//GEN-LAST:event_HistorialdepedidosjButtonActionPerformed

    private void jButtonagregarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonagregarpActionPerformed
        LoginparaP log = new LoginparaP();
        this.dispose();
    }//GEN-LAST:event_jButtonagregarpActionPerformed

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
            java.util.logging.Logger.getLogger(FramePprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HistorialdepedidosjButton;
    private javax.swing.JButton jButtonagregarp;
    private javax.swing.JButton jButtonagregarpedido;
    private javax.swing.JButton jButtonconfirmarp;
    private javax.swing.JButton jButtonenviarm;
    private javax.swing.JComboBox<String> jComboBoxvehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabeltotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePedido;
    private javax.swing.JTable jTableproductos;
    public static javax.swing.JTextField jTextFieldDistancia;
    // End of variables declaration//GEN-END:variables
}
