package model;

public class Gerente extends Funcionario{
    private String formacao;

    public Gerente() {
    }

    public Gerente(Integer matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String formacao) {
        super(matricula, nome, endereco, bairro, cep, cidade, estado);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "Gerente " + super.toString() +
                "formacao='" + formacao + '\'';
    }
}
