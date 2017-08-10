package com.og.todo.domain.model;

import java.util.UUID;

/**
 *
 * Created by orenegauthier on 07/08/2017.
 */

public class TodoItemModel extends BaseModel {
    private final String ID;
    private String title;


    public TodoItemModel(String title){
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
