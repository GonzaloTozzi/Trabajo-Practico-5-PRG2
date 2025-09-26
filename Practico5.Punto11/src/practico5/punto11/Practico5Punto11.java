/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico5.punto11;

/**
 *
 * @author Gonzalo
 */
public class Practico5Punto11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Artista artista1 = new Artista("Divididos", "Rock");
        Cancion cancion1 = new Cancion("Ala delta", artista1);

        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion1); 
    }
    
    
}
