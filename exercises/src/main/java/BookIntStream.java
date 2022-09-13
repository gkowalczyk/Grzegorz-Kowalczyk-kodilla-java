public class BookIntStream {

    private final String author;
    private final String title;
    private final int yearOfProduction;
    private final String signature;

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", signature='" + signature + '\'' +
                '}';
    }

    public String getSignature() {
        return signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public BookIntStream(String author, String title, int yearOfProduction, String signature) {
        this.author = author;
        this.title = title;
        this.yearOfProduction = yearOfProduction;
        this.signature = signature;
    }
}

