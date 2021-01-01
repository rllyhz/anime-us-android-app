package id.rllyhz.animeus.api.response_type;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import okhttp3.Response;

public class GetAnimeByIdResponse {

    @SerializedName("mal_id")
    private int id;

    @SerializedName("image_url")
    private String imageUrl;

    @SerializedName("trailer_url")
    private String trailerUrl;

    @SerializedName("title")
    private String title;

    @SerializedName("title_english")
    private String titleEnglish;


    @SerializedName("title_japanese")
    private String titleJapanese;

    @SerializedName("type")
    private String type;

    @SerializedName("source")
    private String source;

    @SerializedName("episodes")
    private int episodes;

    @SerializedName("status")
    private String status;

    @SerializedName("airing")
    private boolean isAiring;

    @SerializedName("aired")
    private Response airedOn;

    @SerializedName("duration")
    private String duration;

    @SerializedName("rating")
    private String rating;

    @SerializedName("score")
    private double score;

    @SerializedName("rank")
    private int rank;

    @SerializedName("synopsis")
    private double synopsis;

    @SerializedName("premired")
    private String premiredIn;

    @SerializedName("producers")
    private Response producers;

    @SerializedName("licensors")
    private Response licensors;

    @SerializedName("studios")
    private Response studios;

    @SerializedName("genres")
    private Response genres;

    @SerializedName("opening_themes")
    private ArrayList<String> openingThemes;

    @SerializedName("ending_themes")
    private ArrayList<String> endingThemes;
}
