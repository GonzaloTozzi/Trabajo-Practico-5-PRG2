/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico5.punto6;

/**
 *
 * @author Gonzalo
 */
public class Practico5Punto6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Gonzalo Tozzi", "1122334455");
        Mesa mesa1 = new Mesa(5, 4);
        Reserva reserva1 = new Reserva("09/12/2025", "20:00", cliente1, mesa1);

        System.out.println("Cliente: " + reserva1.getCliente().getNombre() + " Tel: " + reserva1.getCliente().getTelefono());
        System.out.println("Reserva: " + reserva1.getFecha() + " a las " + reserva1.getHora());
        System.out.println("Mesa: " + reserva1.getMesa().getNumero() + " Capacidad: " + reserva1.getMesa().getCapacidad());
    }
      
    
    
}
