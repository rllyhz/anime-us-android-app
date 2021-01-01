package id.rllyhz.animeus.api.response_type;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetTopAnimeResponse {
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
    private List<Anime> animeList;

    public GetTopAnimeResponse(String requestHash, boolean requestCached, int requestCacheExpiry, List<Anime> animeList) {
        this.requestHash = requestHash;
        this.requestCached = requestCached;
        this.requestCacheExpiry = requestCacheExpiry;
        this.animeList = animeList;
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

    public List<Anime> getAnimeList() {
        return animeList;
    }

    /*
     * Anime Type
     * */
    public class Anime {
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

        @SerializedName("image_url")
        @Expose
        private String imageUrl;

        @SerializedName("type")
        @Expose
        private String type;

        @SerializedName("episodes")
        @Expose
        private int episodes;

        @SerializedName("start_date")
        @Expose
        private String startDate;

        @SerializedName("end_date")
        @Expose
        private String endDate;

        @SerializedName("members")
        @Expose
        private int members;

        @SerializedName("score")
        @Expose
        private double score;

        public Anime(int id, int rank, String title, String url, String imageUrl, String type, int episodes, String startDate, String endDate, int members, double score) {
            this.id = id;
            this.rank = rank;
            this.title = title;
            this.url = url;
            this.imageUrl = imageUrl;
            this.type = type;
            this.episodes = episodes;
            this.startDate = startDate;
            this.endDate = endDate;
            this.members = members;
            this.score = score;
        }

        public int getId() {
            return id;
        }

        public int getRank() {
            return rank;
        }

        public String getTitle() {
            return title;
        }

        public String getUrl() {
            return url;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public String getType() {
            return type;
        }

        public int getEpisodes() {
            return episodes;
        }

        public String getStartDate() {
            return startDate;
        }

        public String getEndDate() {
            return endDate;
        }

        public int getMembers() {
            return members;
        }

        public double getScore() {
            return score;
        }
    }
}
