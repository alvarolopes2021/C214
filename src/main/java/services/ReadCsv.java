package services;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import models.Model;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadCsv {

    private List<Model> list = new ArrayList<Model>();

    public List<Model> readCsv(String path, Class model){

        Path csvPath = Paths.get(path);

        try{
            Reader reader = Files.newBufferedReader(csvPath);

            CsvToBean<Model> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(model)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            list = csvToBean.parse();
        }
        catch(IOException error){
            System.out.println(error);
        }

        System.out.println(list);

        return list;
    }


}
