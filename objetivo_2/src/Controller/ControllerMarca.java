package Controller;

import Model.Marca;

public class ControllerMarca {
    public static void main(String[] args) {
        Marca m1 = new Marca("Volks");
        Marca m2 = new Marca();
        System.out.println(m1);
        System.out.println(m2);
        m2.setDescricao("Fiat");
        System.out.println(m2.getDescricao());
    }
}