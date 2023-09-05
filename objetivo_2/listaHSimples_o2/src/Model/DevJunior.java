package Model;

public class DevJunior extends Desenvolvedor{
    public DevJunior() {
    }

    public DevJunior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.5;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor Junior | Nome: " + getNome() + " - Salario: " + getSalario();
    }
}
