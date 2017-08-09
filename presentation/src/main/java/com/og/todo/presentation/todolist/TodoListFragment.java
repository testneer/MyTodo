package com.og.todo.presentation.todolist;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.og.todo.presentation.R;


/**
 * A placeholder fragment containing a simple view..
 */
public class TodoListFragment extends Fragment {


    private RecyclerView mRv;
//    private RecyclerView.Adapter<TodoListAdapter.ViewHolder> mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmentLayout = inflater.inflate(R.layout.fragment_todo_list, container, false);
        setupRecyclerView(fragmentLayout);
        return fragmentLayout;
    }

    private void setupRecyclerView(View parent) {
        mRv = (RecyclerView) parent.findViewById(R.id.rv_items);
        mRv.setHasFixedSize(true);
        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getContext());
        mRv.setLayoutManager(mLayoutManager);
        mRv.setAdapter(new TodoListAdapter());
    }
}
