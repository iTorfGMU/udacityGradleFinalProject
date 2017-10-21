package com.example.myjokesandroidlibrary;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by Ila on 10/20/17.
 */

public class JokeActivity extends AppCompatActivity {

    public static final String TAG = JokeActivity.class.getSimpleName();

    public static final String JOKE_KEY = "jokeKey";

    public static void start(String joke, Context context) {
        Intent intent = new Intent(context, JokeActivity.class);
        intent.putExtra(JokeActivity.JOKE_KEY, joke);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
