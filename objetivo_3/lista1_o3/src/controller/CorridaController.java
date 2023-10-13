package controller;

import model.Corrida;
import model.Motorista;
import model.Usuario;
import model.Veiculo;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Comparator;

public class CorridaController {
    public static void main(String[] args) {
        System.out.println("========= Exercicio 1.d =========");
        Usuario user1 = new Usuario("João", "joaozinho@gmail.com","53923456789");
        Usuario user2 = new Usuario("Maria", "maria@gmail.com","54975422356");

        Veiculo veic1 = new Veiculo("Carro1","ABC1234",2015);
        Veiculo veic2 = new Veiculo("Carro2","DEF5678",2017);

        Motorista mot1 = new Motorista("José","jose123@gmail.com","51986564565");
        Motorista mot2 = new Motorista("Pedro","pedrinho@gmail.com","51987654321");

        mot1.setVeiculo(veic1);
        mot2.setVeiculo(veic2);

        Corrida c1 = new Corrida("Dinheiro","Pagamento em dinheiro", LocalDate.of(2023,4,17),50.0,user1,mot1);
        Corrida c2 = new Corrida("Cartão","Pagamento em cartão", LocalDate.of(2023,5,21),35.0,user1,mot1);
        Corrida c3 = new Corrida("Dinheiro","Pagamento em dinheiro", LocalDate.of(2023,6,1),20.0,user2,mot2);

        user1.getCorridaList().add(c1);
        user1.getCorridaList().add(c2);
        user2.getCorridaList().add(c3);

        mot1.getCorridaList().add(c1);
        mot1.getCorridaList().add(c2);
        mot2.getCorridaList().add(c3);

        System.out.println("Listagem de corridas por passageiro:\n");

        System.out.println("Passageiro: " + user1.getNome());
        user1.getCorridaList().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        user1.getCorridaList().forEach(corr -> System.out.println(corr.getId() + " - " + corr.getDataInicio() + " - " + corr.getPreco()));

        System.out.println("\nPassageiro: " + user2.getNome());
        user2.getCorridaList().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        user2.getCorridaList().forEach(corr -> System.out.println(corr.getId() + " - " + corr.getDataInicio() + " - " + corr.getPreco()));

        System.out.println("\nListagem de corridas por motorista:\n");

        System.out.println("Motorista: " + mot1.getNome());
        mot1.getCorridaList().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        mot1.getCorridaList().forEach(corr -> System.out.println(corr.getId() + " - " + corr.getDataInicio() + " - " + corr.getPreco()));

        System.out.println("\nMotorista: " + mot2.getNome());
        mot2.getCorridaList().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        mot2.getCorridaList().forEach(corr -> System.out.println(corr.getId() + " - " + corr.getDataInicio() + " - " + corr.getPreco()));

        System.out.println("\n Valor total das corridas por motorista:\n");

        System.out.println("Motorista: " + mot1.getNome());
        Double total = 0.0;
        for (Corrida corr : mot1.getCorridaList()) {
            total += corr.getPreco();
        }
        System.out.println("Total: " + NumberFormat.getCurrencyInstance().format(total));

        System.out.println("\nMotorista: " + mot2.getNome());
        total = 0.0;
        for (Corrida corr : mot2.getCorridaList()) {
            total += corr.getPreco();
        }
        System.out.println("Total: " + NumberFormat.getCurrencyInstance().format(total));
    }
}
