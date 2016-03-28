package com.iiit.manasa.nbd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onView(View view){
        Intent intent = new Intent(this, View_image.class);
        startActivity(intent);
    }

    public void onMessage(View view){
        Intent intent = new Intent(this, Message.class);
        startActivity(intent);
    }

}
