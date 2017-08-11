package com.og.todo.presentation.todolist;


import com.og.todo.domain.model.TodoItemModel;

import java.util.Collection;
import java.util.List;

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

        void onDataLoaded(List<TodoItemModel> model);

    }
}
