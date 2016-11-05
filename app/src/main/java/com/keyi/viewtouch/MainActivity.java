package com.keyi.viewtouch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (ev.getAction()==MotionEvent.ACTION_DOWN){
            Log.e("ACTION_DOWN-->","ACTION_DOWN1");
        }
        if (ev.getAction()==MotionEvent.ACTION_MOVE){
            Log.e("ACTION_MOVE-->","ACTION_MOVE1");
        }
        if (ev.getAction()==MotionEvent.ACTION_UP){
            Log.e("ACTION_UP-->","ACTION_UP1");
        }
        if (getWindow().superDispatchTouchEvent(ev)){
            Log.e("被处理-->","被处理");
            return true;
        }
        return onTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);

    }

}
