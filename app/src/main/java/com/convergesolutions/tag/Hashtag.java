package com.convergesolutions.tag;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.jar.Attributes;

public class Hashtag extends AppCompatActivity {

    public static final String EXTRA_MESSAGE="com.convergesolutions.tag.MESSAGE";
    public static final String EXTRA_MESSAGE2="com.convergesolutions.tag.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hashtag);
<<<<<<< HEAD

=======
        // what does this do
>>>>>>> e336206311bd4450e2dc2fefcb6653e1afd298b5
        Intent intent = getIntent();
                String Name = intent.getStringExtra(Welcome.EXTRA_MESSAGE);
                TextView textView = (TextView) findViewById(R.id.textView13);
                textView.setText(Name);}

<<<<<<< HEAD

=======
        //add new handler to handle transition located in anim


    // what does this do.
>>>>>>> e336206311bd4450e2dc2fefcb6653e1afd298b5
    public void UserSummary(View view) {
        Intent intent = new Intent(this, UserSummary.class);
        TextView TextView2 = (TextView) findViewById(R.id.textView13);
        EditText EditText2 = (EditText) findViewById(R.id.editText5);
        String Name = TextView2.getText().toString();
        String Hashtags = EditText2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, Name);
        intent.putExtra(EXTRA_MESSAGE2, Hashtags);
        startActivity(intent);

    }

<<<<<<< HEAD
            }
=======

>>>>>>> e336206311bd4450e2dc2fefcb6653e1afd298b5



