package ma.xproce.controlamoudanasmae.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDTO {
    private String title;
    private String publisher;
    private Date datePublication;
    private double price;
    private String resume;

}
