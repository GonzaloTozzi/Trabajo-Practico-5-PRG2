/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico5.punto5;

/**
 *
 * @author Gonzalo
 */
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; //ASOC BIDIRECC.

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }
    
    public void setComputadora(Computadora computadora){
        this.computadora = computadora;
    }
    
}
