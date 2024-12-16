package ma.xproce.controlamoudanasmae.web;

import lombok.AllArgsConstructor;
import ma.xproce.controlamoudanasmae.dto.BookDTO;
import ma.xproce.controlamoudanasmae.service.BookService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class BookGraphQLController {

    private BookService bookService;

    //getBookByTitle(title: String): [BookDTO]
    @QueryMapping
    public List<BookDTO> getBookByTitle(@Argument String title){
        return bookService.getBookByTitle(title);
    }

    //saveBook(book: BookInput):BookDTO
    @MutationMapping
    public BookDTO saveBook(@Argument BookDTO bookDTO){
        return bookService.saveBook(bookDTO);
    }


}
