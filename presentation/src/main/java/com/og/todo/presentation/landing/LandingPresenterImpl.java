package com.og.todo.presentation.landing;

import android.content.Context;

import com.og.todo.presentation.todolist.TodoListActivity;

/**
 * the presenter implementation
 * Created by orenegauthier on 08/08/2017.
 */

 class LandingPresenterImpl implements LandingPresenter {
    private LandingPresenter.View view;

    LandingPresenterImpl(View view){
        this.view = view;
    }


    public void onStart(Context ctx) {
        view.showSnackBar("YAY button clicked");
        ctx.startActivity(TodoListActivity.getIntent(ctx));
    }
}
