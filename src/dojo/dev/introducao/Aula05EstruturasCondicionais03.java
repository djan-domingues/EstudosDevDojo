package dojo.dev.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 3000;
        String mensagemDoar = "Eu vou doar 500 pro dev dojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        //(condição) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

    }
}
