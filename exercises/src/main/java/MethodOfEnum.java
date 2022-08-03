public class MethodOfEnum {


    //Wymień metody typu wyliczeniowego i opisz krótko ich przeznaczenie

    public static void main(String[] args) {
        Gender[] genders = Gender.values();
        for (Gender gender: genders) {
            System.out.println(gender);
        }

        System.out.println("\n");
        System.out.println(Gender.MALE.name());
        System.out.println(Gender.MALE.ordinal());
        System.out.println(Gender.MALE.valueOf("MALE"));

    }
}
