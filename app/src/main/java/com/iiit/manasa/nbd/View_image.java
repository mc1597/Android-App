package com.iiit.manasa.nbd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class View_image extends AppCompatActivity {

    int key1 = 0, n;
    ImageView imageView1a;
    //Bitmap b;
    int position = 0;
    float x1, x2, MIN_DISTANCE = 100;
    private int[] dresses = {R.drawable.mainpic,R.drawable.pic0, R.drawable.pic1, R.drawable.pic2, R.drawable.pic3,
            R.drawable.pic4, R.drawable.pic5,R.drawable.pic6,R.drawable.pic7,R.drawable.pic8,R.drawable.pic9,R.drawable.pic10,
    R.drawable.pic11,R.drawable.pic12};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_view_image);

        n = dresses.length;
        imageView1a = (ImageView) findViewById(R.id.closeupImage);

        imageView1a.setBackground(getResources().getDrawable(dresses[0]));

        imageView1a.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getActionMasked()) {

                    case MotionEvent.ACTION_DOWN:
                        x1 = event.getX();
                        break;
                    case MotionEvent.ACTION_UP:
                        x2 = event.getX();

                        float deltaX = x2 - x1;
                        if (Math.abs(deltaX) > MIN_DISTANCE) {
                            key1 = 0;

                            if (x2 > x1) {
                                //Toast.makeText(this, "Left to Right swipe [Next]", Toast.LENGTH_SHORT).show ();
                                if (position != 0) {
                                    position = (position - 1) % n;
                                } else {
                                    position = n - 1;
                                }
                                imageView1a.setBackground(getResources().getDrawable(dresses[position]));
                            }

                            // Right to left swipe action
                            else {
                                //Toast.makeText(this, "Right to Left swipe [Previous]", Toast.LENGTH_SHORT).show ();
                                position = (position + 1) % n;
                                imageView1a.setBackground(getResources().getDrawable(dresses[position]));
                            }
                        }


                        break;

                }
                return true;

            }
        });

    }
}






