package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VeiculoController {
    public static void main(String[] args) {
        System.out.println("\n----- Exercicio 1.a -----");
        Veiculo bike1 = new Bicicleta(2,"humana","Mountain","model1",2021,17,"78stsdg4t7443");
        System.out.println(bike1);

        System.out.println("\n----- Exercicio 1.b -----");
        Veiculo carro1 = new Carro(2,"combustao","fiat","uno",1999,290,"034560dfvd895h","8sdv874hdv74","11A78-GT4");
        System.out.println(carro1);

        System.out.println("\n----- Exercicio 1.c -----");
        Veiculo caminhao1 = new Caminhao(4,"eletrico","tesla","horsepower",2023,20290,"jkdf7943bhs784","df76erthi78934h89","734H7-C73");
        System.out.println(caminhao1);

        System.out.println("\n----- Exercicio 2.a -----");
        Veiculo bike2 = new Bicicleta(2,"humana","Marca1","model2",2019,19,"fb79e4t7fhdr54");
        Veiculo bike3 = new Bicicleta(2,"humana","Marca2","model3",2023,21,"sfvsig78ue547dr");
        Veiculo bike4 = new Bicicleta(2,"humana","Marca3","model4",2020,15,"dfb89u54jy89f54");
        Veiculo bike5 = new Bicicleta(2,"humana","Marca4","model5",2022,19,"iohdf784ht7fh3f");
        Veiculo carro2 = new Carro(2,"eletrico","marca2","modelo2",1999,290,"jf74tuigve4t4f","fvdg74jhtdfvb","IJN6F-DAD");
        Veiculo carro3 = new Carro(2,"combustao","marca3","modelo3",1989,650,"uisdf784t78v5j","df34t78fvbhd78","JD734-566");
        Veiculo carro4 = new Carro(2,"eletrico","marca4","modelo4",2109,150,"gb4579fb7y4uhf","fdh76owsdg6hd","I8465-4BF");
        Veiculo carro5 = new Carro(3,"combustao","marca5","modelo5",2023,430,"0fuher78h4t78dfh","sdf7834hfbdh","BHS73-457");
        Veiculo caminhao2 = new Caminhao(5,"combustao","marca1","modelo15",2021,42430,"ghsef673rjh78d4h","jdsv74jt7vbse","BHS73-457");
        Veiculo caminhao3 = new Caminhao(6,"combustao","marca2","modelo65",2021,14730,"dfgbdjk23r7yfdrg5","seg5ugj5rgfn","IJHBD-B57");
        Veiculo caminhao4 = new Caminhao(3,"combustao","marca3","modelo567",2013,42330,"067934568dfgdfghd","skjsdhv743jdvs4","658SD-HRF");
        Veiculo caminhao5 = new Caminhao(4,"combustao","marca5","modelo25",2003,55430,"478vdsiv74tfh54h","65ugnwetbdrhdr","I84JTB-74H");

        List<Veiculo> veiculoList = new ArrayList<>();
        veiculoList.add(bike1);
        veiculoList.add(bike2);
        veiculoList.add(bike3);
        veiculoList.add(bike4);
        veiculoList.add(bike5);
        veiculoList.add(carro1);
        veiculoList.add(carro2);
        veiculoList.add(carro3);
        veiculoList.add(carro4);
        veiculoList.add(carro5);
        veiculoList.add(caminhao1);
        veiculoList.add(caminhao2);
        veiculoList.add(caminhao3);
        veiculoList.add(caminhao4);
        veiculoList.add(caminhao5);

        System.out.println("\n----- Lista original -----");
        System.out.println(veiculoList);

        System.out.println("\n----- Lista ordenada pelo ano de fabricaçao -----");
        veiculoList.sort(Comparator.comparing(Veiculo::getAnoFabricacao));
        System.out.println(veiculoList);

        System.out.println("\n----- Lista de automoveis pelo ano de fabricação -----");
        veiculoList.forEach(veiculo -> {
            if (veiculo instanceof Automovel){
                System.out.println(veiculo.toString());
            }
        });

        System.out.println("\n----- Lista de bicicletas pelo ano de fabricação -----");
        veiculoList.forEach(veiculo -> {
            if (veiculo instanceof Bicicleta){
                System.out.println(veiculo.toString());
            }
        });

        System.out.println("\n----- Lista de veiculos com placa inical I pelo ano de fabricação -----");
        veiculoList.forEach(veiculo -> {
            if (veiculo instanceof Automovel){
                if (((Automovel) veiculo).getPlaca().startsWith("I")||((Automovel) veiculo).getPlaca().startsWith("i")) {
                    System.out.println(veiculo.toString());
                }
            }
        });
    }
}
