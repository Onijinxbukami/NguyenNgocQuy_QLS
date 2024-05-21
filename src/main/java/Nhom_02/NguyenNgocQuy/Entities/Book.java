package Nhom_02.NguyenNgocQuy.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book {

    private Long id;
    private String title;
    private String author;
    private double price;
    private String category;
}
