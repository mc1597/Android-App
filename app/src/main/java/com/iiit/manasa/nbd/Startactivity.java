package com.iiit.manasa.nbd;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by manasa on 13/12/15.
 */
public class Startactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        ImageView imageView = (ImageView)findViewById(R.id.balloon);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        imageView.startAnimation(animation1);
        imageView.postDelayed(new Runnable() {
            @Override
            public void run() {
                main();
            }
        },5000);

    }


   /* public void move(){
        ImageView imageView = (ImageView)findViewById(R.id.balloon);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        imageView.startAnimation(animation1);

    }*/

    public void main(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();

    }

}
