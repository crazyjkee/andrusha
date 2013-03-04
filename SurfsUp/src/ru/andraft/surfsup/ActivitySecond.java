package ru.andraft.surfsup;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ru.andraft.surview.SurfView;

public class ActivitySecond extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout fl = new FrameLayout(this);
        fl.addView(new SurfView(this));
        setContentView(fl);
        Log.e("startanyl","oncreate");
}}
