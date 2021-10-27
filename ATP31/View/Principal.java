package ATP31.View;

import Model.Produtos;

public class Principal {
    public static void main(String[] args) {

    }

    public static void imprimirCabecalho() {
        System.out.println("\t\n========================== Cadastro de Produtos ========================== \n");
        System.out.println("1 - Criar Produto \t2 - Listar Produtos \t3 - Atualizar Produtos \t4 - Deletar Produtos \t5 - Sair ");
    }

    public static int lerOpcao() {
        System.out.println("\nDigite uma opção: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static void escolhaMenu(int opcao){
        switch (opcao) {
            case 1:
         
            break;
        case 2:
   
            break;

        case 3:
  
            break;

        case 4:

            break;

        case 5:
            System.out.println("Saindo...");
            break;

        default:
            System.out.println("Opção inválida!");
            break;
        }
    }




}
