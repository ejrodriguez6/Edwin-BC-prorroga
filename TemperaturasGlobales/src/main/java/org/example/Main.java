package org.example;


public class Main {
    public static void main(String[] args) {



//Vector ciudades
        String ciudades[]= {"Londres","Madrid","Nueva York","Buenos Aires","Asuncion","Sao Paulo","Lima","Santiago de Chile","Lisboa","Tokio"};
        //  System.out.println("cantidad de ciudades:"+ciudades.length);
        //  System.out.println("Ciudad indice cero: "+ciudades[0]);
        //Matriz temperaturas: min , max
        int temperaturas[][] = new int[10][2];

        temperaturas[0][0]=-2;
        temperaturas[0][1]=33;

        temperaturas[1][0]=-3;
        temperaturas[1][1]=32;

        temperaturas[2][0]=-8;
        temperaturas[2][1]=27;

        temperaturas[3][0]=4;
        temperaturas[3][1]=37;

        temperaturas[4][0]=6;
        temperaturas[4][1]=42;

        temperaturas[5][0]=5;
        temperaturas[5][1]=43;

        temperaturas[6][0]=0;
        temperaturas[6][1]=39;

        temperaturas[7][0]=-7;
        temperaturas[7][1]=26;

        temperaturas[8][0]=-1;
        temperaturas[8][1]=31;

        temperaturas[9][0]=-10;
        temperaturas[9][1]=35;

        int tempMax = temperaturas[0][0];
        int tempMin = temperaturas[0][0];
        String ciudadMin = ciudades[0];
        String ciudadMax = ciudades[0];


        for (int f = 0; f <= 9; f++){
            for (int c = 0; c <= 1; c++){
                //  System.out.println(" Fila: "+f + " / Columna: "+c);
                //  System.out.println(" Valor: "+ temperaturas[f][c]);

                if(temperaturas[f][c] > tempMax){
                    tempMax=temperaturas[f][c];
                    ciudadMax = ciudades[f];
                }

                if(temperaturas[f][c] < tempMin){
                    tempMin=temperaturas[f][c];
                    ciudadMax = ciudades[f];
                }

            }
        }


        System.out.println("Ciudad: "+ciudadMax+" / Temperatura maxima: "+tempMax);
        System.out.println("Ciudad: "+ciudadMin+" / Temperatura minima: "+tempMin);
    }
}