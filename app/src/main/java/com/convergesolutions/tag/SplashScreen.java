package com.convergesolutions.tag;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SplashScreen extends AppCompatActivity {

    @Override
<<<<<<< HEAD
=======
    //create this activity spash screen
>>>>>>> e336206311bd4450e2dc2fefcb6653e1afd298b5
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);}

<<<<<<< HEAD
    public void Welcome(View view) {
        Intent intent = new Intent(this, Welcome.class);
        startActivity(intent);}
=======
    //start the activity.
    public void Welcome(View view) {
        Intent intent = new Intent(this, Welcome.class);
        startActivity(intent);}
        //add transition
    public void run () {
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        finish();
    }
>>>>>>> e336206311bd4450e2dc2fefcb6653e1afd298b5
}
