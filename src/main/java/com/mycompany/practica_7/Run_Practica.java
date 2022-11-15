/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica_7;

    import java.util.ArrayList;
    import java.util.Scanner;
/**
 *
 * @author Rafael Alejandro
 */
public class Run_Practica {

    public static void main(String[] args) {
        
        Gato gt = new Gato();
        Perro pr = new Perro();
        Scanner lectura = new Scanner (System.in);
        
        ArrayList<Gato> al1 = new ArrayList<Gato>();
        ArrayList<Perro> al2 = new ArrayList<Perro>();
        
        al1.add(gt);
        al2.add(pr);
        
        
        for (Gato o : al1 ){
            System.out.println("Gato ");
            System.out.println("Ingrese su nombre: ");
            String nombre = lectura.next();
            System.out.println("Ingrese su edad: ");
            int edad = lectura.nextInt();
            System.out.println("Ingrese su raza: ");
            String color = lectura.next();
            System.out.println("Computadora ");
            System.out.println("Su nombre es: " + nombre);
            System.out.println("Su edad es: " + edad);
            System.out.println("Su raza es: " + color);
            System.out.println("            " );
        
        }
        
        for (Perro o : al2 ){
            System.out.println("Perro ");
            System.out.println("Ingrese su nombre: ");
            String nombre = lectura.next();
            System.out.println("Ingrese su edad: ");
            int edad = lectura.nextInt();
            System.out.println("Ingrese su raza: ");
            String raza = lectura.next();
            System.out.println("Computadora ");
            System.out.println("Su nombre es: " + nombre);
            System.out.println("Su edad es: " + edad);
            System.out.println("Su raza es: " + raza);
        
        }
        
        }
}
