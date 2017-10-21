package com.example.myjokesandroidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.MyJokes;

/**
 * Created by Ila on 10/20/17.
 */

public class JokeFragment extends Fragment {

    public static final String TAG = JokeFragment.class.getSimpleName();

    public JokeFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_joke, container, false);

        TextView jokeTextView = root.findViewById(R.id.myjoke_textview);
        final TextView jokeAnswerTextView = root.findViewById(R.id.myjoke_answer_textview);
        Button tellMeButton = root.findViewById(R.id.tell_me_button);

        Intent intent = getActivity().getIntent();

        if (intent != null) {
            String jokeKey = intent.getStringExtra(JokeActivity.JOKE_KEY);

            Log.d(TAG, jokeKey);

            MyJokes joke = MyJokes.getInstance(Integer.parseInt(jokeKey));
            jokeTextView.setText(joke.getAJoke());
            jokeAnswerTextView.setText(joke.getJokeAnswer());

            tellMeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (jokeAnswerTextView.getVisibility() == View.GONE) {
                        jokeAnswerTextView.setVisibility(View.VISIBLE);
                    }
                }
            });
        }

        return root;
    }
}
