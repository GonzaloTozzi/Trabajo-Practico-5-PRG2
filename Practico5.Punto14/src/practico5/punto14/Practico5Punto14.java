/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico5.punto14;

/**
 *
 * @author Gonzalo
 */
public class Practico5Punto14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proyecto proyecto1 = new Proyecto("Pelicula nueva", 12);

        EditorVideo editor = new EditorVideo();
        editor.exportar("MP4", proyecto1);
    }
    
}
