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
import id.rllyhz.animeus.api.response_type.GetTopCharactersResponseType;
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
        Call<GetTopCharactersResponseType> call = animeAPIService.getTopCharacters();

        call.enqueue(new Callback<GetTopCharactersResponseType>() {
            @Override
            public void onResponse(Call<GetTopCharactersResponseType> call, Response<GetTopCharactersResponseType> response) {
                if (response.isSuccessful()) {
                    processData(response.body());
                } else {
                    CustomToast.shortToast(SplashScreen.this, response.message());
                }
            }

            @Override
            public void onFailure(Call<GetTopCharactersResponseType> call, Throwable t) {
                CustomToast.shortToast(SplashScreen.this, t.getMessage());
            }
        });
    }

    private void processData(GetTopCharactersResponseType topCharacters) {
        String topFirstCharacterTitle = topCharacters.getCharacterList().get(0).getTitle();
        CustomToast.longToast(getApplicationContext(), topFirstCharacterTitle);
    }
}