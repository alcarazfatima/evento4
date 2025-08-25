/*
 Un centro cultural necesita registrar eventos.
Cada Evento tendrá:
• Nombre (String)
• Fecha (LocalDate)
• Responsable (String)
El sistema deberá:
1. Permitir cargar eventos pidiendo la fecha en formato dd/MM/yyyy y validándola (manejo de
excepciones si el formato es incorrecto).
2. Mostrar todos los eventos.
3. Ordenar los eventos por fecha más cercana primero y por nombre alfabéticamente usando
Comparator.
 */
package ejercicio4evento;

import java.time.LocalDate;
import java.util.Collections;

/**
 *
 * @author fatimaalcaraz
 */
public class Evento {
    private String nombre;
    private LocalDate fecha;
    private String responsable;

    public Evento(String nombre, LocalDate fecha, String responsable) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.responsable = responsable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    @Override
    public String toString() {
        return "Evento{" + "nombre=" + nombre + ", fecha=" + fecha + ", responsable=" + responsable + '}';
    }
    
    
    
}
