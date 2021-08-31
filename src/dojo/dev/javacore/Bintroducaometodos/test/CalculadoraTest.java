package dojo.dev.javacore.Bintroducaometodos.test;

import dojo.dev.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();

        System.out.println("-------------------------");

        calculadora.subtraiDoisNumeros();

        System.out.println("-------------------------");

        calculadora.multiplicaDoisNumeros(10, 20);

        System.out.println("-------------------------");

        double result = calculadora.divideDoisNumeros(20 , 0);

        System.out.println(result);

        System.out.println("-------------------------");


    }
}
