
public class ContaPoupanca extends Conta{


    ContaPoupanca(Cliente cLiente) {
        super(cLiente);
    }

    @Override
    public void imprimir() {
        System.out.println("---------------->conta poupança<-------------------");
        super.imprimirInfosComuns();

    }
}
