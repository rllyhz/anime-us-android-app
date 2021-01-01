package id.rllyhz.animeus.api.response_type;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetCharacterByIdResponseType {

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

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("name_kanji")
    @Expose
    private String nameInKanji;

    @SerializedName("nicknames")
    @Expose
    private List<String> nicknames;

    @SerializedName("about")
    @Expose
    private String about;

    @SerializedName("member_favorites")
    @Expose
    private int memberFavorites;

    @SerializedName("image_url")
    @Expose
    private String imageUrl;

    @SerializedName("animeography")
    @Expose
    private List<CharacterRole> rolesInAnime;

    @SerializedName("mangaography")
    @Expose
    private List<CharacterRole> rolesInManga;

    @SerializedName("voice_actors")
    @Expose
    private List<VoiceActor> voiceActors;

    public GetCharacterByIdResponseType(String requestHash, boolean requestCached, int requestCacheExpiry, int id, String url, String name, String nameInKanji, List<String> nicknames, String about, int memberFavorites, String imageUrl, List<CharacterRole> rolesInAnime, List<CharacterRole> rolesInManga, List<VoiceActor> voiceActors) {
        this.requestHash = requestHash;
        this.requestCached = requestCached;
        this.requestCacheExpiry = requestCacheExpiry;
        this.id = id;
        this.url = url;
        this.name = name;
        this.nameInKanji = nameInKanji;
        this.nicknames = nicknames;
        this.about = about;
        this.memberFavorites = memberFavorites;
        this.imageUrl = imageUrl;
        this.rolesInAnime = rolesInAnime;
        this.rolesInManga = rolesInManga;
        this.voiceActors = voiceActors;
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

    public String getName() {
        return name;
    }

    public String getNameInKanji() {
        return nameInKanji;
    }

    public List<String> getNicknames() {
        return nicknames;
    }

    public String getAbout() {
        return about;
    }

    public int getMemberFavorites() {
        return memberFavorites;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public List<CharacterRole> getRolesInAnime() {
        return rolesInAnime;
    }

    public List<CharacterRole> getRolesInManga() {
        return rolesInManga;
    }

    public List<VoiceActor> getVoiceActors() {
        return voiceActors;
    }
}
