package id.rllyhz.animeus.model;

import java.util.ArrayList;

public class Anime {
    private int id;
    private String title, titleEnglish, titleJapanese, type, episodes, status, duration, rating, synopsis, imageUrl, trailerUrl, airedOn;
    private double score;
    private int rank;
    private boolean isAiring;
    private ArrayList<String> openingThemes, endingThemes;
    private ArrayList<Detail> genres, producers, licensors, studios;

    public Anime() {}

    public Anime(int id, String title, String titleEnglish, String titleJapanese, String type, String episodes, String status, String duration, String rating, String synopsis, String imageUrl, String trailerUrl, String airedOn, double score, int rank, boolean isAiring, ArrayList<String> openingThemes, ArrayList<String> endingThemes, ArrayList<Detail> genres, ArrayList<Detail> producers, ArrayList<Detail> licensors, ArrayList<Detail> studios) {
        this.id = id;
        this.title = title;
        this.titleEnglish = titleEnglish;
        this.titleJapanese = titleJapanese;
        this.type = type;
        this.episodes = episodes;
        this.status = status;
        this.duration = duration;
        this.rating = rating;
        this.synopsis = synopsis;
        this.imageUrl = imageUrl;
        this.trailerUrl = trailerUrl;
        this.airedOn = airedOn;
        this.score = score;
        this.rank = rank;
        this.isAiring = isAiring;
        this.openingThemes = openingThemes;
        this.endingThemes = endingThemes;
        this.genres = genres;
        this.producers = producers;
        this.licensors = licensors;
        this.studios = studios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEpisodes() {
        return episodes;
    }

    public void setEpisodes(String episodes) {
        this.episodes = episodes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
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

    public String getAiredOn() {
        return airedOn;
    }

    public void setAiredOn(String airedOn) {
        this.airedOn = airedOn;
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

    public boolean isAiring() {
        return isAiring;
    }

    public void setAiring(boolean airing) {
        this.isAiring = airing;
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

    public ArrayList<Detail> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<Detail> genres) {
        this.genres = genres;
    }

    public ArrayList<Detail> getProducers() {
        return producers;
    }

    public void setProducers(ArrayList<Detail> producers) {
        this.producers = producers;
    }

    public ArrayList<Detail> getLicensors() {
        return licensors;
    }

    public void setLicensors(ArrayList<Detail> licensors) {
        this.licensors = licensors;
    }

    public ArrayList<Detail> getStudios() {
        return studios;
    }

    public void setStudios(ArrayList<Detail> studios) {
        this.studios = studios;
    }
}
