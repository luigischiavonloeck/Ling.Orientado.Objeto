package Controller;

import Model.Modelo;

public class ControllerModelo {
    public static void main(String[] args) {
        Modelo md1 = new Modelo(1L,"Fox");
        Modelo md2 = new Modelo();
        System.out.println(md1);
        System.out.println(md2);
        md2.setId(2L);
        md2.setDescricao("Uno");
        System.out.println(md2.getDescricao());
    }
}
