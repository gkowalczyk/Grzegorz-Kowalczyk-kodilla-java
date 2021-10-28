package com.kodilla.stream.forumuser;



import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();// to check current year
       // int expectedYear = date.getYear() - 20;// to check current year

        Forum forum = new Forum();
        Map<Integer,ForumUser> finalList = forum.getUserList().stream()
        .filter(forumUser -> forumUser.getSex() != 'F')
        .filter(forumUser -> Period.between(forumUser.getBirthDate(), date).getYears()>=20)
        .filter(forumUser -> forumUser.getPostNumber() >= 1 )
        .collect(Collectors.toMap(ForumUser::getIdNumber, forumUser ->forumUser));
        System.out.println("Filter by ID=" );
        finalList.entrySet().stream()
        .map(entry -> entry.getKey() + " : "+ entry.getValue())
        .forEach(System.out::println);
    }
}
