package id.rllyhz.animeus.api.response_type;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CharacterRole {
    @SerializedName("mal_id")
    @Expose
    private int id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("image_url")
    @Expose
    private String imageUrl;

    @SerializedName("role")
    @Expose
    private String role;

    public CharacterRole(int id, String name, String url, String imageUrl, String role) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.imageUrl = imageUrl;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getRole() {
        return role;
    }
}
