package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Model {

    private int rank;
    private String name;
    private String platform;
    private int year;
    private String genre;
    private String publisher;
    private float na_sales;
    private float eu_sales;
    private float jp_sales;
    private float other_sales;
    private float global_sales;

}
