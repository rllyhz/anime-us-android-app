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

    @SerializedName("score")
    private double score;

    @SerializedName("synopsis")
    private String synopsis;

    @SerializedName("genres")
    private MangaDetail genres;

    @SerializedName("genres")
    private MangaDetail authors;

    @SerializedName("genres")
    private MangaDetail serializations;

    public GetMangaByIdResponse(int id, String title, String titleEnglish, String titleJapanese, List<String> titleSynonyms, String status, String type, int volumes, int chapters, boolean isPublishing, PublishedTime publishedTime, int rank, double score, String synopsis, MangaDetail genres, MangaDetail authors, MangaDetail serializations) {
        this.id = id;
        this.title = title;
        this.titleEnglish = titleEnglish;
        this.titleJapanese = titleJapanese;
        this.titleSynonyms = titleSynonyms;
        this.status = status;
        this.type = type;
        this.volumes = volumes;
        this.chapters = chapters;
        this.isPublishing = isPublishing;
        this.publishedTime = publishedTime;
        this.rank = rank;
        this.score = score;
        this.synopsis = synopsis;
        this.genres = genres;
        this.authors = authors;
        this.serializations = serializations;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getTitleEnglish() {
        return titleEnglish;
    }

    public String getTitleJapanese() {
        return titleJapanese;
    }

    public List<String> getTitleSynonyms() {
        return titleSynonyms;
    }

    public String getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public int getVolumes() {
        return volumes;
    }

    public int getChapters() {
        return chapters;
    }

    public boolean isPublishing() {
        return isPublishing;
    }

    public PublishedTime getPublishedTime() {
        return publishedTime;
    }

    public int getRank() {
        return rank;
    }

    public double getScore() {
        return score;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public MangaDetail getGenres() {
        return genres;
    }

    public MangaDetail getAuthors() {
        return authors;
    }

    public MangaDetail getSerializations() {
        return serializations;
    }
}
