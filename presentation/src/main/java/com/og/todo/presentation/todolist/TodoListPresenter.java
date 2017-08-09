package com.og.todo.presentation.todolist;

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

    }
}
