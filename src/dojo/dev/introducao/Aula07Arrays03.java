package dojo.dev.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[]numeros2 = {1,2,3,4,5};
        int[]numeros3 = new int[]{5,8,9,5,7};

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }

        //resumo com variavel de referencia
        for (int num:numeros3) {
            System.out.println(num);
        }
    }

}
