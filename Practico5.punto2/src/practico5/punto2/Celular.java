/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico5.punto2;

/**
 *
 * @author Gonzalo
 */
public class Celular {
    
    String imei;
    String marca;
    String modelo;
    Bateria bateria; // AGREGACION
    Usuario usuario; // ASOC. BIDIRECC.
    
    public Celular(String imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }
    
}
