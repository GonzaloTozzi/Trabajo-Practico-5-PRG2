/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico5.punto10;

/**
 *
 * @author Gonzalo
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; // Composición: la cuenta contiene su clave
    private Titular titular;      // Asociación bidireccional con Titular

    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaModificacion); // Composición
        this.titular = titular;
        titular.setCuenta(this); // mantener la relación bidireccional
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public Titular getTitular() {
        return titular;
    }
}
