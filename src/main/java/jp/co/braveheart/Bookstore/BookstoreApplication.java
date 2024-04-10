package jp.co.braveheart.Bookstore;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jp.co.braveheart.Bookstore.entity.Book;
import jp.co.braveheart.Bookstore.service.BookService;

@SpringBootApplication
public class BookstoreApplication {

    @Autowired
    private BookService service;

    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args)
        .getBean(BookstoreApplication.class).initData();
    }

    /**
     * サンプルデータ投入
     */
    private void initData() {
        resetData();
        generateSampleData().stream().forEach(book -> {
            service.save(book);
        });
    }

    /**
     * データリセット
     */
    private void resetData() {
        service.deleteAll();
        service.resetIdentity();
    }
    
    /**
     * サンプル初データ作成
     * @return サンプルデータリスト
     */
    private List<Book> generateSampleData() {
        return Arrays.asList(
                Book.builder()
                    .title("WEBアプリケーション開発テキスト")
                    .description("WEBアプリケーション開発の初学者用書籍")
                    .build(),
                Book.builder()
                    .title("始めてのAWS構築")
                    .description("AWS構築の初学者用書籍")
                    .build(),
                Book.builder()
                    .title("PMOの極意")
                    .description("PojectManagementOfficeの初学者用書籍")
                    .build()
                );
    }
}
