package co.develhope.preparazionecheckpoint.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
    private Integer id;
    private String title;
    private String author;
    private String genre;
}
