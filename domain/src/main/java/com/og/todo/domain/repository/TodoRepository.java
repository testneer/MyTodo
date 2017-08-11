package com.og.todo.domain.repository;

import com.og.todo.domain.model.BaseModel;
import com.og.todo.domain.model.TodoItemModel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by orenegauthier on 10/08/2017.
 */

public class TodoRepository implements Repository {

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
            "15 Banana", "Orange", "Cherry", "Apple", "Pineapple", "Melon", "Plum" };

    List<TodoItemModel> mDataSource;

    private static TodoRepository INSTANCE;

    public static TodoRepository getInstance(){
        if(INSTANCE == null){
            INSTANCE = new TodoRepository();
        }
        return INSTANCE;
    }

    private TodoRepository(){
        mDataSource = new ArrayList<>();
        for(String s : mData){
           TodoItemModel item = new TodoItemModel(s);
            mDataSource.add(item);
        }
    }

    public List<TodoItemModel> getAllUsers(){
        return mDataSource;
    }

    @Override
    public boolean insert(BaseModel model) {
        return false;
    }

    @Override
    public boolean update(BaseModel model) {
        return false;
    }

    @Override
    public BaseModel get(Object id) {
        return null;
    }

    @Override
    public boolean delete(BaseModel model) {
        return false;
    }


}
