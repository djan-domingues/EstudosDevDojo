package dojo.dev.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        //Considerando 1 como domingo

        byte dia = 5;

        switch (dia){
            case 1 :
            case 7 :
                System.out.println("não é dia util");
                break;

            case 2 :
            case 3 :
            case 4 :
            case 5 :
            case 6 :
                System.out.println("é dia util");
                break;
            default:
                System.out.println("invalido");
                break;

        }
    }
}
