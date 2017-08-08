package com.example.orenegauthier.mynotepad.presenter;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;

/**
 * the presenter implementation
 * Created by orenegauthier on 08/08/2017.
 */

public class TodoListPresenterImpl implements TodoListPresenter {
    private TodoListPresenter.View view;

    public TodoListPresenterImpl(View view){
        this.view = view;
    }


    public void onStart() {
        view.showSnackBar("YAY button clicked");
        //GetIntent for list activity
//        Intent i
//        context.startActivity();

    }
}
