package org.badsena.cgmlti.java.pruebas;

public class Cage <E extends IComportamientoAnimal>{
//una jaula puede tener dos mascotas del mismo tipo de animal 
private E mascota1;
private E mascota2;
public E getMascota1() {
    return mascota1;
}
public void setMascota1(E mascota1) {
    this.mascota1 = mascota1;
}
public E getMascota2() {
    return mascota2;
}
public void setMascota2(E mascota2) {
    this.mascota2 = mascota2;
}
public void AlimentarMascota(){
    this.mascota1.alimentarse("papurina");
}
}
