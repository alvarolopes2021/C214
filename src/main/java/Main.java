import constants.Platforms;
import constants.Publishers;
import models.Model;
import utils.ReadCsv;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args []){

        ReadCsv readCsv = new ReadCsv();

        List<Model> csv = readCsv.readCsv("vendas-games.csv", Model.class);

        List<Model> gamesByPublisher = csv.stream().filter(p -> p.getPublisher().equals(Publishers.Nintendo.toString())).collect(Collectors.toList());

        System.out.println("JOGOS DA NINTENDO");
        for(Model item : gamesByPublisher){
            System.out.println(item + " \n ");
        }

        System.out.println("JOGOS DE PS4");
        List<Model> gamesByPlatform = csv.stream().filter(p -> p.getPlatform().equals(Platforms.PS4.toString())).collect(Collectors.toList());

        for(Model item : gamesByPlatform){
            System.out.println(item + " \n ");
        }

    }

}
