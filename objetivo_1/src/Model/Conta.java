package Model;

public class  Conta {

    private Long id;
    private double saldo;

    public Conta(){}
    public Conta(Long id,double saldo) {
        this.id=id; this.saldo = saldo;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca(double valor){
        if(valor<this.saldo){
            this.saldo -= valor;
        }
    }

    public void atualiza(double valor){
        this.saldo = this.saldo * (1 - valor/100);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\nConta{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}