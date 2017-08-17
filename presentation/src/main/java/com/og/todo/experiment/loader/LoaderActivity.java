package com.og.todo.experiment.loader;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.og.todo.presentation.R;

public class LoaderActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor>{


    SimpleCursorAdapter mAdapter;
    private ListView mLv;

    public static Intent getIntent(Context context){
        return new Intent(context, LoaderActivity.class);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loader);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && checkSelfPermission(Manifest.permission.READ_CONTACTS) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.READ_CONTACTS}, 100);
        }
        mLv = (ListView) findViewById(R.id.lv);
        mAdapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_2, null,
                new String[] { ContactsContract.Contacts.DISPLAY_NAME, ContactsContract.Contacts.CONTACT_STATUS },
                new int[] { android.R.id.text1, android.R.id.text2 }, 0);
        mLv.setAdapter(mAdapter);
        getSupportLoaderManager().initLoader(0,null,this);
    }

    @Override
    public Loader onCreateLoader(int id, Bundle args) {
        Uri contactUri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;

        // Now create and return a CursorLoader that will take care of
        // creating a Cursor for the data being displayed.
        String select = "((" + ContactsContract.Contacts.DISPLAY_NAME + " NOTNULL) AND ("
                + ContactsContract.Contacts.HAS_PHONE_NUMBER + "=1) AND ("
                + ContactsContract.Contacts.DISPLAY_NAME + " != '' ))";

        CursorLoader contactsLoader = new CursorLoader(this, contactUri, null, null, null, null);
        return contactsLoader;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {
        mAdapter.swapCursor(data);
    }

    @Override
    public void onLoaderReset(Loader loader) {
        mAdapter.swapCursor(null);
    }
}
