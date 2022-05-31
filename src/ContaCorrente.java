
public class ContaCorrente extends Conta{


    ContaCorrente(Cliente cLiente) {
        super(cLiente);
    }

    @Override
    public void imprimir() {
        System.out.println("---------------->conta corrente<-------------------");
        super.imprimirInfosComuns();
    }
}
