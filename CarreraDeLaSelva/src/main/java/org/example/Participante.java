package org.example;

public class Participante {
    private int numero_participante;
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    private String celular;
    private String numero_emergencia;
    private String grupo_sanquineo;



    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Participante(int numero_participante, int dni, String nombre, String apellido, int edad, String celular, String numero_emergencia, String grupo_sanquineo) {
        this.numero_participante = numero_participante;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.celular = celular;
        this.numero_emergencia = numero_emergencia;
        this.grupo_sanquineo = grupo_sanquineo;
    }


    @Override
    public String toString() {
        return "Participante{" +
                "numero_participante=" + numero_participante +
                ", dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", celular='" + celular + '\'' +
                ", numero_emergencia='" + numero_emergencia + '\'' +
                ", grupo_sanquineo='" + grupo_sanquineo + '\'' +
                '}';
    }
}
