package ru.andraft.surfsup.Rawik;

import android.os.Bundle;
import android.util.Log;
import android.view.Window;

import rajawali.RajawaliActivity;
public class RawajalilkaActivity extends RajawaliActivity {
    private RajawaliRendererka mRenderer;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mRenderer = new RajawaliRendererka(this);
        mRenderer.setSurfaceView(mSurfaceView);
        super.setRenderer(mRenderer);
    }
}