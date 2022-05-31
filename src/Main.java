public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setNome("Daiana");

        ContaCorrente cc = new ContaCorrente(c1);
        ContaPoupanca cp = new ContaPoupanca(c1);

        cc.depositar(100);

        cc.transferir(50,cp);

        cc.imprimir();

        cp.imprimir();
    }
}
