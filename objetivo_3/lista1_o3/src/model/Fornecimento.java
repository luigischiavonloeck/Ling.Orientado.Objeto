package model;

import java.time.LocalDate;

public class Fornecimento {
    private LocalDate data;
    private Double valorTotal;
    private Produto produto;
    private Fornecedor fornecedor;

    public Fornecimento() {
    }

    public Fornecimento(LocalDate data, Double valorTotal, Produto produto, Fornecedor fornecedor) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.produto = produto;
        this.fornecedor = fornecedor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "\nFornecimento{" +
                "data=" + data +
                ", valorTotal=" + valorTotal +
                ", produtoList=" + produto +
                ", fornecedorList=" + fornecedor +
                '}';
    }
}
