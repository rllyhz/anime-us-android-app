package id.rllyhz.animeus.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import id.rllyhz.animeus.R;

public class AnimeDetailActivity extends AppCompatActivity {
    public static final String EXTRA_ANIME_DETAIL_TITLE = "id.rllyhz.animeus.EXTRA_ANIME_DETAIL_TITLE";
    public static final String EXTRA_ANIME_DETAIL_DESCRIPTION = "id.rllyhz.animeus.EXTRA_ANIME_DETAIL_DESCRIPTION";

    private TextView animeDetailTitle, animeDetailDescription;
    private ImageView animeDetailImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime_detail);

        Toolbar toolbar = findViewById(R.id.toolbar_layout);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back);

        getWindow().setStatusBarColor(Color.parseColor("#000000"));

        if (getIntent() != null || getIntent().getExtras() != null) {
            String title = getIntent().getStringExtra(EXTRA_ANIME_DETAIL_TITLE);
            String description = getIntent().getStringExtra(EXTRA_ANIME_DETAIL_DESCRIPTION);

            initAnimeDetailViews(title, description);
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                setResult(RESULT_OK);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void initAnimeDetailViews(String title, String description) {
        animeDetailTitle = findViewById(R.id.anime_detail_title);
        animeDetailDescription = findViewById(R.id.anime_detail_description);
        animeDetailImage = findViewById(R.id.anime_detail_image);

        animeDetailImage.setBackground(getDrawable(R.mipmap.ic_launcher_round));
        animeDetailTitle.setText(title);
        animeDetailDescription.setText(description);
    }

    @Override
    public void onBackPressed() {
        setResult(RESULT_OK);
        finish();
    }
}