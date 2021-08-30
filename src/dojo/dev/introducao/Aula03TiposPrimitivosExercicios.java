package dojo.dev.introducao;
/*
Pratica

Crie variaveis para os campos descritos abaixo entre <> e imprima a segunte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salario de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Felipe";
        String endereco = "Rua professor antonio nascimento 201";
        double salario = 2500.50;
        String data = "19/08/21";

        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salario de "
        + salario + " na data de " + data);
    }
}
