public class StringStringBuilderStringBuffer {

//https://javastart.pl/baza-wiedzy/klasy/string-stringbuffer-i-stringbuilder
   //https://stormit.pl/stringbuilder/
   // https://1024kb.pl/nauka-java/jak-polaczyc-stringi-w-javie/

    public static void main(String[] args) throws InterruptedException {



        //StringBuilder __>>>>>>>

        //Klasa StringBuilder powstała jako rozszerzenie funkcjonalności
        // oferowanych przez tradycyjnego stringa. W przeciwieństwie do
        // pierwowzoru StringBuilder jest klasą modyfikowalną, czyli jej
        // obiekty mogą się rozszerzać i zmieniać swoją zawartość. Dzięki
        // temu można łączyć ze sobą różne fragmenty tekstu, bez konieczności
        // generowania wielu niepotrzebnych obiektów.

        //Klasy te bazują na tablicy znaków, do której za każdy dodaniem nowego znaku
        // (append) jest dodawany znak. Dopiero na sam koniec operacji – podczas
        // wywołania toString() – jest tworzony obiekt String. Tak, tworzymy
        // tylko jeden raz obiekt String, dlatego to wszystko wykonuje się dużo szybciej.

StringBuilder stringBuilder = new StringBuilder(); // tworzymy pusty bufor
stringBuilder.append("java").append("rocks"); // modyfikacja bufora poprzez metode append4
String value = stringBuilder.toString();
        System.out.println("value:" + value);

stringBuilder.insert(4, 8); //metoda insert
        System.out.println("stringbuilder:" + stringBuilder);

        stringBuilder.replace(0, 6, "Java7"); //metoda replace
        System.out.println("stringbuilder:" + stringBuilder);

        stringBuilder.delete(4, 5); //metoda delete
        System.out.println("stringbuilder:" + stringBuilder);

        stringBuilder.reverse(); //metoda reverse
        System.out.println("stringbuilder:" + stringBuilder);

         //metoda  int capacity, rozmiar bufora
        System.out.println("stringbuilder:" + stringBuilder.capacity());

        stringBuilder.ensureCapacity(20);
        System.out.println("stringbuilder:" + stringBuilder.capacity());

        // int lenght - zwraca aktualny rozmiar ciągu
        System.out.println("stringbuilder:" + stringBuilder.length());

        // charAt  - znak pod danym indeksem
        System.out.println("stringbuilder:" + stringBuilder.charAt(1));

        // substring  - zwraca danym ciąg znaków w zakresie int start oraz int end
        System.out.println("stringbuilder:" + stringBuilder.substring(0,3));

///////////////////////////////////////////////////////////////////////////////////


        String s1 = "Kasia";
        s1 = s1 + " i Tomek";

        System.out.println(s1);
        //do javy 8 :



        String s = "Kasia";
        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) { // nieefektywna metoda tworzenie 10tyś obiektów StringBuilder  i metod
            s = s + "a";  // za każdym razem tworzony jest nowy obiekt , będący kopią

            //      String jest immutable – po dodaniu nowego Stringa (po zmianie stanu obiektu) – została zwrócona
            //      jego kopia, czyli obiekt z nowym adresem.
            //String blog = "1024kb";
            //System.out.println("Adres String przed dodaniem: " + Integer.toHexString(blog.hashCode()));
            //blog += ".pl";
            //System.out.println("Adres String po dodaniu nowego Stringa: " + Integer.toHexString(blog.hashCode()));

        }

        System.out.println("Time1:" + (System.nanoTime() - start + "ns"));


        //efektywniej ->>>

        //Klasy te bazują na tablicy znaków, do której za każdy dodaniem nowego
        // znaku (append) jest dodawany znak. Dopiero na sam koniec operacji –
        // podczas wywołania toString() – jest tworzony obiekt String. Tak,
        // tworzymy tylko jeden
        // raz obiekt String, dlatego to wszystko wykonuje się dużo szybciej.
       // String s = "Kasia";
        s = new StringBuilder(s).append(" i Tomek").toString(); //nowy obiekt StringBuilder
        System.out.println(s);

        long start1 = System.nanoTime();
        StringBuilder sb = new StringBuilder(s);//tworzymy obiekt przed pętlą
        for (int i = 0; i < 1000; i++) {
            sb.append("a");
        }
        s = sb.toString();
        System.out.println("Time2:" + (System.nanoTime() - start1 + "ns"));

    // od java 9 : za pomocą mechanizmu invokedynamic w locie łączone są Stringi
        String s2 = "Kasia";
        s2 = s2 + " i Tomek";

        System.out.println("s2:" + s2);

//StringBuffer - klasa synchronizowana,  StrinBuilder - nie jest synchronizowana



StringBuffer stringBuffer = new StringBuffer();

new Thread(() -> {
    for (int i = 0; i < 100_000; i++) {
        stringBuffer.append("a");
    }}).start();

        for (int i = 0; i < 100_000; i++) {
            stringBuffer.append("b");
        }

        Thread.sleep(1000);

        String result = stringBuffer.toString();
        System.out.println(result.length());

//Niestety ze względu na to, że StringBuilder nie jest przystosowany do
// pracy w wielu wątkach program ten często się wywala
// (błędy typu ArrayIndexOutOfBoundsException w środku w StringBuilderze),
// a jeśli już się udało, to otrzymywałem
// wyniki rzędu 120 tys. Wychodzi na to, że 80 tys. znaków przepadło!


//Jeszcze raz, najważniejsze różnice:
//String jest immutable, StringBuilder i StringBuffer – mutable (bufor)
//String przechowywany jest w String Pool, StringBuilder i StringBuffer – w normalnej stercie
//StringBuilder i StringBuffer są znacznie wydajniejsze do celów modyfikacji sekwencji znaków


    }
}