
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottoalexander
 */
public class pacientes_orden extends VectorHeap {   
    private String Nombre;
    private String apellido;
    private String lesion;
    private String letra; 
    private int priority; 

    public pacientes_orden(String letra, String lesion, String apellido, String Nombre, int priority) {
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.lesion = lesion;
        this.letra = letra;
        this.priority = priority;
    }
    
     public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getLesion() {
        return lesion;
    }
    public void setLesion(String lesion) {
        this.lesion = lesion;
    }
    
    public String getLetra() {
        return letra;
    }
    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    public int getPriority() {
         return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
}