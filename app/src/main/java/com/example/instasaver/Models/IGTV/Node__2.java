
package com.example.instasaver.Models.IGTV;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Node__2 {

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
    private Owner__1 owner;
    @SerializedName("viewer_has_liked")
    @Expose
    private Boolean viewerHasLiked;
    @SerializedName("edge_liked_by")
    @Expose
    private EdgeLikedBy__1 edgeLikedBy;
    @SerializedName("is_restricted_pending")
    @Expose
    private Boolean isRestrictedPending;

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

    public Owner__1 getOwner() {
        return owner;
    }

    public void setOwner(Owner__1 owner) {
        this.owner = owner;
    }

    public Boolean getViewerHasLiked() {
        return viewerHasLiked;
    }

    public void setViewerHasLiked(Boolean viewerHasLiked) {
        this.viewerHasLiked = viewerHasLiked;
    }

    public EdgeLikedBy__1 getEdgeLikedBy() {
        return edgeLikedBy;
    }

    public void setEdgeLikedBy(EdgeLikedBy__1 edgeLikedBy) {
        this.edgeLikedBy = edgeLikedBy;
    }

    public Boolean getIsRestrictedPending() {
        return isRestrictedPending;
    }

    public void setIsRestrictedPending(Boolean isRestrictedPending) {
        this.isRestrictedPending = isRestrictedPending;
    }

}
