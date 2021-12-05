package com.kodilla.good.patterns.challenges.orderApp;

public class MailService implements InformationServiceInterface {

    @Override
    public void inform(User user) {
        System.out.println("Sending email to user:" + user.getSurname() +  "\n" + "in progress...");
    }
}
