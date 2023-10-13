package controller;

import model.Locacao;

import java.time.*;
import java.util.*;

public class ControllerLocacao {
    public static void main(String[] args) {
        System.out.println("======= exercicio 1 =======");
        Locacao lc1 = new Locacao(1L,LocalDate.of(2019,8,5),LocalTime.of(18,34,7),LocalDate.of(2020,1,17),LocalTime.of(16,17,11),2560,1900,3700,true);
        Locacao lc2 = new Locacao();
        System.out.println(lc1);
        System.out.println(lc2);
        lc2.setId(2L);
        lc2.setDataLocacao(LocalDate.of(2020,2,23));
        lc2.setDevolvido(false);
        lc2.setQuilometragem(5000);
        lc2.setValor_locacao(2333);
        lc2.setHoraLocacao(LocalTime.of(7,54,1));
        lc2.setDataDevolucao(LocalDate.of(2022,8,6));
        lc2.setHoraDevolucao(LocalTime.of(13,13,13));
        lc2.setValorCalcao(1000);
        System.out.println(lc2.getValor_locacao());
        System.out.println(lc2.getQuilometragem());
        System.out.println(lc2.getDataLocacao());
        System.out.println(lc2.getHoraLocacao());
        System.out.println(lc2.getValorCalcao());
        System.out.println(lc2.getDataDevolucao());
        System.out.println(lc2.getHoraDevolucao());
        System.out.println(lc2.isDevolvido());

        System.out.println("====== Exercicio 2 =======");
        Locacao lc3 = new Locacao(3L,LocalDate.of(2017,9,1),LocalTime.of(6,23,37),LocalDate.of(2018,12,1),LocalTime.of(5,43,23),3487,7634,8673,false);
        Locacao lc4 = new Locacao(4L,LocalDate.of(2018,6,23),LocalTime.of(23,54,6),LocalDate.of(2023,8,17),LocalTime.of(18,23,34),9834,7835,3852,false);
        Locacao lc5 = new Locacao(5L,LocalDate.of(2022,2,15),LocalTime.of(11,12,23),LocalDate.of(2022,3,27),LocalTime.of(12,59,2),5623,3468,6257,true);
        Locacao lc6 = lc1;
        System.out.println("------ List -----");
        List<Locacao> locacaoList = new ArrayList<>();
        locacaoList.add(lc1);
        locacaoList.add(lc2);
        locacaoList.add(lc3);
        locacaoList.add(lc4);
        locacaoList.add(lc5);
        locacaoList.add(lc6);
        System.out.println(locacaoList);

        System.out.println("--- Procurar o objeto de id3");
        Locacao findLocacao = locacaoList.stream().filter(locacao -> locacao.getId()==3L).findAny().orElse(null);
        System.out.println(findLocacao);

        System.out.println("--- Ordenar a lista");
        locacaoList.sort(Comparator.comparing(Locacao::getId).reversed());
        System.out.println(locacaoList);

        System.out.println("------ Map ------");
        Map<Long,Locacao> locacaoMap = new HashMap<>();
        locacaoMap.put(lc1.getId(), lc1);
        locacaoMap.put(lc2.getId(), lc2);
        locacaoMap.put(lc3.getId(), lc3);
        locacaoMap.put(lc4.getId(), lc4);
        locacaoMap.put(lc5.getId(), lc5);
        locacaoMap.put(lc6.getId(), lc6);
        System.out.println(locacaoMap);

        System.out.println("--- Procurar o objeto de id3");
        System.out.println(locacaoMap.get(3L));

    }
}
