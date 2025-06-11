public class ContaTerminal {
    private final  int numConta;
    private final String agencia;
    private final String nomeCliente;
    private final float saldo;

    public ContaTerminal(int numConta, String agencia, String nomeCliente, float saldo) {
        this.numConta = numConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return " Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco. " +
                "Sua agência é " + agencia + "," +
                " Conta " + numConta + " e " +
                "saldo: " + saldo;

    }

}
