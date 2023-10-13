package model;

import java.util.ArrayList;
import java.util.List;

public class Motorista {
    private static Long count = 0L;
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private List<Corrida> corridaList = new ArrayList<>();
    private Veiculo veiculo;

    public Motorista() {
    }

    public Motorista(String nome, String email, String telefone) {
        this.id = ++count;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Corrida> getCorridaList() {
        return corridaList;
    }

    public void setCorridaList(List<Corrida> corridaList) {
        this.corridaList = corridaList;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "Motorista{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", corridaList=" + corridaList +
                ", veiculo=" + veiculo +
                '}';
    }
}
