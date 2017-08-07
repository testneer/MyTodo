package com.og.todo.domain;

import java.util.UUID;

/**
 * Created by orenegauthier on 07/08/2017.
 */

public class TodoItem {
    private final String ID;
    private String title;


    public TodoItem(String title){
        this.title = title;
        this.ID = UUID.randomUUID().toString();
    }

    public String getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
