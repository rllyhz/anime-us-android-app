package id.rllyhz.animeus.api.response_type;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetMangaByIdResponseType {
    @SerializedName("request_hash")
    @Expose
    private String requestHash;

    @SerializedName("request_cached")
    @Expose
    private boolean requestCached;

    @SerializedName("request_cache_expiry")
    @Expose
    private int requestCacheExpiry;

    @SerializedName("mal_id")
    @Expose
    private int id;

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("title_english")
    @Expose
    private Object titleEnglish;

    @SerializedName("title_synonyms")
    @Expose
    private List<String> titleSynonyms;

    @SerializedName("title_japanese")
    @Expose
    private String titleJapanese;

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("image_url")
    @Expose
    private String imageUrl;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("volumes")
    @Expose
    private int volumes;

    @SerializedName("chapters")
    @Expose
    private int chapters;

    @SerializedName("publishing")
    @Expose
    private boolean publishing;

    @SerializedName("published")
    @Expose
    private PublishedTime published;

    @SerializedName("rank")
    @Expose
    private int rank;

    @SerializedName("score")
    @Expose
    private double score;

    @SerializedName("popularity")
    @Expose
    private int popularity;

    @SerializedName("members")
    @Expose
    private int members;

    @SerializedName("favorites")
    @Expose
    private int favorites;

    @SerializedName("synopsis")
    @Expose
    private String synopsis;

    @SerializedName("background")
    @Expose
    private Object background;

    @SerializedName("genres")
    @Expose
    private List<MangaDetail> genres;

    @SerializedName("authors")
    @Expose
    private List<MangaDetail> authors;

    @SerializedName("serializations")
    @Expose
    private List<MangaDetail> serializations;

    public GetMangaByIdResponseType(String requestHash, boolean requestCached, int requestCacheExpiry, int id, String url, String title, Object titleEnglish, List<String> titleSynonyms, String titleJapanese, String status, String imageUrl, String type, int volumes, int chapters, boolean publishing, PublishedTime published, int rank, double score, int popularity, int members, int favorites, String synopsis, Object background, List<MangaDetail> genres, List<MangaDetail> authors, List<MangaDetail> serializations) {
        this.requestHash = requestHash;
        this.requestCached = requestCached;
        this.requestCacheExpiry = requestCacheExpiry;
        this.id = id;
        this.url = url;
        this.title = title;
        this.titleEnglish = titleEnglish;
        this.titleSynonyms = titleSynonyms;
        this.titleJapanese = titleJapanese;
        this.status = status;
        this.imageUrl = imageUrl;
        this.type = type;
        this.volumes = volumes;
        this.chapters = chapters;
        this.publishing = publishing;
        this.published = published;
        this.rank = rank;
        this.score = score;
        this.popularity = popularity;
        this.members = members;
        this.favorites = favorites;
        this.synopsis = synopsis;
        this.background = background;
        this.genres = genres;
        this.authors = authors;
        this.serializations = serializations;
    }

    public String getRequestHash() {
        return requestHash;
    }

    public boolean isRequestCached() {
        return requestCached;
    }

    public int getRequestCacheExpiry() {
        return requestCacheExpiry;
    }

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public Object getTitleEnglish() {
        return titleEnglish;
    }

    public List<String> getTitleSynonyms() {
        return titleSynonyms;
    }

    public String getTitleJapanese() {
        return titleJapanese;
    }

    public String getStatus() {
        return status;
    }

    public String getImageUrl() {
        return imageUrl;
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
        return publishing;
    }

    public PublishedTime getPublished() {
        return published;
    }

    public int getRank() {
        return rank;
    }

    public double getScore() {
        return score;
    }

    public int getPopularity() {
        return popularity;
    }

    public int getMembers() {
        return members;
    }

    public int getFavorites() {
        return favorites;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public Object getBackground() {
        return background;
    }

    public List<MangaDetail> getGenres() {
        return genres;
    }

    public List<MangaDetail> getAuthors() {
        return authors;
    }

    public List<MangaDetail> getSerializations() {
        return serializations;
    }
}
