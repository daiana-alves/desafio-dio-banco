public abstract class Conta implements IConta {
    protected static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    Conta(Cliente cLiente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cLiente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }



    @Override
    public void sacar(double valor) {
        saldo-=valor;

    }

    @Override
    public void depositar(double valor) {
        saldo+=valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    protected void imprimirInfosComuns(){
        System.out.println(String.format("Titular: %s",this.cliente.getNome()));
        System.out.println(String.format("agencia: %d",this.agencia));
        System.out.println(String.format("numero: %d",this.numero));
        System.out.println(String.format("saldo: %.2f",this.saldo));
    }
}
