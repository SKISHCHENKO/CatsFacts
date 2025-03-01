package CatsFacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CatsInfo {
    private String id;
    private String text;
    private Type type;
    private String user;
    private int upvotes;

    public CatsInfo(
            @JsonProperty("id")String id,
            @JsonProperty("text")String text,
            @JsonProperty("type")Type type,
            @JsonProperty("user")String user,
            @JsonProperty("upvotes")int upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Type getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public int getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "CatsInfo: " +
                "\n id= " + id+
                "\n text= " + text +
                "\n type= " + type +
                "\n user= " + user +
                "\n upvotes= " + upvotes;
    }
}
