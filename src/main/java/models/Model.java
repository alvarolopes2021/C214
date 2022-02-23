package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Model {

    private int rank;
    private String name;
    private String platform;
    private int year;
    private String genre;
    private String publisher;
    private int na_sales;
    private int eu_sales;
    private int jp_sales;
    private int other_sales;
    private int global_sales;

}
