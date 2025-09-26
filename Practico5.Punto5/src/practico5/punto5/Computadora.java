/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico5.punto5;

/**
 *
 * @author Gonzalo
 */
public class Computadora {
    
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; //COMPOSICION
    private Propietario propietario; // ASOC B

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset);
        this.propietario = propietario;
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }
    
    
    
}
