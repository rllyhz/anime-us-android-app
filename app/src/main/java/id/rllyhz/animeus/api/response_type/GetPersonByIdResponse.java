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
}
