/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4evento;

import java.util.Comparator;

/**
 *
 * @author fatimaalcaraz
 */
public class Comparador {
    public static Comparator <Evento> ordenarFecha= new Comparator<Evento>() {
        @Override
        public int compare(Evento o1, Evento o2) {
            return o1.getFecha().compareTo(o2.getFecha());
        }
    };
        
    public static Comparator <Evento> ordenarNombre= new Comparator<Evento>() {
        @Override
        public int compare(Evento o1, Evento o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
    };
        
        
   
}
