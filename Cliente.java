package TRABALHO_AV2;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private String endereco;
    private String NumEndereco;


    public String getNumEndereco() {
        return NumEndereco;
    }
    public void setNumEndereco(String numEndereco) {
        NumEndereco = numEndereco;
    }

    private List<LinhaTelefonica> linhaTelefonica = new ArrayList<>();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public List<LinhaTelefonica> getLinhaTelefonica() {
        return linhaTelefonica;
    }
    public void setLinhaTelefonica(List<LinhaTelefonica> linhaTelefonica) {
        this.linhaTelefonica = linhaTelefonica;
    }
    
    
  
    public Cliente(String nome, String endereco , String numEndereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.NumEndereco = numEndereco;
    }
       
    @Override
    public String toString() {
        String txt = "+++++ REDE TELEMAR +++++ "+ "\n" +
                    "\nNome do Cliente: " + getNome() +
                     "\nEndereco: " + getEndereco() + ", Número: " + getNumEndereco() + "\n";
                     for(LinhaTelefonica telefone: linhaTelefonica){
                        txt += telefone + "\n";
            } 
         return txt;
    }

    

    


    
}
