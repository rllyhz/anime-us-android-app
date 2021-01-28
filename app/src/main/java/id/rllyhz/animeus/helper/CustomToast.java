package id.rllyhz.animeus.helper;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.IdRes;
import androidx.core.app.ActivityCompat;

import id.rllyhz.animeus.R;

public class CustomToast {
    private Context context;
    private Activity activity;
    private LayoutInflater inflater;
    private int customLayout = -2;

    private View layout;
    private TextView messageView;
    private ImageView iconView;

    public CustomToast(Context context) {
        this.context = context;
    }

    public CustomToast(Activity activity, int customLayout) {
        this.activity = activity;
        this.customLayout = customLayout;
        this.inflater = activity.getLayoutInflater();

        ViewGroup viewGroup = activity.findViewById(R.id.custom_toast_container);
        layout = inflater.inflate(R.layout.custom_toast, viewGroup);

        messageView = layout.findViewById(R.id.custom_toast_message);
        iconView = layout.findViewById(R.id.custom_toast_icon);
    }

    public void show(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public void show(Drawable icon, String message) {
        if (icon != null) {
            iconView.setBackground(icon);
        } else {
            iconView.setVisibility(View.INVISIBLE);
        }

        messageView.setText(message);

        Toast toast = new Toast(activity.getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.BOTTOM, 0, 60);
        toast.setView(layout);
        toast.show();
    }

    public static void longToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public static void shortToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
