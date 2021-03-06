package com.malcomjones.aolsample;

import android.app.Application;
import android.util.Log;

import com.millennialmedia.AppInfo;
import com.millennialmedia.MMException;
import com.millennialmedia.MMSDK;

/**
 * Created by majones95 on 6/6/17.
 */

public class AOLSample extends Application {
    private static final String TAG = "SubclassActivity";
//    private static final String SITE_ID = "8a8094170154542ee5f84c2add5d0234";
    private static final String SITE_ID = "studytime";

    @Override
    public void onCreate() {
        super.onCreate();

        try{
            MMSDK.initialize(this);

            //Set Site ID
            AppInfo appInfo = new AppInfo();
            appInfo.setSiteId(SITE_ID);
            MMSDK.setAppInfo(appInfo);

        } catch (MMException e){
            Log.e(TAG, "SDK didn't initialize", e);
        }

    }
}
