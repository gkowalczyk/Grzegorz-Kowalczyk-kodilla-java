package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(123, "Maciek", 'M', 1980, 05, 1, 20));
        forumUserList.add(new ForumUser(001, "Anna", 'F', 1989, 1, 2, 2));
        forumUserList.add(new ForumUser(109, "Robert", 'M', 1900, 12, 1, 10));
    }
        public List<ForumUser> getUserList() {
            return new ArrayList<>(forumUserList);
        }
    }

