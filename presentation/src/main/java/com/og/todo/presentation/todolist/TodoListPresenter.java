package com.og.todo.presentation.todolist;

import com.og.todo.presentation.model.TodoItemModel;

import java.util.Collection;

/**
 * presented
 * Created by orenegauthier on 08/08/2017.
 */

interface TodoListPresenter {

    void onDeleteItem();
    void onAddItem();
    void onRefresh();
    void loadData();

    interface View{

        void onDataLoaded(Collection<TodoItemModel> model);

    }
}
