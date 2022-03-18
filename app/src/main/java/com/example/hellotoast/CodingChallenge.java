package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CodingChallenge extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.counter);
    }

    public void showToast(View view) {
        Context context = getApplicationContext();
        //setting the text to be shown
        CharSequence text = "Hello Toast!";
        //duration the text will be showing i.e 2sec
        int duration = Toast.LENGTH_SHORT;
        //making toast to display the message for certain amount of time
        Toast toast = Toast.makeText(context, text, duration);
        //calling toast by show() method
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}