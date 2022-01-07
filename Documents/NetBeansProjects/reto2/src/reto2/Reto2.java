/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

import java.util.ArrayList;

/**
 *
 * @author German
 */
public class Reto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Empleado> datos = new ArrayList();
        datos.add(new Empleado("Ada",5,true,1500000));
        datos.add(new Empleado("Laura",5,true,1085000));
        System.out.println("Hola");
        System.out.println(datos);
        System.out.println("Los Slarios son.....");
        System.out.println(Empresa.liquidarNominaEmp(datos));
        System.out.println("Los Slarios Parafiscales  son.....");
        System.out.println(Empresa.liquidarParafiscales(datos));
    }
    
}
