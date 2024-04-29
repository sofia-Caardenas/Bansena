package org.badsena.cgmlti.java.pruebas;

public class PruebaMetodosGenericos {
//metodo generico (debe comenzar siempre con su tipo)
static <T> T mostrarElemento(T item){
    return item;
}
    public static void main(String[] args) {
    //llamar metodo 
    mostrarElemento("CEBOLLIN");
}
}
