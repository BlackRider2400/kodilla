package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final String name;
    private final int id;
    private final char sex;
    private final int postCount;
    private final LocalDate year;

    public ForumUser(final String name, final int id, final char sex, final int postCount, final LocalDate year) {
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.postCount = postCount;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public char getSex() {
        return sex;
    }

    public int getPostCount() {
        return postCount;
    }

    public LocalDate getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", sex=" + sex +
                ", postCount=" + postCount +
                ", year=" + year +
                '}';
    }
}
