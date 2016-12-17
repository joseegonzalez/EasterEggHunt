package nyc.c4q.josegonzalez.easteregghunt.model;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by hakeemsackes-bramble on 12/17/16.
 */

public class InsectApplication extends Application {
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}