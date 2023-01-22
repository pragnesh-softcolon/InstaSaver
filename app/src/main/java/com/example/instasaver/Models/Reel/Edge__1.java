
package com.example.instasaver.Models.Reel;



import com.example.instasaver.Models.Reel.Node__1;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Edge__1 {

    @SerializedName("node")
    @Expose
    private Node__1 node;

    public Node__1 getNode() {
        return node;
    }

    public void setNode(Node__1 node) {
        this.node = node;
    }

}
