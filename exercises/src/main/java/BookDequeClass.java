import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

//Przy użyciu wewnętrznego edytora Kodilli napisz program, który:
//
//tworzy stos i umieszcza w nim pięć obiektów typu Book (możesz użyć klasy Book z przykładu),
//sprawdza rozmiar stosu,
//następnie usuwa wszystkie książki,
//ponownie sprawdza rozmiar stosu,
//wyświetla, która książka została usunięta ze stosu jako ostatnia.

class Book1 {

    String title;
    String author;
    int year;

    // constructor with arguments
    public Book1(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // toString method used for printout the object
    @Override
    public String toString() {
        return "Title: \"" + title + "\", author: " + author + ", (" + year + ")";
    }

    // getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}

public class BookDequeClass {

    public static void main(String[] args) {

        Deque<Book1> book1Deque = new ArrayDeque<>();
        book1Deque.push(new Book1("title1", "author1", 1989));
        book1Deque.push(new Book1("title2", "author2", 1989));
        book1Deque.push(new Book1("title3", "author3", 1989));

        System.out.println("deque size=" + book1Deque.size());

        Book1 lastBook;
        lastBook = book1Deque.pop();
        lastBook = book1Deque.pop();
        lastBook = book1Deque.pop();

        System.out.println("deque size=" + book1Deque.size());
        System.out.println("last delete=" + lastBook);

        Iterator<Book1> iterator = book1Deque.iterator();
        while (iterator.hasNext()) {
            Book1 current = iterator.next();
            System.out.println(current);
            System.out.println();
        }
    }
}
