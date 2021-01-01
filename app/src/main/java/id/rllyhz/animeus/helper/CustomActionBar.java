package id.rllyhz.animeus.helper;

import androidx.appcompat.app.AppCompatActivity;

public class CustomActionBar {

    public static void hide(AppCompatActivity activity) {
        activity.getSupportActionBar().hide();
    }

    public static void setTitle(AppCompatActivity activity, CharSequence title) {
        activity.getSupportActionBar().setTitle(title);
    }
}
