public class Dog {

    String dogName;
    String dogBreed;


    public Dog(String dogName, String dogBreed) {
        this.dogName = "noname";
        this.dogBreed = "unknown";
    }

    public void bark() {
        System.out.println("Woooow   ");
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }
}
class main {


    public static void main(String[] args) {
        Dog pies = new Dog("Rex", "Owczarek");


        System.out.println("Pies wabi się: "+pies.dogName + ", jego rasa to: " + pies.dogBreed + ".");
        pies.bark();
    }
}
