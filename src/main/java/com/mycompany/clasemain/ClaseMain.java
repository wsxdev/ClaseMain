package com.mycompany.clasemain;

import com.mycompany.classdao.*;
import com.mycompany.controlador.*;
import com.mycompany.personaclass.*;

public class ClaseMain {
    public static void main(String[] args) {
        PersonaDao objPersonaDao = new ImplePersonaDao();
        PersonaServicio servicio = new PersonaServicio(objPersonaDao);

        servicio.registrarPersona(new Persona(0, "Licet", "323232", "licet@gmail.com", "Femenino", 19));
        servicio.registrarPersona(new Persona(0, "William", "232323", "william@gmail.com", "Masculino", 22));

        System.out.println("Personas registradas:");
        servicio.mostrarPersonas();

        // Modificar una persona (cambia los datos del ID 1)
        System.out.println("\n=== Modificando persona con ID 1 ===");
        Persona nuevaInfo = new Persona(1, "William A.", "232323", "william.actualizado@gmail.com", "Masculino", 23);
        servicio.modificarPersona(nuevaInfo);

        // Mostrar después de modificar
        System.out.println("\n=== Personas después de modificación ===");
        servicio.mostrarPersonas();

        // Eliminar una persona (por ID)
        System.out.println("\n=== Eliminando persona con ID 0 ===");
        servicio.eliminarPersona(0);

        // Mostrar después de eliminar
        System.out.println("\n=== Personas después de eliminación ===");
        servicio.mostrarPersonas();
    }
}