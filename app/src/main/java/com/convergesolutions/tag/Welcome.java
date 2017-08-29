package com.convergesolutions.tag;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import javax.net.ssl.SSLEngineResult;

public class Welcome extends AppCompatActivity {

    public static final String EXTRA_MESSAGE ="com.convergesolutions.tag.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

        public void Hashtag(View view) {
            Intent intent = new Intent(this, Hashtag.class);
            EditText editText = (EditText) findViewById(R.id.editText);
            String Name = editText.getText().toString();
            intent.putExtra(EXTRA_MESSAGE, Name);
            startActivity(intent);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);


    }
}


