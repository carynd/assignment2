package assignment2.Book_review.repository;

import assignment2.Book_review.entity.books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface booksrepository extends JpaRepository<books,String> {


}
