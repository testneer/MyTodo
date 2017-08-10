package com.og.todo.presentation.model;

/**
 *
 * Created by orenegauthier on 10/08/2017.
 */

public class TodoItemModel {
    private String title;
    private long timeEntered;


    public TodoItemModel(String title, long timeEntered) {
        this.title = title;
        this.timeEntered = timeEntered;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        timeEntered = System.currentTimeMillis();
    }

    public long getTimeEntered() {
        return timeEntered;
    }

    public void setTimeEntered(long timeEntered) {
        this.timeEntered = timeEntered;
    }
}
