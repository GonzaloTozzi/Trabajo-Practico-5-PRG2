/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico5.pkg7;

/**
 *
 * @author Gonzalo
 */
public class Practico57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conductor conductor1 = new Conductor("Gonzalo Tozzi", "159753");
        Motor motor1 = new Motor("V8", "8745165");
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota Hilux", motor1, conductor1);

        System.out.println("Conductor: " + vehiculo1.getConductor().getNombre() + " Licencia: " + vehiculo1.getConductor().getLicencia());
        System.out.println("Vehiculo: " + vehiculo1.getModelo() + " Patente: " + vehiculo1.getPatente());
        System.out.println("Motor: " + vehiculo1.getMotor().getTipo() + " Serie: " + vehiculo1.getMotor().getNumeroSerie());
       }
    
}
