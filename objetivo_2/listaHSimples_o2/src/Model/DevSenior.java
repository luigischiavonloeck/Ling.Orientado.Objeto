package Model;

public class DevSenior extends Desenvolvedor{
    public DevSenior() {
    }

    public DevSenior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.1;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor Senior | Nome: " + getNome() + " - Salario: " + getSalario();
    }
}
