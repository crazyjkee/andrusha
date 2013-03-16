package ru.andraft.surfsup.Rawik;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import rajawali.BaseObject3D;
import rajawali.lights.DirectionalLight;
import rajawali.materials.DiffuseMaterial;
import rajawali.parser.ObjParser;
import rajawali.primitives.Sphere;
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
        mLight = new DirectionalLight(); // set the direction
       // mLight.setColor(1.0f, 1.0f, 1.0f);
       mLight.setPower(2);
        ObjParser objParser = new ObjParser(mContext.getResources(),mTextureManager,R.raw.andrusha);
        objParser.parse();
        mObject = objParser.getParsedObject();
        mObject.setLight(mLight);
        addChild(mObject);

        mCamera.setZ(-5.2f);
    }

    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        super.onSurfaceCreated(gl, config);

    }

    public void onDrawFrame(GL10 glUnused) {
        super.onDrawFrame(glUnused);
        mObject.setRotY(mObject.getRotY() + 1);
    }
}