package com.glympse.plugin;


import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import android.util.Log;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;


import com.glympse.android.lite.LC;
import com.glympse.android.lite.GGlympseLite;
import com.glympse.android.lite.GInviteLite;
import com.glympse.android.lite.GTicketLite;
import com.glympse.android.lite.LiteFactory;

public class Glympse extends CordovaPlugin {


    private Activity activity;
    private static final String TAG = "GlympsePlugin";

    private GGlympseLite glympse;

    // Cordova method names!
    public static String START = "start";

    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);

        Context context = this.cordova.getActivity().getApplicationContext();

        activity = cordova.getActivity();

        ApplicationInfo appliInfo = null;
        try {
            appliInfo = activity.getPackageManager().getApplicationInfo(
                activity.getPackageName(),
                PackageManager.GET_META_DATA
            );
        } catch (NameNotFoundException e) {}

        String API_KEY = appliInfo.metaData.getString("com.glympse.plugin.API_KEY");
        String SERVER_URL = appliInfo.metaData.getString("com.glympse.plugin.SERVER_URL");

        glympse = LiteFactory.createGlympse(context, SERVER_URL, API_KEY);

    }

    public boolean execute(
        String action,
        JSONArray args,
        CallbackContext callbackContext
    ) throws JSONException {
        if(action.equals(START)) {
            return this.startGlympse(callbackContext);
        }
        // GTicketLite ticket = LiteFactory.createTicket(3600000, "Going home!", null);

      return false;
    }
    public boolean startGlympse(
        CallbackContext callbackContext
    ) throws JSONException {
        Log.v(TAG, "Start glympse called!");
        return true;
    }
}
