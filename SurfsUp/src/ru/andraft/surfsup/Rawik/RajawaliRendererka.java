package ru.andraft.surfsup.Rawik;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import android.content.Context;
import rajawali.BaseObject3D;
import rajawali.lights.DirectionalLight;
import rajawali.parser.ObjParser;
import rajawali.renderer.RajawaliRenderer;
import ru.andraft.surfsup.R;
public class RajawaliRendererka extends RajawaliRenderer {
    private DirectionalLight mLight;
    private BaseObject3D mObject;


    public RajawaliRendererka(Context context) {
        super(context);
        setFrameRate(60);
    }
    protected void initScene() {
       mLight = new DirectionalLight();
       mLight.setPower(2);
       mCamera.setPosition(0,2,-7);
       mCamera.setZ(-4);
       ObjParser objParser = new ObjParser(mContext.getResources(),mTextureManager,R.raw.andrushka_obj);
       objParser.parse();
       mObject = objParser.getParsedObject();
       mObject.setLight(mLight);
       addChild(mObject);

    }
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        super.onSurfaceCreated(gl, config);
    }
    public void onDrawFrame(GL10 glUnused) {
        super.onDrawFrame(glUnused);

        //mObject.setRotX(mObject.getRotX()+1);
    }

}





