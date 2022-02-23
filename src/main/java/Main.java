import models.Model;
import services.ReadCsv;

public class Main {

    public static void Main(String args []){

        ReadCsv readCsv = new ReadCsv();

        readCsv.readCsv("./vendas-games.csv", Model.class);

    }

}
