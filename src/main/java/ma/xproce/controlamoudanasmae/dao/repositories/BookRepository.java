package ma.xproce.controlamoudanasmae.dao.repositories;

import ma.xproce.controlamoudanasmae.dao.entities.Book;
import ma.xproce.controlamoudanasmae.dto.BookDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    public List<Book> findByTitle(String title);
}
