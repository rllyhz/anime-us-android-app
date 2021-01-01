package id.rllyhz.animeus.api.response_type;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetAnimeByIdResponse {

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

    @SerializedName("image_url")
    @Expose
    private String imageUrl;

    @SerializedName("trailer_url")
    @Expose
    private Object trailerUrl;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("title_english")
    @Expose
    private String titleEnglish;

    @SerializedName("title_japanese")
    @Expose
    private String titleJapanese;

    @SerializedName("title_synonyms")
    @Expose
    private List<String> titleSynonyms;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("source")
    @Expose
    private String source;

    @SerializedName("episodes")
    @Expose
    private int episodes;

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("airing")
    @Expose
    private boolean isAiring;

    @SerializedName("aired")
    @Expose
    private AiredTime airedTime;

    @SerializedName("duration")
    @Expose
    private String duration;

    @SerializedName("rating")
    @Expose
    private String rating;

    @SerializedName("score")
    @Expose
    private double score;

    @SerializedName("scored_by")
    @Expose
    private int scoredBy;

    @SerializedName("rank")
    @Expose
    private int rank;

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

    @SerializedName("premiered")
    @Expose
    private String premiered;

    @SerializedName("broadcast")
    @Expose
    private String broadcast;

    @SerializedName("producers")
    @Expose
    private List<DetailAnime> producers;

    @SerializedName("licensors")
    @Expose
    private List<DetailAnime> licensors;

    @SerializedName("studios")
    @Expose
    private List<DetailAnime> studios;

    @SerializedName("genres")
    @Expose
    private List<DetailAnime> genres;

    @SerializedName("opening_themes")
    @Expose
    private List<String> openingThemes;

    @SerializedName("ending_themes")
    @Expose
    private List<String> endingThemes;

    public GetAnimeByIdResponse(String requestHash, boolean requestCached, int requestCacheExpiry, int id, String url, String imageUrl, Object trailerUrl, String title, String titleEnglish, String titleJapanese, List<String> titleSynonyms, String type, String source, int episodes, String status, boolean isAiring, AiredTime airedTime, String duration, String rating, double score, int scoredBy, int rank, int popularity, int members, int favorites, String synopsis, String premiered, String broadcast, List<DetailAnime> producers, List<DetailAnime> licensors, List<DetailAnime> studios, List<DetailAnime> genres, List<String> openingThemes, List<String> endingThemes) {
        this.requestHash = requestHash;
        this.requestCached = requestCached;
        this.requestCacheExpiry = requestCacheExpiry;
        this.id = id;
        this.url = url;
        this.imageUrl = imageUrl;
        this.trailerUrl = trailerUrl;
        this.title = title;
        this.titleEnglish = titleEnglish;
        this.titleJapanese = titleJapanese;
        this.titleSynonyms = titleSynonyms;
        this.type = type;
        this.source = source;
        this.episodes = episodes;
        this.status = status;
        this.isAiring = isAiring;
        this.airedTime = airedTime;
        this.duration = duration;
        this.rating = rating;
        this.score = score;
        this.scoredBy = scoredBy;
        this.rank = rank;
        this.popularity = popularity;
        this.members = members;
        this.favorites = favorites;
        this.synopsis = synopsis;
        this.premiered = premiered;
        this.broadcast = broadcast;
        this.producers = producers;
        this.licensors = licensors;
        this.studios = studios;
        this.genres = genres;
        this.openingThemes = openingThemes;
        this.endingThemes = endingThemes;
    }

    public String getRequestHash() {
        return requestHash;
    }

    public void setRequestHash(String requestHash) {
        this.requestHash = requestHash;
    }

    public boolean isRequestCached() {
        return requestCached;
    }

    public void setRequestCached(boolean requestCached) {
        this.requestCached = requestCached;
    }

    public int getRequestCacheExpiry() {
        return requestCacheExpiry;
    }

    public void setRequestCacheExpiry(int requestCacheExpiry) {
        this.requestCacheExpiry = requestCacheExpiry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Object getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(Object trailerUrl) {
        this.trailerUrl = trailerUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleEnglish() {
        return titleEnglish;
    }

    public void setTitleEnglish(String titleEnglish) {
        this.titleEnglish = titleEnglish;
    }

    public String getTitleJapanese() {
        return titleJapanese;
    }

    public void setTitleJapanese(String titleJapanese) {
        this.titleJapanese = titleJapanese;
    }

    public List<String> getTitleSynonyms() {
        return titleSynonyms;
    }

    public void setTitleSynonyms(List<String> titleSynonyms) {
        this.titleSynonyms = titleSynonyms;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isAiring() {
        return isAiring;
    }

    public void setAiring(boolean airing) {
        this.isAiring = airing;
    }

    public AiredTime getAiredTime() {
        return airedTime;
    }

    public void setAiredTime(AiredTime airedTime) {
        this.airedTime = airedTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getScoredBy() {
        return scoredBy;
    }

    public void setScoredBy(int scoredBy) {
        this.scoredBy = scoredBy;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public int getFavorites() {
        return favorites;
    }

    public void setFavorites(int favorites) {
        this.favorites = favorites;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getPremiered() {
        return premiered;
    }

    public void setPremiered(String premiered) {
        this.premiered = premiered;
    }

    public String getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(String broadcast) {
        this.broadcast = broadcast;
    }

    public List<DetailAnime> getProducers() {
        return producers;
    }

    public void setProducers(List<DetailAnime> producers) {
        this.producers = producers;
    }

    public List<DetailAnime> getLicensors() {
        return licensors;
    }

    public void setLicensors(List<DetailAnime> licensors) {
        this.licensors = licensors;
    }

    public List<DetailAnime> getStudios() {
        return studios;
    }

    public void setStudios(List<DetailAnime> studios) {
        this.studios = studios;
    }

    public List<DetailAnime> getGenres() {
        return genres;
    }

    public void setGenres(List<DetailAnime> genres) {
        this.genres = genres;
    }

    public List<String> getOpeningThemes() {
        return openingThemes;
    }

    public void setOpeningThemes(List<String> openingThemes) {
        this.openingThemes = openingThemes;
    }

    public List<String> getEndingThemes() {
        return endingThemes;
    }

    public void setEndingThemes(List<String> endingThemes) {
        this.endingThemes = endingThemes;
    }
}