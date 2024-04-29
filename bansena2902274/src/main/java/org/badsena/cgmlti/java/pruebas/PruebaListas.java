package org.badsena.cgmlti.java.pruebas;

import java.util.List;
import java.util.ArrayList;
public class PruebaListas {
public static void main(String[] args) {
    List<Integer> lEnteros = new ArrayList();
    lEnteros.add(2);
    lEnteros.add(3);
    lEnteros.add(5);
    lEnteros.add(60);
    //sacar un elemento de la lista
//System.out.println(lEnteros.get(0));
//recorrer la lista 
//conversion de tipos de datos 
for(Object n :lEnteros){
    Integer numero=(Integer)n;
    System.out.println(numero);
}

}
}
