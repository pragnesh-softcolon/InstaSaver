
package com.example.instasaver.Models.Reel;

import java.util.List;

import com.example.instasaver.Models.Reel.Edge;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EdgeMediaToCaption {

    @SerializedName("edges")
    @Expose
    private List<com.example.instasaver.Models.Reel.Edge> edges = null;

    public List<com.example.instasaver.Models.Reel.Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

}
