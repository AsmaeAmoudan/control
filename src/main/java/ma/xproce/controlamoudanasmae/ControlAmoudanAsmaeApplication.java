package ma.xproce.controlamoudanasmae;

import ma.xproce.controlamoudanasmae.dto.BookDTO;
import ma.xproce.controlamoudanasmae.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class ControlAmoudanAsmaeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControlAmoudanAsmaeApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BookService bookService){
        return args -> {
            BookDTO bookDTO= BookDTO.builder().title("book1").price(222).build();
            bookService.saveBook(bookDTO);
        };
    }

}
