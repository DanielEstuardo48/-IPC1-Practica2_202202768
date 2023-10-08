package ipc.practica2;

/**
 *
 * @author danis
 */

public class Productos {
    String Nombre;
    Integer Precio;
    
    public Productos(String nombre, Integer precio){
        this.Nombre = nombre;
        this.Precio = precio;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void Nombre(String nombre){
        this.Nombre = nombre;
    }
    
    public Integer getPrecio(){
        return Precio;
    }
    
    public void Precio(Integer precio){
        this.Precio = precio;
    }
}
