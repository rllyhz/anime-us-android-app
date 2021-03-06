package id.rllyhz.animeus.api;

import id.rllyhz.animeus.api.data_service.AnimeAPIService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static Retrofit animeApiServiceInstance;

    public static Retrofit getAnimeApiServiceInstance() {
        if (animeApiServiceInstance == null) {
            animeApiServiceInstance = new Retrofit.Builder()
                    .baseUrl(AnimeAPIService.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return animeApiServiceInstance;
    }
}
