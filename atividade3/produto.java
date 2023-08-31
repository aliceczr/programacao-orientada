package Estoque;

public class produto {

    int id;
    String nome;
    Double peso;
    int quantidadeDisponivel;

    produto (int id, String nome, Double peso){
        this.id = id;
        this.nome = nome;
        this.peso = peso;
        
    }

    String imprimir(){
        
            String ret = "";
            ret = "Nome: " + this.nome + " - Peso: " + this.peso + " kg";
            return ret;

    }

    public int getId() {
        return id;
    }


}
