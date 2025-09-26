/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico5.punto3;

/**
 *
 * @author Gonzalo
 */
public class Practico5Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autor autor1 = new Autor("Gonzalo Tozzi", "Argentino");
        Editorial editorial1 = new Editorial("Alas","Choele Choel, Argentina");
        Libro libro1 = new Libro("Harry Potter", "123456789", autor1, editorial1);
        
        System.out.println("Libro:" + libro1.getTitulo());
        System.out.println("ISBN: "+ libro1.getIsbn());
        System.out.println("Autor: "+ libro1.getAutor().getNombre()+ ", " + libro1.getAutor().getNacionalidad());
        System.out.println("Editorial: "+ libro1.getEditorial().getNombre()+", "+ libro1.getEditorial().getDireccion());
    }
    
}
