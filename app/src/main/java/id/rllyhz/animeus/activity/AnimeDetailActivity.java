package id.rllyhz.animeus.activity;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ProgressDialog;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import id.rllyhz.animeus.R;
import id.rllyhz.animeus.helper.CustomActionBar;

public class AnimeDetailActivity extends AppCompatActivity {
    public static final String EXTRA_ANIME_DETAIL_ID = "id.rllyhz.animeus.EXTRA_ANIME_DETAIL_ID";
    public static final String EXTRA_ANIME_DETAIL_TITLE = "id.rllyhz.animeus.EXTRA_ANIME_DETAIL_TITLE";
    public static final String EXTRA_ANIME_DETAIL_DESCRIPTION = "id.rllyhz.animeus.EXTRA_ANIME_DETAIL_DESCRIPTION";
    public static final String EXTRA_ANIME_DETAIL_IMAGE_URL = "id.rllyhz.animeus.EXTRA_ANIME_DETAIL_IMAGE_URL";
    public static final String EXTRA_ANIME_DETAIL_TOTAL_RANK = "id.rllyhz.animeus.EXTRA_ANIME_DETAIL_TOTAL_RANK";
    public static final String EXTRA_ANIME_DETAIL_TOTAL_EPISODES = "id.rllyhz.animeus.EXTRA_ANIME_DETAIL_TOTAL_EPISODES";

    private TextView animeDetailTitle, animeDetailDescription;
    private ImageView animeDetailImage;

    private ProgressDialog progressDialog;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime_detail);

        progressDialog = new ProgressDialog(this);
        showDialog("Loading....", false);

        Toolbar toolbar = findViewById(R.id.toolbar_layout);

        CustomActionBar.init(this, toolbar, R.drawable.ic_arrow_back,
                getColor(R.color.backgroundColor), CustomActionBar.STATUS_BAR_LIGHT_THEME);

        if (getIntent() != null || getIntent().getExtras() != null) {
            int id = getIntent().getIntExtra(EXTRA_ANIME_DETAIL_ID, -1);
            String title = getIntent().getStringExtra(EXTRA_ANIME_DETAIL_TITLE);
            String description = getIntent().getStringExtra(EXTRA_ANIME_DETAIL_DESCRIPTION);
            String imageUrl = getIntent().getStringExtra(EXTRA_ANIME_DETAIL_IMAGE_URL);
            int totalRank = getIntent().getIntExtra(EXTRA_ANIME_DETAIL_TOTAL_RANK, 0);
            int totalEpisodes = getIntent().getIntExtra(EXTRA_ANIME_DETAIL_TOTAL_EPISODES, 0);

            initAnimeDetailViews(title, description, imageUrl);
        }

        closeDialog();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                goBack();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void initAnimeDetailViews(String title, String description, String imageUrl) {
        animeDetailTitle = findViewById(R.id.anime_detail_title);
        animeDetailDescription = findViewById(R.id.anime_detail_description);
        animeDetailImage = findViewById(R.id.anime_detail_image);

        Picasso.get()
                .load(imageUrl)
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher_round)
                .into(animeDetailImage);

        animeDetailTitle.setText(title);
        animeDetailDescription.setText(description);
    }

    @Override
    public void onBackPressed() {
        goBack();
    }

    private void goBack() {
        setResult(RESULT_OK);

        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

        finish();
    }

    private void showDialog(String message, boolean isCancelable) {
        progressDialog.setMessage(message);
        progressDialog.setCancelable(isCancelable);

        if (!progressDialog.isShowing())
            progressDialog.show();
    }

    private void closeDialog() {
        if (progressDialog.isShowing())
            progressDialog.dismiss();
    }
}