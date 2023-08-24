package Controller;

import Model.Automovel;

public class ControllerAutomovel {
    public static void main(String[] args) {
        Automovel at1 = new Automovel(1L,"Teste","ABCDE-123","Azul",4,"Diesel",5000,"SJKFGSEJKGVHSDV", 1500);
        Automovel at2 = new Automovel();
        System.out.println(at1);
        System.out.println(at2);
        at2.setId(2L);
        at2.setRenavan("Renault");
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
    }
}
