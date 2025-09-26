/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico5.punto12;

/**
 *
 * @author Gonzalo
 */
public class Practico5Punto12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contribuyente contrib1 = new Contribuyente("Gonzalo", "202549841");
        Impuesto imp1 = new Impuesto(45812.0, contrib1);

        Calculadora calc = new Calculadora();
        calc.calcular(imp1);
    }
    
}
