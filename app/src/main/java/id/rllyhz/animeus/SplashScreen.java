package id.rllyhz.animeus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import id.rllyhz.animeus.activity.MainActivity;
import id.rllyhz.animeus.helper.CustomActionBar;
import id.rllyhz.animeus.helper.SharedPrefferencesHelper;

public class SplashScreen extends AppCompatActivity {
    private SharedPrefferencesHelper prefsHelper;
    private static final String IS_THE_FIRST_TIME = "IS_THE_FIRST_TIME";

    private Handler handler;
    private Runnable runnable;
    private static final long DELAY_IN_MILLIS = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        prefsHelper = new SharedPrefferencesHelper(this);
        CustomActionBar.hide(SplashScreen.this);

        if (prefsHelper.getBoolean(IS_THE_FIRST_TIME, true)) {

            setContentView(R.layout.splashscreen);

            runnable = () -> {
                SplashScreen.this.startActivity(new Intent(SplashScreen.this, MainActivity.class));
                SplashScreen.this.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                SplashScreen.this.finish();
            };

            handler = new Handler();
            handler.postDelayed(runnable, DELAY_IN_MILLIS);
            prefsHelper.putBoolean(IS_THE_FIRST_TIME, false);

        } else {
            startActivity(new Intent(SplashScreen.this, MainActivity.class));
            finish();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (handler != null)
            handler.removeCallbacks(runnable);
    }
}