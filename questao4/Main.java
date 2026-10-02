import questao4.ContaCorrente;

import java.util.Scanner;

void main() {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o número da conta:");
    int numeroDaConta = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Digite o nome do titular:");
    String titular = scanner.nextLine();

    ContaCorrente usuario = new ContaCorrente(numeroDaConta, titular, 0);

    int resposta;

    do {
        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Consultar saldo");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");

        resposta = scanner.nextInt();

        switch (resposta) {

            case 1:
                System.out.println("Digite um valor a ser sacado:");
                float valorSacar = scanner.nextFloat();
                usuario.sacar(valorSacar);
                break;

            case 2:
                System.out.println("Digite um valor a ser depositado:");
                float valorDepositar = scanner.nextFloat();
                usuario.depositar(valorDepositar);
                break;

            case 3:
                System.out.printf("Saldo: %.2f%n", usuario.consultarSaldo());
                break;

            case 4:
                System.out.println("Fim do programa.");
                break;

            default:
                System.out.println("Opção inválida!");
        }

    } while (resposta != 4);
}