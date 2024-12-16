package ma.xproce.controlamoudanasmae.service;

import ma.xproce.controlamoudanasmae.dao.entities.Book;
import ma.xproce.controlamoudanasmae.dao.repositories.BookRepository;
import ma.xproce.controlamoudanasmae.dto.BookDTO;
import ma.xproce.controlamoudanasmae.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<BookDTO> getBookByTitle(String title) {
        List<Book> books=bookRepository.findByTitle(title);
        List<BookDTO> bookDTOS= new ArrayList<>();
        for (Book book: books){
            bookDTOS.add(bookMapper.fromBookToBookDTO(book));
        }

        return bookDTOS;
    }

    @Override
    public BookDTO saveBook(BookDTO bookDTO) {
        Book book= bookMapper.fromBookDTOToBook(bookDTO);
        Book book1= bookRepository.save(book);
        return bookMapper.fromBookToBookDTO(book1);
    }
}
