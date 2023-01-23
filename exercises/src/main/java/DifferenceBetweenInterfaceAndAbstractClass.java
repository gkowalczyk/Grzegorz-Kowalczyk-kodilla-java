public interface DifferenceBetweenInterfaceAndAbstractClass {

    public abstract  void save();
    public final static  String name = "test";
    public abstract void load();



    default void getInfo() {
        System.out.println("I am implementing Saveable interface!");
    }

   /* Interfejsy vs klasa abstrakcyjna :

    - interfejsy nie mogą mieć konstruktorów, klasy abstrakcyjne mogą

    - interfejsy mają wszystkie pola typu   public static final String name = "test";

    - interfejsy posiadają tylko domyślne metody abstrakcyjne, które nie posiadają ciała metody,
    gdzie wyjątkiem jest metoda default, podczas gdy klasy abstrakcyjne mogą posiadać też inne metody

    - w interfejsach wszsytkie pola są statyczne i finalne , gdzie w klasach abstrakcyjnych już nie

    - modyfikatory dostępu w klasach abstrakcyjnych mogą być public, protected itd..

    */


    public class Admin implements DifferenceBetweenInterfaceAndAbstractClass {

        @Override
        public void save() {
            System.out.println("User saved!");
        }

        @Override
        public void load() {
            System.out.println("User loaded!");
        }
    }

    public abstract class User {

        private String name;

        public User(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public abstract void print(); // metoda do przeciążenia w klasie rozszerzającej ,  bez ciała
    }


    public class Admin1 extends User {

        private int level;

        public Admin1(String name, int level) {
            super(name);
            this.level = level;
        }

        public void setLevel(int level) {
            this.level = level;
        }
        public int getLevel() {
            return level;
        }
        @Override
        public void print() {
            System.out.println(String.format("Hey! I am %s. I am on %s level.", getName(), getLevel()));
        }
    }
    public static void main(String[] args) {

        User user = new Admin1("Adrian", 3); // nie możemy utworzyć bezpośrednio obiektu klasy abstrakcynej
        user.print();
    }
}
