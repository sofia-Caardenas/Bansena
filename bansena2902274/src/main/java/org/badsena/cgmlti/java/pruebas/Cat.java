package org.badsena.cgmlti.java.pruebas;

public class Cat 
    implements IComportamientoAnimal {
  

    
        //COMPORTAMIENTO
        @Override
        public void alimentarse(String comida){
            System.out.println("miau como " + comida);
        }
}
