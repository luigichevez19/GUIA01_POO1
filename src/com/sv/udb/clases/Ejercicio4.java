/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.awt.Event;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Ejercicio4 { int resp;
        

    public Ejercicio4() {
        
        int resp;
        resp=1;
        
        while(resp != 0)
        {
            int numero = (int) (Math.random()*6+1);
            System.out.println("El dado tiene el numero: "+numero);
            
            /* System.out.println("Desea cancelar ingrese 0");
            Scanner br = new Scanner(System.in);
            resp = br.nextInt();*/ 
           /* System.out.println("Desea cancelar ingrese 0");
            Scanner br = new Scanner(System.in);
            resp = br.nextInt();*/
            
        }
    }
   
    
    
}
