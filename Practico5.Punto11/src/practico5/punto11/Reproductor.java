/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico5.punto11;

/**
 *
 * @author Gonzalo
 */
public class Reproductor {
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo() + 
                           " - Artista: " + cancion.getArtista().getNombre() + 
                           " (" + cancion.getArtista().getGenero() + ")");
    }
    
}
