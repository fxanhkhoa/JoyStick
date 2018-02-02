package com.example.anhkhoa.joystick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements JoystickView.JoystickListener {

    private TextView xtextview;
    private TextView ytextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        JoystickView joystickView = new JoystickView(this);
        setContentView(R.layout.activity_main);
        //setContentView(new JoystickView(getApplicationContext()));

        xtextview = (TextView) findViewById(R.id.xfield);
        ytextview = (TextView) findViewById(R.id.yfield);
    }

    @Override
    public void onJoystickMoved(float xPercent, float yPercent, int id) {
        //Log.d("Main Method", "X percent: " + xPercent + "Y percent: " + yPercent);
        xtextview.setText(String.valueOf(xPercent));
        ytextview.setText(String.valueOf(yPercent));
    }
}
