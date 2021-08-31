package dojo.dev.javacore.Bintroducaometodos.test;

import dojo.dev.javacore.Bintroducaometodos.domain.Estudante;
import dojo.dev.javacore.Bintroducaometodos.domain.ImpressoraEstudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.idade = 19;
        estudante.nome = "Djan";
        estudante.sexo = 'M';

        estudante.imprime();


    }
}
