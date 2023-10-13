package model;

public abstract class Conta {
    protected double saldo;

    public Conta() {
        super();
    }
    public Conta(double saldo) {
        super();
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca(double valor){
        if(valor<this.saldo){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void atualiza(double valor){
        this.saldo = this.saldo * (1 + valor/100);
    }

    @Override
    public String toString() {
        return "\nConta{" +
                "saldo=" + saldo +
                '}';
    }
}
