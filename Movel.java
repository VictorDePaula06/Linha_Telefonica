package TRABALHO_AV2;


public class Movel extends LinhaTelefonica {

    private boolean planoDadosHabilitados;


    public boolean getPlanoDadosHabilitados() {
        return planoDadosHabilitados;
    }

    public void setPlanoDadosHabilitados(boolean planoDadosHabilitados) {
        this.planoDadosHabilitados = planoDadosHabilitados;
    }

    public Movel(Cliente cliente, int qtdMinutosGastos, String numero ,boolean planoDadosHabilitados) {
        super(cliente, qtdMinutosGastos, numero);
        setPlanoDadosHabilitados(planoDadosHabilitados);
       
    }

    @Override
    public double calcular() {
        if (planoDadosHabilitados == true){
            return (getQtdMinutosGastos() * 0.20) + 40;
        }else{
            return getQtdMinutosGastos()* 0.20;
        }
     

    }

    @Override
    public String toString() {
        return "\n====== Linha Móvel ===== "+
                "\nNúmero: " + getNumero()+
                "\nQuantidade de Minutos Gastos: " + getQtdMinutosGastos() +
                "\nPlano de dados Habilitados: " + getPlanoDadosHabilitados() +
                "\nValor a pagar: R$" + calcular();
    }


    
}
