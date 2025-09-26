/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico5.punto13;

/**
 *
 * @author Gonzalo
 */
public class Practico5Punto13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Gonzalo", "gonzalo@mail.com");

        GeneradorQR generador = new GeneradorQR();
        generador.generar("QRNUEVO", usuario1);
    }
    
}
