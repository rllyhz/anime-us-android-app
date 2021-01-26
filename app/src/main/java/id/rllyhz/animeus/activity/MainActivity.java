package id.rllyhz.animeus.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import id.rllyhz.animeus.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // SEARCH endpoint hasn't been implemented yet!

        // type: (anime, manga, character, person)
        // https://api.jikan.moe/v3/search/type?q=Fate/Zero&page=1
    }
}
