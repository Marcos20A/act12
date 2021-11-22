/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.act12;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author Marco
 */
public class AddressBook {
    
    public static void main(String[] args) {
        
    Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        boolean salir = false;
        int opcion;

        
        HashMap<String, String> agenda = new HashMap<>();
        
        
        prueba teclado = new prueba();
        
        String nombre,telefono;

        
        while (!salir) {
            
            System.out.println("Hola!");
            System.out.println("Tus opciones son las siguientes: ");
            System.out.println("1.- Añadir contacto");
            System.out.println("2.- Lista de contactos");
            System.out.println("3.- Buscar contacto");
            System.out.println("4.- Contacto existente");
            System.out.println("5.- Eliminar contacto");
            System.out.println("0.- Salir");
            try {
                System.out.println("Escribe una opción");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:

                       
                        nombre = teclado.pideString("Introduce el nombre").toLowerCase().trim();
                        telefono = teclado.pideString("Introduce el telefono");
                        
                        
                        if(!agenda.containsKey(nombre)){
                            agenda.put(nombre.toLowerCase().trim(), telefono);
                            System.out.println("Se ha añadido con exito el contacto!");
                        }else{
                            System.out.println("Ya existe el contacto en la agenda");
                        }
                        
                        break;
                    case 2:
                        
                        
                        if(agenda.entrySet().isEmpty()){
                            System.out.println("No hay contactos");
                        }else{
                           
                            for(Map.Entry<String, String> entry: agenda.entrySet()){
                                System.out.println(" Telefono: "+entry.getValue()+" Nombre: "+entry.getKey());
                            }
                        }
                        
                        break;
                    case 3:

                       
                        nombre = teclado.pideString("Introduce el nombre").toLowerCase().trim();
                        
                        
                        if(agenda.containsKey(nombre)){
                            System.out.println("El telefono es "+agenda.get(nombre));
                        }else{
                            System.out.println("El contacto no existe");
                        }
                        
                        break;
                    case 4:
                        
                        
                        nombre = teclado.pideString("Introduce el nombre").toLowerCase().trim();
                        
                       
                        if(agenda.containsKey(nombre)){
                            System.out.println("El contacto ya existe!");
                        }else{
                            System.out.println("El contacto no existe!");
                        }
                        break;
                    case 5:

                       
                        nombre = teclado.pideString("Introduce el nombre").toLowerCase().trim();
                        
                         
                        if(agenda.containsKey(nombre)){
                            agenda.remove(nombre);
                            System.out.println("El contacto ha sido borrado con exito!");
                        }else{
                            System.out.println("El contacto no existe");
                        }
                        
                        break;
                    case 0:
                        
                        System.out.println("Adiosin >:)");
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 0 y 5 :)");
                }

            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número por favor");
                sn.next();
            }

        }

    }
    
    
}
