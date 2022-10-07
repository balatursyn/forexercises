package kz.greetgo.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class Library {

  public List<Book> bookList = new ArrayList<>();
  public List<Reader> readerList;

  public Library() {
    init();
  }

  private void init() {
    fillBook(() -> new Book("Mukhtar Auezov", "Abai Joly", getRandomInRange(1800, 2000), new Random().nextInt(400)));
    changeAuthor((e) -> {
          if ((e.getPageSize() % 2 == 0)) {
            e.setAuthor("Arthur Konan Doyle");
          } else {
            e.setAuthor("Akhmet Baitursynuly");
          }
        }
    );
  }

  private Integer getRandomInRange(int min, int max) {
    return new Random().nextInt(max - min) + min;
  }

  private void changeAuthor(Consumer<Book> consumer) {
    bookList.forEach(consumer);
  }


  private void fillBook(Supplier<Book> bookSupplier) {
    for (int i = 0; i < 10; ++i)
      bookList.add(bookSupplier.get());
  }
}
