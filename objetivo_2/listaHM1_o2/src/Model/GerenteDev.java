package Model;

public class GerenteDev extends Gerente{
    public GerenteDev() {
    }

    public GerenteDev(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.2;
    }

    @Override
    public String toString() {
        return "\nGerente de Desenvolvimento | Nome: " + getNome() + " - Salario: " + getSalario();
    }
}
