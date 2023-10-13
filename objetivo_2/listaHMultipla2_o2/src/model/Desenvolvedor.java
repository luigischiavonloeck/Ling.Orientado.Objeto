package model;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor() {
        super();
    }

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.1;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor{" + super.toString() + "}";
    }
}
