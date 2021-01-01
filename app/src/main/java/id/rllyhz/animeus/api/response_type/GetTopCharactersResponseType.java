package id.rllyhz.animeus.api.response_type;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetTopCharactersResponseType {
    @SerializedName("request_hash")
    @Expose
    private String requestHash;

    @SerializedName("request_cached")
    @Expose
    private boolean requestCached;

    @SerializedName("request_cache_expiry")
    @Expose
    private int requestCacheExpiry;

    @SerializedName("top")
    @Expose
    private List<Character> characterList;


    /*
     * Character Type
     * */
    public class Character {
        @SerializedName("mal_id")
        @Expose
        private int id;

        @SerializedName("rank")
        @Expose
        private int rank;

        @SerializedName("title")
        @Expose
        private String title;

        @SerializedName("url")
        @Expose
        private String url;

        @SerializedName("name_kanji")
        @Expose
        private String nameInKanji;

        @SerializedName("animeography")
        @Expose
        private List<Animeography> rolesInAnime;

        @SerializedName("mangaography")
        @Expose
        private List<Mangaography> rolesInManga;

        @SerializedName("favorites")
        @Expose
        private int favorites;

        @SerializedName("image_url")
        @Expose
        private String imageUrl;


        /*
         * Animeography Type
         * */
        public class Animeography {
            @SerializedName("mal_id")
            @Expose
            private int id;

            @SerializedName("type")
            @Expose
            private String type;

            @SerializedName("name")
            @Expose
            private String title;

            @SerializedName("url")
            @Expose
            private String url;

            public Animeography(int id, String type, String title, String url) {
                this.id = id;
                this.type = type;
                this.title = title;
                this.url = url;
            }

            public int getId() {
                return id;
            }

            public String getType() {
                return type;
            }

            public String getTitle() {
                return title;
            }

            public String getUrl() {
                return url;
            }
        }


        /*
         * Mangaography Type
         * */
        public class Mangaography {
            @SerializedName("mal_id")
            @Expose
            private int id;

            @SerializedName("type")
            @Expose
            private String type;

            @SerializedName("name")
            @Expose
            private String name;

            @SerializedName("url")
            @Expose
            private String url;

            public Mangaography(int id, String type, String name, String url) {
                this.id = id;
                this.type = type;
                this.name = name;
                this.url = url;
            }

            public int getId() {
                return id;
            }

            public String getType() {
                return type;
            }

            public String getName() {
                return name;
            }

            public String getUrl() {
                return url;
            }
        }
    }
}
