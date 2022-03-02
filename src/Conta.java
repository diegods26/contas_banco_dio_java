public abstract class Conta implements Iconta{

    private int agencia;
    private   int numero;
    private double saldo;
    protected Cliente cliente;

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }



    @Override
    public void saca(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void deposita(double valor) {
            this.saldo += valor;
    }

    @Override
    public void transfere(double valor, Conta contaDestino) {
        if (this.saldo >= valor){
            this.saldo -= valor;
            contaDestino.deposita(valor);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
