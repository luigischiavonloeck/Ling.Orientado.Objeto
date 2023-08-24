package Controller;

import Model.Conta;

import java.util.*;

public class ContaController {
    public static void main(String[] args) {
        System.out.println("========== Exercicio 1 ==========");
        Conta c1 = new Conta(1L,15000);
        Conta c2 = new Conta();
        System.out.println(c1);
        System.out.println(c2);
        c2.setId(2L);
        c2.setSaldo(72999);
        System.out.println(c2.getSaldo());
        System.out.println(c2.getId());
        c2.deposita(1001);
        System.out.println(c2);
        c2.saca(15000);
        System.out.println(c2);
        c2.saca(100000);
        System.out.println(c2);
        c2.atualiza(30);
        System.out.println(c2);

        System.out.println("========== Exercicio 2 ==========");
        Conta c3 = new Conta(3L,34965);
        Conta c4 = new Conta(4L,234789);
        Conta c5 = new Conta(5L,5734);
        Conta c6 = new Conta(6L,74235);
        Conta c7 = new Conta(7L,85289376);
        Conta c8 = c4;
        System.out.println("------- Lista --------");
        List<Conta> contaList = new ArrayList<>();
        contaList.add(c1);
        contaList.add(c5);
        contaList.add(c6);
        contaList.add(c7);
        contaList.add(c4);
        contaList.add(c3);
        contaList.add(c2);
        System.out.println(contaList);

        System.out.println("--- Procurar o objeto de id3");
        Conta findConta = contaList.stream().filter(conta -> conta.getId()==3L).findAny().orElse(null);
        System.out.println(findConta);

        System.out.println("--- Ordenar a lista");
        contaList.sort(Comparator.comparing(Conta::getId).reversed());
        System.out.println(contaList);


        System.out.println("------- Map -------");
        Map<Long,Conta> contaMap = new HashMap<>();
        contaMap.put(c1.getId(),c1);
        contaMap.put(c2.getId(),c2);
        contaMap.put(c3.getId(),c3);
        contaMap.put(c4.getId(),c4);
        contaMap.put(c5.getId(),c5);
        contaMap.put(c6.getId(),c6);
        contaMap.put(c7.getId(),c7);
        System.out.println(contaMap);

        System.out.println("--- Procurar o objeto de id3");
        System.out.println(contaMap.get(3L));
    }
}
