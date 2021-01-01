package id.rllyhz.animeus.api.response_type;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetPersonByIdResponse {

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

    @SerializedName("website_url")
    @Expose
    private String websiteUrl;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("given_name")
    @Expose
    private String givenName;

    @SerializedName("family_name")
    @Expose
    private String familyName;

    @SerializedName("alternate_names")
    @Expose
    private List<String> alternateNames;

    @SerializedName("birthday")
    @Expose
    private String birthday;

    @SerializedName("member_favorites")
    @Expose
    private int memberFavorites;

    @SerializedName("about")
    @Expose
    private String about;

    @SerializedName("voice_acting_roles")
    @Expose
    private List<VoiceActingRole> voiceActingRoles;

    @SerializedName("anime_staff_positions")
    @Expose
    private List<AnimeStaffPosition> animeStaffPositions;

    public GetPersonByIdResponse(String requestHash, boolean requestCached, int requestCacheExpiry, int id, String url, String imageUrl, String websiteUrl, String name, String givenName, String familyName, List<String> alternateNames, String birthday, int memberFavorites, String about, List<VoiceActingRole> voiceActingRoles, List<AnimeStaffPosition> animeStaffPositions) {
        this.requestHash = requestHash;
        this.requestCached = requestCached;
        this.requestCacheExpiry = requestCacheExpiry;
        this.id = id;
        this.url = url;
        this.imageUrl = imageUrl;
        this.websiteUrl = websiteUrl;
        this.name = name;
        this.givenName = givenName;
        this.familyName = familyName;
        this.alternateNames = alternateNames;
        this.birthday = birthday;
        this.memberFavorites = memberFavorites;
        this.about = about;
        this.voiceActingRoles = voiceActingRoles;
        this.animeStaffPositions = animeStaffPositions;
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

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public String getName() {
        return name;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public List<String> getAlternateNames() {
        return alternateNames;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getMemberFavorites() {
        return memberFavorites;
    }

    public String getAbout() {
        return about;
    }

    public List<VoiceActingRole> getVoiceActingRoles() {
        return voiceActingRoles;
    }

    public List<AnimeStaffPosition> getAnimeStaffPositions() {
        return animeStaffPositions;
    }
}
