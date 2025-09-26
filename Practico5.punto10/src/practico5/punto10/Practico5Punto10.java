/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico5.punto10;

/**
 *
 * @author Gonzalo
 */
public class Practico5Punto10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Titular titular1 = new Titular("Gonzalo", "30123456");
        CuentaBancaria cuenta1 = new CuentaBancaria("12345678943", 150000.0, "abc123", "09/12/2025", titular1);

        System.out.println("Cuenta Bancaria:");
        System.out.println("CBU: " + cuenta1.getCbu() + " - Saldo: $" + cuenta1.getSaldo());
        System.out.println("Titular: " + cuenta1.getTitular().getNombre() + " DNI: " + cuenta1.getTitular().getDni());
        System.out.println("Clave de seguridad: " + cuenta1.getClave().getCodigo() + " (Ult. modif: " + cuenta1.getClave().getUltimaModificacion() + ")");
   
    }
    
}
