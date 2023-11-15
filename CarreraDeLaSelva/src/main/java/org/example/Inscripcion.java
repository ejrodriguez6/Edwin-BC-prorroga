package org.example;

public class Inscripcion {
    private int numero_inscripcion;
    private Categoria categoria;
    private Participante participante;

    private int monto_abonar;



    public Inscripcion(){

    }
    public Inscripcion(int numero_inscripcion, Categoria categoria, Participante participante) {
        this.numero_inscripcion = numero_inscripcion;
        this.categoria = categoria;
        this.participante = participante;

        this.calculoMonto("Circuito avanzado",18);
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Participante getParticipante() {
        return participante;
    }

    public int getMonto_abonar() {
        return monto_abonar;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public void setMonto_abonar(int monto_abonar) {
        this.monto_abonar = monto_abonar;
    }

    public  void calculoMonto(Categoria categoria, Participante participante_edad) {
        System.out.println("Categoria: "+categoria+" / Edad: "+edad);
    }
int sumar2(int n){
        return n + n;
}

    @Override
    public String toString() {
        return "Inscripcion{" +
                "numero_inscripcion=" + numero_inscripcion +
                ", categoria=" + categoria +
                ", participante=" + participante +
                ", monto_abonar=" + monto_abonar +   ", sumar2=" + sumar2(monto_abonar) +
                '}';
    }
}
