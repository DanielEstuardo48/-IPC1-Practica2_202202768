package ipc.practica2;

import gui.FramePprincipal;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author danis
 */
public class Motocicleta implements Runnable {
    private FramePprincipal fmrlista;
    private ImageIcon moto1Icon= new ImageIcon("src/main/java/imagenes/Repartidor.png");
    private JLabel moto1Label = new JLabel(moto1Icon);
    private int ancho = moto1Icon.getIconWidth();
    private int alto = moto1Icon.getIconHeight();
    private JFrame tablero;
    private int posX = 0;
    private int posY = 0;
    int pedidos = 10;
    
    public Motocicleta(JFrame tablero,int posX, int posY){
        this.posX = posX;
        this.posY = posY;
        this.moto1Label.setBounds(posX, posY, alto, ancho);
        this.tablero = tablero;
        this.tablero.add(moto1Label);
    }
    
    public JLabel getLabel() {
        return this.moto1Label;
    }
    
    public int getAlto() {
        return this.alto;
    }
    
    public boolean estaEnmovimiento() {
        return pedidos > 0;
    }
    
    public void setFmrLista(FramePprincipal fmrLista) {
        this.fmrlista = fmrLista;
    }
    
    @Override
    public void run() {
        String distancia = fmrlista.jTextFieldDistancia.getText();
        boolean derecha = true;
        while(estaEnmovimiento()){
            if ((derecha && (posX + ancho + 50) > tablero.getWidth())
                    || (!derecha && (posX - 150) < 0)) {
                derecha = !derecha;
            }

            if (derecha) {
                posX += 30/Integer.parseInt(distancia);
            } else {
                //posX -= 30;
            }

            this.moto1Label.setLocation(posX , posY);

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
