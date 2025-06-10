package com.mycompany.controlador;

import com.mycompany.classdao.*;
import com.mycompany.personaclass.*;

public class PersonaServicio {
    private PersonaDao dao;

    public PersonaServicio(PersonaDao dao) {
        this.dao = dao;
    }

    public void registrarPersona(Persona p) {
        dao.agregarPersona(p);
    }

    public void mostrarPersonas() {
        Persona[] lista = dao.obtenerTodos();
        for (Persona p : lista) {
            System.out.println("ID: " + p.getId());
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Edad: " + p.getEdad());
            System.out.println("Género: " + p.getGenero());
            System.out.println("Correo: " + p.getCorreo());
            System.out.println("Cédula: " + p.getCedula());
            System.out.println("----------------------");
        }
    }
}