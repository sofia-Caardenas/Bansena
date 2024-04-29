package org.badsena.cgmlti.java.pruebas;

public class PruebaJaulas {
public static void main(String[] args) {
    //primera jaula solo perros 
    Dog perro1= new Dog();
    Dog perro2= new Dog();
    Cat gato1 =new Cat();
    Cat gato2 =new Cat();
    Cage <Dog> jaula1= new Cage<Dog>();
    jaula1.setMascota1 (perro1);
    jaula1.setMascota2 (perro2);
    Cage <Cat> jaula2= new Cage<Cat>();
    jaula2.setMascota1(gato1);
jaula2.setMascota2(gato2);
jaula1.AlimentarMascota();
}
}
