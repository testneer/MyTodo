package com.og.todo.presentation.landing;

import android.content.Context;

/**
 * Created by orenegauthier on 07/08/2017.
 */
 interface TodoListPresenter {
    void onStart();

     interface View{
        void showSnackBar(String text);
    }
}
