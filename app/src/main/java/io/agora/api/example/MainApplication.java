package io.agora.api.example;

import android.app.Application;

import com.nimo.facebeauty.FBEffect;
import com.nimo.facebeauty.FBEffect.InitCallback;
import java.lang.annotation.Annotation;
import java.util.Set;

import io.agora.api.example.annotation.Example;
import io.agora.api.example.common.model.Examples;
import io.agora.api.example.common.model.GlobalSettings;
import io.agora.api.example.utils.ClassUtils;

/**
 * The type Main application.
 */
public class MainApplication extends Application {

    private GlobalSettings globalSettings;

    @Override
    public void onCreate() {
        super.onCreate();
        initExamples();
        //todo --- facebeauty start
         #请联系商务获取美颜授权码key
        FBEffect.shareInstance().initFaceBeauty(getApplicationContext(), "YOUR_APP_ID", new InitCallback() {
            @Override public void onInitSuccess() {

            }

            @Override public void onInitFailure() {

            }
        });
        //todo --- facebeauty end
    }

    private void initExamples() {
        try {
            Set<String> packageName = ClassUtils.getFileNameByPackageName(this, "io.agora.api.example.examples");
            for (String name : packageName) {
                Class<?> aClass = Class.forName(name);
                Annotation[] declaredAnnotations = aClass.getAnnotations();
                for (Annotation annotation : declaredAnnotations) {
                    if (annotation instanceof Example) {
                        Example example = (Example) annotation;
                        Examples.addItem(example);
                    }
                }
            }
            Examples.sortItem();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets global settings.
     *
     * @return the global settings
     */
    public GlobalSettings getGlobalSettings() {
        if (globalSettings == null) {
            globalSettings = new GlobalSettings();
        }
        return globalSettings;
    }
}
