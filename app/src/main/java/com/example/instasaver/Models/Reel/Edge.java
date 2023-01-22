
package com.example.instasaver.Models.Reel;


import com.example.instasaver.Models.Reel.Node;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Edge {

    @SerializedName("node")
    @Expose
    private Node node;

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

}
