package id.rllyhz.animeus.model;

import java.util.ArrayList;

public class Manga {
    private int id;
    private String title, titleEnglish, titleJapanese, type, status, imageUrl, publishedOn, synopsis;
    private boolean isPublishing;
    private int volumes, chapters, rank;
    private double score;
    private ArrayList<Detail> genres, authors, serializations;

    public Manga() {}

    public Manga(int id, String title, String titleEnglish, String titleJapanese, String type, String status, String imageUrl, String publishedOn, String synopsis, boolean isPublishing, int volumes, int chapters, int rank, double score, ArrayList<Detail> genres, ArrayList<Detail> authors, ArrayList<Detail> serializations) {
        this.id = id;
        this.title = title;
        this.titleEnglish = titleEnglish;
        this.titleJapanese = titleJapanese;
        this.type = type;
        this.status = status;
        this.imageUrl = imageUrl;
        this.publishedOn = publishedOn;
        this.synopsis = synopsis;
        this.isPublishing = isPublishing;
        this.volumes = volumes;
        this.chapters = chapters;
        this.rank = rank;
        this.score = score;
        this.genres = genres;
        this.authors = authors;
        this.serializations = serializations;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPublishedOn() {
        return publishedOn;
    }

    public void setPublishedOn(String publishedOn) {
        this.publishedOn = publishedOn;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public boolean isPublishing() {
        return isPublishing;
    }

    public void setPublishing(boolean publishing) {
        isPublishing = publishing;
    }

    public int getVolumes() {
        return volumes;
    }

    public void setVolumes(int volumes) {
        this.volumes = volumes;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public ArrayList<Detail> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<Detail> genres) {
        this.genres = genres;
    }

    public ArrayList<Detail> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Detail> authors) {
        this.authors = authors;
    }

    public ArrayList<Detail> getSerializations() {
        return serializations;
    }

    public void setSerializations(ArrayList<Detail> serializations) {
        this.serializations = serializations;
    }
}
