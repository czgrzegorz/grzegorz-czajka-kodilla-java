package com.kodilla.stream.forumuser;


import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getForumUserList().stream()
                .filter(user -> user.getUserSex() == 'M')
                .filter(user -> Period.between(user.getUserDateOfBirth(),LocalDate.now()).getYears() > 20)
                .filter(user -> user.getUserNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
