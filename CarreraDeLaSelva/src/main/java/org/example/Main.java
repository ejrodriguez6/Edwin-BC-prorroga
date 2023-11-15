package org.example;



public class Main {




    public static void main(String[] args) {

        System.out.println("Hello world!");

        //a) Crear 3 objetos de tipo categoría (uno por cada categoría) con sus respectivos datos.
        Categoria circuitoChico = new Categoria(1,"Circuito chico","2 km por selva y arroyos");
        Categoria circuitoMedio = new Categoria(2,"Circuito medio","5 km por selva, arroyos y barro");
        Categoria circuitoAvanzado = new Categoria(3,"Circuito avanzado","10 km por selva, arroyos, barro y escalada en piedra");
        circuitoChico.getNombre();
        //b) Crear nuevo participante
         Participante participante1 = new Participante(1,1,"Edwin","Rodriguez",10,"094","911","O+");

         int participante1Edad = participante1.getEdad();
        System.out.println(participante1Edad);

        Prueba prueba1 = new Prueba();
        int resultadoPrueba1 = prueba1.sumar(3,2);
        System.out.println(resultadoPrueba1);

        Inscripcion inscripcion1 = new Inscripcion();
        //int resultadoInscripcion1 = inscripcion1.sumar(7,7);
       // System.out.println(resultadoInscripcion1);

//        Inscripcion inscripcion2 = new Inscripcion();
//        int retornoInscripcion2 = inscripcion2.sumar2(3);
//        System.out.println(retornoInscripcion2);

        //b) Calcular monto a abonar
        int monto_abonar = 0;
        if (circuitoAvanzado.getNombre()=="Circuito avanzado" && participante1.getEdad()>=18){
            monto_abonar = 2800;
        } else if (circuitoMedio.getNombre() == "Circuito medio" && participante1.getEdad()<18) {
            monto_abonar = 2000;
        } else if (circuitoMedio.getNombre() == "Circuito medio" && participante1.getEdad()>=18) {
            monto_abonar = 2300;
        } else if (circuitoChico.getNombre() == "Circuito chico" && participante1.getEdad()<18) {
            monto_abonar = 1300;
        } else if (circuitoChico.getNombre() == "Circuito chico" && participante1.getEdad()>=18) {
            monto_abonar =1500;
        }
        System.out.println(monto_abonar);
        //b) Inscribir a participante en categoria
        Inscripcion calculoMontoInscripcionParticipante1 = new Inscripcion(1,circuitoChico.getNombre(),participante1.getEdad());//  System.out.println(resultadoPrueba1)=5

        System.out.println(inscripcionParticipante1);







    }


}