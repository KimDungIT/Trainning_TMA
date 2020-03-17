package hibernate.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Book_Store", schema = "minishop")
public class BookStore {
    @EmbeddedId
    private BookStoreId id;

    @Column(name = "number_of_book")
    private Integer number;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("store_id")
    private Store store;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("book_id")
    private Book book;

    public BookStore(BookStoreId id, Integer number) {
        this.id = id;
        this.number = number;
    }

    @Override
    public String toString() {
        return "BookStore {"+ "store_id: " + id.getStoreId() + "," +
                " book_id: " + id.getBookId() + "," + " number: " + number + "}";
    }
}
