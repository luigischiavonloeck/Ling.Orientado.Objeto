package Controller;

import Model.Aluno;

public class AlunoController {
    public static void main(String[] args) {

        System.out.println("===== Exercicio 1 =====\n");
        // Exercicio 1.a
        Aluno al1 = new Aluno();
        Aluno al2 = new Aluno();
        Aluno al3 = new Aluno(1,67352378,"Luigi","Loeck","luigiloeck.pl008@academico.ifsul.edu.br");
        Aluno al4 = new Aluno(2,34673466,"Rafael","Gomes","rafaelgomes@gmail.com");
        Aluno al5 = new Aluno(3,53453452);
        Aluno al6 = new Aluno(4,98623575);
        System.out.println("----- Listagem de todos objetos -----");
        System.out.println(al1);
        System.out.println(al2);
        System.out.println(al3);
        System.out.println(al4);
        System.out.println(al5);
        System.out.println(al6);
        // Exercicio 1.b
        System.out.println("----- Atualizacao dos objetos vazios -----");
        al1.setId(5);
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
        al2.setId(6);
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
    }
}
