/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico5.punto8;

/**
 *
 * @author Gonzalo
 */
public class Practico5Punto8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Gonzalo Tozzi", "gonzalo@email.com");
        Documento doc1 = new Documento("Contrato", "Contenido del contrato", "ASD12345", "9/12", usuario1);

        System.out.println("Documento: " + doc1.getTitulo());
        System.out.println("Contenido: " + doc1.getContenido());
        System.out.println("Firma: " + doc1.getFirma().getCodigoHash() + " Fecha: " + doc1.getFirma().getFecha());
        System.out.println("Usuario: " + doc1.getFirma().getUsuario().getNombre() + " Email: " + doc1.getFirma().getUsuario().getEmail());
    
        
    }
    
}
