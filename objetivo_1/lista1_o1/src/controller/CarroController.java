package controller;

import model.Carro;

import java.util.*;

public class CarroController {
    public static void main(String[] args) {
        System.out.println("======= exercicio 1 =======");
        Carro cr1 = new Carro(1L,"Renault","Oroch",2019);
        Carro cr2 = new Carro();
        System.out.println(cr1);
        System.out.println(cr2);
        cr2.setId(2L);
        cr2.setMarca("Fiat");
        cr2.setModelo("Uno");
        cr2.setAnoFabricacao(1999);
        System.out.println(cr2.getId());
        System.out.println(cr2.getMarca());
        System.out.println(cr2.getAnoFabricacao());
        System.out.println(cr2.getModelo());

        System.out.println("====== Exercicio 2 =======");
        Carro cr3 = new Carro(3L,"Marca1","Modelo1",2020);
        Carro cr4 = new Carro(4L,"Marca2","Modelo2",2021);
        Carro cr5 = new Carro(5L,"Marca3","Modelo3",2023);
        Carro cr6 = cr1;
        System.out.println("------ List -----");
        List<Carro> carroList = new ArrayList<>();
        carroList.add(cr1);
        carroList.add(cr2);
        carroList.add(cr3);
        carroList.add(cr4);
        carroList.add(cr5);
        carroList.add(cr6);
        System.out.println(carroList);

        System.out.println("--- Procurar o objeto de id3");
        Carro findCar = carroList.stream().filter(carro -> carro.getId()==3L).findAny().orElse(null);
        System.out.println(findCar);

        System.out.println("--- Ordenar a lista");
        carroList.sort(Comparator.comparing(Carro::getId).reversed());
        System.out.println(carroList);

        System.out.println("------ Map ------");
        Map<Long,Carro> carroMap = new HashMap<>();
        carroMap.put(cr1.getId(), cr1);
        carroMap.put(cr2.getId(), cr2);
        carroMap.put(cr3.getId(), cr3);
        carroMap.put(cr4.getId(), cr4);
        carroMap.put(cr5.getId(), cr5);
        carroMap.put(cr6.getId(), cr6);
        System.out.println(carroMap);

        System.out.println("--- Procurar o objeto de id3");
        System.out.println(carroMap.get(3L));

    }
}
