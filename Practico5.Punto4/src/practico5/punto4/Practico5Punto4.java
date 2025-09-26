/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico5.punto4;

/**
 *
 * @author Gonzalo
 */
public class Practico5Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Gonzalo Tozzi", "123456789");
        Banco banco1 = new Banco("Banco Patagonia", "2013467989");
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("111122334588", "07/29", cliente1, banco1);
        
        System.out.println("Cliente: "+cliente1.getNombre()+ " DNI: "+ cliente1.getDni());
        System.out.println("Banco: "+ tarjeta1.getBanco().getNombre()+ " CUIT: "+tarjeta1.getBanco().getCuit());
        System.out.println("Tarjeta: "+ cliente1.getTarjeta().getNumero()+ " Vto: "+ cliente1.getTarjeta().getFechaVencimiento());
    }
    
}
