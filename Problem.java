package com.company;

// Tempo de duração de um jogo, com inicio e fim como dado de entrada
public class Problem {
    public static void main(String[] args){
        int inicio = 22;
        int fim = 2;
        int horas = (fim - inicio);
        System.out.println(horas);

        if (horas < 0){
            int tempo  = (24 - inicio) + fim;
            System.out.print("O JOGO DUROU " + (tempo) + " HORA(S)\n");
        }else if(horas == 0){
            System.out.print("O JOGO DUROU 24 HORA(S)\n");
        }else if(horas > 24){
            int tempo = 24+horas;
            System.out.print("O JOGO DUROU " + ( tempo ) + " HORA(S)\n");
        }else{
            System.out.print("O JOGO DUROU " +  ( horas)       + " HORA(S)\n");
        }
    }
}
