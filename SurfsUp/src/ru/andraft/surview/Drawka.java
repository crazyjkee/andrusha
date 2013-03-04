package ru.andraft.surview;

import android.R;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created with IntelliJ IDEA.
 * User: artem
 * Date: 04.03.13
 * Time: 13:49
 * To change this template use File | Settings | File Templates.
 */
public class Drawka {
  static int[] x={0,5,3,2,1};
    public static void Permament(Canvas canvas){
        x[0]++;
        x[1]++;
        x[2]++;
        x[3]++;
        int i=canvas.getWidth();
        int b=canvas.getHeight();
        Paint p = new Paint();
        p.setColor(Color.GRAY);
        canvas.drawLine(x[0],x[1],x[2],x[3],p);
    }
}
