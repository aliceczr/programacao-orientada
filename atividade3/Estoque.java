package Estoque;

import java.util.ArrayList;

public class Estoque {
    ArrayList<produto> produtos;

    Estoque(){
        this.produtos = new ArrayList<produto>();
    }

    public void adicionarProduto(produto p){

        this.produtos.add(p);
    }

    public String listarProdutos(){
        String listaProdutos = "";

        for (produto p: this.produtos) {

            listaProdutos += p.imprimir() + "\n";
            
        }

        return listaProdutos;
    }

    public void removerProduto(produto p ){
        this.produtos.remove(p);
    }

    public void aumentarQuantidadeProduto(produto p, int quantidade){
        for (produto produto : produtos){
            if (produto.equals(p)) {
                produto.quantidadeDisponivel += quantidade;

                if (produto.quantidadeDisponivel < 0) {
                    produto.quantidadeDisponivel = 0; 
                }

                return;
                
            }
        }
    }

    /**
     * @param p
     * @param quantidade
     */
    public void diminuirQuantidadeProduto(produto p, int quantidade){
        for (produto produto : produtos){
            if (produto.equals(p)) {
                produto.quantidadeDisponivel -= quantidade;

                 if (produto.quantidadeDisponivel < 0) {
                    produto.quantidadeDisponivel = 0;
                    
                }
            }
                
        }
    }
}


