package jp.co.braveheart.Bookstore.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Table(name = "book")
@Builder
public class Book {
    /** ID */
    @Id
    private Integer id;
    /** タイトル */
    private String title;
    /** 詳細 */
    private String description;
}
