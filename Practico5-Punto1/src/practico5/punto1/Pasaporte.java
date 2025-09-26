/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico5.punto1;

/**
 *
 * @author Gonzalo
 */
public class Pasaporte {
    String numero;
    String fechaEmision;
    Foto foto; // COMPOSICION
    Titular titular; // ASOC. BIDIRECC.
    
    public Pasaporte(String numero, String fechaEmision) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto("imagen.jpg", "JPEG"); // COMPOSICION
    }
    
}
