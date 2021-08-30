package dojo.dev.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        // !(NOT)

        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida");
        }

        //



        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida");
        }else {
            System.out.println("Não autorizado a comprar bebida");
        }

        System.out.println("Fora do if");
    }
}
