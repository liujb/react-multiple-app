package com.reactmultipleapp;

import android.app.Activity;
import android.os.Bundle;

import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.shell.MainReactPackage;

public class Activity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ReactRootView mReactRootView = new ReactRootView(Activity2.this);

        ReactInstanceManager mReactInstanceManager = ReactInstanceManager.builder()
                .setApplication(getApplication())
                .setBundleAssetName("index.2.bundle")//loadConfig.getBundleAssetName()
                .setJSMainModulePath("index.2")//loadConfig.getJsMainModulePath()
                .addPackage(new MainReactPackage())
                .setUseDeveloperSupport(BuildConfig.DEBUG)
                .setInitialLifecycleState(LifecycleState.RESUMED)
                .build();

        mReactRootView.startReactApplication(mReactInstanceManager, "app1", null);
        setContentView(mReactRootView);
    }
}
