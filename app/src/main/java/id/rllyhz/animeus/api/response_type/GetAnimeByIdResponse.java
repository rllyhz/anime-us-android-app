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

    public GetAnimeByIdResponse(int id, String imageUrl, String trailerUrl, String title, String titleEnglish, String titleJapanese, String type, String source, int episodes, String status, boolean isAiring, Response airedOn, String duration, String rating, double score, int rank, double synopsis, String premiredIn, Response producers, Response licensors, Response studios, Response genres, ArrayList<String> openingThemes, ArrayList<String> endingThemes) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.trailerUrl = trailerUrl;
        this.title = title;
        this.titleEnglish = titleEnglish;
        this.titleJapanese = titleJapanese;
        this.type = type;
        this.source = source;
        this.episodes = episodes;
        this.status = status;
        this.isAiring = isAiring;
        this.airedOn = airedOn;
        this.duration = duration;
        this.rating = rating;
        this.score = score;
        this.rank = rank;
        this.synopsis = synopsis;
        this.premiredIn = premiredIn;
        this.producers = producers;
        this.licensors = licensors;
        this.studios = studios;
        this.genres = genres;
        this.openingThemes = openingThemes;
        this.endingThemes = endingThemes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
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
        isAiring = airing;
    }

    public Response getAiredOn() {
        return airedOn;
    }

    public void setAiredOn(Response airedOn) {
        this.airedOn = airedOn;
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

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(double synopsis) {
        this.synopsis = synopsis;
    }

    public String getPremiredIn() {
        return premiredIn;
    }

    public void setPremiredIn(String premiredIn) {
        this.premiredIn = premiredIn;
    }

    public Response getProducers() {
        return producers;
    }

    public void setProducers(Response producers) {
        this.producers = producers;
    }

    public Response getLicensors() {
        return licensors;
    }

    public void setLicensors(Response licensors) {
        this.licensors = licensors;
    }

    public Response getStudios() {
        return studios;
    }

    public void setStudios(Response studios) {
        this.studios = studios;
    }

    public Response getGenres() {
        return genres;
    }

    public void setGenres(Response genres) {
        this.genres = genres;
    }

    public ArrayList<String> getOpeningThemes() {
        return openingThemes;
    }

    public void setOpeningThemes(ArrayList<String> openingThemes) {
        this.openingThemes = openingThemes;
    }

    public ArrayList<String> getEndingThemes() {
        return endingThemes;
    }

    public void setEndingThemes(ArrayList<String> endingThemes) {
        this.endingThemes = endingThemes;
    }
}
