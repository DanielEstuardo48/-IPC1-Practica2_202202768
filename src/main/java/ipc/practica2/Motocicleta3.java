package ipc.practica2;

import javax.swing.JFrame;

/**
 *
 * @author danis
 */
public class Motocicleta3{
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
    
    
    
}