package com.convergesolutions.tag;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;

public class UserSummary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_summary);

        Intent intent = getIntent();
        String Name = intent.getStringExtra(Hashtag.EXTRA_MESSAGE);
        String Hashtags = intent.getStringExtra(Hashtag.EXTRA_MESSAGE2);
        TextView textView = (TextView) findViewById(R.id.textView7);
        TextView textView2 = (TextView) findViewById(R.id.textView9);
        textView.setText(Name);
        textView.setText(Hashtags);

    }
}


