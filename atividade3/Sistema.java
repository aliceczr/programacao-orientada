package Estoque;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args){
        int opcao = 0;
        Estoque estoque = new Estoque();

        Scanner scanner = new Scanner(System.in);

        while (opcao != 5){
            System.out.println("1 - Adicionar produtos");
            System.out.println("2 - Remover produtos ");
            System.out.println("3 - Listar produtos");
            System.out.println("4 - Atualizar quantidade de objetos cadastrados");
            System.out.println("5 - Sair do sistema");
            opcao = scanner.nextInt();

            executarOpcao(opcao,scanner,estoque);
        }

        scanner.close();
        System.out.println("Sistema fechado");

   
}
  public static void executarOpcao(int op, Scanner sc, Estoque estoque) {
        switch (op) {
            case 1:
                System.out.println("Adicionando um produto");
                System.out.println("Digite o ID");
                int id = sc.nextInt();
                System.out.println("Digite o nome do produto");
                String nome = sc.next();
                System.out.println("Digite o peso do produto");
                Double peso = sc.nextDouble();

                produto novoProduto = new produto(id, nome, peso);

                estoque.adicionarProduto(novoProduto);

                System.out.println("Produto adicionado com sucesso.");
                break;
                
                
            case 2:
                System.out.println("Removendo produto");
                System.out.println("Digite o ID do produto que deseja remover:");

                int idParaRemover = sc.nextInt();
                produto produtoARemover = null;

                for (produto p : estoque.produtos){
                    if (p.getId() == idParaRemover) {
                        produtoARemover = p;

                        break;
                    }
                }
                 if (produtoARemover != null) {
                    estoque.removerProduto(produtoARemover);
                    System.out.println("Produto removido com sucesso");
                    
                 } else{
                        System.out.println("Produto não encontrado");
                        break;
                 }
                
            case 3:
                System.out.println("Listando Produtos");
                System.out.println(estoque.listarProdutos());
                break;

            case 4:
                 System.out.println("Atualizando a quantidade de objetos cadastrados");
                 System.out.println("Digite o ID do produto para atualizar a quantidade");
                 int idParaAtualizar = sc.nextInt();

                 produto produtoAAtualizar = null;

                 //Encontrar o produto com ID especificado

                 for(produto p : estoque.produtos){
                    if (p.getId() == idParaAtualizar) {

                        produtoAAtualizar = p;
                        break;
                        
                    }

                 }

                 //Atualizar a quantidade se o produto for encontrado

                 if (produtoAAtualizar != null) {
                    System.out.println("Digite a quantidade a ser adicionada (positiva) ou removida (negativa):");
                    int quantidadeAtualizar =  sc.nextInt();

                    estoque.aumentarQuantidadeProduto(produtoAAtualizar, quantidadeAtualizar);
                    
                 } else{
                System.out.println("Produto não encontrado");
                 }
            default:
                 
                break;
        }
    }
}