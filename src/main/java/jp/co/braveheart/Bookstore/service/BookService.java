package jp.co.braveheart.Bookstore.service;

import jp.co.braveheart.Bookstore.entity.Book;

/**
 * Book管理ロジックインターフェース
 * @author nakagawa
 */
public interface BookService {

    /**
     * 全件取得
     * @return 書籍一覧
     */
    Iterable<Book> find();

    /**
     * 書籍登録
     * @param book 書籍情報
     */
    void save(Book book);

    /**
     * IDのシリアル採番初期化
     */
    void resetIdentity();

    /**
     * 全件削除
     */
    void deleteAll();
}
