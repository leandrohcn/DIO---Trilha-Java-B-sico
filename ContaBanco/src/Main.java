import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ContaTerminal conta;
        String agencia;
        int numero;
        String nomeCliente;
        float saldo;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, digite o numero da conta: ");
        numero = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Por favor, digite o numero da agencia: ");
        agencia = entrada.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = entrada.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        saldo = entrada.nextFloat();

        conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);
        System.out.println(conta);

        entrada.close();
        }
    }
