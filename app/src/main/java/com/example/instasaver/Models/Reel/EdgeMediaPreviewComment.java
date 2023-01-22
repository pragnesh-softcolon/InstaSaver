
package com.example.instasaver.Models.Reel;

import java.util.List;

import com.example.instasaver.Models.Reel.Edge__2;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class EdgeMediaPreviewComment {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("edges")
    @Expose
    private List<Edge__2> edges = null;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Edge__2> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge__2> edges) {
        this.edges = edges;
    }

}
