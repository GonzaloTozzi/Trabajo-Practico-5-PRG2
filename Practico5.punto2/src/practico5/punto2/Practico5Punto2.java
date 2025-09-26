/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico5.punto2;

/**
 *
 * @author Gonzalo
 */
public class Practico5Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("Ana", "87654321");
        Celular celular = new Celular("123456789", "Samsung", "S22");
        Bateria bateria = new Bateria("Bateria123", 4500);
        
        // AGREGACION
        celular.bateria = bateria;
        
        // RELACION BIDIRECCIONAL
        usuario.celular = celular;
        celular.usuario = usuario;
        
        // PRINT
        System.out.println("Usuario: " + usuario.nombre);
        System.out.println("Celular: " + celular.marca + " " + celular.modelo);
        System.out.println("Bateria: " + celular.bateria.capacidad + " mAh");
    }
}
    

