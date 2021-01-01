package id.rllyhz.animeus.api.response_type;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetTopMangaResponse {
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
    private List<Manga> mangaList;

    public GetTopMangaResponse(String requestHash, boolean requestCached, int requestCacheExpiry, List<Manga> mangaList) {
        this.requestHash = requestHash;
        this.requestCached = requestCached;
        this.requestCacheExpiry = requestCacheExpiry;
        this.mangaList = mangaList;
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

    public List<Manga> getMangaList() {
        return mangaList;
    }

    /*
     * Manga Type
     * */
    public class Manga {

        @SerializedName("mal_id")
        @Expose
        public int id;

        @SerializedName("rank")
        @Expose
        public int rank;

        @SerializedName("title")
        @Expose
        public String title;

        @SerializedName("url")
        @Expose
        public String url;

        @SerializedName("type")
        @Expose
        public String type;

        @SerializedName("volumes")
        @Expose
        public int volumes;

        @SerializedName("start_date")
        @Expose
        public String startDate;

        @SerializedName("end_date")
        @Expose
        public String endDate;

        @SerializedName("members")
        @Expose
        public int members;

        @SerializedName("score")
        @Expose
        public double score;

        @SerializedName("image_url")
        @Expose
        public String imageUrl;

        public Manga(int id, int rank, String title, String url, String type, int volumes, String startDate, String endDate, int members, double score, String imageUrl) {
            this.id = id;
            this.rank = rank;
            this.title = title;
            this.url = url;
            this.type = type;
            this.volumes = volumes;
            this.startDate = startDate;
            this.endDate = endDate;
            this.members = members;
            this.score = score;
            this.imageUrl = imageUrl;
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

        public String getType() {
            return type;
        }

        public int getVolumes() {
            return volumes;
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

        public String getImageUrl() {
            return imageUrl;
        }
    }
}
