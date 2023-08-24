package Controller;

import Model.Automovel;

import java.util.*;


public class ControllerAutomovel {
    public static void main(String[] args) {
        System.out.println("======= exercicio 1 =======");
        Automovel at1 = new Automovel(1L,"7834658345","ABCDE-123","Azul",4,"Diesel",5000,"SJKFGSEJKGVHSDV", 1500);
        Automovel at2 = new Automovel();
        System.out.println(at1);
        System.out.println(at2);
        at2.setId(2L);
        at2.setRenavan("873465367");
        at2.setPlaca("12345-ABC");
        at2.setCor("Amarelo");
        at2.setNum_rodas(6);
        at2.setCombustivel("Gasolina");
        at2.setQuilometragem(1000);
        at2.setChasi("UOYSHEFHJSGDFJHG");
        at2.setValor_locacao(3299);
        System.out.println(at2.getRenavan());
        System.out.println(at2.getPlaca());
        System.out.println(at2.getCor());
        System.out.println(at2.getNum_rodas());
        System.out.println(at2.getCombustivel());
        System.out.println(at2.getQuilometragem());
        System.out.println(at2.getChasi());
        System.out.println(at2.getValor_locacao());

        System.out.println("====== Exercicio 2 =======");
        Automovel at3 = new Automovel(3L,"68678568","DFRTJ-389","Roxo",4,"Etanol",1564,"IYKJTSDEGYUDRH", 1000);
        Automovel at4 = new Automovel(4L,"87235274","8H7J5-F46","Verde",8,"Etanol",57866,"KASHGEBISDUGR", 7500);
        Automovel at5 = new Automovel(5L,"23875623","48W7M-TY5","Azul",2,"Gasolina",8637,"UJEHRGHKDRGJERG", 500);
        Automovel at6 = at1;
        System.out.println("------ List -----");
        List<Automovel> automovelList = new ArrayList<>();
        automovelList.add(at1);
        automovelList.add(at2);
        automovelList.add(at3);
        automovelList.add(at4);
        automovelList.add(at5);
        automovelList.add(at6);
        System.out.println(automovelList);

        System.out.println("--- Procurar o objeto de id3");
        Automovel findAutomovel = automovelList.stream().filter(automovel -> automovel.getId()==3L).findAny().orElse(null);
        System.out.println(findAutomovel);

        System.out.println("--- Ordenar a lista");
        automovelList.sort(Comparator.comparing(Automovel::getId).reversed());
        System.out.println(automovelList);

        System.out.println("------ Map ------");
        Map<Long,Automovel> automovelMap = new HashMap<>();
        automovelMap.put(at1.getId(), at1);
        automovelMap.put(at2.getId(), at2);
        automovelMap.put(at3.getId(), at3);
        automovelMap.put(at4.getId(), at4);
        automovelMap.put(at5.getId(), at5);
        automovelMap.put(at6.getId(), at6);
        System.out.println(automovelMap);

        System.out.println("--- Procurar o objeto de id3");
        System.out.println(automovelMap.get(3L));
    }
}
