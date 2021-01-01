package id.rllyhz.animeus.model;

import java.util.ArrayList;

public class Person {
    private int id;
    private String name, givenName, familyName, birthdayInString, about, imageUrl, websiteUrl;
    private ArrayList<String> alternativeNames;
    private ArrayList<VoiceActingRole> voiceActingRoles;
    private ArrayList<AnimeStaffPosition> animeStaffPositions;

    public static class AnimeStaffPosition {
        private String positionName;
        private AnimeDetail animeTitle;

        public AnimeStaffPosition(String positionName, AnimeDetail animeTitle) {
            this.positionName = positionName;
            this.animeTitle = animeTitle;
        }

        public String getPositionName() {
            return positionName;
        }

        public AnimeDetail getAnimeTitle() {
            return animeTitle;
        }
    }

    public static class VoiceActingRole {
        private String roleName;
        private AnimeDetail anime;
        private CharacterDetail character;

        public VoiceActingRole(String roleName, AnimeDetail anime, CharacterDetail character) {
            this.roleName = roleName;
            this.anime = anime;
            this.character = character;
        }

        public String getRoleName() {
            return roleName;
        }

        public AnimeDetail getAnime() {
            return anime;
        }

        public CharacterDetail getCharacter() {
            return character;
        }
    }

    public static class AnimeDetail {
        private int id;
        private String animeName, imageUrl;

        public AnimeDetail(int id, String animeName, String imageUrl) {
            this.id = id;
            this.animeName = animeName;
            this.imageUrl = imageUrl;
        }

        public int getId() {
            return id;
        }

        public String getAnimeName() {
            return animeName;
        }

        public String getImageUrl() {
            return imageUrl;
        }
    }

    public static class CharacterDetail {
        private int id;
        private String characterName, imageUrl;

        public CharacterDetail(int id, String characterName, String imageUrl) {
            this.id = id;
            this.characterName = characterName;
            this.imageUrl = imageUrl;
        }

        public int getId() {
            return id;
        }

        public String getCharacterName() {
            return characterName;
        }

        public String getImageUrl() {
            return imageUrl;
        }
    }
}
