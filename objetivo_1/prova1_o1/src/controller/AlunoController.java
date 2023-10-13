package controller;

import model.Aluno;

import java.util.*;

public class AlunoController {
    public static void main(String[] args) {

        System.out.println("===== Exercicio 1 =====\n");
        // Exercicio 1.a
        Aluno al1 = new Aluno();
        Aluno al2 = new Aluno();
        Aluno al3 = new Aluno(1L,67352378,"Luigi","Loeck","luigiloeck.pl008@academico.ifsul.edu.br");
        Aluno al4 = new Aluno(2L,34673466,"Rafael","Gomes","rafaelgomes@gmail.com");
        Aluno al5 = new Aluno(3L,53453452);
        Aluno al6 = new Aluno(4L,98623575);
        System.out.println("----- Listagem de todos objetos -----");
        System.out.println(al1);
        System.out.println(al2);
        System.out.println(al3);
        System.out.println(al4);
        System.out.println(al5);
        System.out.println(al6);
        // Exercicio 1.b
        System.out.println("----- Atualizacao dos objetos vazios -----");
        al1.setId(5L);
        al1.setCpf(27835746);
        al1.setNome("Joao");
        al1.setSobrenome("Pedro");
        al1.setEmail("joaopedro@gmail.com");
        System.out.println(al1.getId());
        System.out.println(al1.getCpf());
        System.out.println(al1.getNome());
        System.out.println(al1.getSobrenome());
        System.out.println(al1.getEmail());
        System.out.println("_________________");
        al2.setId(6L);
        al2.setCpf(8962356);
        al2.setNome("Otavio");
        al2.setSobrenome("Moraes");
        al2.setEmail("otaviomoraes@gmail.com");
        System.out.println(al2.getId());
        System.out.println(al2.getCpf());
        System.out.println(al2.getNome());
        System.out.println(al2.getSobrenome());
        System.out.println(al2.getEmail());
        System.out.println("_________________");


        System.out.println("===== Exercicio 2 =====\n");
        System.out.println("----- Lista -----");
        //Criação da lista
        List<Aluno> alunoList = new ArrayList<>();
        alunoList.add(al3);
        alunoList.add(al4);
        alunoList.add(al5);
        alunoList.add(al6);
        alunoList.add(al1);
        alunoList.add(al2);
        System.out.println(alunoList);

        System.out.println("\n----- Encontrar o objeto com id 5 -----");
        Aluno findAluno = alunoList.stream().filter(aluno -> aluno.getId()==5).findAny().orElse(null);
        System.out.println(findAluno);

        System.out.println("\n----- Lista ordenada decrescente -----");
        alunoList.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println(alunoList);

        System.out.println("\n\n----- Map -----");
        //Criação do map
        Map<Long,Aluno> alunoMap = new HashMap<>();
        alunoMap.put(al3.getId(), al3);
        alunoMap.put(al4.getId(), al4);
        alunoMap.put(al5.getId(), al5);
        alunoMap.put(al6.getId(), al6);
        alunoMap.put(al1.getId(), al1);
        alunoMap.put(al2.getId(), al2);
        System.out.println(alunoMap);

        System.out.println("\n----- Encontrar o objeto com id 5 -----");
        System.out.println(alunoMap.get(5L));

        System.out.println("\n----- Lista ordenada decrescente -----");
        System.out.println("- Utilizando o Map nao é possivel ordenar os objetos");
    }
}
