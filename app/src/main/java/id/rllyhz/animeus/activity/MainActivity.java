package id.rllyhz.animeus.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import id.rllyhz.animeus.R;
import id.rllyhz.animeus.helper.CustomActionBar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomActionBar.setTitle(this, "Rully");
    }
}
