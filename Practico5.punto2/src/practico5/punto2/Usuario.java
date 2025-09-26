/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico5.punto2;

/**
 *
 * @author Gonzalo
 */
public class Usuario {
    String nombre;
    String dni;
    Celular celular; // ASOC. BIDIRECC.
    
    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
}
