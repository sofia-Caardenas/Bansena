package org.badsena.cgmlti.java;

import java.time.LocalDateTime;
import java.time.Month;

import org.badsena.cgmlti.java.entidades.Campania;
import org.badsena.cgmlti.java.entidades.CuentaBancaria;

public class Main {
    public static void main(String[] args) {
Campania ca = new Campania(1.20,   "marcos", LocalDateTime.of(2024,Month.MAY,3,13,20,00), LocalDateTime.of(2024,Month.MAY,4,13,20,00));
   
CuentaBancaria cb = new CuentaBancaria((long) 21212121, 10.02, "CEBOLLIN");}
}