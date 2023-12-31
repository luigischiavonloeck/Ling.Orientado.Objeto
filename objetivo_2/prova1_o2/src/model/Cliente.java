package model;

public class Cliente implements Associado{
    private String nome;
    private int qdeCotas;
    private double valorCota;

    public Cliente() {
    }

    public Cliente(String nome, int qdeCotas, double valorCota) {
        this.nome=nome;
        this.qdeCotas=qdeCotas;
        this.valorCota=valorCota;
    }

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        return qdeCotas*valorCota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
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
        return "\nCliente{" + "nome=" + nome + ", qdeCotas=" + qdeCotas + ", valorCota=" + valorCota + ", lucros=" + lucros(qdeCotas,valorCota) + '}';
    }
}
