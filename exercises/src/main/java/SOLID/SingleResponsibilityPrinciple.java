public class SingleResponsibilityPrinciple {

    //użytkownika i obsługę logiki bazodanowej oraz obsługę wysyłania e-maili. To narusza zasadę pojedynczej odpowiedzialności, ponieważ zmiany w jednym obszarze mogą wpływać na inny obszar.
    //
    //Lepszym podejściem byłoby podzielenie tych zadań na dwie osobne klasy:


    class UserData {
        private final String name;
        private final String maessage;

        UserData(String name, String maessage) {
            this.name = name;
            this.maessage = maessage;
        }
    }


    class UserDatabaseManager {
        void saveUserData(UserData userData) {
    String date =  userData.name;
        }
    }


    class EmailSender {
        void sendEmail(UserData userData) {
            String message = userData.name;
        }
    }
}
