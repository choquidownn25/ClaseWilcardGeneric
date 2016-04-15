/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author choqu_000
 */
public class Emp {

    //Atributos
    private String nombre;
    private int Salario;
    //Constructor poliformismo
    public Emp(String nombre, int Salario){
        this.nombre=nombre;
        this.Salario=Salario;
    }
    
    //Encapsulamiento

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the Salario
     */
    public int getSalario() {
        return Salario;
    }

    /**
     * @param Salario the Salario to set
     */
    public void setSalario(int Salario) {
        this.Salario = Salario;
    }
    
}
