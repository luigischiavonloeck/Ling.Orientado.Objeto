package Controller;

import Model.Funcionario;

import java.util.*;

public class FuncionarioController {
    public static void main(String[] args) {
        System.out.println("======= Exercicio 1 ========");
        Funcionario fn1 = new Funcionario(1L,"Rafael",2999);
        Funcionario fn2 = new Funcionario();
        System.out.println(fn1);
        System.out.println(fn2);
        fn2.setId(2L);
        fn2.setNome("Lucas");
        fn2.setSalario(5000);
        System.out.println(fn2.getId());
        System.out.println(fn2.getNome());
        System.out.println(fn2.getSalario());

        System.out.println("======= Exercicio 2 =======");
        Funcionario fn3 = new Funcionario(3L,"Lucas",5670);
        Funcionario fn4 = new Funcionario(4L,"Joao",12399);
        Funcionario fn5 = new Funcionario(5L,"Maria",1200);
        Funcionario fn6 = new Funcionario(6L,"Ana",677);
        Funcionario fn7 = fn2;

        System.out.println("------- Lista ------");
        List<Funcionario> funcionarioList = new ArrayList<>();
        funcionarioList.add(fn1);
        funcionarioList.add(fn4);
        funcionarioList.add(fn2);
        funcionarioList.add(fn6);
        funcionarioList.add(fn3);
        funcionarioList.add(fn7);
        funcionarioList.add(fn5);

        System.out.println(funcionarioList);

        System.out.println("--- Procura o objeto com id3\n");
        Funcionario findFunc = funcionarioList.stream().filter(funcionario -> funcionario.getId()==3).findAny().orElse(null);
        System.out.println(findFunc);

        System.out.println("--- ordena a lista pelo id");
        funcionarioList.sort(Comparator.comparing(Funcionario::getId).reversed());
        System.out.println(funcionarioList);

        System.out.println("--- ordena a lista pelo salario");
        funcionarioList.sort(Comparator.comparing(Funcionario::getSalario).reversed());
        System.out.println(funcionarioList);

        System.out.println("------- Map ------");
        Map<Long,Funcionario> funcionarioMap = new HashMap<>();
        funcionarioMap.put(fn1.getId(), fn1);
        funcionarioMap.put(fn2.getId(), fn2);
        funcionarioMap.put(fn3.getId(), fn3);
        funcionarioMap.put(fn4.getId(), fn4);
        funcionarioMap.put(fn5.getId(), fn5);
        funcionarioMap.put(fn6.getId(), fn6);
        funcionarioMap.put(fn7.getId(), fn7);

        System.out.println(funcionarioMap);

        System.out.println("--- Procurar o objeto de id3");
        System.out.println(funcionarioMap.get(3L));
    }
}
