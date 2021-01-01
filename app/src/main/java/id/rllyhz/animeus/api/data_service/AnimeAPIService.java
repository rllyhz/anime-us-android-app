package id.rllyhz.animeus.api.data_service;

import id.rllyhz.animeus.api.response_type.GetAnimeByIdResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface AnimeAPIService {

    @GET("/anime/343")
    Call<GetAnimeByIdResponse> getAnimeById();
}
