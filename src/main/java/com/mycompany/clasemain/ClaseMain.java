package com.mycompany.clasemain;

import com.mycompany.classdao.*;
import com.mycompany.controlador.*;
import com.mycompany.personaclass.*;

public class ClaseMain {
    public static void main(String[] args) {
        PersonaDao objPersonaDao = new ImplePersonaDao();
        PersonaServicio servicio = new PersonaServicio(objPersonaDao);

        servicio.registrarPersona(new Persona(0, "Licet", "123456", "licet@gmail.com", "Femenino", 20));
        servicio.registrarPersona(new Persona(0, "William", "654321", "william@gmail.com", "Masculino", 21));

        System.out.println("Personas registradas:");
        servicio.mostrarPersonas();
    }
}