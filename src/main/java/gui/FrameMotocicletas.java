package gui;

import ipc.practica2.Appstate;
import ipc.practica2.Motocicleta;
import ipc.practica2.Motocicleta1;
import ipc.practica2.Motocicleta2;
import ipc.practica2.Motocicleta3;
import ipc.practica2.Pedido;
import java.util.LinkedList;

/**
 *
 * @author danis
 */
public class FrameMotocicletas extends javax.swing.JFrame {
    
    LinkedList<Thread> hilomotocicleta1 = new LinkedList<>();
    LinkedList<Thread> hilomotocicleta2 = new LinkedList<>();
    LinkedList<Thread> hilomotocicleta3 = new LinkedList<>();
    
    public Motocicleta moto1 = new Motocicleta(this, 130, 80);
    public Motocicleta moto2 = new Motocicleta(this, 130, 250);
    public Motocicleta moto3 = new Motocicleta(this, 130, 450);
   
    public FrameMotocicletas() {
        initComponents();
        
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Visualizar Trayectoria");
        
        this.Llenardistacnia1();
        this.Llenardistacnia2();
        this.Llenardistacnia3();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        M1jLabel = new javax.swing.JLabel();
        d1jLabel = new javax.swing.JLabel();
        Enviarmoto1jButton = new javax.swing.JButton();
        Enviarmoto2jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        d2jLabel = new javax.swing.JLabel();
        Enviarmoto3jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        EnviarTjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Viaualización de Trayectoria");

        M1jLabel.setText("Motocicleta 1");

        d1jLabel.setText("Distancia:");

        Enviarmoto1jButton.setText("Enviar");
        Enviarmoto1jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enviarmoto1jButtonActionPerformed(evt);
            }
        });

        Enviarmoto2jButton1.setText("Enviar");
        Enviarmoto2jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enviarmoto2jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Motocicleta 2");

        d2jLabel.setText("Distancia:");

        Enviarmoto3jButton2.setText("Enviar");
        Enviarmoto3jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enviarmoto3jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Motocicleta 3");

        jLabel7.setText("Distancia:");

        EnviarTjButton.setText("Enviar Todos");
        EnviarTjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarTjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(Enviarmoto3jButton2)
                    .addComponent(jLabel4)
                    .addComponent(Enviarmoto2jButton1)
                    .addComponent(M1jLabel)
                    .addComponent(Enviarmoto1jButton)
                    .addComponent(d1jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(d2jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 701, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addComponent(EnviarTjButton)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(EnviarTjButton))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(M1jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d1jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Enviarmoto1jButton)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d2jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Enviarmoto2jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Enviarmoto3jButton2)
                        .addGap(55, 55, 55))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton moto 1
    private void Enviarmoto1jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enviarmoto1jButtonActionPerformed
        for (int i = 0; i < 1; i++) {
            //Motocicleta1 moto1 = new Motocicleta(this, 130, 80);
            hilomotocicleta1.add(new Thread(moto1));
            //posY += moto1.getAlto() + 10;
        }
        
        for (Thread h : hilomotocicleta1) {
            h.start();
        }
    }//GEN-LAST:event_Enviarmoto1jButtonActionPerformed
    
    //Boton moto 2
    private void Enviarmoto2jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enviarmoto2jButton1ActionPerformed
        for (int i = 0; i < 1; i++) {            
            hilomotocicleta2.add(new Thread(moto2));
        }
        
        for (Thread h : hilomotocicleta2) {
            h.start();
        }
    }//GEN-LAST:event_Enviarmoto2jButton1ActionPerformed
    
    //Boton moto 3
    private void Enviarmoto3jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enviarmoto3jButton2ActionPerformed
       for (int i = 0; i < 1; i++) {            
            hilomotocicleta3.add(new Thread(moto3));
        }
        
        for (Thread h : hilomotocicleta3) {
            h.start();
        }
    }//GEN-LAST:event_Enviarmoto3jButton2ActionPerformed
    
    //Boton todas
    private void EnviarTjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarTjButtonActionPerformed
        for (int i = 0; i < 1; i++) {
            hilomotocicleta1.add(new Thread(moto1));
            hilomotocicleta2.add(new Thread(moto2));
            hilomotocicleta3.add(new Thread(moto3));
        }
        for (Thread h : hilomotocicleta1) {
            h.start();
        }
        for (Thread h : hilomotocicleta2) {
            h.start();
        }
        for (Thread h : hilomotocicleta3) {
            h.start();
        }
    }//GEN-LAST:event_EnviarTjButtonActionPerformed
    
    //Distancia 1
    private void Llenardistacnia1(){
        int tamano = Appstate.distancia1.size();
        for(Motocicleta1 d: Appstate.distancia1){
            if("Motocicleta 1".equals(d.getNombre())){
                for(int i = 0; i<tamano; i++){
                Motocicleta1 moto1 = Appstate.distancia1.get(i);
                    d1jLabel.setText("Distancia: " +moto1.getDistancia().toString() +" km");
                }
            }
        }
    }
    
    //Distancia 2
    private void Llenardistacnia2(){
        int tamano = Appstate.distancia2.size();
        for(Motocicleta2 d: Appstate.distancia2){
            if("Motocicleta 2".equals(d.getNombre())){
                for(int i = 0; i<tamano; i++){
                Motocicleta2 moto2 = Appstate.distancia2.get(i);
                    d2jLabel.setText("Distancia: " +moto2.getDistancia().toString() +" km");
                }
            }
        }
    }
    
    //Distancia 2
    private void Llenardistacnia3() {
        int tamano = Appstate.distancia3.size();
        for (Motocicleta3 d : Appstate.distancia3) {
            if ("Motocicleta 3".equals(d.getNombre())) {
                for (int i = 0; i < tamano; i++) {
                    Motocicleta3 moto3 = Appstate.distancia3.get(i);
                    jLabel7.setText("Distancia: " + moto3.getDistancia().toString() + " km");
                }
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(FrameMotocicletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMotocicletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMotocicletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMotocicletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMotocicletas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EnviarTjButton;
    private javax.swing.JButton Enviarmoto1jButton;
    private javax.swing.JButton Enviarmoto2jButton1;
    private javax.swing.JButton Enviarmoto3jButton2;
    private javax.swing.JLabel M1jLabel;
    private javax.swing.JLabel d1jLabel;
    private javax.swing.JLabel d2jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}