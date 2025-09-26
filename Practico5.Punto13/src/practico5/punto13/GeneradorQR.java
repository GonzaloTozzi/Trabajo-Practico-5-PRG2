/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico5.punto13;

/**
 *
 * @author Gonzalo
 */
public class GeneradorQR {
     public void generar(String valor, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(valor, usuario); 
        System.out.println("Codigo QR generado: " + codigo.getValor() +
                           " para " + codigo.getUsuario().getNombre() +
                           " (" + codigo.getUsuario().getEmail() + ")");
     }
    
}
