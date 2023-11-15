package org.example;

public class Categoria {
    private int id;
    private String nombre;
    private String Descripcion;

    public Categoria(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.Descripcion = descripcion;
    }

    public Categoria(String nombre){
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public  int sumar(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", Descripcion='" + Descripcion + '\'' +
                '}';
    }
}
