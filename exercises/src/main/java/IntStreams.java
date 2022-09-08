import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class IntStreams {

private static final ArrayList<BookIntStream> list() {

    final List<BookIntStream> theBookList = new ArrayList<>();

    theBookList.add(new BookIntStream("Dylan Murphy", "Wolf of the mountain",
            2003, "0001"));
    theBookList.add(new BookIntStream("Phoebe Pearson", "Slaves of dreams",
            2012, "0002"));
    theBookList.add(new BookIntStream("Morgan Walsh", "Obliteration of heaven",
            2001, "0003"));
    theBookList.add(new BookIntStream("Aimee Murphy", "Rejecting the night",
            2015, "0004"));
    theBookList.add(new BookIntStream("Ryan Talley", "Gangsters and kings",
            2007, "0005"));
    theBookList.add(new BookIntStream("Madelynn Carson", "Unity without duty",
            2007, "0006"));
    theBookList.add(new BookIntStream("Giancarlo Guerrero", "Enemies of eternity",
            2009, "0007"));


    return new ArrayList<BookIntStream>(theBookList);
}

    public static void main(String[] args) {
        ArrayList<BookIntStream> books = IntStreams.list();

        int numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())

                .filter(n -> books.get(n).getYearOfProduction() > 2007)
                .map( n -> 1)
                .sum();
        System.out.println(numberOfBooksPublicatedAfter2007);
    }
}
