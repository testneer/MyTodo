package com.og.todo.presentation.todolist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.og.todo.presentation.R;

/**
 * Created by orenegauthier on 09/08/2017.
 */

class TodoListAdapter extends RecyclerView.Adapter<TodoListAdapter.ViewHolder> {
    private String[] mData = {  "01 Banana", "Orange", "Cherry", "Apple", "Pineapple", "Melon", "Plum",
                                "02 Banana", "Orange", "Cherry", "Apple", "Pineapple", "Melon", "Plum",
                                "03 Banana", "Orange", "Cherry", "Apple", "Pineapple", "Melon", "Plum",
                                "04 Banana", "Orange", "Cherry", "Apple", "Pineapple", "Melon", "Plum",
                                "05 Banana", "Orange", "Cherry", "Apple", "Pineapple", "Melon", "Plum",
                                "06 Banana", "Orange", "Cherry", "Apple", "Pineapple", "Melon", "Plum",
                                "07 Banana", "Orange", "Cherry", "Apple", "Pineapple", "Melon", "Plum",
                                "08 Banana", "Orange", "Cherry", "Apple", "Pineapple", "Melon", "Plum",
                                "09 Banana", "Orange", "Cherry", "Apple", "Pineapple", "Melon", "Plum",
                                "10 Banana", "Orange", "Cherry", "Apple", "Pineapple", "Melon", "Plum",
                                "11 Banana", "Orange", "Cherry", "Apple", "Pineapple", "Melon", "Plum",
                                "12 Banana", "Orange", "Cherry", "Apple", "Pineapple", "Melon", "Plum",
                                "13 Banana", "Orange", "Cherry", "Apple", "Pineapple", "Melon", "Plum",
                                "14 Banana", "Orange", "Cherry", "Apple", "Pineapple", "Melon", "Plum",
                                "15 Banana", "Orange", "Cherry", "Apple", "Pineapple", "Melon", "Plum" };;

    static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView mTextView;
    public ViewHolder(TextView tv) {
        super(tv);
        mTextView = tv;
    }
}

    @Override
    public TodoListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView tv = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.todo_list_item,null);
        return new ViewHolder(tv);
    }

    @Override
    public void onBindViewHolder(TodoListAdapter.ViewHolder holder, int position) {
        holder.mTextView.setText(mData[position]);
    }

    @Override
    public int getItemCount() {
        return mData.length;
    }

}
