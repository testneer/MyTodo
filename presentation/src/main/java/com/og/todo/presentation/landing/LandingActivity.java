package com.og.todo.presentation.landing;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.LoaderManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.og.todo.presentation.R;

public class LandingActivity extends AppCompatActivity implements LandingPresenter.View{
    private LandingPresenter mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new LandingPresenterImpl(this);
        setContentView(R.layout.landing_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button startApp = (Button) findViewById(R.id.button_start);
        startApp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mPresenter.onStart(LandingActivity.this);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_to_do_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void showSnackBar(String text) {
        View view = findViewById(android.R.id.content);
        Snackbar.make(view, text, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
    }
}
