package id.rllyhz.animeus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import id.rllyhz.animeus.api.ApiClient;
import id.rllyhz.animeus.api.data_service.AnimeAPIService;
import id.rllyhz.animeus.api.data_service.PhotoAPIService;
import id.rllyhz.animeus.api.response_type.GetAnimeByIdResponse;
import id.rllyhz.animeus.api.response_type.RetroPhoto;
import id.rllyhz.animeus.api.response_type.Test;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnimeAPIService animeAPIService = ApiClient.getAnimeApiServiceInstance().create(AnimeAPIService.class);
        Call<Test> animeCall = animeAPIService.getAnimeById();
        animeCall.enqueue(new Callback<Test>() {
            @Override
            public void onResponse(Call<Test> call, Response<Test> response) {
                if (response.isSuccessful()) {
                    getData(response.body());
                } else {
                    Log.d("TEST", "ERROR : " + response.message());
                }
            }

            @Override
            public void onFailure(Call<Test> call, Throwable t) {

            }
        });
    }

    private void getData(Test test) {
        if (test != null) {
            Log.d("TEST", test.getTitle());
        } else {
            Log.d("TEST", "Null");
        }
    }
}