package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public List<ForumUser> getUserList() {
        userList.add(new ForumUser("John", 1, 'M', 0, LocalDate.of(1998, 12, 16)));
        userList.add(new ForumUser("Julia", 2, 'F', 10, LocalDate.of(1982, 3, 23)));
        userList.add(new ForumUser("Karen", 3, 'F', 234, LocalDate.of(1950, 4, 14)));
        userList.add(new ForumUser("Bob", 4, 'M', 3, LocalDate.of(1968, 8, 26)));
        userList.add(new ForumUser("Patric", 5, 'M', 43, LocalDate.of(1978, 10, 25)));
        userList.add(new ForumUser("Max", 6, 'M', 36, LocalDate.of(1980, 11, 29)));
        userList.add(new ForumUser("Jessica", 7, 'F', 12, LocalDate.of(1999, 4, 1)));
        userList.add(new ForumUser("Chris", 8, 'M', 21, LocalDate.of(2006, 1, 7)));
        userList.add(new ForumUser("Roxanne", 9, 'F', 15, LocalDate.of(1986, 4, 9)));
        userList.add(new ForumUser("David", 10, 'M', 6, LocalDate.of(1947, 5, 12)));
        userList.add(new ForumUser("Nicole", 11, 'F', 10, LocalDate.of(1935, 12, 30)));
        return new ArrayList<>(userList);
    }
}
