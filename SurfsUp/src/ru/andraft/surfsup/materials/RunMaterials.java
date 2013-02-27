package ru.andraft.surfsup.materials;

import android.os.Bundle;
import com.jme3.app.AndroidHarness;
import android.content.pm.ActivityInfo;
import com.jme3.system.android.AndroidConfigChooser.ConfigType;

public class RunMaterials extends AndroidHarness{
      HelloMaterials mat;

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        Bundle bundle = getIntent().getExtras();
        appClass = bundle.getString("APPCLASSNAME");
        appClass = "ru.andraft.surfsup"+bundle.getString("APPCLASSNAME");

        if (bundle.getString("DISABLEMOUSE").equals("YES")){
            mouseEventsEnabled=false;
        };

        eglConfigType = ConfigType.BEST;

        //mouseEventsEnabled=false;
        exitDialogTitle = "Exit?";
        exitDialogMessage = "Press Yes";
        eglConfigVerboseLogging = false;

        super.onCreate(savedInstanceState);
        //game=(Game) getJmeApplication();
    }
    static {
        System.loadLibrary("bulletjme");
    }
}