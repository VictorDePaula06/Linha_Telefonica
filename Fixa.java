package TRABALHO_AV2;

public class Fixa extends LinhaTelefonica {

    public static final int Franquia = 30;

    public  Fixa(Cliente cliente, int qtdMinutosGastos, String numero) {
        super(cliente, qtdMinutosGastos, numero);
       
    }

    @Override
    public double calcular() {
     if(getQtdMinutosGastos()<= Franquia){
        return 45.00;
     }else{
        return calcular(getQtdMinutosGastos()-Franquia);
     }
    }

    public double calcular(int minutosExcedentes){

        return (minutosExcedentes * 0.05)+ 45.00;
       
    }

    @Override
    public String toString() {
        return "\n===== Linha Fixa ===== " + 
                "\nNúmero: " + getNumero()+
                "\nQuantidade de Minutos Gastos: " + getQtdMinutosGastos()+
                "\nValor a pagar: R$" + calcular() ;
    }
    
}
