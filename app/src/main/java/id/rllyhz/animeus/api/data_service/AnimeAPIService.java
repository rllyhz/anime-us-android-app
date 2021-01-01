package id.rllyhz.animeus.api.data_service;

import id.rllyhz.animeus.api.response_type.GetAnimeByIdResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AnimeAPIService {

    @GET("/anime/{id}/")
    Call<GetAnimeByIdResponse> getAnimeById(@Query("id") int id);
}
