package id.rllyhz.animeus.helper;

import android.view.View;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class CustomActionBar {
    public static final int DEFAULT_HOME_AS_UP = -10101;
    public static final int DEFAULT_STATUS_BAR_COLOR = -10102;
    public static final int STATUS_BAR_LIGHT_THEME = -10103;
    public static final int STATUS_BAR_DARK_THEME = -10104;

    public static void init(AppCompatActivity compatActivity,Toolbar toolbar,@DrawableRes int homeAsUp, @ColorInt int statusBarColor, int statusBarTheme) {
         if (compatActivity == null)
             return;

         compatActivity.setSupportActionBar(toolbar);
         compatActivity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

         if (homeAsUp != DEFAULT_HOME_AS_UP) {
             compatActivity.getSupportActionBar().setHomeAsUpIndicator(homeAsUp);
         }

         if (statusBarTheme == STATUS_BAR_LIGHT_THEME) {
             compatActivity.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
         }

         if (statusBarColor != DEFAULT_STATUS_BAR_COLOR) {
             compatActivity.getWindow().setStatusBarColor(statusBarColor);
         }
    }

    public static void hide(AppCompatActivity compatActivity) {
        if (compatActivity != null)
            compatActivity.getSupportActionBar().hide();
    }

    public static void setTitle(AppCompatActivity compatActivity, CharSequence title) {
        if (compatActivity != null)
            compatActivity.getSupportActionBar().setTitle(title);
    }
}
