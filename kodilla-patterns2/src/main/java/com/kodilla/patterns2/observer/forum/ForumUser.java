package com.kodilla.patterns2.observer.forum;

public class ForumUser implements Observer {
    private final String name;
    private int updateCount;

    public ForumUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(ForumTopic forumTopic) {
        System.out.println(name + "New messages in topic" + forumTopic.getName() + "\n" +
                "(total:" + forumTopic.getMessages().size() + "messages)");
        updateCount++;

    }
}

