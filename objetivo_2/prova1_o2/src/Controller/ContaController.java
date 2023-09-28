package Controller;

import Model.*;

import java.util.*;

public class ContaController {
    public static void main(String[] args) {
        System.out.println("\n======== Exercício 1.a ========");
        ContaPoupança cp1 = new ContaPoupança(1000);
        ContaPoupança cp2 = new ContaPoupança(2000);
        ContaPoupança cp3 = new ContaPoupança(3000);
        ContaCorrente cc1 = new ContaCorrente(1000,0,0);
        ContaCorrente cc2 = new ContaCorrente(2000,0,0);
        ContaCorrente cc3 = new ContaCorrente(3000,0,0);
        Cliente c1 = new Cliente("João",0,0);
        Cliente c2 = new Cliente("Maria",0,0);
        Cliente c3 = new Cliente("José",0,0);
        System.out.println(cp1);
        System.out.println(cp2);
        System.out.println(cp3);
        System.out.println(cc1);
        System.out.println(cc2);
        System.out.println(cc3);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("\n======== Exercício 1.b ========");
        System.out.println("\n------- Contas -------");
        List<Conta> contasList = new ArrayList<>();
        contasList.add(cp1);
        contasList.add(cp2);
        contasList.add(cp3);
        contasList.add(cc1);
        contasList.add(cc2);
        contasList.add(cc3);
        System.out.println(contasList);

        System.out.println("\n------- Associados -------");
        List<Associado> associadosList = new ArrayList<>();
        associadosList.add(c1);
        associadosList.add(c2);
        associadosList.add(c3);
        associadosList.add(cc1);
        associadosList.add(cc2);
        associadosList.add(cc3);
        System.out.println(associadosList);

        System.out.println("\n======== Exercício 1.c ========");
        cp3.deposita(1000);
        System.out.println(cp3);
        cp3.atualiza(5);
        System.out.println(cp3);
        cp3.saca(50);
        System.out.println(cp3);

        System.out.println("\n======== Exercício 1.d ========");
        cc2.deposita(500);
        System.out.println(cc2);
        cc2.saca(400);
        System.out.println(cc2);
        cc2.saca(2500);

        System.out.println("\n======== Exercício 1.e ========");
        int[] qdeCotas = {100,400,600,300,600,600};
        double[] valorCota = {70,15,30,20,34,27};
        for(int i=0;i<associadosList.size();i++){
            (associadosList.get(i)).setQdeCotas(qdeCotas[i]);
            (associadosList.get(i)).setValorCota(valorCota[i]);
        }
        System.out.println(associadosList);

        System.out.println("\n======== Exercício 1.f ========");
        System.out.println("\n------- Associados em ordem de quantidade de cotas -------");
        associadosList.sort(Comparator.comparing(Associado::getQdeCotas).reversed());
        System.out.println(associadosList);
        System.out.println("\n------- Associados com maior quantidade de cotas -------");
//        associadosList.stream().max(Comparator.comparing(Associado::getQdeCotas)).ifPresent(System.out::println);
        int maxCota = associadosList.stream().max(Comparator.comparing(Associado::getQdeCotas)).get().getQdeCotas();
        associadosList.forEach( associado -> {
            if (associado.getQdeCotas() == maxCota) {
                System.out.println(associado);
            }
        });

        System.out.println("\n======== Exercício 1.g ========");
        System.out.println("\n------- Contas em ordem de saldo -------");
        contasList.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println(contasList);

        System.out.println("\n------- Associados que possuem contas no sistema -------");
        associadosList.forEach( associado -> {
            if (associado instanceof Conta) {
                System.out.println(associado);
            }
        });

        System.out.println("\n------- Contas com maior saldo -------");
        double maxSaldo = contasList.stream().max(Comparator.comparing(Conta::getSaldo)).get().getSaldo();
        contasList.forEach( conta -> {
            if (conta.getSaldo() == maxSaldo) {
                System.out.println(conta);
            }
        });
    }
}
