
package com.example.instasaver.Models.Photo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Node__1 {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("created_at")
    @Expose
    private Integer createdAt;
    @SerializedName("did_report_as_spam")
    @Expose
    private Boolean didReportAsSpam;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("viewer_has_liked")
    @Expose
    private Boolean viewerHasLiked;
    @SerializedName("edge_liked_by")
    @Expose
    private EdgeLikedBy edgeLikedBy;
    @SerializedName("is_restricted_pending")
    @Expose
    private Boolean isRestrictedPending;
    @SerializedName("edge_threaded_comments")
    @Expose
    private EdgeThreadedComments edgeThreadedComments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getDidReportAsSpam() {
        return didReportAsSpam;
    }

    public void setDidReportAsSpam(Boolean didReportAsSpam) {
        this.didReportAsSpam = didReportAsSpam;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Boolean getViewerHasLiked() {
        return viewerHasLiked;
    }

    public void setViewerHasLiked(Boolean viewerHasLiked) {
        this.viewerHasLiked = viewerHasLiked;
    }

    public EdgeLikedBy getEdgeLikedBy() {
        return edgeLikedBy;
    }

    public void setEdgeLikedBy(EdgeLikedBy edgeLikedBy) {
        this.edgeLikedBy = edgeLikedBy;
    }

    public Boolean getIsRestrictedPending() {
        return isRestrictedPending;
    }

    public void setIsRestrictedPending(Boolean isRestrictedPending) {
        this.isRestrictedPending = isRestrictedPending;
    }

    public EdgeThreadedComments getEdgeThreadedComments() {
        return edgeThreadedComments;
    }

    public void setEdgeThreadedComments(EdgeThreadedComments edgeThreadedComments) {
        this.edgeThreadedComments = edgeThreadedComments;
    }

}
