package id.rllyhz.animeus.api.data_service;

import id.rllyhz.animeus.api.response_type.GetAnimeByIdResponseType;
import id.rllyhz.animeus.api.response_type.GetCharacterByIdResponseType;
import id.rllyhz.animeus.api.response_type.GetMangaByIdResponseType;
import id.rllyhz.animeus.api.response_type.GetPersonByIdResponseType;
import id.rllyhz.animeus.api.response_type.GetTopAnimeResponseType;
import id.rllyhz.animeus.api.response_type.GetTopMangaResponseType;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AnimeAPIService {
    public static final String BASE_URL = "https://api.jikan.moe/";
    public static final String VERSION_API = "v3";

    @GET(VERSION_API + "/anime/{id}/")
    Call<GetAnimeByIdResponseType> getAnimeById(@Path("id") int animeId);

    @GET(VERSION_API + "/manga/{id}/")
    Call<GetMangaByIdResponseType> getMangaById(@Path("id") int mangaId);

    @GET(VERSION_API + "/character/{id}/")
    Call<GetCharacterByIdResponseType> getCharacterById(@Path("id") int characterId);

    @GET(VERSION_API + "/person/{id}/")
    Call<GetPersonByIdResponseType> getPersonById(@Path("id") int personId);

    @GET(VERSION_API + "/top/anime/1/")
    Call<GetTopAnimeResponseType> getTopAnime();

    @GET(VERSION_API + "/top/manga/1/")
    Call<GetTopMangaResponseType> getTopManga();
}
