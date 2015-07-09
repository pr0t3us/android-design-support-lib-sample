package ch.swissonid.design_lib_sample;

import android.app.Application;

import com.android.volley.toolbox.NoCache;

import ch.swissonid.design_lib_sample.utils.Consts;
import retrovolley.EndpointAdapter;
import retrovolley.RetroVolley;

/**
 * Created by soleinicenco on 7/9/15.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        RetroVolley.init(new NoCache());
        RetroVolley.supportEndpoint(
                Consts.GITHUB_ENDPOINT,
                new EndpointAdapter.Builder()
                        .setEndpoint("https://api.github.com")
                        .build()
        );
    }
}