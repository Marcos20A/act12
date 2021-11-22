/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.act12;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class prueba {
    
        private Scanner sc;

    
        public prueba() {
        sc = new Scanner(System.in);
        sc.useDelimiter("\n"); 
        sc.useLocale(Locale.US); 
    }
        
    public String pideString() {

        System.out.println("Introduce una cadena");
        String cadena = sc.next();

        return cadena;

    }


    public String pideString(String mensaje) {

        System.out.println(mensaje);
        String cadena = sc.next();

        return cadena;

    }
    
}
