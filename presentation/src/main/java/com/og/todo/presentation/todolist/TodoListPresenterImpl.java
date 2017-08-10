package com.og.todo.presentation.todolist;

import com.og.todo.domain.interactors.GetItemsUseCase;

import java.util.logging.Logger;

/**
 *
 * Created by orenegauthier on 09/08/2017.
 */

class TodoListPresenterImpl implements TodoListPresenter {

    private TodoListPresenter.View mView;

    TodoListPresenterImpl(View mView, GetItemsUseCase getItems) {
        this.mView = mView;
    }

    @Override
    public void onDeleteItem() {

    }

    @Override
    public void onAddItem() {

    }

    @Override
    public void onRefresh() {

    }

    @Override
    public void loadData() {
//        mView.onDataLoaded();
    }
}
