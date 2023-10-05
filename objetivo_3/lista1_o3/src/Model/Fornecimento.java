package Model;

import java.util.Date;
import java.util.List;

public class Fornecimento {
    private Date data;
    private Double valorTotal;
    private List<Produto> produtoList;
    private List<Fornecedor> fornecedorList;

    public Fornecimento() {
    }

    public Fornecimento(Date data, Double valorTotal, List<Produto> produtoList, List<Fornecedor> fornecedorList) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.produtoList = produtoList;
        this.fornecedorList = fornecedorList;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

    public List<Fornecedor> getFornecedorList() {
        return fornecedorList;
    }

    public void setFornecedorList(List<Fornecedor> fornecedorList) {
        this.fornecedorList = fornecedorList;
    }

    @Override
    public String toString() {
        return "Fornecimento{" +
                "data=" + data +
                ", valorTotal=" + valorTotal +
                ", produtoList=" + produtoList +
                ", fornecedorList=" + fornecedorList +
                '}';
    }
}
