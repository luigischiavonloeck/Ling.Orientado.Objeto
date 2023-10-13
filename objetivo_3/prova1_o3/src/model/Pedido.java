package model;

import java.time.LocalDate;

public class Pedido {
    private Integer numero;
    private LocalDate data;
    private Double valor;
    private String tipo;
    private Vendedor vendedor;
    private Item item;

    public Pedido() {
    }

    public Pedido(Integer numero, LocalDate data, Double valor, String tipo, Vendedor vendedor, Item item) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
        this.vendedor = vendedor;
        this.item = item;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" + valor +
                ", vendedor=" + vendedor +
                ", item=" + item +
                '}';
    }
}
