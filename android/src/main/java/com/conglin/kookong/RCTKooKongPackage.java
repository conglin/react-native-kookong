package com.conglin.kookong.RCTKooKong;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import android.util.Log;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.JavaScriptModule;
public class RCTKooKongPackage implements ReactPackage {



    @Override
    public List<NativeModule> createNativeModules(
                               ReactApplicationContext reactContext) {

     List<NativeModule> modules = new ArrayList<>();

     modules.add(new RCTKooKongModule(reactContext));

     return modules;
    }
    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
    	return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(
                              ReactApplicationContext reactContext) {
    	return Collections.emptyList();
    }

}