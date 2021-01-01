package id.rllyhz.animeus.api;

import id.rllyhz.animeus.api.data_service.AnimeAPIService;
import id.rllyhz.animeus.api.data_service.PhotoAPIService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static Retrofit animeApiServiceInstance;
    private static Retrofit photoApiServiceInstance;

    public static Retrofit getAnimeApiServiceInstance()
    {
        if (animeApiServiceInstance == null) {
            animeApiServiceInstance = new Retrofit.Builder()
                    .baseUrl(AnimeAPIService.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return animeApiServiceInstance;
    }

    public static Retrofit getPhotoApiServiceInstance()
    {
        if (photoApiServiceInstance == null) {
            photoApiServiceInstance = new Retrofit.Builder()
                    .baseUrl(PhotoAPIService.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return photoApiServiceInstance;
    }
}
