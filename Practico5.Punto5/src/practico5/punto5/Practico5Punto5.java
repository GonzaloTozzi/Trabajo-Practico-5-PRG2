/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico5.punto5;

/**
 *
 * @author Gonzalo
 */
public class Practico5Punto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Propietario prop1 = new Propietario("Gonzalo Tozzi", "32165498");
        Computadora comp1 = new Computadora("Dell", "ASD123", "MSI B450", "AMD B450", prop1);

        System.out.println("Propietario: " + prop1.getNombre() + " DNI: " + prop1.getDni());
        System.out.println("Computadora: " + comp1.getMarca() + " Serie: " + comp1.getNumeroSerie());
        System.out.println("Placa Madre: " + comp1.getPlacaMadre().getModelo() + " Chipset: " + comp1.getPlacaMadre().getChipset());
    }
    
}
