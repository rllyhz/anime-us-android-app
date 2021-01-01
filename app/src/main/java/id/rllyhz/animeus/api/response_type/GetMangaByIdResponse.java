package id.rllyhz.animeus.api.response_type;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetMangaByIdResponse {
    @SerializedName("mal_id")
    private int id;

    @SerializedName("title")
    private String title;

    @SerializedName("title_english")
    private String titleEnglish;

    @SerializedName("title_japanese")
    private String titleJapanese;

    @SerializedName("title_synonyms")
    private List<String> titleSynonyms;

    @SerializedName("status")
    private String status;

    @SerializedName("type")
    private String type;

    @SerializedName("volumes")
    private int volumes;

    @SerializedName("chapters")
    private int chapters;

    @SerializedName("publishing")
    private boolean isPublishing;

    @SerializedName("published")
    private PublishedTime publishedTime;

    @SerializedName("rank")
    private int rank;

    @SerializedName("rank")
    private double rank;
}
