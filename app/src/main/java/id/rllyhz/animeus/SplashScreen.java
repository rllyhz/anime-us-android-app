package id.rllyhz.animeus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import id.rllyhz.animeus.api.ApiClient;
import id.rllyhz.animeus.api.data_service.AnimeAPIService;
import id.rllyhz.animeus.api.response_type.GetAnimeByIdResponse;
import id.rllyhz.animeus.api.response_type.GetMangaByIdResponse;
import id.rllyhz.animeus.helper.CustomToast;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnimeAPIService animeAPIService = ApiClient.getAnimeApiServiceInstance().create(AnimeAPIService.class);

        Call<GetAnimeByIdResponse> animeCall = animeAPIService.getAnimeById(324);
        animeCall.enqueue(new Callback<GetAnimeByIdResponse>() {
            @Override
            public void onResponse(Call<GetAnimeByIdResponse> call, Response<GetAnimeByIdResponse> response) {
                if (response.isSuccessful()) {
                    getAnime(response.body());
                } else {
                    Log.d("TEST", "ERROR : " + response.message());
                }
            }

            @Override
            public void onFailure(Call<GetAnimeByIdResponse> call, Throwable t) {
                CustomToast.shortToast(SplashScreen.this, "Sorry... something went wrong. Please try again later!");
            }
        });

        AnimeAPIService service = ApiClient.getAnimeApiServiceInstance().create(AnimeAPIService.class);
        Call<GetMangaByIdResponse> mangaCall = service.getMangaById(454);
        mangaCall.enqueue(new Callback<GetMangaByIdResponse>() {
            @Override
            public void onResponse(Call<GetMangaByIdResponse> call, Response<GetMangaByIdResponse> response) {
                if (response.isSuccessful()) {
                    getManga(response.body());
                }
            }

            @Override
            public void onFailure(Call<GetMangaByIdResponse> call, Throwable t) {

            }
        });
    }

    private void getAnime(GetAnimeByIdResponse animeResult) {
        if (animeResult != null) {
            Log.d("TEST", "Anime: " + animeResult.getTitleJapanese());
        } else {
            Log.d("TEST", "Null");
        }
    }

    private void getManga(GetMangaByIdResponse mangaResult) {
        if (mangaResult != null) {
            Log.d("TEST", "Manga: " + mangaResult.getTitleJapanese());
        }
    }
}