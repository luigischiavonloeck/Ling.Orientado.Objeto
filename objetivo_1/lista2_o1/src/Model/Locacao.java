package Model;

import java.time.*;

public class Locacao {
    private Long id;
    private LocalDate dataLocacao;
    private LocalTime horaLocacao;
    private LocalDate dataDevolucao;
    private LocalTime horaDevolucao;
    private int quilometragem ;
    private double valorCalcao;
    private double valor_locacao;
    private boolean devolvido ;

    public Locacao() {
    }

    public Locacao(Long id, LocalDate dataLocacao, LocalTime horaLocacao, LocalDate dataDevolucao, LocalTime horaDevolucao, int quilometragem, double valorCalcao, double valor_locacao, boolean devolvido) {
        this.id = id;
        this.dataLocacao = dataLocacao;
        this.horaLocacao = horaLocacao;
        this.dataDevolucao = dataDevolucao;
        this.horaDevolucao = horaDevolucao;
        this.quilometragem = quilometragem;
        this.valorCalcao = valorCalcao;
        this.valor_locacao = valor_locacao;
        this.devolvido = devolvido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalTime getHoraLocacao() {
        return horaLocacao;
    }

    public void setHoraLocacao(LocalTime horaLocacao) {
        this.horaLocacao = horaLocacao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalTime getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(LocalTime horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getValorCalcao() {
        return valorCalcao;
    }

    public void setValorCalcao(double valorCalcao) {
        this.valorCalcao = valorCalcao;
    }

    public double getValor_locacao() {
        return valor_locacao;
    }

    public void setValor_locacao(double valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "id=" + id +
                ", dataLocacao=" + dataLocacao +
                ", horaLocacao=" + horaLocacao +
                ", dataDevolucao=" + dataDevolucao +
                ", horaDevolucao=" + horaDevolucao +
                ", quilometragem=" + quilometragem +
                ", valorCalcao=" + valorCalcao +
                ", valor_locacao=" + valor_locacao +
                ", devolvido=" + devolvido +
                '}';
    }
}
