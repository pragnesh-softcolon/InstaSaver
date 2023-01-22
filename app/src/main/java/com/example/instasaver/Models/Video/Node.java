
package com.example.instasaver.Models.Video;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Node {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("shortcode")
    @Expose
    private String shortcode;
    @SerializedName("dimensions")
    @Expose
    private Dimensions__1 dimensions;
    @SerializedName("gating_info")
    @Expose
    private Object gatingInfo;
    @SerializedName("fact_check_overall_rating")
    @Expose
    private Object factCheckOverallRating;
    @SerializedName("fact_check_information")
    @Expose
    private Object factCheckInformation;
    @SerializedName("sensitivity_friction_info")
    @Expose
    private Object sensitivityFrictionInfo;
    @SerializedName("sharing_friction_info")
    @Expose
    private SharingFrictionInfo__1 sharingFrictionInfo;
    @SerializedName("media_overlay_info")
    @Expose
    private Object mediaOverlayInfo;
    @SerializedName("media_preview")
    @Expose
    private String mediaPreview;
    @SerializedName("display_url")
    @Expose
    private String displayUrl;
    @SerializedName("display_resources")
    @Expose
    private List<DisplayResource__1> displayResources = null;
    @SerializedName("accessibility_caption")
    @Expose
    private Object accessibilityCaption;
    @SerializedName("dash_info")
    @Expose
    private DashInfo dashInfo;
    @SerializedName("has_audio")
    @Expose
    private Boolean hasAudio;
    @SerializedName("video_url")
    @Expose
    private String videoUrl;
    @SerializedName("video_view_count")
    @Expose
    private Integer videoViewCount;
    @SerializedName("video_play_count")
    @Expose
    private Object videoPlayCount;
    @SerializedName("is_video")
    @Expose
    private Boolean isVideo;
    @SerializedName("tracking_token")
    @Expose
    private String trackingToken;
    @SerializedName("upcoming_event")
    @Expose
    private Object upcomingEvent;
    @SerializedName("edge_media_to_tagged_user")
    @Expose
    private EdgeMediaToTaggedUser__1 edgeMediaToTaggedUser;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShortcode() {
        return shortcode;
    }

    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    public Dimensions__1 getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions__1 dimensions) {
        this.dimensions = dimensions;
    }

    public Object getGatingInfo() {
        return gatingInfo;
    }

    public void setGatingInfo(Object gatingInfo) {
        this.gatingInfo = gatingInfo;
    }

    public Object getFactCheckOverallRating() {
        return factCheckOverallRating;
    }

    public void setFactCheckOverallRating(Object factCheckOverallRating) {
        this.factCheckOverallRating = factCheckOverallRating;
    }

    public Object getFactCheckInformation() {
        return factCheckInformation;
    }

    public void setFactCheckInformation(Object factCheckInformation) {
        this.factCheckInformation = factCheckInformation;
    }

    public Object getSensitivityFrictionInfo() {
        return sensitivityFrictionInfo;
    }

    public void setSensitivityFrictionInfo(Object sensitivityFrictionInfo) {
        this.sensitivityFrictionInfo = sensitivityFrictionInfo;
    }

    public SharingFrictionInfo__1 getSharingFrictionInfo() {
        return sharingFrictionInfo;
    }

    public void setSharingFrictionInfo(SharingFrictionInfo__1 sharingFrictionInfo) {
        this.sharingFrictionInfo = sharingFrictionInfo;
    }

    public Object getMediaOverlayInfo() {
        return mediaOverlayInfo;
    }

    public void setMediaOverlayInfo(Object mediaOverlayInfo) {
        this.mediaOverlayInfo = mediaOverlayInfo;
    }

    public String getMediaPreview() {
        return mediaPreview;
    }

    public void setMediaPreview(String mediaPreview) {
        this.mediaPreview = mediaPreview;
    }

    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    public List<DisplayResource__1> getDisplayResources() {
        return displayResources;
    }

    public void setDisplayResources(List<DisplayResource__1> displayResources) {
        this.displayResources = displayResources;
    }

    public Object getAccessibilityCaption() {
        return accessibilityCaption;
    }

    public void setAccessibilityCaption(Object accessibilityCaption) {
        this.accessibilityCaption = accessibilityCaption;
    }

    public DashInfo getDashInfo() {
        return dashInfo;
    }

    public void setDashInfo(DashInfo dashInfo) {
        this.dashInfo = dashInfo;
    }

    public Boolean getHasAudio() {
        return hasAudio;
    }

    public void setHasAudio(Boolean hasAudio) {
        this.hasAudio = hasAudio;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Integer getVideoViewCount() {
        return videoViewCount;
    }

    public void setVideoViewCount(Integer videoViewCount) {
        this.videoViewCount = videoViewCount;
    }

    public Object getVideoPlayCount() {
        return videoPlayCount;
    }

    public void setVideoPlayCount(Object videoPlayCount) {
        this.videoPlayCount = videoPlayCount;
    }

    public Boolean getIsVideo() {
        return isVideo;
    }

    public void setIsVideo(Boolean isVideo) {
        this.isVideo = isVideo;
    }

    public String getTrackingToken() {
        return trackingToken;
    }

    public void setTrackingToken(String trackingToken) {
        this.trackingToken = trackingToken;
    }

    public Object getUpcomingEvent() {
        return upcomingEvent;
    }

    public void setUpcomingEvent(Object upcomingEvent) {
        this.upcomingEvent = upcomingEvent;
    }

    public EdgeMediaToTaggedUser__1 getEdgeMediaToTaggedUser() {
        return edgeMediaToTaggedUser;
    }

    public void setEdgeMediaToTaggedUser(EdgeMediaToTaggedUser__1 edgeMediaToTaggedUser) {
        this.edgeMediaToTaggedUser = edgeMediaToTaggedUser;
    }

}
