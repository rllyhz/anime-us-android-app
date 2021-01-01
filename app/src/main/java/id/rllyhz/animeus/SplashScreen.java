package id.rllyhz.animeus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import id.rllyhz.animeus.api.ApiClient;
import id.rllyhz.animeus.api.data_service.AnimeAPIService;
import id.rllyhz.animeus.api.response_type.GetAnimeByIdResponseType;
import id.rllyhz.animeus.api.response_type.GetCharacterByIdResponseType;
import id.rllyhz.animeus.api.response_type.GetMangaByIdResponseType;
import id.rllyhz.animeus.api.response_type.GetPersonByIdResponseType;
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

        Call<GetAnimeByIdResponseType> animeCall = animeAPIService.getAnimeById(324);
        animeCall.enqueue(new Callback<GetAnimeByIdResponseType>() {
            @Override
            public void onResponse(Call<GetAnimeByIdResponseType> call, Response<GetAnimeByIdResponseType> response) {
                if (response.isSuccessful()) {
                    getAnime(response.body());
                } else {
                    Log.d("TEST", "ERROR : " + response.message());
                }
            }

            @Override
            public void onFailure(Call<GetAnimeByIdResponseType> call, Throwable t) {
                CustomToast.shortToast(SplashScreen.this, "Sorry... something went wrong. Please try again later!");
            }
        });

        Call<GetMangaByIdResponseType> mangaCall = animeAPIService.getMangaById(454);
        mangaCall.enqueue(new Callback<GetMangaByIdResponseType>() {
            @Override
            public void onResponse(Call<GetMangaByIdResponseType> call, Response<GetMangaByIdResponseType> response) {
                if (response.isSuccessful()) {
                    getManga(response.body());
                }
            }

            @Override
            public void onFailure(Call<GetMangaByIdResponseType> call, Throwable t) {

            }
        });

        Call<GetCharacterByIdResponseType> characterCall = animeAPIService.getCharacterById(233);
        characterCall.enqueue(new Callback<GetCharacterByIdResponseType>() {
            @Override
            public void onResponse(Call<GetCharacterByIdResponseType> call, Response<GetCharacterByIdResponseType> response) {
                if (response.isSuccessful()) {
                    getCharacter(response.body());
                }
            }

            @Override
            public void onFailure(Call<GetCharacterByIdResponseType> call, Throwable t) {

            }
        });

        Call<GetPersonByIdResponseType> personCall = animeAPIService.getPersonById(343);
        personCall.enqueue(new Callback<GetPersonByIdResponseType>() {
            @Override
            public void onResponse(Call<GetPersonByIdResponseType> call, Response<GetPersonByIdResponseType> response) {
                if (response.isSuccessful()) {
                    getPerson(response.body());
                }
            }

            @Override
            public void onFailure(Call<GetPersonByIdResponseType> call, Throwable t) {

            }
        });
    }

    private void getAnime(GetAnimeByIdResponseType animeResult) {
        if (animeResult != null) {
            Log.d("TEST", "Anime: " + animeResult.getTitleJapanese());
        } else {
            Log.d("TEST", "Null");
        }
    }

    private void getManga(GetMangaByIdResponseType mangaResult) {
        if (mangaResult != null) {
            Log.d("TEST", "Manga: " + mangaResult.getTitleJapanese());
        }
    }

    private void getCharacter(GetCharacterByIdResponseType characterResult) {
        if (characterResult != null) {
            Log.d("TEST", "Character: " + characterResult.getName());
        }
    }

    private void getPerson(GetPersonByIdResponseType personResult) {
        if (personResult != null) {
            Log.d("TEST", "Person: " + personResult.getName());
        }
    }
}