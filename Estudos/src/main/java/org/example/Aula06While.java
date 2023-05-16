package org.example;

public class Aula06While {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;

//        while (count < 10) {
//            System.out.println(count);
//            count++;
//        }

        do {
            System.out.println("Imprimo mesmo se a condição for falsa, pelo menos 1x");
            count++;
        } while (count < 2);

        for (int i=0; i <= 10; i+=2){
            System.out.println(i);
        }

        int valorMax = 50;

        for (int i = 0; i < valorMax; i++) {
            if(i > 25){
                break;
            }
            System.out.println(i);
        }

    }
}

