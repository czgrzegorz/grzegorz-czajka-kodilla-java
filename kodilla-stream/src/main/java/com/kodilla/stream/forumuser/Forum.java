package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(1, "One", 'M', LocalDate.of(1985,1,1), 0));
        theForumUserList.add(new ForumUser(2, "Two", 'F', LocalDate.of(1980,1,1), 15));
        theForumUserList.add(new ForumUser(3, "Three", 'M', LocalDate.of(1990,1,1), 5));
        theForumUserList.add(new ForumUser(4, "Four", 'F', LocalDate.of(2000,1,1), 20));
        theForumUserList.add(new ForumUser(5, "Five", 'M', LocalDate.of(1997,1,1), 20));
    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(theForumUserList);
    }
}
