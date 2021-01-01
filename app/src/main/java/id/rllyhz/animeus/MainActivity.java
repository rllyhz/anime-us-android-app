package id.rllyhz.animeus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import id.rllyhz.animeus.api.ApiClient;
import id.rllyhz.animeus.api.data_service.AnimeAPIService;
import id.rllyhz.animeus.api.data_service.PhotoAPIService;
import id.rllyhz.animeus.api.response_type.RetroPhoto;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PhotoAPIService service = ApiClient.getPhotoApiServiceInstance().create(PhotoAPIService.class);
        Call<List<RetroPhoto>> call = service.getAllPhotos();
        call.enqueue(new Callback<List<RetroPhoto>>() {
            @Override
            public void onResponse(Call<List<RetroPhoto>> call, Response<List<RetroPhoto>> response) {
                getData(response.body());
            }

            @Override
            public void onFailure(Call<List<RetroPhoto>> call, Throwable t) {

            }
        });

        AnimeAPIService animeAPIService = ApiClient.getAnimeApiServiceInstance().create(AnimeAPIService.class);
        Call<>
    }

    private void getData(List<RetroPhoto> body) {
        if (body != null) {
            Log.d("TEST", body.get(0).getUrl());
        } else {
            Log.d("TEST", "Null");
        }
    }
}