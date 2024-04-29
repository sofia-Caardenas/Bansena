package org.badsena.cgmlti.java.pruebas;

public class Dog
implements IComportamientoAnimal {
  

    
//COMPORTAMIENTO
@Override
public void alimentarse(String comida){
    System.out.println("guau me estoy alimentando" + comida);
}
}
