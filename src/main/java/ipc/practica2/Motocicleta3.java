package ipc.practica2;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author danis
 */
public class Motocicleta3 implements Runnable{
    String Distancia;
    String Nombre;
    
    public Motocicleta3(String distancia,String nombre){
        this.Distancia = distancia;
        this.Nombre = nombre;
    }

    public String getDistancia() {
        return Distancia;
    }

    public void setDistancia(String Distancia) {
        this.Distancia = Distancia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
     private ImageIcon moto1Icon= new ImageIcon("src/main/java/imagenes/Repartidor.png");
    private JLabel moto03Label = new JLabel(moto1Icon);
    private int ancho = moto1Icon.getIconWidth();
    private int alto = moto1Icon.getIconHeight();
    private JFrame tablero;
    private int posX = 0;
    private int posY = 0;
    int pedidos = 10;
    
    public Motocicleta3(JFrame tablero,int posX, int posY){
        this.posX = posX;
        this.posY = posY;
        this.moto03Label.setBounds(posX, posY, alto, ancho);
        this.tablero = tablero;
        this.tablero.add(moto03Label);
    }
    
    public JLabel getLabel() {
        return this.moto03Label;
    }
    
    public int getAlto() {
        return this.alto;
    }
    
    public boolean estaEnmovimiento() {
        return pedidos > 0;
    }
        
    @Override
    public void run() {      
        int tamano = Appstate.distancia3.size();
        boolean derecha = true;
         while(estaEnmovimiento()){
            if ((derecha && (posX + ancho + 50) > tablero.getWidth())
                    || (!derecha && (posX - 150) < 0)) {
                derecha = !derecha;
            }

            if (derecha) {
                for(int i = 0; i<tamano; i++){
                Motocicleta3 moto03 = Appstate.distancia3.get(i);
                    posX += 30/Integer.parseInt(moto03.getDistancia().toString());                   
                }
            } else {
                //posX -= 30;
            }

            this.moto03Label.setLocation(posX , posY);

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
         }   
    }
    
}
