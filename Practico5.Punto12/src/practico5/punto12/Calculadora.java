/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico5.punto12;

/**
 *
 * @author Gonzalo
 */
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto de $" + impuesto.getMonto() +
                           " para " + impuesto.getContribuyente().getNombre() +
                           " (CUIL: " + impuesto.getContribuyente().getCuil() + ")");
    }
    
}
