package id.rllyhz.animeus.helper;

import android.content.Context;
import android.widget.Toast;

public class CustomToast {
    private Context context;

    public CustomToast(Context context) {
        this.context = context;
    }

    public void show(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void longToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public static void shortToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
