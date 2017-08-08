package com.example.orenegauthier.mynotepad.presenter;

import android.content.Context;

/**
 * Created by orenegauthier on 07/08/2017.
 */

public interface TodoListPresenter {
    void onStart();

    public interface View{
        void showSnackBar(String text);
    }
}
