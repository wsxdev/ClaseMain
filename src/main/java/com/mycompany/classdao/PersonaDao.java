package com.mycompany.classdao;

import com.mycompany.personaclass.Persona;

public interface PersonaDao {
    void agregarPersona(Persona persona);
    void modificarPersona(int id, Persona nuevaPersona);
    void eliminarPersona(int id);
    Persona[] obtenerTodos();
}