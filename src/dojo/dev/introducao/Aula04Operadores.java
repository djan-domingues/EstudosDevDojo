package dojo.dev.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // +     -    /    *
        double numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 + numero02;

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // <  >    <=    >=   ==  !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezDiferenteVinte " + isDezDiferenteVinte);

        // && (AND)     || (OR)   !(NOT)

        /*
        V && V = v
        V && F = F
        F && V = F
        F && F = F

        V || V = V
        V || F = V
        F || V = V
        F || F = f


         */
        int idade = 35;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000f;

        boolean isPlaysatationCincoCompravel = valorTotalContaCorrente > valorPlaystation ||
                valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaysatationCincoCompravel " + isPlaysatationCincoCompravel);

        // =   +=   -=   *=    %=   /=

        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1; // contador = contador +1;
        contador ++;
        contador --;









    }
}
