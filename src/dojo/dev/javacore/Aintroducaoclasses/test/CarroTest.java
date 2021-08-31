package dojo.dev.javacore.Aintroducaoclasses.test;

import dojo.dev.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro02 = new Carro();
        carro.nome = "polo";
        carro.modelo = "sedan";
        carro.ano = "2008";

        carro02.nome = "mustang";
        carro02.modelo = "sport";
        carro02.ano = "1956";

        System.out.println(carro.nome + " " + carro.modelo + " " + carro.ano);
        System.out.println("------------------------------------------");
        System.out.println(carro02.nome + " " + carro02.ano + " " + carro02.modelo);
    }

}
