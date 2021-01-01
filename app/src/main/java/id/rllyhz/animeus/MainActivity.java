package id.rllyhz.animeus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import id.rllyhz.animeus.api.ApiClient;
import id.rllyhz.animeus.api.data_service.AnimeAPIService;
import id.rllyhz.animeus.api.response_type.GetAnimeByIdResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnimeAPIService service = ApiClient.getApiClientInstance().create(AnimeAPIService.class);
        Call<GetAnimeByIdResponse> call = service.getAnimeById();
        call.enqueue(new Callback<GetAnimeByIdResponse>() {
            @Override
            public void onResponse(Call<GetAnimeByIdResponse> call, Response<GetAnimeByIdResponse> response) {
                getData(response.body());
            }

            @Override
            public void onFailure(Call<GetAnimeByIdResponse> call, Throwable t) {

            }
        });
    }

    private void getData(GetAnimeByIdResponse body) {
        if (body != null) {
//            Log.d("TEST", body.)
        }
    }
}