package ru.andraft.surview;


import android.content.res.Resources;
import android.graphics.*;
import android.util.Log;
import android.view.SurfaceHolder;
import ru.andraft.surfsup.R;

class DrawThread extends Thread{
    private boolean runFlag = false;
    private SurfaceHolder surfaceHolder;
    private Bitmap picture;
    private Matrix matrix;
    private long prevTime;

    public DrawThread(SurfaceHolder surfaceHolder, Resources resources){
        this.surfaceHolder = surfaceHolder;

        // загружаем картинку, которую будем отрисовывать
        picture = BitmapFactory.decodeResource(resources, R.drawable.ic_launcher);

        // формируем матрицу преобразований для картинки
        matrix = new Matrix();
        matrix.postScale(3.0f, 3.0f);
        matrix.postTranslate(100.0f, 100.0f);

        // сохраняем текущее время
        prevTime = System.currentTimeMillis();
    }

    public void setRunning(boolean run) {
        runFlag = run;
    }

    @Override
    public void run() {
        Canvas canvas;
        while (runFlag) {
            // получаем текущее время и вычисляем разницу с предыдущим
            // сохраненным моментом времени
            long now = System.currentTimeMillis();
            long elapsedTime = now - prevTime;
            if (elapsedTime > 30){
                // если прошло больше 30 миллисекунд - сохраним текущее время
                // и повернем картинку на 2 градуса.
                // точка вращения - центр картинки
                prevTime = now;
                matrix.preRotate(2.0f, picture.getWidth() / 2, picture.getHeight() / 2);
            }
            canvas = null;
            try {
                // получаем объект Canvas и выполняем отрисовку
                canvas = surfaceHolder.lockCanvas(null);
                synchronized (surfaceHolder) {
                    Log.e("бубубу","trarata");
                    canvas.drawColor(Color.BLACK);
                    canvas.drawBitmap(picture, matrix, null);
                    Drawka.Permament(canvas);
                }
            }
            finally {
                if (canvas != null) {
                    // отрисовка выполнена. выводим результат на экран
                    surfaceHolder.unlockCanvasAndPost(canvas);
                }
            }
        }
    }
}