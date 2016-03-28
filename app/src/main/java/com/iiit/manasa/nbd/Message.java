package com.iiit.manasa.nbd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by manasa on 12/12/15.
 */
public class Message extends AppCompatActivity {

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        txt = (TextView)findViewById(R.id.bdaymsg);

        txt.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getActionMasked()) {
                    case MotionEvent.ACTION_DOWN:
                        txt.setTextColor(getResources().getColor(R.color.colorAccent));
                        break;

                    case MotionEvent.ACTION_MOVE:
                        txt.setTextColor(getResources().getColor(R.color.colorAccent));
                        break;

                    case MotionEvent.ACTION_UP:
                        txt.setTextColor(getResources().getColor(R.color.writeYellow));
                        break;
                }
                    return true;
            }
        });
    }

}
