package com.kodilla.exception.nullpointer;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User(null);


        Optional<User> optionalUser1 = Optional.ofNullable(user);// pobiera i zwraca opakowaną zmienną
        Optional<User> optionalUser2 = Optional.ofNullable(null);//zwraca obiekt, który został przekazany jako argument metody (czyli "wartość domyślną").

        String username = optionalUser1.orElse(new User("optional  name ")).getName();
        System.out.println(username);

//Metoda ta działa w taki sposób, że wykonuje to, co zapakowane w Optional, ale
// tylko wtedy, gdy opakowany obiekt ma
// wartość inną niż null. W przeciwnym wypadku żadna akcja nie zostaje wykonana.

        Optional<User> optionalUser3 = Optional.ofNullable(user);
optionalUser3.ifPresent(u -> System.out.println(u.getName()));



    }

}
