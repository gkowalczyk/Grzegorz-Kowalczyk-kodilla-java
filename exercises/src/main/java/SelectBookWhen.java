import java.util.List;


//Część 2
//
//Napisz program przy użyciu listy LinkedList, zawierającej obiekty opisujące
// książki.
// Każda książka powinna mieć tytuł i rok wydania.
//Wypełnij listę kilkoma przykładowymi pozycjami.
//Następnie przy pomocy pętli for-each wyświetl tylko te
// książki z listy, dla których rok wydania nie jest mniejszy niż 2000.

class Book {

    String title;
    int year;

    public Book() {
    }

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void getYour() {

        Book book1 = new Book("title1", 2000);
        Book book2 = new Book("title2", 20005);

        List<Book> linkedList = List.of(book1, book2);

        for (Book listBook : linkedList) {
            if (listBook.getYear() > 2000) {
                System.out.println(listBook.getTitle());
            }

        }
    }
}
class SelectBookWhen {

    public static void main(String[] args) {
        Book book = new Book();
        book.getYour();
    }
}
