package com.mycompany.classdao;

import com.mycompany.personaclass.Persona;

public class ImplePersonaDao implements PersonaDao {
    private Persona[] personas = new Persona[5];
    private int contador = 0;
    private int idContador = 1;

    @Override
    public void agregarPersona(Persona persona) {
        if (contador < personas.length) {
            persona.setId(idContador++);
            personas[contador++] = persona;
        } else {
            System.out.println("No hay espacio disponible.");
        }
    }

    @Override
    public void modificarPersona(int id, Persona nuevaPersona) {
        for (int i = 0; i < contador; i++) {
            if (personas[i] != null && personas[i].getId() == id) {
                nuevaPersona.setId(id);
                personas[i] = nuevaPersona;
                break;
            }
        }
    }

    @Override
    public void eliminarPersona(int id) {
        for (int i = 0; i < contador; i++) {
            if (personas[i] != null && personas[i].getId() == id) {
                personas[i] = null;
                break;
            }
        }
    }

    @Override
    public Persona[] obtenerTodos() {

        int cantidadPersonas = 0;

        // Primera pasada: contar cuántas personas no son nulas
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null) {
                cantidadPersonas++;
            }
        }

        // Crear arreglo con el tamaño exacto
        Persona[] personasValidas = new Persona[cantidadPersonas];
        int posicion = 0;

        // Segunda pasada: copiar las personas válidas
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null) {
                personasValidas[posicion] = personas[i];
                posicion++;
            }
        }

        return personasValidas;
    }

}