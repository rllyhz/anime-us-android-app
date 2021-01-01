package id.rllyhz.animeus.api.data_service;

import id.rllyhz.animeus.api.response_type.GetAnimeByIdResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AnimeAPIService {
    public static final String BASE_URL = "https://api.jikan.moe/";
    String VERSION_API = "v3";

    @GET(VERSION_API + "/anime/{id}/")
    Call<GetAnimeByIdResponse> getAnimeById(@Path("id") int id);
}
