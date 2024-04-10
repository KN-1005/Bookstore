package jp.co.braveheart.Bookstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import jp.co.braveheart.Bookstore.entity.Book;
import jp.co.braveheart.Bookstore.repository.BookRepository;
import jp.co.braveheart.Bookstore.service.BookService;

/**
 * Book管理ロジック実装部
 * @author nakgawa
 */
@Service
@Transactional
public class BookServiceImpl implements BookService {
    
    @Autowired
    private BookRepository bookRep;
    
    @Override
    public Iterable<Book> find() {
        return bookRep.findAll();
    }

    @Override
    public void save(Book book) {
        bookRep.save(book);
    }

    @Override
    public void resetIdentity() {
        bookRep.resetIdentity();
    }

    @Override
    public void deleteAll() {
        bookRep.deleteAll();
    }
}
