/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico5.punto14;

/**
 *
 * @author Gonzalo
 */
public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto); // se instancia aca
        System.out.println("Exportando proyecto '" + render.getProyecto().getNombre() +
                           "' (" + render.getProyecto().getDuracionMin() + " min)" +
                           " en formato " + render.getFormato());
    }
    
}
