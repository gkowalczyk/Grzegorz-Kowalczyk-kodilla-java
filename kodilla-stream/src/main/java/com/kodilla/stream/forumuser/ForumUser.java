package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int idNumber;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int postNumber;

    public int getIdNumber() {
        return idNumber;
    }
    public String getUserName() {
        return userName;
    }
    public char getSex() {
        return sex;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public int getPostNumber() {
        return postNumber;
    }
    @Override
    public String toString() {
        return "ForumUser{" +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postNumber=" + postNumber +
                '}';
    }
    public ForumUser(int idNumber, String userName, char sex, int yearOfBirth , int monthOfBirth, int dayOfBirth, int postNumber) {
        this.idNumber = idNumber;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        this.postNumber = postNumber;
    }
}

