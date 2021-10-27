import java.util.Scanner;

public class Principal {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao = 0;

        do {
            try {
                System.out.println("\n ----------- Calculadora -----------\n");
                //Captando valor do usuário
                int valor1 = lerValor("Digite o primeiro valor: ");
                int valor2 = lerValor("Digite o segundo valor: ");
                //Imprindo e captando opção menu
                imprimeMenu();
                opcao = lerValor("\nDigite uma opção do menu: ");
                escolhaMenu(opcao, valor1, valor2);
                //Tratamento divisão por 0
            } catch (ArithmeticException e) {
                System.out.println("Não é possível fazer a divisão por zero. Favor, tente novamente: ");
            }
        } while (opcao != 5);
    }

    public static void imprimeMenu() {
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Sair ");
    }

    public static int lerValor(String mensagem) {
        int valor = 0;
        boolean validacao = true;

        do {
            try {
                System.out.println(mensagem);
                valor = Integer.parseInt(sc.nextLine());
                validacao = true;
            // Tratamento de número    
            } catch (NumberFormatException e) {
                System.out.println("Dado inválido! Tente novamente.\n");
                validacao = false;
            }
        } while (validacao == false);
        return valor;
    }

    public static void escolhaMenu(int opcao, int valor1, int valor2) {
        switch (opcao) {
        case 1:
            System.out.println("O resultado da soma é: " + Calculadora.soma(valor1, valor2));
            break;

        case 2:
            System.out.println("O resultado da subtração é: " + Calculadora.sub(valor1, valor2));
            break;

        case 3:
            System.out.println("O resultado da multiplicação é: " + Calculadora.mult(valor1, valor2));
            break;

        case 4:
            System.out.println("O resultado da divisão é: " + Calculadora.div(valor1, valor2));
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
