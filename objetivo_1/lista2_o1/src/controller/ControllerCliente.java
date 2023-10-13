package controller;

import model.Cliente;

import java.util.*;

public class ControllerCliente {
    public static void main(String[] args) {
        System.out.println("======= exercicio 1 =======");
        Cliente c1 = new Cliente(1L,"12345678912","Luigi","Loeck","Endereço falso","96070-080","55 53 99142-5300","luigi@gmail.com");
        Cliente c2 = new Cliente();
        System.out.println(c1);
        System.out.println(c2);
        c2.setId(2L);
        c2.setCpf("98765432198");
        c2.setNome("Rafael");
        c2.setSobrenome("Gomes");
        c2.setEndereco("LA na Bento");
        c2.setCep("12345-678");
        c2.setTelefone("55 51 99156-7338");
        c2.setEmail("rafagomes@gmail.com");
        System.out.println(c2.getCpf());
        System.out.println(c2.getNome());
        System.out.println(c2.getSobrenome());
        System.out.println(c2.getEndereco());
        System.out.println(c2.getCep());
        System.out.println(c2.getTelefone());
        System.out.println(c2.getEmail());

        System.out.println("====== Exercicio 2 =======");
        Cliente c3 = new Cliente(3L,"8734698364","Lucas","Guilherme","Endereço falso2","983465-874","54 82 34664-4374","lucasguilherme@gmail.com");
        Cliente c4 = new Cliente(4L,"5478458456","Raul","Martins","Endereço falso3","73527-573","46 35 67347-3467","raulmartins@gmail.com");
        Cliente c5 = new Cliente(5L,"4568456837","Tomas","Hack","Endereço falso4","57434-235","67 23 74575-4356","tomashack@gmail.com");
        Cliente c6 = c1;
        System.out.println("------ List -----");
        List<Cliente> clienteList = new ArrayList<>();
        clienteList.add(c1);
        clienteList.add(c2);
        clienteList.add(c3);
        clienteList.add(c4);
        clienteList.add(c5);
        clienteList.add(c6);
        System.out.println(clienteList);

        System.out.println("--- Procurar o objeto de id3");
        Cliente findCliente = clienteList.stream().filter(cliente -> cliente.getId()==3L).findAny().orElse(null);
        System.out.println(findCliente);

        System.out.println("--- Ordenar a lista");
        clienteList.sort(Comparator.comparing(Cliente::getId).reversed());
        System.out.println(clienteList);

        System.out.println("------ Map ------");
        Map<Long,Cliente> clienteMap = new HashMap<>();
        clienteMap.put(c1.getId(), c1);
        clienteMap.put(c2.getId(), c2);
        clienteMap.put(c3.getId(), c3);
        clienteMap.put(c4.getId(), c4);
        clienteMap.put(c5.getId(), c5);
        clienteMap.put(c6.getId(), c6);
        System.out.println(clienteMap);

        System.out.println("--- Procurar o objeto de id3");
        System.out.println(clienteMap.get(3L));
    }
}
