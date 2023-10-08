/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ipc.practica2;

import gui.FramePprincipal;

/**
 *
 * @author danis
 */
public class Practica2 {

    public static void main(String[] args) {
        Appstate.deserializar();
        if(Appstate.productos.isEmpty()){
            Productos producto = new Productos("Pizza Grande",100);
            Appstate.productos.add(producto);
            Appstate.productos.add(new Productos("Hamburguesa",30));
            Appstate.productos.add(new Productos("Nachos con queso",25));
            Appstate.productos.add(new Productos("Pollo frito",40));
        }
 
        
        FramePprincipal pprincipal = new FramePprincipal();
    }
}
