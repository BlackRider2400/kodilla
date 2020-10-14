package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.config.Task;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {

    @Bean
    public Board board(){
        return new Board(toDoList(), inProgressList(), doneList());
    }

    @Bean
    public TaskList toDoList(){
        List<String> toDoList = new ArrayList<>();
        toDoList.add("Feed a cat");
        toDoList.add("Pet a cat");
        toDoList.add("Make picture of cat");
        return new TaskList(toDoList);
    }

    @Bean
    public TaskList inProgressList(){
        List<String> inProgressList = new ArrayList<>();
        inProgressList.add("Feed a dog");
        inProgressList.add("Pet a dog");
        inProgressList.add("Make picture of dog");
        return new TaskList(inProgressList);
    }

    @Bean
    public TaskList doneList(){
        List<String> doneList = new ArrayList<>();
        doneList.add("Feed a rabbit");
        doneList.add("Pet a rabbit");
        doneList.add("Make picture of rabbit");
        return new TaskList(doneList);
    }
}
