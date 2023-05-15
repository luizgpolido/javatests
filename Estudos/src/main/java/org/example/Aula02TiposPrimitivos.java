package org.example;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>

*/
public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean

        String nome = "Luiz";
        String endereco = "São Paulo";
        float salario = 2500;
        String data = "15/05/2023";

        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de R$" + salario + ", na data: " + data);
    }
}
