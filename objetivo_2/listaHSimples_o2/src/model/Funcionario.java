package model;

public abstract class Funcionario {
    private String nome;
    private double salario;
//    protected double bonus = 0;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, double salario) {
        super();
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

//    public double getBonus() {
//        return salario*(bonus/100);
//    }

    public abstract double getBonus();
}
