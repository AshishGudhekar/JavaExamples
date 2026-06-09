package com.java.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskManager {

    static void main(String[] args) {

        List<Task> result = makeToDoList();
        System.out.println(result.toString());

    }


    public static List<Task> makeToDoList() {

        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("Complete assignment"));
        taskList.add(new Task("Go for a run"));
        taskList.add(new Task("Buy groceries"));

        taskList.get(1).setCompleted(true);

        for(int i=0; i<taskList.size(); i++) {
            Task t = taskList.get(i);
            System.out.println(
                    (i+1) + ". " + t.getDescription() + " - " + "Completed: "
                    + t.isCompleted()
            );
        }

        return taskList;
    }

}
