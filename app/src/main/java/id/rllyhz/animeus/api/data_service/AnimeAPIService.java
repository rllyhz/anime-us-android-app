package id.rllyhz.animeus.api.data_service;

import id.rllyhz.animeus.api.response_type.GetAnimeByIdResponse;
import id.rllyhz.animeus.api.response_type.Test;
import retrofit2.Call;
import retrofit2.http.GET;

public interface AnimeAPIService {
    public static final String BASE_URL = "https://api.jikan.moe/";
    String VERSION_API = "v3";

    @GET(VERSION_API + "/anime/354/")
    Call<Test> getAnimeById();
}
