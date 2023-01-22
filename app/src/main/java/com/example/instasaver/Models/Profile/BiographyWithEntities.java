
package com.example.instasaver.Models.Profile;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BiographyWithEntities {

    @SerializedName("raw_text")
    @Expose
    private String rawText;
    @SerializedName("entities")
    @Expose
    private List<Object> entities = null;

    public String getRawText() {
        return rawText;
    }

    public void setRawText(String rawText) {
        this.rawText = rawText;
    }

    public List<Object> getEntities() {
        return entities;
    }

    public void setEntities(List<Object> entities) {
        this.entities = entities;
    }

}
