package id.rllyhz.animeus.api.data_service;

import id.rllyhz.animeus.api.response_type.GetAnimeByIdResponse;
import id.rllyhz.animeus.api.response_type.GetCharacterByIdResponse;
import id.rllyhz.animeus.api.response_type.GetMangaByIdResponse;
import id.rllyhz.animeus.api.response_type.GetPersonByIdResponse;
import id.rllyhz.animeus.api.response_type.GetTopAnimeResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AnimeAPIService {
    public static final String BASE_URL = "https://api.jikan.moe/";
    public static final String VERSION_API = "v3";

    @GET(VERSION_API + "/anime/{id}/")
    Call<GetAnimeByIdResponse> getAnimeById(@Path("id") int animeId);

    @GET(VERSION_API + "/manga/{id}/")
    Call<GetMangaByIdResponse> getMangaById(@Path("id") int mangaId);

    @GET(VERSION_API + "/character/{id}/")
    Call<GetCharacterByIdResponse> getCharacterById(@Path("id") int characterId);

    @GET(VERSION_API + "/person/{id}/")
    Call<GetPersonByIdResponse> getPersonById(@Path("id") int personId);

    @GET(VERSION_API + "/top/anime/1/")
    Call<GetTopAnimeResponse> getTopAnime();
}
