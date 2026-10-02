package questao4;

public class ContaCorrente {
    private int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(int numero, String titular, float saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void sacar(float valor){
        if(valor < 0 || valor > saldo || valor > 10000) IO.println("Valor invalido! Tente novamente com valor valido.");
        else {
            saldo -= valor;
            IO.println("Operação relaizada com sucesso!");
        }
    }

    public void depositar(float valor){
        if(valor < 0 || valor > 10000) IO.println("Valor invalido! Tente novamente com valor valido.");
        else {
            saldo += valor;
            IO.println("Operação relaizada com sucesso!");
        }
    }
    public float consultarSaldo(){
        return saldo;
    }
}
