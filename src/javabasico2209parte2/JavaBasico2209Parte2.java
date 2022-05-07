/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209parte2;

import ico.fes.Aritmetica;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author vania
 */
public class JavaBasico2209Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 
        * Excepciones
        */
        ArrayList<String> nombres=new ArrayList<String>();
        nombres.add("Alma");
        nombres.add("Bartolo");
        nombres.add("Carlos");
        nombres.add("Diana");
        nombres.add("Ernesto");
        
        for (String nombre : nombres){
            System.out.println( nombre );   
        }
        
        System.out.println("----------");
        Scanner teclado = new Scanner(System.in);
        int seleccion = 0;
        
        String elNombre="";
        try {
            elNombre = nombres.get(seleccion);
        }catch(InputMismatchException e){
            System.out.println("Debes teclear valores numericos");
            elNombre = nombres.get(0);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Error, debe ser entre 0 y 4");
            elNombre = nombres.get(0);
        }
        catch (Exception e) {
            System.out.println("Generica");
            elNombre = nombres.get(1);
        } finally {
            System.out.println( elNombre );
            elNombre=null;
            //Limpieza
        }
        
        //System.out.println( nombres.get(seleccion));
        
        System.out.println("Continua el programa ...");
        
        Aritmetica cal = new Aritmetica(2, 0);
        System.out.println( cal.getA() + "+" + cal.getB() +"=" + cal.sumar() );
        
        try {
            System.out.println( cal.getA() + "/" + cal.getB() +"=" + cal.dividir() );
        } catch (Exception e) {
            System.out.println("Error de Aritmetica");
        }
       
        
        System.out.println("Fin del programa");
    }
    
}
