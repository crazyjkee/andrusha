package ru.andraft.surfsup.Rawik;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import rajawali.RajawaliActivity;

/**
 * Created with IntelliJ IDEA.
 * User: artem
 * Date: 24.03.13
 * Time: 23:07
 * To change this template use File | Settings | File Templates.
 */
public class RajawalilkaActivity extends RajawaliActivity {
    private RajawaliRendererka mRenderer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mRenderer = new RajawaliRendererka(this);
        mRenderer.setSurfaceView(mSurfaceView);
        super.setRenderer(mRenderer);

        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);

        TextView label = new TextView(this);
        label.setText("Типа кароч высветилось");
        label.setTextSize(20);
        ll.addView(label);


        mLayout.addView(ll);
    }
}