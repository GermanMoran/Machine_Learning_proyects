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
public class Empresa {
    ArrayList<Empleado> empleados = new ArrayList();

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    public static ArrayList<Double> liquidarNominaEmp(ArrayList<Empleado> empleados){
        ArrayList<Double> liquida = new ArrayList();
        
        int auxilio = 0;
        double totals = 0;
        double valh = 0;

     for(int x= 0; x<empleados.size(); x++){
         
         int salario = empleados.get(x).getSalario();
         int he = empleados.get(x).getHorasExtra();
         
         if(empleados.get(x).isAuxilioTrasporte() == true){
             auxilio=106454;
         }
         else{
             auxilio=0;
         }
        
         valh = salario/240;
         
         totals = (salario+(he*valh));
         
         totals = (totals - (totals*0.08))+ (auxilio);
         
         liquida.add(totals);
        }
     
       return liquida;
    }
    
    public static ArrayList<Double> liquidarParafiscales(ArrayList<Empleado> empleados){
        ArrayList<Double> paraFiscales = new ArrayList();
        
        double totals = 0;
        double valh = 0;

     for(int x= 0; x<empleados.size(); x++){
         
         int salario = empleados.get(x).getSalario();
         int he = empleados.get(x).getHorasExtra();
         
        valh = salario/240;
         
         totals = (salario+(he*valh));
         
         totals = (totals*0.09);
         
         paraFiscales.add(totals);
        }
       return paraFiscales;
    }
}
