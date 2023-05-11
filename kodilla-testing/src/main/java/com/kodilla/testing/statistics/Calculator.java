package com.kodilla.testing.statistics;

import java.util.Objects;

public class Calculator {

    double userQty;
    double postQty;
    double commentQty;
    double avgPostsByUserQty;
    double avgCommentsByUserQty;
    double avgCommentsByPostQty;


    public void calculateAdvStatistics(Statistics statistics) {
        userQty = statistics.userNames().size();
        postQty = statistics.postsCount();
        commentQty = statistics.commentsCount();
        avgPostsByUserQty = calculateAvgPostsByUserQty();
        avgCommentsByPostQty = calculateAvgCommentsByUserQty();
        avgCommentsByPostQty = calculateAvgCommentsByPostQty();

    }

    public double calculateAvgPostsByUserQty() {

        return userQty > 0 ? postQty / userQty : 0;
    }

    public double calculateAvgCommentsByUserQty() {

        return userQty > 0 ? commentQty / userQty : 0;
    }

    public double calculateAvgCommentsByPostQty() {

        return postQty > 0 ? commentQty / postQty : 0;
    }

    public double getUserQty() {
        return userQty;
    }

    public void setUserQty(int userQty) {
        this.userQty = userQty;
    }

    public double getPostQty() {
        return postQty;
    }

    public void setPostQty(int postQty) {
        this.postQty = postQty;
    }

    public double getCommentQty() {
        return commentQty;
    }

    public void setCommentQty(int commentQty) {
        this.commentQty = commentQty;
    }

    public double getAvgPostsByUserQty() {
        return avgPostsByUserQty;
    }

    public void setAvgPostsByUserQty(int avgPostsByUserQty) {
        this.avgPostsByUserQty = avgPostsByUserQty;
    }

    public double getAvgCommentsByUserQty() {
        return avgCommentsByUserQty;
    }

    public void setAvgCommentsByUserQty(int avgCommentsByUserQty) {
        this.avgCommentsByUserQty = avgCommentsByUserQty;
    }

    public double getAvgCommentsByPostQty() {
        return avgCommentsByPostQty;
    }

    public void setAvgCommentsByPostQty(int avgCommentsByPostQty) {
        this.avgCommentsByPostQty = avgCommentsByPostQty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculator that = (Calculator) o;
        return userQty == that.userQty && postQty == that.postQty && commentQty == that.commentQty && avgPostsByUserQty == that.avgPostsByUserQty && avgCommentsByUserQty == that.avgCommentsByUserQty && avgCommentsByPostQty == that.avgCommentsByPostQty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userQty, postQty, commentQty, avgPostsByUserQty, avgCommentsByUserQty, avgCommentsByPostQty);
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "userQty=" + userQty +
                ", postQty=" + postQty +
                ", commentQty=" + commentQty +
                ", avgPostsByUserQty=" + avgPostsByUserQty +
                ", avgCommentsByUserQty=" + avgCommentsByUserQty +
                ", avgCommentsByPostQty=" + avgCommentsByPostQty +
                '}';
    }
}

