package dojo.dev.introducao;

public class Aula07Arrays02 {

    public static void main(String[] args) {

        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Gok";
        nomes[2] = "Gku";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }

}
