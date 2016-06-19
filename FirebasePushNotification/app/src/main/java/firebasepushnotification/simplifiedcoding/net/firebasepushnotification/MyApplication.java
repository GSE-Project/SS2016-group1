package firebasepushnotification.simplifiedcoding.net.firebasepushnotification;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by MZEEN on 17/Jun/2016.
 */
public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        //Initializing firebase
        Firebase.setAndroidContext(getApplicationContext());
    }
}