package com.example.daniel_scroll_recycler_view;

public class ListaElementos {

    public String nombre;
    public String apellido;
    public String ciudad;
    public String color;

    public ListaElementos(String nombre, String apellido, String ciudad, String color) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
