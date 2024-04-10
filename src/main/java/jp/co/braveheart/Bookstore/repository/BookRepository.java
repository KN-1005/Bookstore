package jp.co.braveheart.Bookstore.repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import jp.co.braveheart.Bookstore.entity.Book;

/**
 * Bookテーブルアクセス
 * @author nakagawa
 */
public interface BookRepository extends CrudRepository<Book, Integer> {

    /** シリアルIDの採番をリセットします */
    @Modifying
    @Query(value = "TRUNCATE TABLE book RESTART IDENTITY")
    void resetIdentity();
}
