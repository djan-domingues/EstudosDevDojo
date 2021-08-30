package dojo.dev.introducao;

public class Aula06EstruturasRepeticao03 {
    public static void main(String[] args) {
        //imprima os 25 primeiros numeros de um dado valor

        int valorMax = 50;
        for (int i = 0; i <= valorMax ; i++) {
            if (i <= 25){
                break;

            }
            System.out.println(i);
        }
    }
}
