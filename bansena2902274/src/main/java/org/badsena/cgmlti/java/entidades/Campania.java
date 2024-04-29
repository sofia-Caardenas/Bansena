package org.badsena.cgmlti.java.entidades;
import java.time.LocalDateTime;
public class Campania extends Habilitante{
    private String nombre;
    private LocalDateTime fechainicio;
    private LocalDateTime fechafin;
    public Campania(double valor, String nombre, LocalDateTime fechainicio, LocalDateTime fechafin) {
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
    public LocalDateTime getFechainicio() {
        return fechainicio;
    }
    public void setFechainicio(LocalDateTime fechainicio) {
        this.fechainicio = fechainicio;
    }
    public LocalDateTime getFechafin() {
        return fechafin;
    }
    public void setFechafin(LocalDateTime fechafin) {
        this.fechafin = fechafin;
    }

}
