package controller;

import model.Fornecedor;
import model.Fornecimento;
import model.Produto;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FornecimentoController {
    public static void main(String[] args) {
        System.out.println("========= Exercicio 1.e =========");

        Fornecedor fornec1 = new Fornecedor("34556712335838","53934662345","Fornecedor 1");
        Fornecedor fornec2 = new Fornecedor("87934628936568","53989826885","Fornecedor 2");

        Produto prod1 = new Produto(1,"Agua",150,2.50);
        Produto prod2 = new Produto(2,"Coca-Cola",100,5.00);
        Produto prod3 = new Produto(3,"Pepsi",100,4.50);

        prod1.getFornecedorList().add(fornec1);
        prod2.getFornecedorList().add(fornec2);
        prod3.getFornecedorList().add(fornec2);

        Fornecimento fornecimento1 = new Fornecimento(LocalDate.of(2021, 10, 1), prod1.getPreco() * 75, prod1, fornec1);
        Fornecimento fornecimento2 = new Fornecimento(LocalDate.of(2021, 10, 1), prod2.getPreco() * 50, prod2, fornec2);
        Fornecimento fornecimento3 = new Fornecimento(LocalDate.of(2021, 10, 1), prod3.getPreco() * 50, prod3, fornec2);
        prod1.setQuantidade(prod1.getQuantidade() - 75);
        prod2.setQuantidade(prod2.getQuantidade() - 50);
        prod3.setQuantidade(prod3.getQuantidade() - 50);

        List<Fornecimento> fornecimentoList = new ArrayList<>();
        fornecimentoList.add(fornecimento1);
        fornecimentoList.add(fornecimento2);
        fornecimentoList.add(fornecimento3);

        System.out.println("Fornecimentos: ");
        System.out.println(fornecimentoList);

        System.out.println("Valor total dos fornecimentos: ");
        Double valorTotal = 0.0;
        for (Fornecimento fornecimento : fornecimentoList) {
            valorTotal += fornecimento.getValorTotal();
        }
        System.out.println(NumberFormat.getCurrencyInstance().format(valorTotal));


    }
}
