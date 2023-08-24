package Controller;

import Model.Cliente;

public class ControllerCliente {
    public static void main(String[] args) {
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
    }
}
