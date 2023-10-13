package Controller;

import Model.Aluno;
import Model.Disciplina;

import java.util.Comparator;

public class DiscAlunoController {
    public static void main(String[] args) {
        System.out.println("========= Exercicio 1.b =========");
        Aluno al1 = new Aluno(321L, "João", "Peter");
        Aluno al2 = new Aluno(213L, "Rafael", "Gomes");

        Disciplina disc1 = new Disciplina(12L, "Matemática");
        Disciplina disc2 = new Disciplina(21L, "Português");
        Disciplina disc3 = new Disciplina(32L, "História");

        al1.getDisciplinasList().add(disc1);
        al1.getDisciplinasList().add(disc3);
        al2.getDisciplinasList().add(disc1);
        al2.getDisciplinasList().add(disc2);
        al2.getDisciplinasList().add(disc3);

        System.out.println("Aluno: " + al1.getNome());
        al1.getDisciplinasList().sort(Comparator.comparing(Disciplina::getNome));
        al1.getDisciplinasList().forEach(disc -> System.out.println(disc.getNome()));

        System.out.println("\nAluno: " + al2.getNome());
        al2.getDisciplinasList().sort(Comparator.comparing(Disciplina::getNome));
        al2.getDisciplinasList().forEach(disc -> System.out.println(disc.getNome()));

        System.out.println("\n========= Segunda parte =========");

        al2.getDisciplinasList().remove(disc1);
        al2.getDisciplinasList().remove(disc2);
        al2.getDisciplinasList().remove(disc3);

        System.out.println("\nAluno: " + al1.getNome());
        al1.getDisciplinasList().forEach(disc -> System.out.println(disc.getNome()));

        System.out.println("\nAluno: " + al2.getNome());
        al2.getDisciplinasList().forEach(disc -> System.out.println(disc.getNome()));

    }
}
