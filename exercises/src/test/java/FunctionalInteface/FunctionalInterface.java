package FunctionalInteface;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalInterface {

    //@FunctionalInteface.FunctionalInterface
    //public interface Function<T, R> {
    //
    //    /**
    //     * Applies this function to the given argument.
    //     *
    //     * @param t the function argument
    //     * @return the function result
    //     */
    //    R apply(T t);
    @Test
    void function() {
        Function<Integer, String> function = t -> t + t + " tekst ";
        System.out.println(function.apply(69));

    }

    //@FunctionalInterface
    //public interface Predicate<T> {
    //
    //    /**
    //     * Evaluates this predicate on the given argument.
    //     *
    //     * @param t the input argument
    //     * @return {@code true} if the input argument matches the predicate,
    //     * otherwise {@code false}
    //     */
    //    boolean test(T t);
    @Test
    void predicate() {
        Predicate<Student> predicate = p -> p.getAge() > 21;
        boolean test2 = predicate.test(new Student("Karolina", "Nowak", 20));
        System.out.println(test2);
    }

    //@FunctionalInterface
//public interface Runnable {
//    /**
//     * When an object implementing interface <code>Runnable</code> is used
//     * to create a thread, starting the thread causes the object's
//     * <code>run</code> method to be called in that separately executing
//     * thread.
//     * <p>
//     * The general contract of the method <code>run</code> is that it may
//     * take any action whatsoever.
//     *
//     * @see     java.lang.Thread#run()
//     */
//    public abstract void run();
//}
    @Test
    void classicThread() { //jawnie

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() { //metoda abstrakcyjna
                System.out.println("ello");
            }
        });
        t1.start();
    }

    @Test
    void functionalThread() { //niejawnie

        Thread t1 = new Thread(() -> System.out.println("hello"));

        t1.start();
    }

    @Test
    void ConsumerFull() {
//@FunctionalInterface
//public interface Consumer<T> {
//
//    /**
//     * Performs this operation on the given argument.
//     *
//     * @param t the input argument
//     */
//    void accept(T t);
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }

    @Test
    void ConsumerShort() {
//@FunctionalInterface
//public interface Consumer<T> {
//
//    /**
//     * Performs this operation on the given argument.
//     *
//     * @param t the input argument
//     */
//    void accept(T t);
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");
        names.forEach((String s) -> System.out.println(s));

    }

    @Test
    void ConsumerShorter() {
//@FunctionalInterface
//public interface Consumer<T> {
//
//    /**
//     * Performs this operation on the given argument.
//     *
//     * @param t the input argument
//     */
//    void accept(T t);
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");
        names.forEach((name) -> System.out.println(name));
    }

    @Test
    void ConsumerShorter1() {
//@FunctionalInterface
//public interface Consumer<T> {
//
//    /**
//     * Performs this operation on the given argument.
//     *
//     * @param t the input argument
//     */
//    void accept(T t);
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");
        names.forEach(name -> System.out.println(name));
    }

    @Test
    void ConsumerShorter2() {
//@FunctionalInterface
//public interface Consumer<T> {
//
//    /**
//     * Performs this operation on the given argument.
//     *
//     * @param t the input argument
//     */
//    void accept(T t);
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");
        names.forEach(System.out::println);
    }


    // ####ZADANIE

    @Test
    public void classicProgrammingExample() {
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");
        long counter = 0;
        for (String name : names) {
            if (name.length() > 6) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    @Test
    public void classicProgrammingExampleSolution() {

        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");
        long counter = names.stream()
                .filter(name -> name.length() > 6)
                .count();
        System.out.println(counter);

    }

    @Test
    public void classicProgrammingExampleSolution1() {

        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");
        long counter = names.stream()
                .filter(name -> name.length() > 6)
                .count();
        System.out.println(counter);
    }

    @Test
    void FunctionalProgramingStream() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int num = 2;
        numbers.stream()
                .map(number -> number * num)
                .forEach(System.out::println);

    }

    @Test
    void FunctionalProgramingStrea1m() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final int num = 2;
        Stream<Integer> integerStream = numbers.stream()
                .map(number -> number * num);
        integerStream.forEach(System.out::println);
        // num = 3;
    }

    @Test
    void FunctionalProgramingStream2() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final Integer[] num = {2};   // przy użyciu tablicy
        Stream<Integer> integerStream = numbers.stream()
                .map(number -> number * num[0]);
        num[0] = 3; // przy uzyciu tablicy oszukujemy final który sprawdza referencje
        //wynik będzie inny bo Java interface korzysta z lazy initialization
        integerStream.forEach(System.out::println);
    }

    @Test
    void ListAndSort() {
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia", "Ola");

        List<String> collect = names.stream()
                .filter(s -> s.length() > 2)
                //  .limit(5)
                .map(String::toUpperCase)
                .sorted((l1, l2) -> l1.length() - l2.length())
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void mapExample() {
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");
        names.stream()
                .map(String::length)
                .forEach(System.out::println);
    }

    @Test
    void limitAndSort() {
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");

        String collect = names.stream()
                .filter(s -> s.length() > 2)
                .limit(5)
                .map(String::toUpperCase)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.joining(" , "));

        System.out.println(collect);

    }

    @Test
    public void statistics() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        OptionalInt optionalInt = numbers.stream()
                .mapToInt(x -> x)
                .max();

        System.out.println(optionalInt.getAsInt());
    }

    @Test
    public void statistics1() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        IntSummaryStatistics intSummaryStatistics = numbers.stream()
                .mapToInt(x -> x)
                .summaryStatistics();

        System.out.println(intSummaryStatistics);
    }
}