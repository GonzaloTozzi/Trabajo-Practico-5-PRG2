/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico5.punto9;

/**
 *
 * @author Gonzalo
 */
public class Practico5Punto9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {Paciente pac1 = new Paciente("Gonzalo Tozzi", "OSDE");
        Profesional prof1 = new Profesional("Dra. Martinez", "Cardiologia");
        CitaMedica cita1 = new CitaMedica("15/7/25", "09:30", pac1, prof1);

        System.out.println("Cita Medica:");
        System.out.println("Fecha: " + cita1.getFecha() + " Hora: " + cita1.getHora());
        System.out.println("Paciente: " + cita1.getPaciente().getNombre() + " Obra Social: " + cita1.getPaciente().getObraSocial());
        System.out.println("Profesional: " + cita1.getProfesional().getNombre() + " Especialidad: " + cita1.getProfesional().getEspecialidad());    
       
    }
    
}
