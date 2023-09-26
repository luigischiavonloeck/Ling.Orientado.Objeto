package Controller;

import Model.*;

import java.util.*;
public class FuncionarioController {
    public static void main(String[] args) {
        System.out.println("====== Exercício 1.a ======\n");
        System.out.println("------ Desenvolvedores ------\n");
        Desenvolvedor dev1 = new Desenvolvedor("João", 7000);
        System.out.println(dev1);
        Desenvolvedor dev2 = new Desenvolvedor("Maria", 3000);
        System.out.println(dev2);
        Desenvolvedor dev3 = new Desenvolvedor("José", 6000);
        System.out.println(dev3);
        Desenvolvedor dev4 = new Desenvolvedor("Ana", 4000);
        System.out.println(dev4);
        Desenvolvedor dev5 = new Desenvolvedor("Pedro", 5000);
        System.out.println(dev5);
        Desenvolvedor dev6 = new Desenvolvedor("Paulo", 6500);
        System.out.println(dev6);

        System.out.println("\n------ Gerentes ------\n");
        Gerente ger1 = new Gerente("Rafael", 30000, "PETR4", 150);
        System.out.println(ger1);
        Gerente ger2 = new Gerente("Maria", 20000, "VALE3", 500);
        System.out.println(ger2);
        Gerente ger3 = new Gerente("Lucas", 10000, "B3SA3", 300);
        System.out.println(ger3);
        Gerente ger4 = new Gerente("Joca", 15000, "ITUB4", 600);
        System.out.println(ger4);
        Gerente ger5 = new Gerente("Gabriel", 50000, "ABEV3", 510);
        System.out.println(ger5);
        Gerente ger6 = new Gerente("Almeida", 40000, "PETR4", 600);
        System.out.println(ger6);

        System.out.println("\n------ Clientes ------\n");
        Cliente cli1 = new Cliente("Alana", "Silva", "VALE3", 156);
        System.out.println(cli1);
        Cliente cli2 = new Cliente("Luana", "Gomes", "PETR4", 462);
        System.out.println(cli2);
        Cliente cli3 = new Cliente("José", "Martins", "B3SA4", 573);
        System.out.println(cli3);
        Cliente cli4 = new Cliente("Eduardo", "Silva", "BBDC4", 235);
        System.out.println(cli4);
        Cliente cli5 = new Cliente("Alexandre", "Pires", "PETR4", 500);
        System.out.println(cli5);
        Cliente cli6 = new Cliente("Paulo", "Moraes", "ABEV3", 700);
        System.out.println(cli6);

        System.out.println("\n====== Exercício 1.b ======\n");
        List<Funcionario> funcionariosList = new ArrayList<>();
        funcionariosList.add(dev1);
        funcionariosList.add(dev2);
        funcionariosList.add(dev3);
        funcionariosList.add(dev4);
        funcionariosList.add(dev5);
        funcionariosList.add(dev6);
        funcionariosList.add(ger1);
        funcionariosList.add(ger2);
        funcionariosList.add(ger3);
        funcionariosList.add(ger4);
        funcionariosList.add(ger5);
        funcionariosList.add(ger6);
        System.out.println("------ Funcionários ------\n");
        System.out.println(funcionariosList);

        List<Investidor> investidoresList = new ArrayList<>();
        investidoresList.add(ger1);
        investidoresList.add(ger2);
        investidoresList.add(ger3);
        investidoresList.add(ger4);
        investidoresList.add(ger5);
        investidoresList.add(ger6);
        investidoresList.add(cli1);
        investidoresList.add(cli2);
        investidoresList.add(cli3);
        investidoresList.add(cli4);
        investidoresList.add(cli5);
        investidoresList.add(cli6);
        System.out.println("\n------ Investidores ------\n");
        System.out.println(investidoresList);


        System.out.println("\n====== Exercício 1.c ======\n");
        funcionariosList.sort(Comparator.comparing(Funcionario::getSalario).reversed());
        System.out.println("------ Funcionários ------\n");
        System.out.println(funcionariosList);

        investidoresList.sort(Comparator.comparing(Investidor::getQuantidade).reversed());
        System.out.println("\n------ Clientes ------\n");
        investidoresList.forEach( investidor -> {
            if (investidor instanceof Cliente) {
                System.out.println(investidor);
            }
        });
        System.out.println("\n------ Investidores ------\n");
        System.out.println(investidoresList);


        System.out.println("\n====== Exercício 1.d ======\n");
//        System.out.println("Funcionario com maior salário");
//        System.out.println(funcionariosList.get(0));
//        System.out.println("Investidor com maior quantidade");
//        System.out.println(investidoresList.get(0));
        System.out.println("Funcionario com maior salário");
        Funcionario funcMaxSal = funcionariosList.stream().max(Comparator.comparing(Funcionario::getSalario)).get();
        System.out.println(funcMaxSal);
        System.out.println("\nInvestidor com maior quantidade");
        Investidor invMaxQuant = investidoresList.stream().max(Comparator.comparing(Investidor::getQuantidade)).get();
        System.out.println(invMaxQuant);



    }
}
