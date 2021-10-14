package assignment2.Book_review.services;


import assignment2.Book_review.entity.books;
import assignment2.Book_review.repository.booksrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class booksservice {

    @Autowired
    booksrepository BooksRepository;//inject BooksRepository, in repository name booksrepository.
    public List<books> getallbooks(){
        List<books> booksinfo=BooksRepository.findAll();
        return booksinfo;
    }

    public books addbook(books book){
        books book1=BooksRepository.save(book);
        return book1;

    }

    public String updatebook(books book) {
        Optional<books> book1=BooksRepository.findById(book.getBookid());
        if(book1.isEmpty()) {return "repository error";}


        //can use module wrapper also
        book1.get().setBookid(book.getBookid());
        book1.get().setName(book.getName());
        book1.get().setAuthor(book.getAuthor());
        book1.get().setPublication(book.getPublication());
        book1.get().setCategory(book.getCategory());
        book1.get().setPages(book.getPages());
        book1.get().setPrice(book.getPrice());

        BooksRepository.save(book1.get());
        return  "Information updated";


    }


    public String deletebook(String bookid) {
        books b1=BooksRepository.findById(bookid).get();

        try{
            BooksRepository.delete(b1);
            return "deleted";
        }
        catch (Exception ex){
            return "delete failed";
        }
    }

    public books getbyid(String bookid) {

        Optional<books> b1 = BooksRepository.findById(bookid);
        if (b1.isEmpty()) {
            return null;
        }

        return b1.get();

    }
}
