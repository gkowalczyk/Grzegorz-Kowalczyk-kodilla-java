package InterfaceAndAbstractClass;
/* Interfejsy vs klasa abstrakcyjna :

    - Klasy abstrakcyjnej używamy gdy tworzymy np ogólnego
    użytkownika,
    User w takim przypadku jest tylko bazową klasą pomocniczą i
    nigdy nie będziemy chcieli tworzyć obiektów tej klasy
    bezpośrednio. Dlatego możemy z niej zrobić klasę abstrakcyjną
    i tym samym „zablokować” możliwość tworzenia obiektów tej klasy.

    - interfejsy nie mogą mieć konstruktorów, klasy abstrakcyjne mogą

    - interfejsy mają wszystkie pola typu   public static final String name = "test";

    - interfejsy posiadają tylko domyślne metody abstrakcyjne, które nie posiadają ciała metody,
    gdzie wyjątkiem jest metoda default, podczas gdy klasy abstrakcyjne mogą posiadać też inne metody

    - w interfejsach wszsytkie pola są statyczne i finalne , gdzie w klasach abstrakcyjnych już nie

    - modyfikatory dostępu w klasach abstrakcyjnych mogą być public, protected itd..
    interfejsy mogą mieć pola private

    - rozszerzając interfejs używamy extends

    -An abstract class can override Object class methods, but an interface can't.
    https://www.baeldung.com/java-interface-default-method-vs-abstract-class

    */
public interface Employee extends Iterable {

    public final static int maxDaysVacation = 26; //1

    abstract void takeVacation(int days);          //2
    abstract void takeSickLeave();

    default void quitJob() {                       //3
        System.out.println("no hejjjjjj");
    }

    static void fireEmployees(Employee [] employees) {//4
        for (Employee employee : employees) {
            employee.quitJob();
        }
    }
        private void printBye() {                   //5
            System.out.println("byeeee");
    }
}
