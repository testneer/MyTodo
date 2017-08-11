package com.og.todo.presentation.todolist;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.og.todo.presentation.R;
import com.og.todo.domain.model.TodoItemModel;

import java.util.Collection;
import java.util.List;

/**
 *
 * Created by orenegauthier on 09/08/2017.
 */

class TodoListAdapter extends RecyclerView.Adapter<TodoListAdapter.ViewHolder> {
    private List<TodoItemModel> mData;

    void setNewData(List<TodoItemModel> newData) {
        this.mData = newData;
        Log.d("OREN-notifyDataSetCha", Thread.currentThread().getName());
        notifyDataSetChanged();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView mTextView;

        ViewHolder(TextView tv) {
            super(tv);
            mTextView = tv;
        }
    }

    @Override
    public TodoListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView tv = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.view_todo_list_item,null);
        return new ViewHolder(tv);
    }

    @Override
    public void onBindViewHolder(TodoListAdapter.ViewHolder holder, int position) {
        holder.mTextView.setText(mData.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return mData==null?0:mData.size();
    }

}
