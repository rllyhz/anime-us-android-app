package id.rllyhz.animeus.activity;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.app.ProgressDialog;
import android.os.Build;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import id.rllyhz.animeus.R;
import id.rllyhz.animeus.api.ApiClient;
import id.rllyhz.animeus.api.data_service.AnimeAPIService;
import id.rllyhz.animeus.api.response_type.DetailAnime;
import id.rllyhz.animeus.api.response_type.GetAnimeByIdResponseType;
import id.rllyhz.animeus.helper.CustomActionBar;
import id.rllyhz.animeus.helper.CustomToast;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AnimeDetailActivity extends AppCompatActivity {
    public static final String EXTRA_ANIME_DETAIL_ID = "id.rllyhz.animeus.EXTRA_ANIME_DETAIL_ID";

    private GetAnimeByIdResponseType anime;

    private CardView animeDetailImageContainer, animeDetailTableContainer;
    private TextView animeDetailTitle, animeDetailDescription, animeDetailRank, animeDetailTotalEpisodes,
            animeDetailRating, animeDetailAiredTime, animeDetailDuration, animeDetailGenres, animeDetailType,
            animeDetailSysnopsisHeading, footerText;
    private ImageView animeDetailImage;

    private ProgressDialog progressDialog;
    private CustomToast toast;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime_detail);

        toast = new CustomToast(this, R.layout.custom_toast);
        progressDialog = new ProgressDialog(this);
        showDialog("Loading....", false);

        Toolbar toolbar = findViewById(R.id.toolbar_layout);
        CustomActionBar.init(this, toolbar, R.drawable.ic_arrow_back,
                getColor(R.color.backgroundColor), CustomActionBar.STATUS_BAR_LIGHT_THEME);

        initUI();

        // check data extra
        if (getIntent() != null || getIntent().getExtras() != null) {
            int id = getIntent().getIntExtra(EXTRA_ANIME_DETAIL_ID, -1);

            if (id != -1) {
                getAnimeById(id);
            } else {
                toast.show("Oppss... something went wrong!");
                finish();
            }
        }
    }

    private void initUI() {
        animeDetailImageContainer = findViewById(R.id.anime_detail_image_container);
        animeDetailTableContainer = findViewById(R.id.anime_detail_table_container);
        animeDetailTitle = findViewById(R.id.anime_detail_title);
        animeDetailDescription = findViewById(R.id.anime_detail_description);
        animeDetailImage = findViewById(R.id.anime_detail_image);
        animeDetailRank = findViewById(R.id.anime_detail_rank);
        animeDetailTotalEpisodes = findViewById(R.id.anime_detail_total_episodes);
        animeDetailDuration = findViewById(R.id.anime_detail_duration);
        animeDetailRating = findViewById(R.id.anime_detail_rating);
        animeDetailGenres = findViewById(R.id.anime_detail_genres);
        animeDetailAiredTime = findViewById(R.id.anime_detail_aired_time);
        animeDetailType = findViewById(R.id.anime_detail_type);
        animeDetailSysnopsisHeading = findViewById(R.id.anime_detail_sysnopsis_heading);
        footerText = findViewById(R.id.footer_text);

        animeDetailGenres.setMovementMethod(new ScrollingMovementMethod());

        setUIVisibility(false);
    }

    private void getAnimeById(int id) {
        AnimeAPIService animeAPIService = ApiClient.getAnimeApiServiceInstance().create(AnimeAPIService.class);
        Call<GetAnimeByIdResponseType> call = animeAPIService.getAnimeById(id);

        call.enqueue(new Callback<GetAnimeByIdResponseType>() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onResponse(Call<GetAnimeByIdResponseType> call, Response<GetAnimeByIdResponseType> response) {
                if (response.isSuccessful() && response.code() == 200 && response.body() != null) {
                    anime = response.body();
                    setUI();
                    closeDialog();
                }
            }

            @Override
            public void onFailure(Call<GetAnimeByIdResponseType> call, Throwable t) {
                closeDialog();
                showToast("Failed to load data!");
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void setUI() {
        if (anime == null)
            return;

        Picasso.get()
                .load(anime.getImageUrl())
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher_round)
                .into(animeDetailImage);

        animeDetailTitle.setText(anime.getTitle());
        animeDetailDescription.setText(anime.getSynopsis());

        animeDetailRank.setText("#" + anime.getRank());
        if (anime.getRank() < 4) {
            animeDetailRank.setTextColor(getColor(R.color.primaryColor));
        }

        animeDetailTotalEpisodes.setText(String.valueOf(anime.getEpisodes()));
        animeDetailDuration.setText(anime.getDuration());
        animeDetailRating.setText(anime.getRating());
        animeDetailGenres.setText(getFormattedGenres(anime.getGenres()));
        animeDetailAiredTime.setText(anime.getAiredTime().getStringFormat());
        animeDetailType.setText("Type: " + anime.getType());

        setUIVisibility(true);
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    private String getFormattedGenres(List<DetailAnime> genres) {
        StringBuilder formattedGenres = new StringBuilder();

        for (int index = 0; index < genres.size(); index++) {
            if (index == genres.size() - 1) {
                formattedGenres.append(genres.get(index).getName() + " ");
            } else {
                formattedGenres.append(genres.get(index).getName() + ", ");
            }
        }

        return formattedGenres
                .toString()
                .trim();
    }

    private void setUIVisibility(boolean visible) {
        int visibility = View.GONE;

        if (visible) {
            visibility = View.VISIBLE;
        }

        animeDetailImageContainer.setVisibility(visibility);
        animeDetailTableContainer.setVisibility(visibility);
        animeDetailTitle.setVisibility(visibility);
        animeDetailDescription.setVisibility(visibility);
        animeDetailRank.setVisibility(visibility);
        animeDetailTotalEpisodes.setVisibility(visibility);
        animeDetailDuration.setVisibility(visibility);
        animeDetailRating.setVisibility(visibility);
        animeDetailGenres.setVisibility(visibility);
        animeDetailAiredTime.setVisibility(visibility);
        animeDetailType.setVisibility(visibility);
        animeDetailSysnopsisHeading.setVisibility(visibility);
        footerText.setVisibility(visibility);
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

    @Override
    public void onBackPressed() {
        goBack();
    }

    private void goBack() {
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

        setResult(RESULT_OK);
        finish();
    }

    private void showToast(String message) {
        toast.show(null, message);
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