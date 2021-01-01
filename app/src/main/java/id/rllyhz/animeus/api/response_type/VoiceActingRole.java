package id.rllyhz.animeus.api.response_type;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VoiceActingRole {
    @SerializedName("role")
    @Expose
    private String role;

    @SerializedName("anime")
    @Expose
    private Anime anime;

    @SerializedName("character")
    @Expose
    private Character character;

    public VoiceActingRole(String role, Anime anime, Character character) {
        this.role = role;
        this.anime = anime;
        this.character = character;
    }

    public String getRole() {
        return role;
    }

    public Anime getAnime() {
        return anime;
    }

    public Character getCharacter() {
        return character;
    }


    /*
    * Anime Type
    * */
    public class Anime {
        @SerializedName("mal_id")
        @Expose
        private int id;

        @SerializedName("url")
        @Expose
        private String url;

        @SerializedName("image_url")
        @Expose
        private String imageUrl;

        @SerializedName("name")
        @Expose
        private String title;

        public Anime(int id, String url, String imageUrl, String title) {
            this.id = id;
            this.url = url;
            this.imageUrl = imageUrl;
            this.title = title;
        }

        public int getId() {
            return id;
        }

        public String getUrl() {
            return url;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public String getTitle() {
            return title;
        }
    }


    /*
     * Character Type
     * */
    public class Character {
        @SerializedName("mal_id")
        @Expose
        private int id;

        @SerializedName("url")
        @Expose
        private String url;

        @SerializedName("image_url")
        @Expose
        private String imageUrl;

        @SerializedName("name")
        @Expose
        private String name;

        public Character(int id, String url, String imageUrl, String name) {
            this.id = id;
            this.url = url;
            this.imageUrl = imageUrl;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getUrl() {
            return url;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public String getName() {
            return name;
        }
    }
}
