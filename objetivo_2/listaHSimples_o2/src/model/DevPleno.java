package model;

public class DevPleno extends Desenvolvedor{
    public DevPleno() {
    }

    public DevPleno(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor Pleno | Nome: " + getNome() + " - Salario: " + getSalario();
    }
}
