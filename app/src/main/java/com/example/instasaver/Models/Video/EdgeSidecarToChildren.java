
package com.example.instasaver.Models.Video;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class EdgeSidecarToChildren {

    @SerializedName("edges")
    @Expose
    private Edge edges = null;

    public Edge getEdges() {
        return edges;
    }

    public void setEdges(Edge edges) {
        this.edges = edges;
    }

}
