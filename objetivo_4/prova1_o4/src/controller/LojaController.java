package controller;

import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LojaController {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor(1, "Rafael", "Rua Barao de Cotegipe", "Centro", "13870-000", "Rio Claro", "SP", "Sede 1B");
        Vendedor vendedor2 = new Vendedor(2, "Joao", "Rua Sergao da Catiba", "Tijuca", "18626-000", "Sao Paulo", "SP", "Sede 3A");

        Fornecedor fornecedor1 = new Fornecedor("34.556.712/0001-38", "(53) 93466 2345", "Fornecedor 1");
        Fornecedor fornecedor2 = new Fornecedor("87.934.628/0001-68", "(53) 98982 6885", "Fornecedor 2");

        Produto prod1 = new Produto(1, "Agua", 150, 2.50);
        Produto prod2 = new Produto(2, "Coca-Cola", 100, 5.00);
        Produto prod3 = new Produto(3, "Pepsi", 100, 4.50);

        Item item1 = new Item(1, 5.0,45, prod1);
        Item item2 = new Item(2, 15.0, 55, prod2);
        Item item3 = new Item(3, 10.0, 30, prod3);
        prod1.getItemList().add(item1);
        prod2.getItemList().add(item2);
        prod3.getItemList().add(item3);

        System.out.println("========= Exercicio 1.b =========");
        Pedido pedido1 = new Pedido(1, LocalDate.of(2021, 10, 1), vendedor1);
        pedido1.addItens(item1);
        Pedido pedido2 = new Pedido(2, LocalDate.of(2022, 3, 17), vendedor2);
        pedido2.addItens(item2);
        pedido2.addItens(item3);
        vendedor1.getPedidoList().add(pedido1);
        vendedor2.getPedidoList().add(pedido2);

        List<Pedido> vendas = new ArrayList<>();
        vendas.add(pedido1);
        vendas.add(pedido2);

        System.out.println("\nVendas:");
        System.out.println(vendas);
        System.out.println("\nEstoque atualizado: ");
        System.out.println(prod1);
        System.out.println(prod2);
        System.out.println(prod3);

        System.out.println("\n========= Testando funções =========");
        // Estoque baixo
        System.out.println(pedido1);
        pedido1.addItens(item2);
        System.out.println(pedido1);
        // Remover item
        System.out.println(prod2);
        System.out.println(pedido2);
        pedido2.removeItens(item2);
        System.out.println(prod2);
        System.out.println(pedido2);
        pedido2.removeItens(item1);

        System.out.println("\n========= Exercicio 1.c =========");
        prod1.getFornecedorList().add(fornecedor1);
        prod2.getFornecedorList().add(fornecedor2);
        prod3.getFornecedorList().add(fornecedor2);

        Fornecimento fornecimento1 = new Fornecimento(LocalDate.of(2021, 10, 1), prod1.getPreco() * 75, prod1, fornecedor1);
        Fornecimento fornecimento2 = new Fornecimento(LocalDate.of(2021, 10, 1), prod2.getPreco() * 50, prod2, fornecedor2);
        Fornecimento fornecimento3 = new Fornecimento(LocalDate.of(2021, 10, 1), prod3.getPreco() * 50, prod3, fornecedor2);
        prod1.setQuantidade(prod1.getQuantidade() + 75);
        prod2.setQuantidade(prod2.getQuantidade() + 50);
        prod3.setQuantidade(prod3.getQuantidade() + 50);

        List<Fornecimento> fornecimentoList = new ArrayList<>();
        fornecimentoList.add(fornecimento1);
        fornecimentoList.add(fornecimento2);
        fornecimentoList.add(fornecimento3);

        System.out.println("Fornecimentos: ");
        System.out.println(fornecimentoList);

        System.out.println("\nValor total dos fornecimentos: ");
        Double valorTotal = 0.0;
        for (Fornecimento fornecimento : fornecimentoList) {
            valorTotal += fornecimento.getValorTotal();
        }
        System.out.println(valorTotal);
    }
}
