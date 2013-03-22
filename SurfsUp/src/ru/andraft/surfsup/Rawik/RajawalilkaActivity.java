package ru.andraft.surfsup.Rawik;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Window;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import rajawali.RajawaliActivity;
public class RajawalilkaActivity extends RajawaliActivity {
    private RajawaliRendererka mRenderer;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mRenderer = new RajawaliRendererka(this);
        mRenderer.setSurfaceView(mSurfaceView);
        super.setRenderer(mRenderer);

    }




}