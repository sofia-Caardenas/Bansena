package org.badsena.cgmlti.java.entidades;
import java.time.DateTimeException;
public class Campania extends Habilitante{
    private String nombre;
    private DateTimeException fechainicio;
    private DateTimeException fechafin;
    public Campania(double valor, String nombre, DateTimeException fechainicio, DateTimeException fechafin) {
        super(valor);
        this.nombre = nombre;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public DateTimeException getFechainicio() {
        return fechainicio;
    }
    public void setFechainicio(DateTimeException fechainicio) {
        this.fechainicio = fechainicio;
    }
    public DateTimeException getFechafin() {
        return fechafin;
    }
    public void setFechafin(DateTimeException fechafin) {
        this.fechafin = fechafin;
    }

}
