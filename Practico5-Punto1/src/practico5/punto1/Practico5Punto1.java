/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico5.punto1;

/**
 *
 * @author Gonzalo
 */
public class Practico5Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CREAR
        Titular titular = new Titular("Juan", "12345678");
        Pasaporte pasaporte = new Pasaporte("AR123", "2024-01-15");
        
        // DAR VALORES
        titular.pasaporte = pasaporte;
        pasaporte.titular = titular;
        
        // PRINT
        System.out.println("Titular: " + titular.nombre);
        System.out.println("Pasaporte: " + pasaporte.numero);
        System.out.println("Foto formato: " + pasaporte.foto.formato);
    }
}
    

