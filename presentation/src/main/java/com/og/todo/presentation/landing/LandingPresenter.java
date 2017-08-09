package com.og.todo.presentation.landing;

import android.content.Context;

/**
 *
 * Created by orenegauthier on 07/08/2017..
 */
 interface LandingPresenter {
    void onStart(Context ctx);

     interface View{
        void showSnackBar(String text);
    }
}
