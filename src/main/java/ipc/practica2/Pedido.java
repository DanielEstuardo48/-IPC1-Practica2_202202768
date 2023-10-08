package ipc.practica2;

/**
 *
 * @author danis
 */
public class Pedido {
    public String Vehiculo;
    public String Distancia;
    String Monto;
    String Fecha;
    
    public Pedido (String Vehiculo, String Distancia, String Monto, String Fecha){
        this.Vehiculo = Vehiculo;
        this.Distancia = Distancia;
        this.Monto = Monto;
        this.Fecha = Fecha;
    }

    public String getVehiculo() {
        return Vehiculo;
    }

    public void setVehiculo(String Vehiculo) {
        this.Vehiculo = Vehiculo;
    }

    public String getDistancia() {
        return Distancia;
    }

    public void setDistancia(String Distancia) {
        this.Distancia = Distancia;
    }

    public String getMonto() {
        return Monto;
    }

    public void setMonto(String Monto) {
        this.Monto = Monto;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    
}
