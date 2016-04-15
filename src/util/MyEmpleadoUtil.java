/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import datos.Emp;

/**
 *
 * @author choqu_000
 */
public class MyEmpleadoUtil<T extends Emp> {
    
    private T emp;
    
    //Constructor
    public MyEmpleadoUtil(T objeto){
        emp=objeto;
    }
    
    //Metodos para el salario
    public int getSalario(){
        return emp.getSalario();
    }
    
    //Metodos para el Nombre
    public String getNombre(){
        return emp.getNombre();
    }
    
    //Metodo si el salario exite
    public boolean isSalarioEqual(MyEmpleadoUtil<?> otroEmp){
        //Logica
        if(emp.getSalario() == otroEmp.getSalario()){
            return true;
        }
        
        return false;
    }
    
    //Metodo para Nombre
    public boolean isNombreEqual(MyEmpleadoUtil<?> nombreOtroEmp){
        //Atributo local
        boolean respuesta;
        if (emp.getNombre().isEmpty()) {
            System.out.println("Esta Null");
            respuesta=true;
        }else{
            System.out.println("Nombre es : " + emp.getNombre());
            respuesta=false;
        }
        
        return respuesta;
    }
    
}
