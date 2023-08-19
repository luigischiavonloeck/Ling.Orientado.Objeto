package Controller;

import Model.Locacao;

import java.time.*;

public class ControllerLocacao {
    public static void main(String[] args) {
        Locacao lc1 = new Locacao(LocalDate.of(2019,8,5),LocalTime.of(18,34,7),LocalDate.of(2020,1,17),LocalTime.of(16,17,11),2560,1900,3700,true);
        Locacao lc2 = new Locacao();
        System.out.println(lc1);
        System.out.println(lc2);
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
    }
}
