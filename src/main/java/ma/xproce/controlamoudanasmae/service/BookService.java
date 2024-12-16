package ma.xproce.controlamoudanasmae.service;

import ma.xproce.controlamoudanasmae.dto.BookDTO;

import java.util.List;

public interface BookService {
    public List<BookDTO> getBookByTitle(String title);
    public BookDTO saveBook(BookDTO bookDTO);
}
