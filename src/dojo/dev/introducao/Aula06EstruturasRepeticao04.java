package dojo.dev.introducao;

public class Aula06EstruturasRepeticao04 {
    //dado o valor de um carro, descubra em quantas vz ele pode ser parcelado
    //condição valorparcela = 100
    public static void main(String[] args) {
        double valorTotal = 30000;
        for(int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
                break;
            }
            System.out.println("Parcela " + parcela + "R$ " + valorParcela);

        }
    }
}
