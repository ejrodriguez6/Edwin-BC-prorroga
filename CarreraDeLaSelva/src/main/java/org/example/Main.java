package org.example;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Carrera de la Selva
public class Main {



    public static void main(String[] args) {

        int montoAbono = 0;
        int montoTotal = 0;

        List<Map<String, String>> circuitoChico = new ArrayList<>();
        List<Map<String, String>> circuitoMedio = new ArrayList<>();
        List<Map<String, String>> circuitoAvanzado = new ArrayList<>();




        // número de participante, dni, nombre, apellido, edad, celular, número de emergencia y grupo sanguíneo.
        Map<String, String> participante1 = new HashMap<>();
        participante1.put("Numero de Participante", "1");
        participante1.put("DNI", "1");
        participante1.put("Nombre", "Edwin");
        participante1.put("Apellido", "Rodriguez");
        participante1.put("Edad", "38");
        participante1.put("Celular", "+59894");
        participante1.put("Numero de emergencia", "*911");
        participante1.put("Grupo Sanguineo", "O+");

        circuitoChico.add(0, participante1);



        // número de participante, dni, nombre, apellido, edad, celular, número de emergencia y grupo sanguíneo.
        Map<String, String> participante2 = new HashMap<>();
        participante2.put("Numero de Participante", "2");
        participante2.put("DNI", "2");
        participante2.put("Nombre", "Javier");
        participante2.put("Apellido", "Cassaniti");
        participante2.put("Edad", "15");
        participante2.put("Celular", "+59893");
        participante2.put("Numero de emergencia", "*611");
        participante2.put("Grupo Sanguineo", "A+");

        circuitoChico.add(0, participante2);


        // número de participante, dni, nombre, apellido, edad, celular, número de emergencia y grupo sanguíneo.
        Map<String, String> participante3 = new HashMap<>();
        participante3.put("Numero de Participante", "3");
        participante3.put("DNI", "3");
        participante3.put("Nombre", "Mariana");
        participante3.put("Apellido", "Introna");
        participante3.put("Edad", "27");
        participante3.put("Celular", "+59892");
        participante3.put("Numero de emergencia", "*711");
        participante3.put("Grupo Sanguineo", "B+");

        circuitoMedio.add(0, participante3);


        // número de participante, dni, nombre, apellido, edad, celular, número de emergencia y grupo sanguíneo.
        Map<String, String> participante4 = new HashMap<>();
        participante4.put("Numero de Participante", "4");
        participante4.put("DNI", "4");
        participante4.put("Nombre", "Fernanda");
        participante4.put("Apellido", "Escala");
        participante4.put("Edad", "21");
        participante4.put("Celular", "+59891");
        participante4.put("Numero de emergencia", "*111");
        participante4.put("Grupo Sanguineo", "B-");

        circuitoAvanzado.add(0, participante4);


        // número de participante, dni, nombre, apellido, edad, celular, número de emergencia y grupo sanguíneo.
        Map<String, String> participante5 = new HashMap<>();
        participante5.put("Numero de Participante", "5");
        participante5.put("DNI", "5");
        participante5.put("Nombre", "Victoria");
        participante5.put("Apellido", "Lopez");
        participante5.put("Edad", "34");
        participante5.put("Celular", "+598900");
        participante5.put("Numero de emergencia", "*011");
        participante5.put("Grupo Sanguineo", "A-");

        circuitoAvanzado.add(0, participante5);

        //Borro el participante5
        circuitoAvanzado.remove(participante4);

        System.out.println("*** Participantes Circuito Chico *** ");
        int montoCategoriaChico = 0;
        //Recorremos los participantes en el circuitoChico
        for (Map<String, String> participante : circuitoChico) {

                if(Integer.parseInt(participante.get("Edad")) < 18){
                    montoAbono = 1300;
                    System.out.println(" Numero de inscripcion: "+participante.get("Numero de Participante")+ ".  el/la participante "+participante.get("Nombre")+", es menor de edad y abona $"+montoAbono);

                    montoTotal = montoTotal + montoAbono;
                    montoCategoriaChico= montoCategoriaChico + montoAbono;
                }
                else {
                    montoAbono = 1500;
                    System.out.println(" Numero de inscripcion: "+participante.get("Numero de Participante")+ ".  el/la participante "+participante.get("Nombre")+", es mayor de edad y abona $"+montoAbono);

                    montoTotal = montoTotal + montoAbono;
                    montoCategoriaChico= montoCategoriaChico + montoAbono;
                }


            System.out.println(" ....Monto Categoria Circuito Chico: $"+montoCategoriaChico);
            System.out.println("Monto total: "+ montoTotal);
        }

        System.out.println("*** Participantes Circuito Medio ***");
        int montoCategoriaMedio = 0;
        //Recorremos los participantes en el circuitoMedio
        for (Map<String, String> participante : circuitoMedio) {

            if(Integer.parseInt(participante.get("Edad")) < 18){
                montoAbono = 2000;
                System.out.println(" Numero de inscripcion: "+participante.get("Numero de Participante")+ ".  el/la participante "+participante.get("Nombre")+", es menor de edad y abona $"+montoAbono);

                montoTotal = montoTotal + montoAbono;
                montoCategoriaMedio= montoCategoriaMedio + montoAbono;

            }
            else {
                montoAbono = 2300;
                System.out.println(" Numero de inscripcion: "+participante.get("Numero de Participante")+ ".  el/la participante "+participante.get("Nombre")+", es mayor de edad y abona $"+montoAbono);

                montoTotal = montoTotal + montoAbono;
                montoCategoriaMedio= montoCategoriaMedio + montoAbono;

            }


            System.out.println(" ....Monto Categoria Circuito Medio: $"+montoCategoriaMedio);
            System.out.println("Monto total: "+ montoTotal);
        }

        System.out.println("*** Participantes Circuito Avanzado ***");
        int montoCategoriaAvanzado = 0;
        //Recorremos los participantes en el circuitoAvanzado
        for (Map<String, String> participante : circuitoAvanzado) {

            if(Integer.parseInt(participante.get("Edad")) < 18){
                System.out.println("No se permite los menores de 18 anios en Circuito Avanzado");
            }
            else {
                montoAbono = 2800;
                System.out.println(" Numero de inscripcion: "+participante.get("Numero de Participante")+ ".  el/la participante "+participante.get("Nombre")+", es mayor de edad y abona $"+montoAbono);
                montoTotal = montoTotal + montoAbono;
                montoCategoriaAvanzado= montoCategoriaAvanzado + montoAbono;

            }


            System.out.println(" ....Monto Categoria Circuito Avanzado: $"+montoCategoriaAvanzado);
            System.out.println("Monto total: "+ montoTotal);
        }


    }


}