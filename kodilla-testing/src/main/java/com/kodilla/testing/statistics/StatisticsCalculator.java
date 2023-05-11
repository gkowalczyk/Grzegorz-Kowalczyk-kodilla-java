package com.kodilla.testing.statistics;

public class StatisticsCalculator {

    private final Statistics statistics;

    public StatisticsCalculator(Statistics statistics) {
        this.statistics = statistics;
    }


    public long getUserCount() {
        return statistics.userNames().stream().count();
    }

    public int getPostsCount() {


        return statistics.postsCount();
    }

    public long getCommentCount() {

        return statistics.commentsCount();

    }

    public int getPostByUser() {
        return (int) (getPostsCount()/getUserCount());
    }
    public int getCommentByUser() {
        return (int) (getCommentCount()/getUserCount());
    }

    public int getCommentByPost() {
        return (int) (getCommentCount()/getPostsCount());
    }

}