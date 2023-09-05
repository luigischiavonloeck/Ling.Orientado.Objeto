package Model;

public class Gerente extends Funcionario{

    public Gerente() {
        super();
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

//    @Override
//    public double getBonus() {
//        bonus = 20;
//        return super.getBonus();
//    }


    @Override
    public double getBonus() {
        return getSalario() * 0.2;
    }

    @Override
    public String toString() {
        return "\nGerente | Nome: " + getNome() + " - Salario: " + getSalario();
    }
}
