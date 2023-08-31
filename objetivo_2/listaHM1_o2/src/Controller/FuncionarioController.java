package Controller;

import Model.Desenvolvedor;
import Model.Funcionario;
import Model.Gerente;

public class FuncionarioController {
    public static void main(String[] args) {
//        --------- Exercicio 1.1 ---------
//        Funcionario fc1 = new Funcionario();
//        Funcionario fc2 = new Funcionario("Rafael",1500);

//        Não é possivel criar instancias do tipo tipo funcionario pois esta class esta como 'abstract' e serve
//        apenas de herança para as classes filho.

//      -------- Exercicio 1.2 ---------
//      As regras de negocio devem ser inseridas nas classes especificas (gerente e desenvolvedor). Pois estas
//      classes herdam todas caracteristicas dos funcionarios, mudando apenas o bonus.

        Gerente g1 = new Gerente();
        Gerente g2 = new Gerente("Gomes",5600);
        Desenvolvedor dev1 = new Desenvolvedor();
        Desenvolvedor dev2 = new Desenvolvedor("Rafael",2500);
        System.out.println(g1);
        System.out.println(g2);
        System.out.println("Bonus: "+ g2.getBonus());
        System.out.println(dev1);
        System.out.println(dev2);
        System.out.println("Bonus: "+ dev2.getBonus());

        System.out.println("\n====== Alterar os dados ======");

        g1.setNome("Joao");
        g1.setSalario(7500);
        g2.setSalario(5000);
        dev1.setNome("Otavio");
        dev1.setSalario(1750);
        dev2.setSalario(3125);
        System.out.println(g1);
        System.out.println(g2);
        System.out.println("Bonus: "+ g2.getBonus());
        System.out.println(dev1);
        System.out.println(dev2);
        System.out.println("Bonus: "+ dev2.getBonus());
    }
}
