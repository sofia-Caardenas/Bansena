package org.badsena.cgmlti.java.entidades;

import java.util.ArrayList;
import java.util.List;
public class Titular {
   private String nombre;
   private Long numeroIdentidicacion;
   //atributo de relacion 
 private  List<CuentaBancaria> cuentasBancarias=
    new ArrayList<CuentaBancaria>();
public Titular(String nombre, Long numeroIdentidicacion) {
    this.nombre = nombre;
    this.numeroIdentidicacion = numeroIdentidicacion;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public Long getNumeroIdentidicacion() {
    return numeroIdentidicacion;
}
public void setNumeroIdentidicacion(Long numeroIdentidicacion) {
    this.numeroIdentidicacion = numeroIdentidicacion;
}
public List<CuentaBancaria> getCuentasBancarias() {
    return cuentasBancarias;
}
public void setCuentasBancarias(List<CuentaBancaria> cuentasBancarias) {
    this.cuentasBancarias = cuentasBancarias;
}

}
