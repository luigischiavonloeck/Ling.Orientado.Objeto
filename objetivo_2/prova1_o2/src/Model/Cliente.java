package Model;

public class Cliente implements Associado{
    String nome;

    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + '}';
    }
}
