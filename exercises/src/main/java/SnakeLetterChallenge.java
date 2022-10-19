import java.util.*;

//Zadanie składa się z dwóch części.
//
//Część 1
//
//Napisz program, który w kolejce ArrayDeque umieści 50 obiektów
// przechowujących napisy (ciągi znaków), składające się z litery 'a'
// powtórzonej losową ilość razy (zakres powtórzeń: 1-50).
//Wypełnienie obiektu powtórzeniami litery 'a' zrealizuj przy pomocy pętli for.
//Część 2
//
//Program z części pierwszej rozbuduj w taki sposób, że przekażesz
// utworzoną kolejkę do metody Twojej klasy, która dokona rozdzielenia
// obiektów z kolejki na dwie kolekcje ArrayList.
//Jedna z nich będzie przechowywała obiekty o parzystej liczbie znaków
// 'a', a druga o nieparzystej.
class CharAGenerator {


    public void checkEvenOrOddChar(Deque<String> stringDeque) {


        List<String> even = new ArrayList<>();
        List<String> odd = new ArrayList<>();

        while (stringDeque.size() > 0) {

            String temp = stringDeque.poll();
            if (temp.length() % 2 == 0) {
                even.add(temp);
                System.out.println("List even:" + temp);
            }
            odd.add(temp);
            System.out.println("List odd:" + temp);
        }

    }

}

public class SnakeLetterChallenge {
    public static void main(String[] args) {

        Deque<String> chainDeque = new ArrayDeque<>();

        Random random = new Random();
        int number = random.nextInt(50);
        String charA = "a";

        for (int n = 0; n < 50; n++) {
            //String charA = "a";

            for (int i = 0; i < random.nextInt(50); i++) {

                charA = charA + "a";
            }
            //System.out.println(charA);
            chainDeque.offer(charA);

            CharAGenerator charAGenerator = new CharAGenerator();
            charAGenerator.checkEvenOrOddChar(chainDeque);
        }
    }
}
