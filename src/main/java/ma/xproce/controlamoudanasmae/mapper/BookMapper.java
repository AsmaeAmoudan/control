package ma.xproce.controlamoudanasmae.mapper;

import ma.xproce.controlamoudanasmae.dao.entities.Book;
import ma.xproce.controlamoudanasmae.dto.BookDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    ModelMapper modelMapper= new ModelMapper();

    public BookDTO fromBookToBookDTO(Book book){
        return modelMapper.map(book, BookDTO.class);
    }

    public Book fromBookDTOToBook(BookDTO bookDTO){
        return modelMapper.map(bookDTO, Book.class);
    }
}
