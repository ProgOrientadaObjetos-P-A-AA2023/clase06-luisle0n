/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author luisa
 */
public class Colegio {
    private String nombre;
    private String cuidad;
    public Colegio(String n, String c){
        nombre=n;
        cuidad=c;
    }
    public void establecerNombre(String x){
        nombre=x;
    }
    public void establecerCuidad(String x){
        nombre=x;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerCuidad(){
        return cuidad;
    }
            
}
