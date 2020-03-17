package hibernate.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class BookStoreId implements Serializable {
    @Column(name = "store_id")
    private Integer storeId;

    @Column(name = "book_id")
    private Integer bookId;

    @Override
    public int hashCode() {
        return Objects.hash(storeId, bookId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        BookStoreId that = (BookStoreId) obj;
        return Objects.equals(storeId, that.storeId) &&
                Objects.equals(bookId, that.bookId);
    }
}
