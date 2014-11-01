/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ramirez.j.h.j;


public class Evaluacion {
  
    private String nombre;
    private float calificaion;
    
     public Evaluacion() {   
     }

    public Evaluacion(String nombre, float calificaion) {
        this.nombre = nombre;
        this.calificaion = calificaion;
    }

    public float getCalificaion() {
        return calificaion;
    }

    public void setCalificaion(float calificaion) {
        this.calificaion = calificaion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
