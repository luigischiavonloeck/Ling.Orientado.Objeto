package Controller;

import Model.Produto;

import java.util.*;

public class ProdutoController {
    public static void main(String[] args) {
        // Exercicio 1
        System.out.println("======= Exercicio 1 ========");
        Produto pd1 = new Produto(1L,"Celular","Dispositivo Movel",1500,299);
        Produto pd2 = new Produto(2L,"Tablet","Dispositivo Movel de maior porte",2500,127);
        Produto pd3 = new Produto();
        System.out.println(pd1.toString());
        System.out.println(pd2.toString());
        System.out.println(pd3.toString());
        pd3.setId(3L);
        pd3.setNome("Notebook");
        pd3.setDescricao("Computador pessoal portatil");
        pd3.setValor(3599);
        pd3.setEstoque(47);
        System.out.println(pd3.getNome());
        System.out.println(pd3.getDescricao());
        System.out.println(pd3.getValor());
        System.out.println("\n\n");

        // Exercicio 2
        // List
        System.out.println("======== Exercicio 2 ========\n\n");
        System.out.println("------ Lista ------");
        Produto pd4 = new Produto(4L,"Computador","Desktop utilizado para trabalho",4500,32);
        Produto pd5 = new Produto(5L,"Teclado","Periferico utilizado para digitacao",399,568);
        Produto pd6 = pd1;

        List<Produto> produtoList = new ArrayList<>();

        produtoList.add(pd2);
        produtoList.add(pd4);
        produtoList.add(pd3);
        produtoList.add(pd1);
        produtoList.add(pd5);
        produtoList.add(pd6);

        // Procura objeto com id 3
        System.out.println("--- Procura o objeto com id3\n");
        System.out.println(produtoList);
        Produto listFind = produtoList.stream().filter(produto -> produto.getId()==3L).findAny().orElse(null);
        System.out.println("--- Resultado:");
        System.out.println(listFind);

        // Ordenar a lista

        System.out.println("\n\n");
        System.out.println("--- Ordena a lista\n");
        produtoList.sort(Comparator.comparing(Produto::getId).reversed());
        System.out.println(produtoList);

        // Map
        System.out.println("\n\n------- Map -------");
        Map<Long,Produto> produtoMap = new HashMap<>();
        produtoMap.put(pd1.getId(), pd1);
        produtoMap.put(pd2.getId(), pd2);
        produtoMap.put(pd3.getId(), pd3);
        produtoMap.put(pd4.getId(), pd4);
        produtoMap.put(pd5.getId(), pd5);
        produtoMap.put(pd6.getId(), pd6);

        // Procura objeto com id 3
        System.out.println("--- Procura o objeto com id3\n");
        System.out.println(produtoMap);
        System.out.println("--- Resultado:");
        System.out.println(produtoMap.get(3L));
    }
}
