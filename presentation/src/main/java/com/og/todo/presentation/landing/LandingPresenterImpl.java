package com.og.todo.presentation.landing;

/**
 * the presenter implementation
 * Created by orenegauthier on 08/08/2017.
 */

 class LandingPresenterImpl implements LandingPresenter {
    private LandingPresenter.View view;

    public LandingPresenterImpl(View view){
        this.view = view;
    }


    public void onStart() {
        view.showSnackBar("YAY button clicked");
        //GetIntent for list activity
//        Intent i
//        context.startActivity();

    }
}
