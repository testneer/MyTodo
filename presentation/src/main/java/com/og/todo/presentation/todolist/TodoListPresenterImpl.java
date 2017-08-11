package com.og.todo.presentation.todolist;

import com.og.todo.domain.interactors.GetItemsUseCase;
import com.og.todo.domain.model.TodoItemModel;

import java.util.List;

/**
 *
 * Created by orenegauthier on 09/08/2017.
 */

class TodoListPresenterImpl implements TodoListPresenter, GetItemsUseCase.Callback{

    private TodoListPresenter.View mView;
    private GetItemsUseCase mUseCase;

    TodoListPresenterImpl(View mView, GetItemsUseCase useCase) {
        this.mView = mView;
        useCase.setCallback(this);
        this.mUseCase = useCase;
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
        mUseCase.execute();
    }

    //callBack implementations
    @Override
    public void onDataLoaded(List<TodoItemModel> model) {
        mView.onDataLoaded(model);
    }
}
