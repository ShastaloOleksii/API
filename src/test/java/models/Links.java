package models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "self",
        "edit",
        "avatar"
})
public class Links {

    @JsonProperty("self")
    private Self self;
    @JsonProperty("edit")
    private Edit edit;
    @JsonProperty("avatar")
    private Avatar avatar;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Links() {
    }

    /**
     *
     * @param edit
     * @param self
     * @param avatar
     */
    public Links(Self self, Edit edit, Avatar avatar) {
        super();
        this.self = self;
        this.edit = edit;
        this.avatar = avatar;
    }

    @JsonProperty("self")
    public Self getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(Self self) {
        this.self = self;
    }

    @JsonProperty("edit")
    public Edit getEdit() {
        return edit;
    }

    @JsonProperty("edit")
    public void setEdit(Edit edit) {
        this.edit = edit;
    }

    @JsonProperty("avatar")
    public Avatar getAvatar() {
        return avatar;
    }

    @JsonProperty("avatar")
    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("self", self).append("edit", edit).append("avatar", avatar).append("additionalProperties", additionalProperties).toString();
    }

}