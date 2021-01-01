package id.rllyhz.animeus.api.data_service;

import id.rllyhz.animeus.api.response_type.GetAnimeByIdResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface AnimeAPIService {
    public static final String BASE_URL = "https://api.jikan.moe/v3/";

    @GET("/anime/354/")
    Call<GetAnimeByIdResponse> getAnimeById();
}
