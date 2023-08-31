package Model;

public class DevPleno extends Desenvolvedor{
    public DevPleno() {
    }

    public DevPleno(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.1;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor Pleno | Nome: " + getNome() + " - Salario: " + getSalario();
    }
}
