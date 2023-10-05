package Model;

import java.util.List;

public class Empresa {
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private List<Funcionario> funcionariosList;

    public Empresa() {
    }

    public Empresa(String cnpj, String razaoSocial, String nomeFantasia, List<Funcionario> funcionariosList) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.funcionariosList = funcionariosList;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public List<Funcionario> getFuncionariosList() {
        return funcionariosList;
    }

    public void setFuncionariosList(List<Funcionario> funcionariosList) {
        this.funcionariosList = funcionariosList;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", funcionariosList=" + funcionariosList +
                '}';
    }
}
