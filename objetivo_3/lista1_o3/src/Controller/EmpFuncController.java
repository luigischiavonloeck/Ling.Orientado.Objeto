package Controller;

import Model.Empresa;
import Model.Funcionario;

import java.time.LocalDate;
import java.util.Comparator;

public class EmpFuncController {
    public static void main(String[] args) {
        System.out.println("========= Exercicio 1.c =========");

        Funcionario func1 = new Funcionario(1L, "45723456723", "João", "Peter", LocalDate.of(1991, 2, 17));
        Funcionario func2 = new Funcionario(2L, "12345678901", "Rafael", "Gomes", LocalDate.of(1990, 7, 28));
        Funcionario func3 = new Funcionario(3L, "98765432109", "Maria", "Silva", LocalDate.of(1982, 1, 19));
        Funcionario func4 = new Funcionario(4L, "45678912345", "Ana", "Santos", LocalDate.of(1993, 5, 27));
        Funcionario func5 = new Funcionario(5L, "65432198709", "Pedro", "Souza", LocalDate.of(1984, 11, 11));
        Funcionario func6 = new Funcionario(6L, "87023556723", "Gabriel", "Martins", LocalDate.of(1994, 6, 21));

        Empresa emp1 = new Empresa("67589236634672","Empresa 1 Ltda","1a Empresa");
        Empresa emp2 = new Empresa("87621234985337","Empresa 2 Ltda","2a Empresa");

        emp1.getFuncionariosList().add(func1);
        emp1.getFuncionariosList().add(func2);
        emp1.getFuncionariosList().add(func3);
        emp2.getFuncionariosList().add(func4);
        emp2.getFuncionariosList().add(func5);
        emp2.getFuncionariosList().add(func6);

        System.out.println("Listagem por nome:\n");
        System.out.println("Empresa: " + emp1.getNomeFantasia());
        emp1.getFuncionariosList().sort(Comparator.comparing(Funcionario::getNome));
        emp1.getFuncionariosList().forEach(func -> System.out.println(func.getNome()));

        System.out.println("\nEmpresa: " + emp2.getNomeFantasia());
        emp2.getFuncionariosList().sort(Comparator.comparing(Funcionario::getNome));
        emp2.getFuncionariosList().forEach(func -> System.out.println(func.getNome()));

        System.out.println("\nListagem por Idade:\n");
        System.out.println("Empresa: " + emp1.getNomeFantasia());
        emp1.getFuncionariosList().sort(Comparator.comparing(Funcionario::getDataNascimento).reversed());
        emp1.getFuncionariosList().forEach(func -> System.out.println(func.getNome() + " - " + func.getDataNascimento()));

        System.out.println("\nEmpresa: " + emp2.getNomeFantasia());
        emp2.getFuncionariosList().sort(Comparator.comparing(Funcionario::getDataNascimento).reversed());
        emp2.getFuncionariosList().forEach(func -> System.out.println(func.getNome() + " - " + func.getDataNascimento()));
    }
}
