package model;

public class Veiculo {
    private static Long count = 0L;
    private Long id;
    private String tipo;
    private String placa;
    private Integer anoFabricacao;
    private Motorista motorista;

    public Veiculo() {
    }

    public Veiculo(String tipo, String placa, Integer anoFabricacao) {
        this.id = ++count;
        this.tipo = tipo;
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", placa='" + placa + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", motorista=" + motorista +
                '}';
    }
}
