package View;
import Controller.ControllerProdutos;
import java.util.Scanner;
import Model.Produtos;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ControllerProdutos cp = new ControllerProdutos();

    public static void main(String[] args) {

        // Chamando funções
        int opcao;

        do {
            imprimirCabecalho();
            opcao = lerOpcao();
            escolhaMenu(opcao);
        } while (opcao != 5);
    }

    // Cabeçalho
    public static void imprimirCabecalho() {
        System.out.println("\n____________________Bem-vindo ao Cadastro de Produtos____________________\n");
        System.out.println("1 - Criar Produto");
        System.out.println("2 - Listar Produtos");
        System.out.println("3 - Atualizar Produtos");
        System.out.println("4 - Deletar Produtos");
        System.out.println("5 - Sair ");
    }

    public static int lerOpcao() {
        System.out.println("\nDigite uma opção: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static void escolhaMenu(int opcao) {
        switch (opcao) {
        case 1:
            cadastrar();
            break;
        case 2:
            listar();
            break;

        case 3:
            atualizar();
            break;

        case 4:
            deletar();
            break;

        case 5:
            System.out.println("Saindo... Obrigada por utilizar nosso cadastro de produtos!");
            break;

        default:
            System.out.println("Opção inválida!");
            break;
        }
    }

    static public void listar() {
        for (Produtos p : cp.read()) {
            System.out.println(p);
        }
    }

    public static void cadastrar() {
        Produtos p = new Produtos();

        System.out.println("Digite o ID: ");
        p.id = Integer.parseInt(sc.nextLine());
        System.out.printf("Digite o nome do produto: ");
        p.nome = sc.nextLine();
        System.out.printf("Digite a marca do produto: ");
        p.categoria.marca = sc.nextLine();
        System.out.printf("Digite a descrição do produto: ");
        p.categoria.descricao = sc.nextLine();
        cp.create(p);
    }

    public static void atualizar() {
        Produtos p = new Produtos();

        System.out.println("Digite o ID: ");
        p.id = Integer.parseInt(sc.nextLine());
        System.out.printf("Digite o nome do produto: ");
        p.nome = sc.nextLine();
        System.out.printf("Digite a marca do produto: ");
        p.categoria.marca = sc.nextLine();
        System.out.printf("Digite a descrição do produto: ");
        p.categoria.descricao = sc.nextLine();
        cp.update(p);
    }

    public static void deletar() {
        Produtos p = new Produtos();
        System.out.println("Digite o ID: ");
        p.id = Integer.parseInt(sc.nextLine());
        cp.delete(p);
    }
}
