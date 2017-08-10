package com.og.todo.presentation.todolist;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.og.todo.domain.executor.Executor;
import com.og.todo.domain.executor.MainThread;
import com.og.todo.domain.executor.impl.ThreadExecutor;
import com.og.todo.domain.interactors.GetItemsUseCase;
import com.og.todo.presentation.MainThreadImpl;
import com.og.todo.presentation.R;
import com.og.todo.presentation.model.TodoItemModel;

import java.util.Collection;


/**
 * A placeholder fragment containing a simple view..
 */
public class TodoListFragment extends Fragment implements TodoListPresenter.View{


    private RecyclerView mRv;
    private RecyclerView.LayoutManager mLayoutManager;
    private TodoListPresenter mPresenter;
    private TodoListAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmentLayout = inflater.inflate(R.layout.fragment_todo_list, container, false);
        setupRecyclerView(fragmentLayout);
        GetItemsUseCase useCase = new GetItemsUseCase(ThreadExecutor.getInstance(), MainThreadImpl.getInstance());
        mPresenter = new TodoListPresenterImpl(this, useCase);
        return fragmentLayout;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mPresenter.loadData();
    }

    private void setupRecyclerView(View parent) {
        mRv = (RecyclerView) parent.findViewById(R.id.rv_items);
        mRv.setHasFixedSize(true);
        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getContext());
        mRv.setLayoutManager(mLayoutManager);
        mAdapter = new TodoListAdapter();
        mRv.setAdapter(mAdapter);
    }

    @Override
    public void onDataLoaded(Collection<TodoItemModel> model) {
        mAdapter.setNewData(model);
    }
}
