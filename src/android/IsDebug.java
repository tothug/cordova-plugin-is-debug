package me.mattlewis.isdebug;

import org.apache.cordova.BuildConfig;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class IsDebug extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("getIsDebug")) {
            callbackContext.success(this.isDebug() ? 1 : 0);
        } else {
            return false;
        }
        return true;
    }

    private boolean isDebug() {
        return BuildConfig.DEBUG;
    }
}