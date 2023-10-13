package controller;

import model.Modelo;

import java.util.*;

public class ControllerModelo {
    public static void main(String[] args) {
        System.out.println("======= Exercicio 1 =======");
        Modelo md1 = new Modelo(1L,"Fox");
        Modelo md2 = new Modelo();
        System.out.println(md1);
        System.out.println(md2);
        md2.setId(2L);
        md2.setDescricao("Uno");
        System.out.println(md2.getDescricao());

        System.out.println("======== Exercicio 2 =========");
        Modelo md3 = new Modelo(3L,"Model1");
        Modelo md4 = new Modelo(4L,"Model2");
        Modelo md5 = new Modelo(5L,"Model3");
        Modelo md6 = md1;
        System.out.println("----- List -----");
        List<Modelo> modeloList = new ArrayList<>();
        modeloList.add(md1);
        modeloList.add(md2);
        modeloList.add(md3);
        modeloList.add(md4);
        modeloList.add(md5);
        modeloList.add(md6);
        System.out.println(modeloList);

        System.out.println("--- Procurar o obj de id3");
        Modelo findModel = modeloList.stream().filter(modelo -> modelo.getId()==3L).findAny().orElse(null);
        System.out.println(findModel);

        System.out.println("--- Ordenar a lista");
        modeloList.sort(Comparator.comparing(Modelo::getId).reversed());
        System.out.println(modeloList);

        System.out.println("------- Map ------");
        Map<Long,Modelo> modeloMap = new HashMap<>();
        modeloMap.put(md1.getId(), md1);
        modeloMap.put(md2.getId(), md2);
        modeloMap.put(md3.getId(), md3);
        modeloMap.put(md4.getId(), md4);
        modeloMap.put(md5.getId(), md5);
        modeloMap.put(md6.getId(), md6);
        System.out.println(modeloMap);

        System.out.println("---- Procurar o obj de id3");
        System.out.println(modeloMap.get(3L));
    }
}
