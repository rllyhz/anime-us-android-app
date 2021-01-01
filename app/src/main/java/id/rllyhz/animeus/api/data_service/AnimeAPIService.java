package id.rllyhz.animeus.api.data_service;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AnimeAPIService {

    @GET("/anime/{id}/")
    Call
}
