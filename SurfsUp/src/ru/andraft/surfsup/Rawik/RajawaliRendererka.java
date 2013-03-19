package ru.andraft.surfsup.Rawik;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import rajawali.BaseObject3D;
import rajawali.lights.DirectionalLight;
import rajawali.parser.ObjParser;
import rajawali.renderer.RajawaliRenderer;
import ru.andraft.surfsup.R;
import android.app.Activity;


public class RajawaliRendererka extends RajawaliRenderer {
    private DirectionalLight mLight;
    private BaseObject3D mObject;

    public RajawaliRendererka(Context context) {
        super(context);
        setFrameRate(60);
    }


    protected void initScene() {
       mLight = new DirectionalLight(); // set the direction
       mLight.setPower(2);
        ObjParser objParser = new ObjParser(mContext.getResources(),mTextureManager,R.raw.andrushka);
        objParser.parse();
        mObject = objParser.getParsedObject();
        mObject.setLight(mLight);
        mObject.setPosition(0.8f,0.0f,0.0f);
        addChild(mObject);
    }
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        super.onSurfaceCreated(gl, config);
    }
    public void onDrawFrame(GL10 glUnused) {
        super.onDrawFrame(glUnused);
    }


}