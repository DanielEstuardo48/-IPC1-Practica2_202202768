package ipc.practica2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danis
 */
public class Appstate {
    public static LinkedList<Productos> productos = new LinkedList();
    public static LinkedList<Pedido> pedidos = new LinkedList();
    public static LinkedList<Motocicleta1> distancia1 = new LinkedList();
    public static LinkedList<Motocicleta2> distancia2 = new LinkedList();
    public static LinkedList<Motocicleta3> distancia3 = new LinkedList();
    public static String rutaDatosSerializados = "./DatosSerializados/appState.bin";
    
    public static void serializar() {
            File file = new File(rutaDatosSerializados);

            // Creamos la carpeta donde iran los archivos serializados, si no existia
            if (!file.exists()) {
                file.getParentFile().mkdir();
            }

             // Se crea el archvio donde se va serializar
            try {
                file.createNewFile();
            } catch(IOException ex) {
                System.out.println("No se pudo crear el archvio de serialización.");
            }

            // Se escriben los datos de serializados en sobre el archivo
            try {
                FileOutputStream fos = new FileOutputStream(rutaDatosSerializados);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(productos);
                oos.writeObject(pedidos);
            } catch (FileNotFoundException ex) {
                System.out.println("No se encotro el archivo para serializar");
            } catch (IOException ex) {
                System.out.println("Ocurrio un error al intentar escribir sobre el archivo.");
            }
        }
        
        public static void deserializar() {
        try {
            File file = new File(rutaDatosSerializados);
            if (!file.exists()) {
                return;
            }
            FileInputStream fis = new FileInputStream(rutaDatosSerializados);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productos = (LinkedList<Productos>) ois.readObject();
            pedidos = (LinkedList<Pedido>) ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Appstate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Appstate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Appstate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
