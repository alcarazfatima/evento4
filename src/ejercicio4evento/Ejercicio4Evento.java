/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4evento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author fatimaalcaraz
 */
public class Ejercicio4Evento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList eventos = new ArrayList ();
        Scanner leer = new Scanner(System.in);
        boolean flag= true;
        do {
        try{
        
        System.out.println("Ingrese el nombre del evento");
         String nombre = leer.nextLine();
         System.out.println("Ingrese la fecha del evento, dd/mm/yyyy");
         String fecha= leer.nextLine();
         
         DateTimeFormatter forma=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
         LocalDate fecha2= LocalDate.parse(fecha, forma);
        
         
         
         System.out.println("Ingrese el responsable");
         String responsable= leer.nextLine();
        
         
        
        Evento e1= new Evento (nombre, fecha2, responsable);
        eventos.add(e1);
        
        
       
         }  catch( DateTimeParseException e){
             System.out.println("Mal formato de fecha");
    } finally {
            System.out.println("Desea agregar otro evento si/no");
            String rta= leer.nextLine();
          if(rta.equalsIgnoreCase("si")){
              
              flag= true;
    }else{
          flag= false;
          }
            }
        }while (flag==true);
        
        
        System.out.println("Lista de eventos");
        for (Object evento : eventos) {
            System.out.println(evento);
            
        }
        
        
        Collections.sort(eventos, Comparador.ordenarFecha);
        System.out.println("Eventos ordfenados por fecha");
          for (Object evento : eventos) {
            System.out.println(evento);
            
        }
          
        Collections.sort(eventos, Comparador.ordenarNombre);
        System.out.println("Eventos ordenados por nombre ");
         for (Object evento : eventos) {
            System.out.println(evento);
            
        }
    }
    
}
