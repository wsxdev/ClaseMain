package com.mycompany.controlador;

import com.mycompany.classdao.*;
import com.mycompany.personaclass.*;

public class PersonaServicio {
    private PersonaDao personaDao;

    public PersonaServicio(PersonaDao personaDao) {
        this.personaDao = personaDao;
    }

    public void registrarPersona(Persona registrarPersona) {
        personaDao.agregarPersona(registrarPersona);
    }

    public void modificarPersona(Persona nuevaPersona) {
        personaDao.modificarPersona(nuevaPersona.getId(), nuevaPersona);
    }

    public void eliminarPersona(int id) {
        personaDao.eliminarPersona(id);
    }

    public void mostrarPersonas() {
        Persona[] lista = personaDao.obtenerTodos();
        for (int i = 0; i < lista.length; i++) {
            Persona varPersona = lista[i];
            if (varPersona != null) {
                System.out.println("ID: " + varPersona.getId());
                System.out.println("Nombre: " + varPersona.getNombre());
                System.out.println("Edad: " + varPersona.getEdad());
                System.out.println("Género: " + varPersona.getGenero());
                System.out.println("Correo: " + varPersona.getCorreo());
                System.out.println("Cédula: " + varPersona.getCedula());
                System.out.println("----------------------");
            }
        }
    }
}