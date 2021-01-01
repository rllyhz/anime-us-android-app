package id.rllyhz.animeus.api.response_type;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AnimeStaffPosition {
    @SerializedName("position")
    @Expose
    private String position;

    @SerializedName("anime")
    @Expose
    private VoiceActingRole.Anime anime;

    public AnimeStaffPosition(String position, VoiceActingRole.Anime anime) {
        this.position = position;
        this.anime = anime;
    }

    public String getPosition() {
        return position;
    }

    public VoiceActingRole.Anime getAnime() {
        return anime;
    }
}
