package com.og.todo.domain.interactors;

import android.support.annotation.NonNull;
import android.util.Log;

import com.og.todo.domain.executor.Executor;
import com.og.todo.domain.executor.MainThread;
import com.og.todo.domain.interactors.base.AbstractInteractor;
import com.og.todo.domain.model.TodoItemModel;
import com.og.todo.domain.repository.Repository;
import com.og.todo.domain.repository.TodoRepository;

import java.util.List;

/**
 *
 * Created by orenegauthier on 10/08/2017.
 */

public class GetItemsUseCase extends AbstractInteractor {

    private Repository<TodoItemModel> mRepository;
    @NonNull
    private Callback mCallback;


    public GetItemsUseCase(Executor threadExecutor, MainThread mainThread, Repository<TodoItemModel> repository) {
        super(threadExecutor, mainThread);
        mRepository = repository;
        Log.d("ORORENORENORENOREN", Thread.currentThread().getName());
    }

    public void setCallback(Callback callback){
        mCallback = callback;
    }


    @Override
    public void run() {
        List<TodoItemModel> items = ((TodoRepository)mRepository).getAllUsers();
        mCallback.onDataLoaded(items);
    }

    public interface Callback {
        void onDataLoaded(List<TodoItemModel> model);
    }
}
