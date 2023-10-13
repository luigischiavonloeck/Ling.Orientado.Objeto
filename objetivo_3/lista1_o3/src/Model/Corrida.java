package Model;

import java.time.LocalDate;
import java.util.Date;

public class Corrida {
    private static Long count = 0L;
    private Long id;
    private String tipoPagamento;
    private String detalhesPagamento;
    private LocalDate dataInicio;
    private Double preco;
    private Usuario passageiro;
    private Motorista motorista;

    public Corrida() {
    }

    public Corrida(String tipoPagamento, String detalhesPagamento, LocalDate dataInicio, Double preco, Usuario passageiro, Motorista motorista) {
        this.id = ++count;
        this.tipoPagamento = tipoPagamento;
        this.detalhesPagamento = detalhesPagamento;
        this.dataInicio = dataInicio;
        this.preco = preco;
        this.passageiro = passageiro;
        this.motorista = motorista;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getDetalhesPagamento() {
        return detalhesPagamento;
    }

    public void setDetalhesPagamento(String detalhesPagamento) {
        this.detalhesPagamento = detalhesPagamento;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Usuario getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Usuario passageiro) {
        this.passageiro = passageiro;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "Corrida{" +
                "id=" + id +
                ", tipoPagamento='" + tipoPagamento + '\'' +
                ", detalhesPagamento='" + detalhesPagamento + '\'' +
                ", dataInicio=" + dataInicio +
                ", preco=" + preco +
                ", passageiro=" + passageiro +
                ", motorista=" + motorista +
                '}';
    }
}
