package model;

public class Item {
    private Integer codItem;
    private Double desconto;
    private Integer quantidade;
    private Produto produto;
    private Double valorTotal;

    public Item() {
    }

    public Item(Integer codItem, Double desconto, Integer quantidade, Produto produto) {
        this.codItem = codItem;
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.produto = produto;
        this.valorTotal = (produto.getPreco() * quantidade)*(1 - (desconto/100));
    }

    public Integer getCodItem() {
        return codItem;
    }

    public void setCodItem(Integer codItem) {
        this.codItem = codItem;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "\n    Item " + codItem +
                ": " + produto.getNome() +
                " | quantidade : " + quantidade +
                " | desconto : " + desconto +
                "% | valor total : " + Math.ceil(valorTotal);
    }
}
