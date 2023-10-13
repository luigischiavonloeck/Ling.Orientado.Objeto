package model;

public class Modelo {
    private Long id;
    private String descricao;

    public Modelo(){

    }

    public Modelo(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
