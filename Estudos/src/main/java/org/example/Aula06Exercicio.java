package org.example;

public class Aula06Exercicio {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000

//        for (int milhao = 0; milhao <= 1000000; milhao += 2){
//            System.out.println(milhao);
//        }

        int milhao = 0;

        while (milhao <= 1000000) {
            System.out.println(milhao);
            milhao += 2;
        }


    }
}
