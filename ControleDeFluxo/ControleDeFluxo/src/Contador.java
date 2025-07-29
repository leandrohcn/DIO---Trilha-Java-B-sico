import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Contador {
    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if  (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("Parametro um maior que Parametro dois");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo o numero: " + i);
        }
    }
}

