package ru.andraft.surfsup.Rawik;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import android.content.Context;

import rajawali.BaseObject3D;
import rajawali.lights.DirectionalLight;
import rajawali.materials.GouraudMaterial;

import rajawali.parser.ObjParser;
import rajawali.renderer.RajawaliRenderer;
import ru.andraft.surfsup.R;
import android.graphics.Color;


public class RajawaliRendererka extends RajawaliRenderer {
    private DirectionalLight mLight;
    private BaseObject3D mObject;
    public RajawaliRendererka(Context context) {
        super(context);
        setFrameRate(60);
    }
    protected void setColorka(BaseObject3D b3d){
        GouraudMaterial simple = new GouraudMaterial();
        simple.setUseColor(true);
        simple.setSpecularIntensity(.1f,.1f,1.f,1);
        b3d.setMaterial(simple);
        b3d.setColor(Color.GREEN);

    }

    protected void initScene() {
       mLight = new DirectionalLight(-.5f,-.5f,-.5f);
       mLight.setPower(5.0f);
       ObjParser objParser = new ObjParser(mContext.getResources(),mTextureManager,R.raw.andrusha_obj);
       objParser.parse();
       mObject = objParser.getParsedObject();
       mObject.setLight(mLight);
     setColorka(mObject);
       mObject.setPosition(.0f,-2.0f,.0f);
       addChild(mObject);
    }
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        super.onSurfaceCreated(gl, config);
    }
    public void onDrawFrame(GL10 glUnused) {
        super.onDrawFrame(glUnused);
    }
}