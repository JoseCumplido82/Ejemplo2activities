package com.example.ejemplo2activities.clases;

import java.io.Serializable;
import java.util.Objects;

public class Ciudad implements Serializable {
    private String nombre;
    private int habitantes;

    public Ciudad(String nombre, int habitantes) {
        this.nombre = nombre;
        this.habitantes = habitantes;
    }

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.habitantes =0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ciudad ciudad = (Ciudad) o;
        return nombre.equals(ciudad.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", habitantes=" + habitantes +
                '}';
    }

}
