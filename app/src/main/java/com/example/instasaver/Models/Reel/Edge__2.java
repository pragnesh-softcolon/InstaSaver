
package com.example.instasaver.Models.Reel;



import com.example.instasaver.Models.Reel.Node__2;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Edge__2 {

    @SerializedName("node")
    @Expose
    private Node__2 node;

    public Node__2 getNode() {
        return node;
    }

    public void setNode(Node__2 node) {
        this.node = node;
    }

}
