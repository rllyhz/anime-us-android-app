package id.rllyhz.animeus.helper;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefferencesHelper {
    public final String SHARED_PREFS_NAME = "id.rllyhz.animeus.MY_SHARED_PREFS";

    private Context context;
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;

    public SharedPrefferencesHelper(Context context) {
        this.context = context;
        this.prefs = context.getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE);
    }

    private SharedPreferences getPrefs() {
        return this.prefs;
    }

    public void putBoolean(String key, boolean value) {
        editor = getPrefs().edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        return getPrefs().getBoolean(key, defaultValue);
    }
}
