package id.rllyhz.animeus.model;

import java.util.ArrayList;

public class Character {
    private int id;
    private String name, nameInKanji, imageUrl, about;
    private ArrayList<String> nicknames;
    private ArrayList<CharacterRole> animeography, mangaography;
    private ArrayList<VoiceActor> voiceActors;

    public Character() {}

    public Character(int id, String name, String nameInKanji, String imageUrl, String about, ArrayList<String> nicknames, ArrayList<CharacterRole> animeography, ArrayList<CharacterRole> mangaography, ArrayList<VoiceActor> voiceActors) {
        this.id = id;
        this.name = name;
        this.nameInKanji = nameInKanji;
        this.imageUrl = imageUrl;
        this.about = about;
        this.nicknames = nicknames;
        this.animeography = animeography;
        this.mangaography = mangaography;
        this.voiceActors = voiceActors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameInKanji() {
        return nameInKanji;
    }

    public void setNameInKanji(String nameInKanji) {
        this.nameInKanji = nameInKanji;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public ArrayList<String> getNicknames() {
        return nicknames;
    }

    public void setNicknames(ArrayList<String> nicknames) {
        this.nicknames = nicknames;
    }

    public ArrayList<CharacterRole> getAnimeography() {
        return animeography;
    }

    public void setAnimeography(ArrayList<CharacterRole> animeography) {
        this.animeography = animeography;
    }

    public ArrayList<CharacterRole> getMangaography() {
        return mangaography;
    }

    public void setMangaography(ArrayList<CharacterRole> mangaography) {
        this.mangaography = mangaography;
    }

    public ArrayList<VoiceActor> getVoiceActors() {
        return voiceActors;
    }

    public void setVoiceActors(ArrayList<VoiceActor> voiceActors) {
        this.voiceActors = voiceActors;
    }
}
