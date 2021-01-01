package id.rllyhz.animeus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import id.rllyhz.animeus.api.ApiClient;
import id.rllyhz.animeus.api.data_service.AnimeAPIService;
import id.rllyhz.animeus.api.response_type.GetAnimeByIdResponse;
import id.rllyhz.animeus.api.response_type.GetCharacterByIdResponse;
import id.rllyhz.animeus.api.response_type.GetMangaByIdResponse;
import id.rllyhz.animeus.api.response_type.GetPersonByIdResponse;
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

        Call<GetMangaByIdResponse> mangaCall = animeAPIService.getMangaById(454);
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

        Call<GetCharacterByIdResponse> characterCall = animeAPIService.getCharacterById(233);
        characterCall.enqueue(new Callback<GetCharacterByIdResponse>() {
            @Override
            public void onResponse(Call<GetCharacterByIdResponse> call, Response<GetCharacterByIdResponse> response) {
                if (response.isSuccessful()) {
                    getCharacter(response.body());
                }
            }

            @Override
            public void onFailure(Call<GetCharacterByIdResponse> call, Throwable t) {

            }
        });

        Call<GetPersonByIdResponse> personCall = animeAPIService.getPersonById(343);
        personCall.enqueue(new Callback<GetPersonByIdResponse>() {
            @Override
            public void onResponse(Call<GetPersonByIdResponse> call, Response<GetPersonByIdResponse> response) {
                if (response.isSuccessful()) {
                    getPerson(response.body());
                }
            }

            @Override
            public void onFailure(Call<GetPersonByIdResponse> call, Throwable t) {

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

    private void getCharacter(GetCharacterByIdResponse characterResult) {
        if (characterResult != null) {
            Log.d("TEST", "Character: " + characterResult.getName());
        }
    }

    private void getPerson(GetPersonByIdResponse personResult) {
        if (personResult != null) {
            Log.d("TEST", "Person: " + personResult.getName());
        }
    }
}