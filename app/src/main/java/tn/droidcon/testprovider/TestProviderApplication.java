package tn.droidcon.testprovider;

import android.app.Application;

import com.facebook.stetho.Stetho;

public class TestProviderApplication extends Application {
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
