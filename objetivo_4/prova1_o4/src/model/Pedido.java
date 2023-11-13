package model;

import exceptions.EstoqueInsuficienteException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Integer numero;
    private LocalDate data;
    private Double valor = 0.0;
    private Vendedor vendedor;
    private List<Item> itens = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(Integer numero, LocalDate data, Vendedor vendedor) {
        this.numero = numero;
        this.data = data;
        this.vendedor = vendedor;
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

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void addItens(Item item) {
        try {
            if (item.getProduto().getQuantidade() < item.getQuantidade()) {
                throw new EstoqueInsuficienteException();
            }
            this.itens.add(item);
            this.valor += item.getValorTotal();
            item.getProduto().setQuantidade(item.getProduto().getQuantidade() - item.getQuantidade());
        } catch (EstoqueInsuficienteException e) {
            System.err.println(e.getMessage());
        }
    }

    public void removeItens(Item item) {
        this.itens.remove(item);
        this.valor -= item.getValorTotal();
        item.getProduto().setQuantidade(item.getProduto().getQuantidade() + item.getQuantidade());
    }

    @Override
    public String toString(){
        return "\n\nVenda " + numero +
                "\nData - " + data +
                "\nItens vendidos - " + itens +
                "\nValor total - " + Math.ceil(valor) +
                "\nVendedor - " + vendedor.getNome();
    }
}
