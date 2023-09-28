package Model;

public class ContaCorrente extends Conta implements Associado{
    private int qdeCotas;
    private double valorCota;

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(double saldo, int qdeCotas, double valorCota) {
        super(saldo);
        this.qdeCotas=qdeCotas;
        this.valorCota=valorCota;
    }

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        return qdeCotas*valorCota;
    }

    public int getQdeCotas() {
        return qdeCotas;
    }

    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas=qdeCotas;
    }

    public double getValorCota() {
        return valorCota;
    }

    public void setValorCota(double valorCota) {
        this.valorCota=valorCota;
    }

    @Override
    public String toString() {
        return "\nContaCorrente{" + "saldo=" + getSaldo() + ", qdeCotas=" + qdeCotas + ", valorCota=" + valorCota + ", lucros=" + lucros(qdeCotas,valorCota) + '}';
    }

}
