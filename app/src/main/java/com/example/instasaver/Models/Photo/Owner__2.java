
package com.example.instasaver.Models.Photo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Owner__2 {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("is_verified")
    @Expose
    private Boolean isVerified;
    @SerializedName("profile_pic_url")
    @Expose
    private String profilePicUrl;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("blocked_by_viewer")
    @Expose
    private Boolean blockedByViewer;
    @SerializedName("restricted_by_viewer")
    @Expose
    private Object restrictedByViewer;
    @SerializedName("followed_by_viewer")
    @Expose
    private Boolean followedByViewer;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("has_blocked_viewer")
    @Expose
    private Boolean hasBlockedViewer;
    @SerializedName("is_embeds_disabled")
    @Expose
    private Boolean isEmbedsDisabled;
    @SerializedName("is_private")
    @Expose
    private Boolean isPrivate;
    @SerializedName("is_unpublished")
    @Expose
    private Boolean isUnpublished;
    @SerializedName("requested_by_viewer")
    @Expose
    private Boolean requestedByViewer;
    @SerializedName("pass_tiering_recommendation")
    @Expose
    private Boolean passTieringRecommendation;
    @SerializedName("edge_owner_to_timeline_media")
    @Expose
    private EdgeOwnerToTimelineMedia edgeOwnerToTimelineMedia;
    @SerializedName("edge_followed_by")
    @Expose
    private EdgeFollowedBy edgeFollowedBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getBlockedByViewer() {
        return blockedByViewer;
    }

    public void setBlockedByViewer(Boolean blockedByViewer) {
        this.blockedByViewer = blockedByViewer;
    }

    public Object getRestrictedByViewer() {
        return restrictedByViewer;
    }

    public void setRestrictedByViewer(Object restrictedByViewer) {
        this.restrictedByViewer = restrictedByViewer;
    }

    public Boolean getFollowedByViewer() {
        return followedByViewer;
    }

    public void setFollowedByViewer(Boolean followedByViewer) {
        this.followedByViewer = followedByViewer;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getHasBlockedViewer() {
        return hasBlockedViewer;
    }

    public void setHasBlockedViewer(Boolean hasBlockedViewer) {
        this.hasBlockedViewer = hasBlockedViewer;
    }

    public Boolean getIsEmbedsDisabled() {
        return isEmbedsDisabled;
    }

    public void setIsEmbedsDisabled(Boolean isEmbedsDisabled) {
        this.isEmbedsDisabled = isEmbedsDisabled;
    }

    public Boolean getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public Boolean getIsUnpublished() {
        return isUnpublished;
    }

    public void setIsUnpublished(Boolean isUnpublished) {
        this.isUnpublished = isUnpublished;
    }

    public Boolean getRequestedByViewer() {
        return requestedByViewer;
    }

    public void setRequestedByViewer(Boolean requestedByViewer) {
        this.requestedByViewer = requestedByViewer;
    }

    public Boolean getPassTieringRecommendation() {
        return passTieringRecommendation;
    }

    public void setPassTieringRecommendation(Boolean passTieringRecommendation) {
        this.passTieringRecommendation = passTieringRecommendation;
    }

    public EdgeOwnerToTimelineMedia getEdgeOwnerToTimelineMedia() {
        return edgeOwnerToTimelineMedia;
    }

    public void setEdgeOwnerToTimelineMedia(EdgeOwnerToTimelineMedia edgeOwnerToTimelineMedia) {
        this.edgeOwnerToTimelineMedia = edgeOwnerToTimelineMedia;
    }

    public EdgeFollowedBy getEdgeFollowedBy() {
        return edgeFollowedBy;
    }

    public void setEdgeFollowedBy(EdgeFollowedBy edgeFollowedBy) {
        this.edgeFollowedBy = edgeFollowedBy;
    }

}
