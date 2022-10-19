package Polymorphism;

public class Main {
    public static void main(String[] args) {

        //Polimorfizm - nadklasy i intrfejsy przyjmują różne formy dzięki implementacjom np nadklasa DocumrntItem przyjmuje Pdf i Word
        DocumentItem pdf = new PdfDocument();
        DocumentItem word = new WordDocument();
        System.out.println(pdf.getDescription());
        System.out.println(word.getDescription());
    }
}
