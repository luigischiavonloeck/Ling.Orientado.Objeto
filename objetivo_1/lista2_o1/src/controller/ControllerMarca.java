package controller;

import model.Marca;

import java.util.*;

public class ControllerMarca {
    public static void main(String[] args) {
        System.out.println("======= exercicio 1 =======");
        Marca m1 = new Marca(1L,"Volks");
        Marca m2 = new Marca();
        System.out.println(m1);
        System.out.println(m2);
        m2.setId(2L);
        m2.setDescricao("Fiat");
        System.out.println(m2.getDescricao());

        System.out.println("====== Exercicio 2 =======");
        Marca m3 = new Marca(3L,"Marca1");
        Marca m4 = new Marca(4L,"Marca2");
        Marca m5 = new Marca(5L,"Marca3");
        Marca m6 = m1;
        System.out.println("------ List -----");
        List<Marca> marcaList = new ArrayList<>();
        marcaList.add(m1);
        marcaList.add(m2);
        marcaList.add(m3);
        marcaList.add(m4);
        marcaList.add(m5);
        marcaList.add(m6);
        System.out.println(marcaList);

        System.out.println("--- Procurar o objeto de id3");
        Marca findMarca = marcaList.stream().filter(marca -> marca.getId()==3L).findAny().orElse(null);
        System.out.println(findMarca);

        System.out.println("--- Ordenar a lista");
        marcaList.sort(Comparator.comparing(Marca::getId).reversed());
        System.out.println(marcaList);

        System.out.println("------ Map ------");
        Map<Long,Marca> marcaMap = new HashMap<>();
        marcaMap.put(m1.getId(), m1);
        marcaMap.put(m2.getId(), m2);
        marcaMap.put(m3.getId(), m3);
        marcaMap.put(m4.getId(), m4);
        marcaMap.put(m5.getId(), m5);
        marcaMap.put(m6.getId(), m6);
        System.out.println(marcaMap);

        System.out.println("--- Procurar o objeto de id3");
        System.out.println(marcaMap.get(3L));
    }
}
