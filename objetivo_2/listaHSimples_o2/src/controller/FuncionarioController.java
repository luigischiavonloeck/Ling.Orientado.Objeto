package controller;

import model.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

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


        System.out.println("\n====== Exercicio 2 =======");
        GerenteGeral gg1 = new GerenteGeral("Lucas",6500);
        GerenteDev gd1 = new GerenteDev("Alexandre",4500);

        DevSenior ds1 = new DevSenior("Luisa",3500);
        DevSenior ds2 = new DevSenior("Ana",3500);
        Desenvolvedor ds3 = new DevSenior("Miguel",3500);
        Desenvolvedor ds4 = new DevSenior("Gabriel",3500);
        Funcionario ds5 = new DevSenior("Bruno",3500);
        Funcionario ds6 = new DevSenior("Thales",3500);

        DevPleno dp1 = new DevPleno("Vitor", 2500);
        DevPleno dp2 = new DevPleno("Julia", 2500);
        Desenvolvedor dp3 = new DevPleno("Juliano", 2500);
        Desenvolvedor dp4 = new DevPleno("Rodrigo", 2500);
        Funcionario dp5 = new DevPleno("Henrique", 2500);
        Funcionario dp6 = new DevPleno("Amanda", 2500);

        DevJunior dj1 = new DevJunior("Pedro",1800);
        DevJunior dj2 = new DevJunior("Cleber",1800);
        Desenvolvedor dj3 = new DevJunior("Marcia",1800);
        Desenvolvedor dj4 = new DevJunior("Borba",1800);
        Funcionario dj5 = new DevJunior("Caetano",1800);
        Funcionario dj6 = new DevJunior("George",1800);

        List<Funcionario> funcionarioList = new ArrayList<>();
        funcionarioList.add(gg1);
        funcionarioList.add(gd1);
        funcionarioList.add(ds1);
        funcionarioList.add(ds2);
        funcionarioList.add(ds3);
        funcionarioList.add(ds4);
        funcionarioList.add(ds5);
        funcionarioList.add(ds6);
        funcionarioList.add(dp1);
        funcionarioList.add(dp2);
        funcionarioList.add(dp3);
        funcionarioList.add(dp4);
        funcionarioList.add(dp5);
        funcionarioList.add(dp6);
        funcionarioList.add(dj1);
        funcionarioList.add(dj2);
        funcionarioList.add(dj3);
        funcionarioList.add(dj4);
        funcionarioList.add(dj5);
        funcionarioList.add(dj6);

        System.out.println("Lista de funcionarios: \n"+funcionarioList);

        System.out.println("\n----- Folha salarial -----");
        double soma = 0;
        for (Funcionario func: funcionarioList) {
            soma += func.getSalario() + func.getBonus();
        }
        System.out.println("\nCom bonus: "+ soma);
        soma = 0;
        for (Funcionario func: funcionarioList) {
            soma += func.getSalario();
        }
        System.out.println("\nSem bonus: "+ soma);

        System.out.println("\n------ Bonus e salario ------\n");
        for (Funcionario func: funcionarioList) {
            System.out.println("Nome: "+func.getNome()+" - Salario: "+func.getSalario()+" - Bonus: "+func.getBonus());
        }

        System.out.println("\n------- Reajuste salarial -------\n");
        soma = 0;
        for (Funcionario func: funcionarioList) {
            func.setSalario(func.getSalario() * 1.05);
            soma += func.getSalario();
        }
        System.out.println("\nNova folha: "+ NumberFormat.getCurrencyInstance().format(soma));
    }
}
