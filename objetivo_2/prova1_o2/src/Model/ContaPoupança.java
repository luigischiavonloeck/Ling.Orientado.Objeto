package Model;

public class ContaPoupança extends Conta{
    public ContaPoupança() {
    }

    public ContaPoupança(double saldo) {
        super(saldo);
    }

    @Override
    public String toString() {
        return "\nContaPoupança{" + "saldo=" + getSaldo() + '}';
    }
}
