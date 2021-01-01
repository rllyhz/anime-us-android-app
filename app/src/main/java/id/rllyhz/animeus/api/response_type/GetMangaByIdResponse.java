package id.rllyhz.animeus.api.response_type;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetMangaByIdResponse {
    @SerializedName("request_hash")
    @Expose
    public String requestHash;

    @SerializedName("request_cached")
    @Expose
    public boolean requestCached;

    @SerializedName("request_cache_expiry")
    @Expose
    public int requestCacheExpiry;

    @SerializedName("mal_id")
    @Expose
    public int id;

    @SerializedName("url")
    @Expose
    public String url;

    @SerializedName("title")
    @Expose
    public String title;

    @SerializedName("title_english")
    @Expose
    public Object titleEnglish;

    @SerializedName("title_synonyms")
    @Expose
    public List<String> titleSynonyms;

    @SerializedName("title_japanese")
    @Expose
    public String titleJapanese;

    @SerializedName("status")
    @Expose
    public String status;

    @SerializedName("image_url")
    @Expose
    public String imageUrl;

    @SerializedName("type")
    @Expose
    public String type;

    @SerializedName("volumes")
    @Expose
    public int volumes;

    @SerializedName("chapters")
    @Expose
    public int chapters;

    @SerializedName("publishing")
    @Expose
    public boolean publishing;

    @SerializedName("published")
    @Expose
    public PublishedTime published;

    @SerializedName("rank")
    @Expose
    public int rank;

    @SerializedName("score")
    @Expose
    public Object score;

    @SerializedName("scored_by")
    @Expose
    public Object scoredBy;

    @SerializedName("popularity")
    @Expose
    public int popularity;

    @SerializedName("members")
    @Expose
    public int members;

    @SerializedName("favorites")
    @Expose
    public int favorites;

    @SerializedName("synopsis")
    @Expose
    public String synopsis;

    @SerializedName("background")
    @Expose
    public Object background;

    @SerializedName("genres")
    @Expose
    public List<MangaDetail> genres;

    @SerializedName("authors")
    @Expose
    public List<MangaDetail> authors;

    @SerializedName("serializations")
    @Expose
    public List<MangaDetail> serializations;

    public GetMangaByIdResponse(String requestHash, boolean requestCached, int requestCacheExpiry, int id, String url, String title, Object titleEnglish, List<String> titleSynonyms, String titleJapanese, String status, String imageUrl, String type, int volumes, int chapters, boolean publishing, PublishedTime published, int rank, Object score, Object scoredBy, int popularity, int members, int favorites, String synopsis, Object background, List<MangaDetail> genres, List<MangaDetail> authors, List<MangaDetail> serializations) {
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
        this.scoredBy = scoredBy;
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

    public Object getScore() {
        return score;
    }

    public Object getScoredBy() {
        return scoredBy;
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
