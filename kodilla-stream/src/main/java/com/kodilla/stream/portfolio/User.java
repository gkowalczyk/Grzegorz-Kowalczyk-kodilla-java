package com.kodilla.stream.portfolio;

public class User {
    private final String username;
    private final String realName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!getUsername().equals(user.getUsername())) return false;
        return getRealName().equals(user.getRealName());
    }

    @Override
    public int hashCode() {
        int result = getUsername().hashCode();
        result = 31 * result + getRealName().hashCode();
        return result;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public User(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }
}
